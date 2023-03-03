/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author issaa
 */
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.*;
public class CustomerCheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckOut
     */
    public CustomerCheckOut() {
        initComponents();
        jtxtCustomerName.setEditable(false);
        jtxtCheckInDate.setEditable(false);
        jtxtCheckOutDate.setEditable(false);
        jtxtCustomerMobileNum.setEditable(false);
        jtxtPricePerDay.setEditable(false);
        jtxtNumberOfDaysStay.setEditable(false);
        jtxtTotlaeAmountCollectCustomer.setEditable(false);
        jtxtEmail.setEditable(false);
    }
    int id=0;
    String Query;
    String roomType;
    String bed;
    String roomNo;
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtxtRoomNum = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jtxtCustomerName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtCheckInDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtCheckOutDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtCustomerMobileNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtPricePerDay = new javax.swing.JTextField();
        jtxtNumberOfDaysStay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtTotlaeAmountCollectCustomer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Check Out.png"))); // NOI18N
        jLabel1.setText("Customer Check Out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 28, 229, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1234, 15, 17, 21));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 120, -1));

        jtxtRoomNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtRoomNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 96, 230, -1));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 96, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "CheckIn Date", "Room Number", "Bed", "Room Type", "Price per Day"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 378, 1210, 208));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 157, 178, -1));

        jtxtCustomerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 192, 250, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Check In Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 157, 130, -1));

        jtxtCheckInDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtCheckInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 192, 250, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Check Out Date (Today)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 157, 225, -1));

        jtxtCheckOutDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtCheckOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 192, 250, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Customer Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 157, 221, -1));

        jtxtCustomerMobileNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtCustomerMobileNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 192, 250, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Price Per Day");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 244, 153, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Number of Days Stay");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 244, 202, -1));

        jtxtPricePerDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtPricePerDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 279, 250, -1));

        jtxtNumberOfDaysStay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtNumberOfDaysStay, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 279, 250, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Totale Amount Collect Customer");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 244, 238, -1));

        jtxtTotlaeAmountCollectCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtTotlaeAmountCollectCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 279, 250, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 244, 43, -1));

        jtxtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 279, 250, -1));

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Check Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 320, -1, -1));

        Clear.setBackground(new java.awt.Color(102, 0, 0));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 320, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       ResultSet rs=Select.getData("select * from customer where checkOut is NULL");
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();       
        try
        {
           while(rs.next())
           {
               model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
           }
           rs.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String roomNo=jtxtRoomNum.getText();
        try
        {
           ResultSet rs=Select.getData("select * from customer where roomNo='"+roomNo+"' and checkout is NULL");
           if (rs.next())
           {
               jtxtRoomNum.setEditable(false);
               id=rs.getInt(1);
               jtxtCustomerName.setText(rs.getString(2));
               jtxtCheckInDate.setText(rs.getString(9));
               jtxtCustomerMobileNum.setText(rs.getString(3));
               jtxtPricePerDay.setText(rs.getString(13));
               
               
               SimpleDateFormat myFormat=new SimpleDateFormat("yyyy/MM/dd");
               Calendar cal=Calendar.getInstance();
               jtxtCheckOutDate.setText(myFormat.format(cal.getTime()));
               String dateBeforString=rs.getString(9);
               java.util.Date dateBefor= myFormat.parse(dateBeforString);
               String dateAfterString=myFormat.format(cal.getTime());
               java.util.Date dateAfter= myFormat.parse(dateAfterString);
               long difference=dateAfter.getTime()-dateBefor.getTime();
               int noOfDayStay=(int) (difference/(1000*60*60*24));
               if(noOfDayStay==0)
                   noOfDayStay=1;
               jtxtNumberOfDaysStay.setText(String.valueOf(noOfDayStay));
               float price=Float.parseFloat(jtxtPricePerDay.getText());
               
               jtxtTotlaeAmountCollectCustomer.setText(String.valueOf(noOfDayStay*price));
               jtxtEmail.setText(rs.getString(6));
               roomType=rs.getString(12);
               bed=rs.getString(11);
           }
           else 
               JOptionPane.showMessageDialog(null, "Room Number is not Booked or Not exist");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String name=jtxtCustomerName.getText();
       String mobileNumber=jtxtCustomerMobileNum.getText();
       String email=jtxtEmail.getText();
       String checkOut=jtxtCheckOutDate.getText();
       String numberOfDayStay=jtxtNumberOfDaysStay.getText();
       String totalAmount=jtxtTotlaeAmountCollectCustomer.getText();
       roomNo=jtxtRoomNum.getText();
       Query ="update customer set numberOfDaysStay='"+numberOfDayStay+"',totalAmount='"+totalAmount+"',checkout='"+checkOut+"' where id='"+id+"'";
       InsertUpdateDelete.setData(Query, "");
       Query="update room set Status='Not Booked' where roomNo='"+roomNo+"'";
       InsertUpdateDelete.setData(Query, "");
       String path="E:\\";
       com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
       try
       { 
           PdfWriter.getInstance(doc, new FileOutputStream(path+""+id+".pdf"));
           doc.open();
           Paragraph paragraph1= new Paragraph("                                               BTech Days Hotel Management System\n");
           doc.add(paragraph1);
           Paragraph paragraph2= new Paragraph("**************************************************************************************************************");
           doc.add(paragraph2);
           Paragraph paragraph3= new Paragraph("\tBill ID: "+id+"\nCustomer Details:\nName: "+name+"\nMobile Number: "+mobileNumber+"\nEmail: "+email+"\n");
           doc.add(paragraph3);
           doc.add(paragraph2);
           Paragraph paragraph4= new Paragraph("\tRoom Details:\nNumber: "+jtxtRoomNum.getText()+"\nType: "+roomType+"\nBed: "+bed+"\nPrice Per Day: "+jtxtPricePerDay.getText()+"");
           doc.add(paragraph4);
           doc.add(paragraph2);
           PdfPTable tb1=new PdfPTable(4);
           tb1.addCell("Check IN Date: "+jtxtCheckInDate.getText());
           tb1.addCell("Check Out Date: "+jtxtCheckOutDate.getText());
           tb1.addCell("No of Days Stay: "+jtxtNumberOfDaysStay.getText());
           tb1.addCell("Total Amount Paid: "+jtxtTotlaeAmountCollectCustomer.getText());
           doc.add(tb1);
           doc.add(paragraph2);
           Paragraph paragraph5= new Paragraph("Thank you, Please Visit Again.");
           doc.add(paragraph5);
           
           
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       doc.close();
       int a=JOptionPane.showConfirmDialog(null, "Do you want Print Bill","Select",JOptionPane.YES_NO_OPTION);
       if(a==0)
       {
           try
           {
               if ((new File("E:\\"+id+".pdf")).exists())
               {
                   Process P;
                   P = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler E:\\"+id+".pdf");
                           
               }
               else
                   System.out.println("File is not Exists");
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null, e);
           }
       }
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtCheckInDate;
    private javax.swing.JTextField jtxtCheckOutDate;
    private javax.swing.JTextField jtxtCustomerMobileNum;
    private javax.swing.JTextField jtxtCustomerName;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtNumberOfDaysStay;
    private javax.swing.JTextField jtxtPricePerDay;
    private javax.swing.JTextField jtxtRoomNum;
    private javax.swing.JTextField jtxtTotlaeAmountCollectCustomer;
    // End of variables declaration//GEN-END:variables
}
