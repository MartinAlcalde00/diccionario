import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

public class DiccionarioMain extends javax.swing.JFrame {

    private JDialog dialogoIntroduceIdiomas = new IntroduceIdiomas(this, true);
    private String idioma1 = null;
    private String idioma2 = null;
    private DiccionarioBilingue diccionarioBilingue = null;
    private File fileOpened;
    private boolean isModoBuscar = false;
    public DiccionarioMain() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        textoIdioma1 = new javax.swing.JTextField();
        textoIdioma2 = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();
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
        radioButtonAdd = new javax.swing.JRadioButtonMenuItem();
        radioButtonSearch = new javax.swing.JRadioButtonMenuItem();

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setViewportView(lista1);

        jScrollPane2.setViewportView(lista2);

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        etIdioma2.setText("Idioma2");

        etIdioma1.setText("Idioma1");

        etMensajes.setText("Mensajes:");
        etMensajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menuBar.setMaximumSize(new java.awt.Dimension(90, 21));
        menuBar.setMinimumSize(new java.awt.Dimension(90, 21));

        menuArchivo.setMnemonic('a');
        menuArchivo.setText("Archivo");

        menuItemAbrir.setMnemonic('a');
        menuItemAbrir.setText("Abrir");
        menuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemAbrir);

        menuItemNuevo.setMnemonic('n');
        menuItemNuevo.setText("Nuevo");
        menuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemNuevo);
        menuArchivo.add(jSeparator1);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemSalir.setMnemonic('s');
        menuItemSalir.setText("Salir");
        menuArchivo.add(menuItemSalir);

        menuBar.add(menuArchivo);

        menuModo.setMnemonic('m');
        menuModo.setText("Modo");

        radioButtonAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        buttonGroup1.add(radioButtonAdd);
        radioButtonAdd.setText("Añadir");
        menuModo.add(radioButtonAdd);

        radioButtonSearch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        buttonGroup1.add(radioButtonSearch);
        radioButtonSearch.setSelected(true);
        radioButtonSearch.setText("Buscar");
        radioButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonSearchActionPerformed(evt);
            }
        });
        menuModo.add(radioButtonSearch);

        menuBar.add(menuModo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(textoIdioma1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(textoIdioma2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(etIdioma1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etIdioma2)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(buttonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addComponent(buttonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(etMensajes)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoActionPerformed
        File file = this.selectFile();
        this.fileOpened = file;
        if (file.exists()) {
            PrintWriter writer = null;
            try {
                writer = new PrintWriter(new FileWriter(file, false));
            } catch (Exception ex) {
            }
            writer.print("");
            writer.close();
            this.dialogoIntroduceIdiomas.setVisible(true);
            this.dialogoIntroduceIdiomas.addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    System.out.print("llega");
                }
            });
            this.dialogoIntroduceIdiomas.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    String idioma1 = DiccionarioMain.this.getIdioma1();
                    String idioma2 = DiccionarioMain.this.getIdioma2();
                    DiccionarioMain.this.buttonBuscar.setText("Añadir");
                    DiccionarioMain.this.etIdioma1.setText(idioma1);
                    DiccionarioMain.this.etIdioma2.setText(idioma2);
                    DiccionarioMain.this.buttonBuscar.setEnabled(true);
                    DiccionarioMain.this.diccionarioBilingue = new DiccionarioBilingue(file, idioma1, idioma2);
                }
            });
        }
    }//GEN-LAST:event_menuItemNuevoActionPerformed

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
        File file = this.selectFile();
        if (file.exists()) {
            this.radioButtonSearch.setSelected(true);
        }
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private void radioButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonSearchActionPerformed
        //this.diccionarioBilingue.cerrar();
        this.isModoBuscar = true;
        this.buttonBuscar.setText("Buscar");
    }//GEN-LAST:event_radioButtonSearchActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        if (this.textoIdioma1 != null || this.textoIdioma2 != null) {
            if (this.isModoBuscar) {
                String palabraABuscar = null;
                if (this.textoIdioma1.getText() != null) {
                    System.out.println(this.diccionarioBilingue.buscarLengua1(this.textoIdioma1.getText()));
                }
            } else {
                this.diccionarioBilingue.insertar(this.textoIdioma1.getText(), this.textoIdioma2.getText());
            }
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private File selectFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File fichero = fileChooser.getSelectedFile();
            return fichero;
        }
        return new File("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DiccionarioMain diccionario = new DiccionarioMain();
                diccionario.setVisible(true);
                diccionario.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                diccionario.buttonBuscar.setEnabled(false);
            }
        });
    }

    public void setIdioma1(String idioma1) {
        this.idioma1 = idioma1;
    }

    public void setIdioma2(String idioma2) {
        this.idioma2 = idioma2;
    }

    public String getIdioma1() {
        return this.idioma1;
    }

    public String getIdioma2() {
        return this.idioma2;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etIdioma1;
    private javax.swing.JLabel etIdioma2;
    private javax.swing.JLabel etMensajes;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
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
    private javax.swing.JRadioButtonMenuItem radioButtonAdd;
    private javax.swing.JRadioButtonMenuItem radioButtonSearch;
    private javax.swing.JTextField textoIdioma1;
    private javax.swing.JTextField textoIdioma2;
    // End of variables declaration//GEN-END:variables
}
