import java.io.File;
import java.io.IOException;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

public class DiccionarioMain extends javax.swing.JFrame {
    
    private IntroduceIdiomas dialog = new IntroduceIdiomas(this, true);
    private DiccionarioBilingue diccionarioB = null;
    
    public DiccionarioMain() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        textoIdioma1 = new javax.swing.JTextField();
        textoIdioma2 = new javax.swing.JTextField();
        buttonMain = new javax.swing.JButton();
        etIdioma2 = new javax.swing.JLabel();
        etIdioma1 = new javax.swing.JLabel();
        etMensajes = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemNuevo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemSalir = new javax.swing.JMenuItem();
        menuModo = new javax.swing.JMenu();
        radioButtonAñadir = new javax.swing.JRadioButtonMenuItem();
        radioButtonBuscar = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diccionario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lista1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lista1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lista1.setMaximumSize(new java.awt.Dimension(1, 1));
        lista1.setMinimumSize(new java.awt.Dimension(1, 1));
        jScrollPane1.setViewportView(lista1);

        lista2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lista2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lista2.setMaximumSize(new java.awt.Dimension(1, 1));
        lista2.setMinimumSize(new java.awt.Dimension(1, 1));
        jScrollPane2.setViewportView(lista2);

        textoIdioma1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textoIdioma1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoIdioma2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textoIdioma2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonMain.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonMain.setText("Buscar");
        buttonMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMainActionPerformed(evt);
            }
        });

        etIdioma2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        etIdioma2.setText("Idioma2");

        etIdioma1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        etIdioma1.setText("Idioma1");

        etMensajes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etMensajes.setText("Mensajes:");
        etMensajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menuBar.setMaximumSize(new java.awt.Dimension(90, 21));
        menuBar.setMinimumSize(new java.awt.Dimension(90, 21));

        menuArchivo.setMnemonic('a');
        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        menuItemAbrir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuItemAbrir.setMnemonic('a');
        menuItemAbrir.setText("Abrir");
        menuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemAbrir);

        menuItemNuevo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuItemNuevo.setMnemonic('n');
        menuItemNuevo.setText("Nuevo");
        menuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemNuevo);
        menuArchivo.add(jSeparator1);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemSalir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuItemSalir.setMnemonic('s');
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemSalir);

        menuBar.add(menuArchivo);

        menuModo.setMnemonic('m');
        menuModo.setText("Modo");
        menuModo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        radioButtonAñadir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        buttonGroup1.add(radioButtonAñadir);
        radioButtonAñadir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        radioButtonAñadir.setText("Añadir");
        radioButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonAñadirActionPerformed(evt);
            }
        });
        menuModo.add(radioButtonAñadir);

        radioButtonBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        buttonGroup1.add(radioButtonBuscar);
        radioButtonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        radioButtonBuscar.setSelected(true);
        radioButtonBuscar.setText("Buscar");
        radioButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonBuscarActionPerformed(evt);
            }
        });
        menuModo.add(radioButtonBuscar);

        menuBar.add(menuModo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(textoIdioma1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(textoIdioma2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(etIdioma1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etIdioma2)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(buttonMain)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etIdioma2)
                    .addComponent(etIdioma1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoIdioma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoIdioma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(buttonMain)
                .addGap(18, 18, 18)
                .addComponent(etMensajes)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoActionPerformed
        File file = this.selectFile();
        if (file != null) {
            if (this.dialog.mostrar() == IntroduceIdiomas.ACEPTAR) {
                this.toEstadoInicial();
                String idioma1 = this.dialog.getNombreIdioma1();
                String idioma2 = this.dialog.getNombreIdioma2();
                this.diccionarioB = new DiccionarioBilingue(file, idioma1, 
                        idioma2);
                this.radioButtonAñadir.setSelected(true);
                this.radioButtonAñadirActionPerformed(evt);
                this.etIdioma1.setText(idioma1);
                this.etIdioma2.setText(idioma2);
                this.buttonMain.setEnabled(true);
            } 
        }
    }//GEN-LAST:event_menuItemNuevoActionPerformed

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
        File file = this.selectFile();
        if (file != null) {
            try {
                if (file.exists()) {
                    this.toEstadoInicial();
                    try {
                        this.diccionarioB = new DiccionarioBilingue(file);
                        this.buttonMain.setEnabled(true);
                        this.etIdioma1.setText(diccionarioB.getIdioma1());
                        this.etIdioma2.setText(diccionarioB.getIdioma2());
                    } catch (IOException e) {
                        throw new Exception("Problemas de lectura o formato "
                                + "en el fichero.");
                    }
                } else {
                    throw new Exception("El fichero no existe.");
                }
            } catch (Exception e) {
                this.actualizaMensajes(e.getMessage());
            }
        }
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private void radioButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonBuscarActionPerformed
        this.clearMensaje();
        this.clearListas();
        this.clearTextoIdiomas();
        this.buttonMain.setText("Buscar");  
    }//GEN-LAST:event_radioButtonBuscarActionPerformed

    private void buttonMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMainActionPerformed
        this.clearMensaje();
        this.clearListas();
        String palabra1 = this.textoIdioma1.getText();
        String palabra2 = this.textoIdioma2.getText();
        DefaultListModel listModel1 = new DefaultListModel();
        DefaultListModel listModel2 = new DefaultListModel();
        try {
            if (this.radioButtonBuscar.isSelected()) {
                if (!palabra1.equals("")) {
                    Set<String> traducciones = this.diccionarioB.buscarLengua1(
                            palabra1);
                    if (traducciones.isEmpty()) {
                        throw new Exception("La palabra no tiene traducciones "
                                + "disponibles.");
                    }
                    for (String palabra: traducciones) {
                        listModel2.addElement(palabra);
                    }
                    this.lista2.setModel(listModel2);
                } else if (!palabra2.equals("")) {
                    Set<String> traducciones = this.diccionarioB.buscarLengua2(
                            palabra2);
                    if (traducciones.size() == 1 && traducciones.contains("")) {
                        throw new Exception("La palabra no tiene traducciones "
                                + "disponibles.");
                    }
                    for (String palabra: traducciones) {
                        if (!palabra.equals("")) {
                            listModel1.addElement(palabra);
                        }
                    }
                    this.lista1.setModel(listModel1);
                } else {
                    throw new Exception("Los campos de texto están ambos vacíos.");
                }    
            } else if (!palabra1.equals("") || !palabra2.equals("")) {
                this.diccionarioB.insertar(palabra1, palabra2);
                throw new Exception("Palabras añadidas al diccionario "
                        + "correctamente.");
            } else {
                throw new Exception("Los campos de texto están ambos vacíos");
            }
        } catch (Exception e) {
            this.actualizaMensajes(e.getMessage());
        }
    }//GEN-LAST:event_buttonMainActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        this.cerrarDiccionario();
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.cerrarDiccionario();
    }//GEN-LAST:event_formWindowClosing

    private void radioButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonAñadirActionPerformed
        this.clearMensaje();
        this.clearListas();
        this.clearTextoIdiomas();
        this.buttonMain.setText("Añadir");
    }//GEN-LAST:event_radioButtonAñadirActionPerformed

    private File selectFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File fichero = fileChooser.getSelectedFile();
            return fichero;
        }
        return null;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DiccionarioMain diccionario = new DiccionarioMain();
                diccionario.pack();
                diccionario.setVisible(true);
                diccionario.buttonMain.setEnabled(false);
            }
        });
    }

    private void clearMensaje() {
        this.etMensajes.setText("Mensajes: ");
    }
    
    private void clearListas() {
        this.lista1.setModel(new DefaultListModel());
        this.lista2.setModel(new DefaultListModel());
    }
    
    private void clearTextoIdiomas() {
        this.textoIdioma1.setText("");
        this.textoIdioma2.setText("");
    }
    
    private void actualizaMensajes(String message) {
        this.etMensajes.setText("Mensajes: " + message);
    }
    
    private void cerrarDiccionario() {
        if (this.diccionarioB != null) {
            try{
                try {
                    this.diccionarioB.cerrar();
                    this.diccionarioB = null;
                } catch (IOException e) {
                    throw new Exception("Problemas de escritura en el fichero.");
                }
            } catch (Exception e) {
                this.actualizaMensajes(e.getMessage());
            }
        }
    }
    
    private void toEstadoInicial() {
        this.cerrarDiccionario();
        this.clearMensaje();
        this.clearListas();
        this.clearTextoIdiomas();
        this.etIdioma1.setText("Idioma1");
        this.etIdioma2.setText("Idioma2");
        this.radioButtonBuscar.setSelected(true);
        this.buttonMain.setText("Buscar");
        this.buttonMain.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonMain;
    private javax.swing.JLabel etIdioma1;
    private javax.swing.JLabel etIdioma2;
    private javax.swing.JLabel etMensajes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> lista2;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemNuevo;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuModo;
    private javax.swing.JRadioButtonMenuItem radioButtonAñadir;
    private javax.swing.JRadioButtonMenuItem radioButtonBuscar;
    private javax.swing.JTextField textoIdioma1;
    private javax.swing.JTextField textoIdioma2;
    // End of variables declaration//GEN-END:variables
}
