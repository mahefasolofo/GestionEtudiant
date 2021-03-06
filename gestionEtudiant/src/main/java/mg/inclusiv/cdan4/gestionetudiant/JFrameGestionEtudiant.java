/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mg.inclusiv.cdan4.gestionetudiant;

/**
 *
 * @author Inclusiv Academy 03
 */
public class JFrameGestionEtudiant extends javax.swing.JFrame {

    /**
     * Creates new form JFrameGestionEtudiant
     */
    public JFrameGestionEtudiant() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomEtudiant = new javax.swing.JLabel();
        jTextFieldNomEtu = new javax.swing.JTextField();
        jLabelPrenomEtudiant = new javax.swing.JLabel();
        jTextFieldPrenomEtu = new javax.swing.JTextField();
        jLabelAdresseEtudiant = new javax.swing.JLabel();
        jTextFieldAdresseEtu = new javax.swing.JTextField();
        jButtonAjouter = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jLabelContactEtudiant = new javax.swing.JLabel();
        jTextFieldContactEtu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEtudiant = new javax.swing.JTable();
        jButtonModifier = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion Etudiant");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 26, 686, 32);

        jLabelNomEtudiant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNomEtudiant.setText("Nom");
        getContentPane().add(jLabelNomEtudiant);
        jLabelNomEtudiant.setBounds(70, 100, 27, 16);
        getContentPane().add(jTextFieldNomEtu);
        jTextFieldNomEtu.setBounds(130, 90, 430, 30);

        jLabelPrenomEtudiant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPrenomEtudiant.setText("Prenom");
        getContentPane().add(jLabelPrenomEtudiant);
        jLabelPrenomEtudiant.setBounds(70, 140, 42, 16);
        getContentPane().add(jTextFieldPrenomEtu);
        jTextFieldPrenomEtu.setBounds(130, 130, 430, 30);

        jLabelAdresseEtudiant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelAdresseEtudiant.setText("Adresse");
        getContentPane().add(jLabelAdresseEtudiant);
        jLabelAdresseEtudiant.setBounds(41, 180, 70, 16);
        getContentPane().add(jTextFieldAdresseEtu);
        jTextFieldAdresseEtu.setBounds(130, 170, 430, 30);

        jButtonAjouter.setText("Ajouter");
        getContentPane().add(jButtonAjouter);
        jButtonAjouter.setBounds(360, 260, 110, 25);

        jButtonAnnuler.setText("Annuler");
        getContentPane().add(jButtonAnnuler);
        jButtonAnnuler.setBounds(220, 260, 110, 25);

        jLabelContactEtudiant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelContactEtudiant.setText("Contact");
        getContentPane().add(jLabelContactEtudiant);
        jLabelContactEtudiant.setBounds(70, 220, 42, 16);
        getContentPane().add(jTextFieldContactEtu);
        jTextFieldContactEtu.setBounds(130, 210, 430, 30);

        jTableEtudiant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N??", "Nom", "Prenom", "Adresse", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEtudiant);
        if (jTableEtudiant.getColumnModel().getColumnCount() > 0) {
            jTableEtudiant.getColumnModel().getColumn(0).setResizable(false);
            jTableEtudiant.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableEtudiant.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTableEtudiant.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTableEtudiant.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableEtudiant.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 320, 662, 120);

        jButtonModifier.setText("Modifier");
        getContentPane().add(jButtonModifier);
        jButtonModifier.setBounds(360, 540, 110, 25);

        jButtonSupprimer.setText("Supprimer");
        getContentPane().add(jButtonSupprimer);
        jButtonSupprimer.setBounds(220, 540, 110, 25);

        setSize(new java.awt.Dimension(706, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFrameGestionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestionEtudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdresseEtudiant;
    private javax.swing.JLabel jLabelContactEtudiant;
    private javax.swing.JLabel jLabelNomEtudiant;
    private javax.swing.JLabel jLabelPrenomEtudiant;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEtudiant;
    private javax.swing.JTextField jTextFieldAdresseEtu;
    private javax.swing.JTextField jTextFieldContactEtu;
    private javax.swing.JTextField jTextFieldNomEtu;
    private javax.swing.JTextField jTextFieldPrenomEtu;
    // End of variables declaration//GEN-END:variables
}
