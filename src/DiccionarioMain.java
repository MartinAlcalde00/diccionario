import javax.swing.JDialog;

public class DiccionarioMain extends javax.swing.JFrame {

    private JDialog dialogoIntroduceIdiomas = new IntroduceIdiomas(this, true);
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
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setViewportView(lista1);

        jScrollPane2.setViewportView(lista2);

        buttonBuscar.setText("Buscar");

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
        menuArchivo.add(menuItemAbrir);

        menuItemNuevo.setMnemonic('n');
        menuItemNuevo.setText("Nuevo");
        menuArchivo.add(menuItemNuevo);
        menuArchivo.add(jSeparator1);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemSalir.setMnemonic('s');
        menuItemSalir.setText("Salir");
        menuArchivo.add(menuItemSalir);

        menuBar.add(menuArchivo);

        menuModo.setMnemonic('m');
        menuModo.setText("Modo");

        jRadioButtonMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Añadir");
        menuModo.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Buscar");
        menuModo.add(jRadioButtonMenuItem2);

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DiccionarioMain diccionario = new DiccionarioMain();
                diccionario.dialogoIntroduceIdiomas.setVisible(true);
                diccionario.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etIdioma1;
    private javax.swing.JLabel etIdioma2;
    private javax.swing.JLabel etMensajes;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
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
    private javax.swing.JTextField textoIdioma1;
    private javax.swing.JTextField textoIdioma2;
    // End of variables declaration//GEN-END:variables
}
