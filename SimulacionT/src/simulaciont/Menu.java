/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simulaciont;

/**
 *
 * @author ivann
 */
public class Menu extends javax.swing.JFrame {
    Cola cola;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        cola = new Cola();
        cola.encolar("Golf", true, 4,"VOLKSWAGEN" , "DEPORTIVO", 1000);
        cola.encolar("Tsuru 2", true, 4,"NISSAN" , "PENE", 1000);
    }
    
    public Menu(Cola coche) {
        initComponents();
        cola = coche;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMCarros = new javax.swing.JMenu();
        jmiAgregar = new javax.swing.JMenuItem();
        jmiRecorrer = new javax.swing.JMenuItem();
        jmiBorrar = new javax.swing.JMenuItem();
        jmiBuscar = new javax.swing.JMenuItem();
        jMNoticias = new javax.swing.JMenu();
        jMNosotros = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMCarros.setText("Carros");

        jmiAgregar.setText("Agregar");
        jmiAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarActionPerformed(evt);
            }
        });
        jMCarros.add(jmiAgregar);

        jmiRecorrer.setText("Recorrer");
        jmiRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRecorrerActionPerformed(evt);
            }
        });
        jMCarros.add(jmiRecorrer);

        jmiBorrar.setText("Borrar");
        jmiBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBorrarActionPerformed(evt);
            }
        });
        jMCarros.add(jmiBorrar);

        jmiBuscar.setText("Buscar");
        jmiBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarActionPerformed(evt);
            }
        });
        jMCarros.add(jmiBuscar);

        jMenuBar1.add(jMCarros);

        jMNoticias.setText("Noticias");
        jMenuBar1.add(jMNoticias);

        jMNosotros.setText("Nosotros");
        jMenuBar1.add(jMNosotros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarActionPerformed
        Formulario registar = new Formulario(cola);
        registar.setVisible(true);
        registar.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jmiAgregarActionPerformed

    private void jmiRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRecorrerActionPerformed
        cola.recorrerCola();
    }//GEN-LAST:event_jmiRecorrerActionPerformed

    private void jmiBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBorrarActionPerformed
        cola.desencolar();

    }//GEN-LAST:event_jmiBorrarActionPerformed

    private void jmiBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jmiBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMCarros;
    private javax.swing.JMenu jMNosotros;
    private javax.swing.JMenu jMNoticias;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAgregar;
    private javax.swing.JMenuItem jmiBorrar;
    private javax.swing.JMenuItem jmiBuscar;
    private javax.swing.JMenuItem jmiRecorrer;
    // End of variables declaration//GEN-END:variables
}
