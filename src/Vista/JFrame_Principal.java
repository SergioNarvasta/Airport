
package Vista;


public class JFrame_Principal extends javax.swing.JFrame {
    
     ObjDialogoCiudad ObjDialogCiudad = new ObjDialogoCiudad(null, true);
     ObjDialogoCliente ObjDialogCliente = new ObjDialogoCliente(null, true);
     ObjDialogoPais ObjDialogPais = new ObjDialogoPais(null, true);
     ObjDialogoVuelo ObjDialogVuelo = new ObjDialogoVuelo(null, true);
     ObjJDialogoBoleto ObjDialogBoleto = new ObjJDialogoBoleto(null, true);
    /**
     * Creates new form JFrame_Principal
     */
    public JFrame_Principal() {
        initComponents();
        setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnu_Salir = new javax.swing.JMenu();
        Menu_Salir = new javax.swing.JMenuItem();
        mnu_Mantenimiento = new javax.swing.JMenu();
        Menu_Pais = new javax.swing.JMenuItem();
        Menu_Ciudad = new javax.swing.JMenuItem();
        Menu_Cliente = new javax.swing.JMenuItem();
        Menu_Vuelo = new javax.swing.JMenuItem();
        Menu_Operaciones = new javax.swing.JMenu();
        Menu_Boletos = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SISTEMA DE GESTION AEROPUERTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        mnu_Salir.setText("Archivo");
        mnu_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_SalirActionPerformed(evt);
            }
        });

        Menu_Salir.setText("Salir");
        Menu_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_SalirActionPerformed(evt);
            }
        });
        mnu_Salir.add(Menu_Salir);

        jMenuBar2.add(mnu_Salir);

        mnu_Mantenimiento.setText("Mantenimiento");

        Menu_Pais.setText("Pais");
        Menu_Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_PaisActionPerformed(evt);
            }
        });
        mnu_Mantenimiento.add(Menu_Pais);

        Menu_Ciudad.setText("Ciudad");
        Menu_Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_CiudadActionPerformed(evt);
            }
        });
        mnu_Mantenimiento.add(Menu_Ciudad);

        Menu_Cliente.setText("Cliente");
        Menu_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ClienteActionPerformed(evt);
            }
        });
        mnu_Mantenimiento.add(Menu_Cliente);

        Menu_Vuelo.setText("Vuelo");
        Menu_Vuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_VueloActionPerformed(evt);
            }
        });
        mnu_Mantenimiento.add(Menu_Vuelo);

        jMenuBar2.add(mnu_Mantenimiento);

        Menu_Operaciones.setText("Operaciones");

        Menu_Boletos.setText("Venta de Boletos");
        Menu_Boletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_BoletosActionPerformed(evt);
            }
        });
        Menu_Operaciones.add(Menu_Boletos);

        jMenuBar2.add(Menu_Operaciones);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Menu_SalirActionPerformed

    private void mnu_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_SalirActionPerformed

    private void Menu_CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_CiudadActionPerformed
        ObjDialogCiudad.setVisible(true);
    }//GEN-LAST:event_Menu_CiudadActionPerformed

    private void Menu_BoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_BoletosActionPerformed
        ObjDialogBoleto.setVisible(true);
    }//GEN-LAST:event_Menu_BoletosActionPerformed

    private void Menu_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ClienteActionPerformed
        ObjDialogCliente.setVisible(true);
    }//GEN-LAST:event_Menu_ClienteActionPerformed

    private void Menu_PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_PaisActionPerformed
        ObjDialogPais.setVisible(true);
    }//GEN-LAST:event_Menu_PaisActionPerformed

    private void Menu_VueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_VueloActionPerformed
        ObjDialogVuelo.setVisible(true);
    }//GEN-LAST:event_Menu_VueloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_Boletos;
    private javax.swing.JMenuItem Menu_Ciudad;
    private javax.swing.JMenuItem Menu_Cliente;
    private javax.swing.JMenu Menu_Operaciones;
    private javax.swing.JMenuItem Menu_Pais;
    private javax.swing.JMenuItem Menu_Salir;
    private javax.swing.JMenuItem Menu_Vuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnu_Mantenimiento;
    private javax.swing.JMenu mnu_Salir;
    // End of variables declaration//GEN-END:variables
}