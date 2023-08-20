package hotelmanagement;

import Details.BookerDetails;
import Details.BookerRoomDetails;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Payment extends javax.swing.JFrame {

    BookerDetails bookerDetails;
    BookerRoomDetails roomDetails;
    String totalAmount;
    String pathName;
    
    public Payment() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public Payment(String totalAmount, BookerDetails bookerDetails, BookerRoomDetails roomDetails) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.totalAmount = totalAmount;
        this.bookerDetails = bookerDetails;
        this.roomDetails = roomDetails;
        lTotalAmount.setText("RS:" + totalAmount);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfAccNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lTotalAmount = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Payment");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel3.setText("Amount");

        jLabel4.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel4.setText("Account No");

        lTotalAmount.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfName)
                            .addComponent(tfAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(lTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tfName))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tfAccNo))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cancel))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        storeBookedDetails();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       this.dispose();
    }//GEN-LAST:event_cancelActionPerformed
    
    private void storeBookedDetails(){
        Random r = new Random();
        int high = 10000000;
        int low = 1000000;
        int roomIDForUser = r.nextInt(high - low) + low;
        
        File f = new File("");
        pathName = f.getAbsolutePath() + "\\Users\\" + bookerDetails.getUsername() + "\\" + roomIDForUser;
        
        try {
            FileWriter  Writer = new FileWriter(pathName + ".txt");
            Writer.write("RoomID For User: " + roomIDForUser);
            Writer.write("\nRoom No: " + roomDetails.getRoomNo());
            Writer.write("\nRoom Type: " + roomDetails.getRoomType());
            Writer.write("\nRoom Price: " + roomDetails.getRoomPrice());
            Writer.write("\nTotal Amount: " + totalAmount);
            Writer.write("\nMax no of persons: " + bookerDetails.getNumberOfPerson());
            Writer.write("\nName: " + bookerDetails.getName());
            Writer.write("\nMobileNo: " + bookerDetails.getMobileNo());
            Writer.write("\nAadharNo: " + bookerDetails.getAadharNo());
            Writer.write("\nDateFrom: " + bookerDetails.getDateFrom());
            Writer.write("\nDateTo: " + bookerDetails.getDateTO());
            Writer.write("\nMailId: " + bookerDetails.getMailId());
            //Writer.write(System.getProperty("line.separator"));
            Writer.close();
            
            String fileName1, temp;
            temp = roomDetails.getRoomType();
            
            if(temp.equals("Single Bed Room")){
              temp="singleBedRoomNonAC";
            }
            else if(temp.equals("Single Bed Room(AC)")){
              temp="singleBedRoomWithAC";
            }
            else if(temp.equals("Double Bed Room")){
              temp="doubleBedRoomNonAC";
            }
            else if(temp.equals("Double Bed Room(AC)")){
              temp="doubleBedRoomWithAC";
            }

            //if room is booked then change room is unavailable
            fileName1 = f.getAbsolutePath() + "\\" + temp + "\\" + roomDetails.getRoomNo()+ ".txt";
            FileWriter  Writer1 = new FileWriter(fileName1);
            Writer1.write("Unavailable");
            Writer1.write("\n" + roomDetails.getRoomNo());
            Writer1.write("\n" + roomDetails.getRoomPrice());
            Writer1.close();
            
            //show succsufully booked dialog box
            JOptionPane.showMessageDialog(this, "Sucessfully Booked", "Payment", JOptionPane.PLAIN_MESSAGE);
            this.dispose();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lTotalAmount;
    private javax.swing.JTextField tfAccNo;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables

    private void saveDetails() {
        Document document = new Document();
        //Font font = new Font(FontFamily.HELVETICA, 12, Font.BOLD);
            //Paragraph para = new Paragraph("HotelManagement", font);
        /*try {
            PdfWriter.getInstance(document, new FileOutputStream( pathName + ".pdf"));    
            document.open();  
            
            document.add(para);
            
            document.close(); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    
}
