
package hotelmanagement;

import javax.swing.JLabel;
import javax.swing.UIManager;

public class Home extends javax.swing.JFrame {

    String userName;
    public Home(){
        initComponents();
        this.setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            System.out.println("UIManager Exception : "+e);
        }
    }
    
    public Home(String userName) {
        initComponents();
        this.setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        this.userName = userName;
        username.setText("Welcome " + userName);
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            System.out.println("UIManager Exception : "+e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        cancelRoom = new javax.swing.JButton();
        viewBookedRoom = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mysterious Hotel");
        getContentPane().setLayout(null);

        username.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        username.setText("Welcome ");
        getContentPane().add(username);
        username.setBounds(60, 10, 370, 30);

        cancelRoom.setBackground(new java.awt.Color(0, 0, 0));
        cancelRoom.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cancelRoom.setForeground(new java.awt.Color(255, 255, 255));
        cancelRoom.setText("Cancel room");
        cancelRoom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        cancelRoom.setBorderPainted(false);
        cancelRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRoomActionPerformed(evt);
            }
        });
        getContentPane().add(cancelRoom);
        cancelRoom.setBounds(60, 350, 150, 40);

        viewBookedRoom.setBackground(new java.awt.Color(0, 0, 0));
        viewBookedRoom.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        viewBookedRoom.setForeground(new java.awt.Color(255, 255, 255));
        viewBookedRoom.setText("View booked room");
        viewBookedRoom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        viewBookedRoom.setBorderPainted(false);
        viewBookedRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBookedRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookedRoomActionPerformed(evt);
            }
        });
        getContentPane().add(viewBookedRoom);
        viewBookedRoom.setBounds(60, 300, 150, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search Room");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 250, 150, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/My project.jpg"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SearchRoom searchRoom = new SearchRoom(userName);
        searchRoom.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void viewBookedRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookedRoomActionPerformed
        VerifyUserRoomId userRoomId  = new VerifyUserRoomId(userName);
        userRoomId.setVisible(true);
    }//GEN-LAST:event_viewBookedRoomActionPerformed

    private void cancelRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRoomActionPerformed
        CancelRoom cr = new CancelRoom(userName);
        cr.setVisible(true);
    }//GEN-LAST:event_cancelRoomActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelRoom;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel username;
    private javax.swing.JButton viewBookedRoom;
    // End of variables declaration//GEN-END:variables
}
