public class IntroduceIdiomas extends javax.swing.JDialog {

    public static final int ACEPTAR = 1;
    public static final int CANCELAR = 0;
    private int botonPulsado;
    private String nombreIdioma1;
    private String nombreIdioma2;
    
    public IntroduceIdiomas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoIdioma1 = new javax.swing.JTextField();
        textoIdioma2 = new javax.swing.JTextField();
        buttonAceptar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        etIdioma2 = new javax.swing.JLabel();
        etIdioma1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textoIdioma1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textoIdioma1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoIdioma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIdioma1ActionPerformed(evt);
            }
        });

        textoIdioma2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textoIdioma2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoIdioma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIdioma2ActionPerformed(evt);
            }
        });

        buttonAceptar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonAceptar.setMnemonic('a');
        buttonAceptar.setText("Aceptar");
        buttonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAceptarActionPerformed(evt);
            }
        });

        buttonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonCancelar.setMnemonic('c');
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        etIdioma2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        etIdioma2.setText("Idioma2");

        etIdioma1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        etIdioma1.setText("Idioma1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(textoIdioma1)
                    .addComponent(textoIdioma2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etIdioma1)
                            .addComponent(etIdioma2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etIdioma1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoIdioma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etIdioma2)
                .addGap(4, 4, 4)
                .addComponent(textoIdioma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonAceptar)
                .addGap(18, 18, 18)
                .addComponent(buttonCancelar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoIdioma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIdioma1ActionPerformed
        this.nombreIdioma1 = this.textoIdioma1.getText().trim();
    }//GEN-LAST:event_textoIdioma1ActionPerformed

    private void textoIdioma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIdioma2ActionPerformed
        this.nombreIdioma2 = this.textoIdioma2.getText().trim();
    }//GEN-LAST:event_textoIdioma2ActionPerformed

    private void buttonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAceptarActionPerformed
        this.textoIdioma1ActionPerformed(evt);
        this.textoIdioma2ActionPerformed(evt);
        if (!this.nombreIdioma1.equals("") && 
                !this.nombreIdioma2.equals("")) {
            this.botonPulsado = ACEPTAR;
            this.dispose();
        }
    }//GEN-LAST:event_buttonAceptarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.botonPulsado = CANCELAR;
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.botonPulsado = CANCELAR;
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    public String getNombreIdioma1() {
        return this.nombreIdioma1;
    }

    public String getNombreIdioma2() {
        return this.nombreIdioma2;
    }
    
    public int mostrar() {
        this.textoIdioma1.setText("");
        this.textoIdioma2.setText("");
        this.setVisible(true);
        return this.botonPulsado;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAceptar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JLabel etIdioma1;
    private javax.swing.JLabel etIdioma2;
    private javax.swing.JTextField textoIdioma1;
    private javax.swing.JTextField textoIdioma2;
    // End of variables declaration//GEN-END:variables
}
