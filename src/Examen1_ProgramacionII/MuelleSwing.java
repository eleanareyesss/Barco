
package Examen1_ProgramacionII;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MuelleSwing extends javax.swing.JFrame {
    private ArrayList<Barco> barcos;
    
    public MuelleSwing() {
        barcos = new ArrayList<>();
        
        initComponents();
        MenuPrincipal.setVisible(true);
        AgregarBarco.setVisible(false);
        AgregarElemento.setVisible(false);
        VaciarBarco.setVisible(false);
        BarcosPorFecha.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        MenuPrincipal = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AgregarBarco = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        AgregarElemento = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        VaciarBarco = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        BarcosPorFecha = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 470));
        setMinimumSize(new java.awt.Dimension(720, 470));

        jPanel.setBackground(new java.awt.Color(255, 153, 255));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPrincipal.setBackground(new java.awt.Color(255, 153, 255));
        MenuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(153, 0, 153));
        jButton5.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        MenuPrincipal.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 280, 50));

        jButton4.setBackground(new java.awt.Color(153, 0, 153));
        jButton4.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BARCOS POR FECHA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        MenuPrincipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 280, 50));

        jButton3.setBackground(new java.awt.Color(153, 0, 153));
        jButton3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("VACIAR BARCO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MenuPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 280, 50));

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("AGREGAR ELEMENTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MenuPrincipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 280, 50));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AGREGAR BARCO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MenuPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 280, 50));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ PRINCIPAL");
        MenuPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jPanel.add(MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        AgregarBarco.setBackground(new java.awt.Color(255, 204, 255));
        AgregarBarco.setMaximumSize(new java.awt.Dimension(720, 470));
        AgregarBarco.setMinimumSize(new java.awt.Dimension(720, 470));
        AgregarBarco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setBackground(new java.awt.Color(153, 0, 153));
        jButton10.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("AGREGAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        AgregarBarco.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 140, 40));

        jButton6.setBackground(new java.awt.Color(153, 0, 153));
        jButton6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("REGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        AgregarBarco.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 140, 40));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE DEL BARCO:");
        AgregarBarco.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AGREGAR BARCO");
        AgregarBarco.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(153, 0, 153));
        jComboBox1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‏‏‎ ‎", "PESQUERO", "PASAJERO" }));
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBox1KeyReleased(evt);
            }
        });
        AgregarBarco.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIPO DE BARCO:");
        AgregarBarco.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        AgregarBarco.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 160, -1));

        jPanel.add(AgregarBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        AgregarElemento.setBackground(new java.awt.Color(255, 204, 255));
        AgregarElemento.setMaximumSize(new java.awt.Dimension(720, 470));
        AgregarElemento.setMinimumSize(new java.awt.Dimension(720, 470));
        AgregarElemento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(153, 0, 153));
        jButton7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("REGRESAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        AgregarElemento.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 140, 40));

        jPanel.add(AgregarElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        VaciarBarco.setBackground(new java.awt.Color(255, 204, 255));
        VaciarBarco.setMaximumSize(new java.awt.Dimension(720, 470));
        VaciarBarco.setMinimumSize(new java.awt.Dimension(720, 470));
        VaciarBarco.setPreferredSize(new java.awt.Dimension(720, 470));
        VaciarBarco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(153, 0, 153));
        jButton8.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("REGRESAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        VaciarBarco.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 140, 40));

        jPanel.add(VaciarBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        BarcosPorFecha.setBackground(new java.awt.Color(255, 204, 255));
        BarcosPorFecha.setMaximumSize(new java.awt.Dimension(720, 470));
        BarcosPorFecha.setMinimumSize(new java.awt.Dimension(720, 470));
        BarcosPorFecha.setPreferredSize(new java.awt.Dimension(720, 470));
        BarcosPorFecha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setBackground(new java.awt.Color(153, 0, 153));
        jButton9.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("REGRESAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        BarcosPorFecha.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 140, 40));

        jPanel.add(BarcosPorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AgregarBarco.setVisible(true);
        MenuPrincipal.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AgregarElemento.setVisible(true);
        MenuPrincipal.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VaciarBarco.setVisible(true);
        MenuPrincipal.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        BarcosPorFecha.setVisible(true);
        MenuPrincipal.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        AgregarBarco.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AgregarElemento.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        VaciarBarco.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        BarcosPorFecha.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jComboBox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyReleased
        if(jComboBox1.getSelectedIndex()==0){
           jLabel2.setVisible(false);
           jTextField1.setVisible(false);
        }else if(jComboBox1.getSelectedIndex()==1){
           jLabel2.setVisible(true);
           jTextField1.setVisible(true);
        }else{
            
        }
    }//GEN-LAST:event_jComboBox1KeyReleased

    private Barco buscarBarco(String nombre) {
        for (Barco barcoNombre : barcos) {
            if (barcoNombre.getNombre().equals(nombre)) {
                return barcoNombre;
            }
        }
        return null;
    }
    
    private void agregarBarco(String tipo) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Nombre del Barco: ");
        String nombre = lector.nextLine().toUpperCase();
        
        if (buscarBarco(nombre) != null) {
            System.out.println("El barco ya existe.");
            return;
        } else {
            switch (tipo.toUpperCase()) {
                case "PESQUERO":
                    System.out.println("");
                    System.out.println("Tipos: (Pez / Camaron / Langosta)");
                    System.out.print("¿Qué tipo de barco pesquero?: ");
                    String tipoPesquero = lector.nextLine().toUpperCase();
                    
                    if (tipoPesquero.equals("PEZ")) {
                        BarcoPesquero barcoPesquero = new BarcoPesquero(nombre, TipoPesquero.PEZ);
                        barcos.add(barcoPesquero);
                        System.out.println("¡Barco Agregado Exitosamente!");
                    } else if (tipoPesquero.equals("CAMARON")) {
                        BarcoPesquero barcoPesquero = new BarcoPesquero(nombre, TipoPesquero.CAMARON);
                        barcos.add(barcoPesquero);
                        System.out.println("¡Barco Agregado Exitosamente!");
                    } else if (tipoPesquero.equals("LANGOSTA")) {
                        BarcoPesquero barcoPesquero = new BarcoPesquero(nombre, TipoPesquero.LANGOSTA);
                        barcos.add(barcoPesquero);
                        System.out.println("¡Barco Agregado Exitosamente!");
                    } else {
                        System.out.println("Tipo de barco pesquero no válido.");
                    }
                    System.out.println("");
                    break;
                    
                case "PASAJERO":
                    System.out.println("");
                    System.out.print("Limite de Pasajeros: ");
                    int limitePasajeros = lector.nextInt();
                    
                    System.out.print("Precio de Boleto: $. ");
                    double precioBoleto = lector.nextDouble();
                    
                    BarcoPasajero barcoPasajero = new BarcoPasajero(nombre, limitePasajeros, precioBoleto);
                    barcos.add(barcoPasajero);
                    System.out.println("¡Barco Agregado Exitosamente!");
                    System.out.println("");
                    break;
                    
                default: 
                    System.out.println("Tipo de barco inválido.");
                    System.out.println("");
                    break;
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(MuelleSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MuelleSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MuelleSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MuelleSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MuelleSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarBarco;
    private javax.swing.JPanel AgregarElemento;
    private javax.swing.JPanel BarcosPorFecha;
    private javax.swing.JPanel MenuPrincipal;
    private javax.swing.JPanel VaciarBarco;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}