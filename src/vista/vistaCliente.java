/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import cliente.Conector;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author angel
 */
public class vistaCliente extends javax.swing.JFrame {

    Conector server = new Conector();

    /**
     * Creates new form vistaCliente
     */
    public vistaCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        textPuerto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonConectar = new javax.swing.JButton();
        buttonEnviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        textEnviar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textServer = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonEnviar1 = new javax.swing.JButton();
        buttonEnviar2 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.gray);
        getContentPane().setLayout(null);

        textPuerto.setBackground(new java.awt.Color(52, 56, 59));
        textPuerto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textPuerto.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(textPuerto);
        textPuerto.setBounds(550, 30, 80, 28);

        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PUERTO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 0, 90, 30);

        buttonConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonConectar.png"))); // NOI18N
        buttonConectar.setBorder(null);
        buttonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConectarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonConectar);
        buttonConectar.setBounds(640, 10, 50, 50);

        buttonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton.png"))); // NOI18N
        buttonEnviar.setText("Enviar");
        buttonEnviar.setBorder(null);
        buttonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEnviar);
        buttonEnviar.setBounds(720, 350, 60, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CLIENTE SOCKET");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(990, 13, 148, 28);

        jLabel6.setText("Angel Ruiz - David Morales");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(990, 53, 153, 16);

        jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOMBRE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 10, 120, 19);

        txtNombre.setBackground(new java.awt.Color(52, 56, 59));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(220, 30, 117, 23);

        textEnviar.setBackground(new java.awt.Color(52, 56, 59));
        textEnviar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        textEnviar.setForeground(new java.awt.Color(255, 255, 255));
        textEnviar.setBounds(150, 150, 150, 150);
        textEnviar.setBorder(null);
        textEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textEnviar.setPreferredSize(new java.awt.Dimension(5, 22));
        textEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(textEnviar);
        textEnviar.setBounds(100, 360, 600, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BarraWs.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 350, 720, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BG.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 340, 780, 70);

        textServer.setEditable(false);
        textServer.setBackground(new java.awt.Color(0, 0, 0));
        textServer.setColumns(20);
        textServer.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        textServer.setForeground(new java.awt.Color(255, 255, 255));
        textServer.setRows(5);
        textServer.setAlignmentX(1.0F);
        textServer.setBorder(null);
        jScrollPane1.setViewportView(textServer);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 780, 290);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wsIcon.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-110, 0, 400, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bgTOP.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 780, 70);

        buttonEnviar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton.png"))); // NOI18N
        buttonEnviar1.setText("Enviar");
        buttonEnviar1.setBorder(null);
        buttonEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviar1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEnviar1);
        buttonEnviar1.setBounds(720, 350, 60, 60);

        buttonEnviar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Boton.png"))); // NOI18N
        buttonEnviar2.setText("Enviar");
        buttonEnviar2.setBorder(null);
        buttonEnviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviar2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEnviar2);
        buttonEnviar2.setBounds(720, 350, 60, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTextEnviar() {
        return textEnviar;
    }

    public void setTextEnviar(JTextField textEnviar) {
        this.textEnviar = textEnviar;
    }


    public JTextField getTextPuerto() {
        return textPuerto;
    }

    public void setTextPuerto(JTextField textPuerto) {
        this.textPuerto = textPuerto;
    }

    public JTextArea getTextServer() {
        return textServer;
    }

    public void setTextServer(JTextArea textServer) {
        this.textServer = textServer;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    private void buttonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConectarActionPerformed
        // TODO add your handling code here:
        server.start();
    }//GEN-LAST:event_buttonConectarActionPerformed

    private void buttonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarActionPerformed
        server.enviarMsg();
    }//GEN-LAST:event_buttonEnviarActionPerformed

    private void textEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEnviarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void buttonEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnviar1ActionPerformed

    private void buttonEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnviar2ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCliente().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConectar;
    private javax.swing.JButton buttonEnviar;
    private javax.swing.JButton buttonEnviar1;
    private javax.swing.JButton buttonEnviar2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textEnviar;
    private javax.swing.JTextField textPuerto;
    private javax.swing.JTextArea textServer;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
