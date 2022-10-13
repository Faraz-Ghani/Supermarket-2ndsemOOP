/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package anusha.ssupermarket;

/**
 *
 * @author faraz
 */
public class NewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public NewJPanel() {
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

        cart = new javax.swing.JPanel();
        Userinfo = new javax.swing.JPanel();
        Userlogo = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cart.setBackground(new java.awt.Color(62, 120, 207));
        cart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Userinfo.setBackground(new java.awt.Color(113, 168, 255));
        Userinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Userlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anusha/ssupermarket/imgs/icons8_user_50px.png"))); // NOI18N
        Userinfo.add(Userlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 62, -1));

        Username.setFont(new java.awt.Font("Google Sans Display Medium", 0, 24)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText(user.get("Name"));
        Userinfo.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 145, 50));

        cart.add(Userinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 280, 110));

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "01", "02", "03", "04", "05", "06", "07", "08", "09" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        cart.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 60, 250));

        jList2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(jList2);

        cart.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 70, 250));

        jList3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane4.setViewportView(jList3);

        cart.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 120, 250));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Sr. No.");
        cart.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 60, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Amount");
        cart.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Item Name");
        cart.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jButton1.setText("Purchase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        cart.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 100, 30));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        cart.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Total :");
        cart.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cart.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 120, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Rs");
        cart.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Userinfo;
    private javax.swing.JLabel Userlogo;
    private javax.swing.JLabel Username;
    private javax.swing.JPanel cart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
