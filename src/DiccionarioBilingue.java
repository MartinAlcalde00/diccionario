import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DiccionarioBilingue {
    
    private File file;
    private String idioma1;
    private String idioma2;
    private Map<String, Set<String>> map;

    public DiccionarioBilingue(File file, String idioma1, String idioma2) {
       this.file = file;       
       this.idioma1 = idioma1;
       this.idioma2 = idioma2; 
       this.map = new HashMap<>();
    }

    public DiccionarioBilingue(File file) throws IOException {
        this.file = file;
        this.map = new HashMap<>();
        Scanner sc = new Scanner(this.file);
        if (sc.hasNextLine()) {
            this.idioma1 = sc.nextLine();
        } else {
           throw new IOException(); 
        } 
        if (sc.hasNextLine()) {
            this.idioma2 = sc.nextLine();
        } else {
            throw new IOException();
        }
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            String[] lineSplitted = line.split(":");
            String palabra1;
            String palabra2;
            if (line.startsWith(":")) {
                palabra1 = "";
                palabra2 = lineSplitted[0].trim();
            } else {
                palabra1 = lineSplitted[0];
                if (lineSplitted.length > 1) {
                    palabra2 = lineSplitted[1].trim();
                } else {
                    palabra2 = "";
                }
            }
            this.insertar(palabra1, palabra2);
        } 
    }

    public String getIdioma1() {
        return this.idioma1;
    }

    public String getIdioma2() {
        return this.idioma2;
    }

    public void cerrar() throws IOException, Exception {
        PrintWriter pw;
        pw = new PrintWriter(new FileWriter(this.file));
        pw.println(this.getIdioma1());
        pw.println(this.getIdioma2());
        for (String palabra1: this.map.keySet()) {
            Set<String> traducciones = this.map.get(palabra1);
            if (traducciones.isEmpty()) {
                pw.println(palabra1 + ":");
            }
            for (String palabra2: traducciones) {
                pw.println(palabra1 + ":" + palabra2);
            }
        }
        pw.close();   
    }

    public Set<String> buscarLengua1(String palabra) throws Exception {
        if (this.map.get(palabra) == null) {
            throw new Exception("La palabra no está registrada en el diccionario.");
        }
        return this.map.get(palabra);
    }

    public Set<String> buscarLengua2(String palabra) throws Exception {
        Set<String> traducciones = new HashSet<>();
        boolean isRegistrada = false;
        for (String palabra1: this.map.keySet()) {
            if (buscarLengua1(palabra1).contains(palabra)) {
                traducciones.add(palabra1);
                isRegistrada = true;
            }   
        }
        if (!isRegistrada) {
            throw new Exception("La palabra no está registrada en el diccionario.");
        }
        return traducciones;
    }

    public final void insertar(String palabra1, String palabra2) {
        Set<String> traducciones = this.map.get(palabra1);
        if (traducciones == null) {
            traducciones = new HashSet<>();
            this.map.put(palabra1, traducciones);
        }   
        if (!palabra2.equals("")) {
            traducciones.add(palabra2);
            Set<String> palabrasLengua2SinTraduccion = this.map.get("");
            if (palabrasLengua2SinTraduccion != null) {
                try {
                    Set<String> traduccionesPalabra2;
                    traduccionesPalabra2 = this.buscarLengua2(palabra2);
                    traduccionesPalabra2.remove("");
                    if (!traduccionesPalabra2.isEmpty())
                        palabrasLengua2SinTraduccion.remove(palabra2);
                    if (palabrasLengua2SinTraduccion.isEmpty())
                        this.map.remove("");
                } catch (Exception e) {}
            }
        }
    }
}
