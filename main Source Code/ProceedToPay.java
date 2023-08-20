package hotelmanagement;

import Details.BookerDetails;
import Details.BookerRoomDetails;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.table.JTableHeader;

public class ProceedToPay extends javax.swing.JFrame {

    BookerDetails bookerDetails;
    BookerRoomDetails roomDetails;
    private int totalAmount, noOfDays = 2;
    Random r = new Random();
    int low = 100;
    int high = 225;
    
    
    //default constructor
    public ProceedToPay() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTable1.setShowVerticalLines(true);
        jTable1.setShowHorizontalLines(false);
        JTableHeader  tableHeader = jTable1.getTableHeader();
        JTableHeader  tableHeader1 = jTable2.getTableHeader();
        tableHeader1.setEnabled(false);
        tableHeader1.setVisible(false);
        tableHeader.setBackground(Color.WHITE);
        tableHeader.setFont(new Font("monospaced", Font.BOLD, 14));
    }

    //receiving data from "BookRoom.java"
    public ProceedToPay(BookerDetails details, BookerRoomDetails roomDetails) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jTable1.setShowVerticalLines(true);
        jTable1.setShowHorizontalLines(false);
        
        JTableHeader  tableHeader = jTable1.getTableHeader();
        tableHeader.setBackground(Color.WHITE);
        tableHeader.setFont(new Font("monospaced", Font.BOLD, 14));
        bookerDetails = details;
        this.roomDetails = roomDetails;
        displayDetails(); //to display the user details and room details
        calculateTotalAmount(); // to calculate the total amount
    }
    
    private void calculateTotalAmount(){
        int price = roomDetails.getRoomPrice();
        
        if(noOfDays == 1){
            jTable2.setValueAt("Room rent for " + noOfDays + " day",2, 0);
        } else {
            jTable2.setValueAt("Room rent for " + noOfDays + " days",2, 0);
        }
        
        
        int GST = r.nextInt(high - low) + low; //for gst we have generated random gst price between RS 100 to 225
        
        jTable2.setValueAt( GST,0, 1);
        jTable2.setValueAt(price ,1,1);
        jTable2.setValueAt(price * noOfDays ,2, 1);
        totalAmount = GST + (price * noOfDays);
        jTable2.setValueAt(totalAmount, 3, 1);
    }
    
    private void displayDetails() {
        //display Booker details 
        jTable1.setValueAt(bookerDetails.getName(), 0, 1);
        jTable1.setValueAt(bookerDetails.getNumberOfPerson(), 1, 1);
        jTable1.setValueAt(bookerDetails.getMobileNo(), 2, 1);
        jTable1.setValueAt(bookerDetails.getAadharNo(), 3, 1);
        jTable1.setValueAt(bookerDetails.getMailId(), 4, 1);
        jTable1.setValueAt(bookerDetails.getDateFrom(), 5, 1);
        jTable1.setValueAt(bookerDetails.getDateTO(), 6, 1);
        jTable1.setValueAt(noOfDays, 7, 1);
        
        
        //display room details
        jTable1.setValueAt(roomDetails.getRoomType(),8, 1);
        jTable1.setValueAt(roomDetails.getRoomNo(),9, 1);
        jTable1.setValueAt(roomDetails.getRoomPrice(), 10, 1);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        proceedToPayBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conform Your Details");
        setResizable(false);

        jTable1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Name", ""},
                {"Max Number of person", null},
                {"Mobile No", null},
                {"Aadhar No", null},
                {"Mail Id", null},
                {"Date From", null},
                {"Date To", null},
                {"No of days", null},
                {"Room type", null},
                {"Room No", null},
                {"Room price", null}
            },
            new String [] {
                "Conform your details", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setRowHeight(22);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 0));
        jTable1.setShowVerticalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(220);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(220);
        }

        proceedToPayBtn.setText("Proceed to Pay");
        proceedToPayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedToPayBtnActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"GST", null},
                {"Room Rent(Per day)", null},
                {"Room Rent for days", null},
                {"Total Amount(Rs)", null}
            },
            new String [] {
                "Bill", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoscrolls(false);
        jTable2.setRowHeight(22);
        jTable2.setSelectionBackground(new java.awt.Color(204, 204, 0));
        jTable2.setShowVerticalLines(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(220);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(220);
        }

        jLabel1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conform details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(proceedToPayBtn)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(proceedToPayBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedToPayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedToPayBtnActionPerformed
        this.dispose(); //to close this frame
        //to send the total amount to "Payment"
        
        Payment payment = new Payment(String.valueOf(totalAmount), bookerDetails, roomDetails);
        payment.setVisible(true);
        
    }//GEN-LAST:event_proceedToPayBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProceedToPay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton proceedToPayBtn;
    // End of variables declaration//GEN-END:variables


}
