package hotelmanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CancelRoom extends javax.swing.JFrame {

    String userName;
    public String pathName,path,path1,No,temp,price;
    int count=0;
    
    public CancelRoom() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

     public CancelRoom(String userName) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.userName = userName;
        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfUserRoomId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCancelRoom = new javax.swing.JButton();

        setTitle("Cnacel Room");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Enter your room id");

        tfUserRoomId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserRoomIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Check Room Details");

        btnCheck.setText("check");
        btnCheck.setMaximumSize(new java.awt.Dimension(577, 519));
        btnCheck.setMinimumSize(new java.awt.Dimension(577, 519));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room details", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnCancelRoom.setText("Cancel room");
        btnCancelRoom.setMaximumSize(new java.awt.Dimension(577, 519));
        btnCancelRoom.setMinimumSize(new java.awt.Dimension(577, 519));
        btnCancelRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUserRoomId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfUserRoomId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserRoomIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserRoomIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserRoomIdActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        count++;
        if(count==1){
        String roomId = tfUserRoomId.getText();

        File f = new File("");
        String pathName = f.getAbsolutePath() + "\\Users\\" + userName + "\\" + roomId + ".txt";

        try{
            FileReader reader = new FileReader(pathName);
            BufferedReader br = new BufferedReader(reader);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            Object[] tableLines = br.lines().toArray();

            for(int i=0; i<tableLines.length; i++){
                String line = tableLines[i].toString().trim();
                String dataRow[] = line.split(":");
                model.addRow(dataRow);
     
            }

            br.close();
            reader.close();


        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Room not found", "Warring", JOptionPane.OK_OPTION);
        }
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnCancelRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRoomActionPerformed
        File f = new File("");
        pathName = f.getAbsolutePath() + "\\Users\\" + userName +"\\History";
        
        File files = new File(pathName);
        if(!files.exists()){ //if the file folder does not exist
            if(files.mkdirs()){
                cancel();
            }
            else{
                JOptionPane.showMessageDialog(this,"Problem Occured creating directory", "Problem", JOptionPane.ERROR_MESSAGE);                
            }
        }else{
            cancel();
        }
   
    }//GEN-LAST:event_btnCancelRoomActionPerformed

    private void cancel() {                                         
        String roomId = tfUserRoomId.getText();

        File f = new File("");
        

        try{
            FileWriter writer =new FileWriter(pathName + "\\" + roomId + ".txt");
            for(int i=0; i<jTable1.getRowCount(); i++){
                String row = jTable1.getValueAt(i, 0).toString();
                String column = jTable1.getValueAt(i, 1).toString();
                 
                    writer.write(row+" : "+column+"\n");
                    if(i==1)
                        No=column.trim();
                    if(i==2){
                         temp=column;
                          if(temp.equals(" Single Bed Room")){
                            temp="singleBedRoomNonAC";
                          }
                          else if(temp.equals(" Single Bed Room(AC)")){
                            temp="singleBedRoomWithAC";
                          }
                          else if(temp.equals(" Double Bed Room")){
                            temp="doubleBedRoomNonAC";
                          }
                          else if(temp.equals(" Double Bed Room(AC)")){
                            temp="doubleBedRoomWithAC";
                          }
                    }
                    if(i==3)
                        price=column.trim();
            }
            writer.close();
            
            path1=f.getAbsolutePath() + "\\" +temp + "\\" +No+ ".txt";
            FileWriter Writer1 = new FileWriter(path1);
            Writer1.write("Available");
            Writer1.write("\n" +No);
            Writer1.write("\n" +price);
            Writer1.close();
          
            
            path= f.getAbsolutePath() + "\\Users\\" + userName +"\\"+roomId;
            File file= new File(path+".txt");
            
            if (file.delete()) {
               JOptionPane.showMessageDialog(this, "Room Cancelled Successfully", "Warring", JOptionPane.PLAIN_MESSAGE);
               this.dispose();
            }
            else {
               JOptionPane.showMessageDialog(this, "Room Cancelled Failed", "Warring", JOptionPane.OK_OPTION);
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Room not found", "Warring", JOptionPane.OK_OPTION);
        }
    }                      
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRoom;
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfUserRoomId;
    // End of variables declaration//GEN-END:variables
}
