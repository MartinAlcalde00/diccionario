
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Scanner sc = new Scanner(this.file);
        if (sc.hasNextLine()) {
            String idioma1 = sc.nextLine();
            this.idioma1 = idioma1;
        }
        if (sc.hasNextLine()) {
            String idioma2 = sc.nextLine();
            this.idioma2 = idioma2;
        }
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (!line.startsWith(":")) {
                String palabra1 = line.split(":")[0];
                String palabra2 = line.split(":")[1];
                if (map.get(palabra1) == null) {
                    map.put(palabra1, new HashSet<>());
                }
                Set<String> conjuntoImagen = map.get(palabra1);
                conjuntoImagen.add(palabra2);
                map.put(palabra1, conjuntoImagen);
            }
        }
    }

    public String getIdioma1() {
        return idioma1;
    }

    public void setIdioma1(String idioma1) {
        this.idioma1 = idioma1;
    }

    public String getIdioma2() {
        return idioma2;
    }

    public void setIdioma2(String idioma2) {
        this.idioma2 = idioma2;
    }

    public void cerrar() {
        PrintWriter pw;
        try {
            pw = new PrintWriter(new FileWriter(this.file));
            pw.println(this.getIdioma1());
            pw.println(this.getIdioma2());
            for (Map.Entry<String, Set<String>> entry : this.map.entrySet()) {
                String palabra = entry.getKey();
                for (String palabra2: entry.getValue()) {
                    pw.println(palabra + ":" + palabra2);
                }
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(DiccionarioBilingue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Set<String> buscarLengua1(String palabra) {
        return this.map.get(palabra);
    }

    public Set<String> buscarLengua2(String palabra) {
        return this.map.get(palabra);
    }

    public void insertar(String palabra1, String palabra2) {
        if (map.get(palabra1) == null) {
            map.put(palabra1, new HashSet<>());
        }
        this.map.get(palabra1).add(palabra2);
        for (Map.Entry<String, Set<String>> entry : this.map.entrySet()) {
            System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
        }
    }
}
