/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tour;

/**
 *
 * @author Jrad
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StaffMenu extends javax.swing.JFrame {
Connection con; // for establishing a connection
    Statement st;  //sql statement
    String cs;  //database path
    ResultSet rs; //for the resultset
    
    String user;  //database username
    String password;  //database password
    String query;
    /**
     * Creates new form StaffMenu
     */
    public StaffMenu() {
        con = null;
        st = null;
        //statement = null;
        rs = null;
        cs = "jdbc:mysql://localhost:3306/mydb";
        user = "root";
        password = "@tQbfjotlD//1q";
        initComponents();
        registerDriverAndst();
    }
    private void registerDriverAndst(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(cs, user, password);
            st = con.createStatement();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
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
        jMenu1 = new javax.swing.JMenu();
        menuback = new javax.swing.JMenuItem();
        menuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuchangecontact = new javax.swing.JMenuItem();
        menuchangeemail = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menubooked = new javax.swing.JMenu();
        menubookedtours = new javax.swing.JMenuItem();
        menubookedrooms = new javax.swing.JMenuItem();
        menubookedflights = new javax.swing.JMenuItem();
        menuavailablerooms = new javax.swing.JMenuItem();
        menuavailabletours = new javax.swing.JMenuItem();
        menuavailableflights = new javax.swing.JMenuItem();
        menupayment = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menusendinvoice = new javax.swing.JMenuItem();
        menuinvoicesent = new javax.swing.JMenuItem();
        menupaidinvoice = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N

        jMenu1.setText("File");

        menuback.setText("Back");
        menuback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubackActionPerformed(evt);
            }
        });
        jMenu1.add(menuback);

        menuexit.setText("Exit");
        jMenu1.add(menuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        menuchangecontact.setText("Change Contact");
        jMenu2.add(menuchangecontact);

        menuchangeemail.setText("Change Email");
        jMenu2.add(menuchangeemail);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        menubooked.setText("Booked");

        menubookedtours.setText("Booked Tours");
        menubookedtours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubookedtoursActionPerformed(evt);
            }
        });
        menubooked.add(menubookedtours);

        menubookedrooms.setText("Booked Rooms");
        menubookedrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubookedroomsActionPerformed(evt);
            }
        });
        menubooked.add(menubookedrooms);

        menubookedflights.setText("Booked Flights");
        menubookedflights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubookedflightsActionPerformed(evt);
            }
        });
        menubooked.add(menubookedflights);

        jMenu3.add(menubooked);

        menuavailablerooms.setText("Available Rooms");
        menuavailablerooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuavailableroomsActionPerformed(evt);
            }
        });
        jMenu3.add(menuavailablerooms);

        menuavailabletours.setText("Available Tours");
        jMenu3.add(menuavailabletours);

        menuavailableflights.setText("Available Flights");
        jMenu3.add(menuavailableflights);

        menupayment.setText("Payment");
        jMenu3.add(menupayment);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Invoices");

        menusendinvoice.setText("Send invoice");
        jMenu4.add(menusendinvoice);

        menuinvoicesent.setText("Sent Invoice");
        jMenu4.add(menuinvoicesent);

        menupaidinvoice.setText("Invoice Paid");
        jMenu4.add(menupaidinvoice);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menubackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menubackActionPerformed

    private void menubookedtoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubookedtoursActionPerformed
        String query2,query3;
        ResultSet rs2,rs3;
        try{
            Document doc =new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(doc, new FileOutputStream("bookedtours.pdf"));
            
            doc.open();
            
            Paragraph para = new Paragraph("BOOKED TOURS");
            doc.add(para);
            PdfPTable table = new PdfPTable(5);
            
            Phrase phrase1 = new Phrase("FIRSTNAME");
            PdfPCell cell1 = new PdfPCell(phrase1);
            cell1.setNoWrap(false);
            table.addCell(cell1);
            
            Phrase phrase2 = new Phrase("LAST NAME");
            PdfPCell cell2 = new PdfPCell(phrase2);
            cell2.setNoWrap(false);
            table.addCell(cell2);
            
            Phrase phrase3 = new Phrase("TOUR NAME");
            PdfPCell cell3 = new PdfPCell(phrase3);
            cell3.setNoWrap(false);
            table.addCell(cell3);
            
            Phrase phrase4 = new Phrase("CATEGORY");
            PdfPCell cell4 = new PdfPCell(phrase4);
            cell4.setNoWrap(false);
            table.addCell(cell4);
            
            Phrase phrase5 = new Phrase("BOOKED DATE");
            PdfPCell cell5 = new PdfPCell(phrase5);
            cell5.setNoWrap(false);
            table.addCell(cell5);
            
            
            
        query ="SELECT tour_tourid,bookeddate,tourist_detail_touristid FROM booking";
        rs = st.executeQuery(query);
        while(rs.next()){
            String s1,s2,s3;
            String s4,s5;
            String s6,s7;
            
            s1 =rs.getString("tour_tourid");
            s2 = rs.getString("bookeddate");
            s3 = rs.getString("tourist_detail_touristid");
            
            query2 = "SELECT firstname,lastname FROM tourist_detail where touristid='"+s3+"'";
            rs2 = st.executeQuery(query2);
            while(rs2.next()){
                table.addCell(rs2.getString("firstname"));
                table.addCell(rs2.getString("lastname"));
                
            }
            query3 ="SELECT tourname,category FROM tour where tourid='"+s1+"'";
            rs3 = st.executeQuery(query3);
            while(rs3.next()){
                 table.addCell(rs3.getString("tourname"));
                 table.addCell(rs3.getString("category"));
                table.addCell(rs.getString("bookeddate"));
                 return;
            }
            
            
        }
        
        
           
            doc.add(table);
        
        if(Desktop.isDesktopSupported()){
            try{
                File myfile = new File("bookedtours.pdf");
                Desktop.getDesktop().open(myfile);
                
            }catch(IOException ex){                
            }
            doc.close();
      }
      }
      catch(SQLException ex){
          ex.printStackTrace();
      } 
      catch (FileNotFoundException | DocumentException ex) {
        Logger.getLogger(TouristMenu.class.getName()).log(Level.SEVERE, null, ex);
    }
             
        
    }//GEN-LAST:event_menubookedtoursActionPerformed

    private void menubookedroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubookedroomsActionPerformed
        
        String query2,query3;
        ResultSet rs2,rs3;
        try{
            Document doc =new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(doc, new FileOutputStream("bookedroom.pdf"));
            
            doc.open();
            
            Paragraph para = new Paragraph("BOOKED ROOMS");
            doc.add(para);
            PdfPTable table = new PdfPTable(5);
            
            Phrase phrase1 = new Phrase("FIRSTNAME");
            PdfPCell cell1 = new PdfPCell(phrase1);
            cell1.setNoWrap(false);
            table.addCell(cell1);
            
            Phrase phrase2 = new Phrase("LAST NAME");
            PdfPCell cell2 = new PdfPCell(phrase2);
            cell2.setNoWrap(false);
            table.addCell(cell2);
            
            Phrase phrase3 = new Phrase("ROOM NAME");
            PdfPCell cell3 = new PdfPCell(phrase3);
            cell3.setNoWrap(false);
            table.addCell(cell3);
            
            Phrase phrase4 = new Phrase("PRICE");
            PdfPCell cell4 = new PdfPCell(phrase4);
            cell4.setNoWrap(false);
            table.addCell(cell4);
            
            Phrase phrase5 = new Phrase("BOOKED DATE");
            PdfPCell cell5 = new PdfPCell(phrase5);
            cell5.setNoWrap(false);
            table.addCell(cell5);
            
            
            
        query ="SELECT Room_idRoom,bookeddate,tourist_detail_touristid FROM booking";
        rs = st.executeQuery(query);
        while(rs.next()){
            String s1,s2,s3;
            String s4,s5;
            String s6,s7;
            
            s1 =rs.getString("Room_idRoom");
            s2 = rs.getString("bookeddate");
            s3 = rs.getString("tourist_detail_touristid");
            
            query2 = "SELECT firstname,lastname FROM tourist_detail where tourid='"+s3+"'";
            rs2 = st.executeQuery(query2);
            while(rs2.next()){
                table.addCell(rs2.getString("firstname"));
                table.addCell(rs2.getString("lastname"));
                
            }
            query3 ="SELECT RoomName,Price FROM tour where Room_idRoom='"+s1+"'";
            rs3 = st.executeQuery(query3);
            while(rs3.next()){
                 table.addCell(rs3.getString("RoomName"));
                 table.addCell(rs3.getString("Price"));
                
            }
            table.addCell(rs.getString("bookeddate"));            
        }
        
        
           
            doc.add(table);
        
        if(Desktop.isDesktopSupported()){
            try{
                File myfile = new File("bookedroom.pdf");
                Desktop.getDesktop().open(myfile);
                
            }catch(IOException ex){                
            }
            doc.close();
      }
      }
      catch(SQLException ex){
          ex.printStackTrace();
      } 
      catch (FileNotFoundException | DocumentException ex) {
        Logger.getLogger(TouristMenu.class.getName()).log(Level.SEVERE, null, ex);
    }
             
    }//GEN-LAST:event_menubookedroomsActionPerformed

    private void menubookedflightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubookedflightsActionPerformed
       
        String query2,query3;
        ResultSet rs2,rs3;
        try{
            Document doc =new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(doc, new FileOutputStream("bookedflight.pdf"));
            
            doc.open();
            
            Paragraph para = new Paragraph("BOOKED FLIGHTS");
            doc.add(para);
            PdfPTable table = new PdfPTable(5);
            
            Phrase phrase1 = new Phrase("FIRSTNAME");
            PdfPCell cell1 = new PdfPCell(phrase1);
            cell1.setNoWrap(false);
            table.addCell(cell1);
            
            Phrase phrase2 = new Phrase("LAST NAME");
            PdfPCell cell2 = new PdfPCell(phrase2);
            cell2.setNoWrap(false);
            table.addCell(cell2);
            
            Phrase phrase3 = new Phrase("FLIGHT NAME");
            PdfPCell cell3 = new PdfPCell(phrase3);
            cell3.setNoWrap(false);
            table.addCell(cell3);
            
            Phrase phrase4 = new Phrase("DESTINATION");
            PdfPCell cell4 = new PdfPCell(phrase4);
            cell4.setNoWrap(false);
            table.addCell(cell4);
            
            Phrase phrase5 = new Phrase("BOOKED DATE");
            PdfPCell cell5 = new PdfPCell(phrase5);
            cell5.setNoWrap(false);
            table.addCell(cell5);
            
            
            
        query ="SELECT flight_flightid,bookeddate,tourist_detail_touristid FROM booking";
        rs = st.executeQuery(query);
        while(rs.next()){
            String s1,s2,s3;
            String s4,s5;
            String s6,s7;
            
            s1 =rs.getString("flight_flightid");
            s2 = rs.getString("bookeddate");
            s3 = rs.getString("tourist_detail_touristid");
            
            query2 = "SELECT firstname,lastname FROM tourist_detail where tourid='"+s3+"'";
            rs2 = st.executeQuery(query2);
            while(rs2.next()){
                table.addCell(rs2.getString("firstname"));
                table.addCell(rs2.getString("lastname"));
                
            }
            query3 ="SELECT flightname,destiname FROM tour where flight_flightid='"+s1+"'";
            rs3 = st.executeQuery(query3);
            while(rs3.next()){
                 table.addCell(rs3.getString("flightname"));
                 table.addCell(rs3.getString("destiname"));
                
            }
            table.addCell(rs.getString("bookeddate"));            
        }
        
        
           
            doc.add(table);
        
        if(Desktop.isDesktopSupported()){
            try{
                File myfile = new File("bookedflight.pdf");
                Desktop.getDesktop().open(myfile);
                
            }catch(IOException ex){                
            }
            doc.close();
      }
      }
      catch(SQLException ex){
          ex.printStackTrace();
      } 
      catch (FileNotFoundException | DocumentException ex) {
        Logger.getLogger(TouristMenu.class.getName()).log(Level.SEVERE, null, ex);
    }
             
    }//GEN-LAST:event_menubookedflightsActionPerformed

    private void menuavailableroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuavailableroomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuavailableroomsActionPerformed

    /**
     * @param args the command line arguments
     */
    public void StaffMenu() {
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
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuavailableflights;
    private javax.swing.JMenuItem menuavailablerooms;
    private javax.swing.JMenuItem menuavailabletours;
    private javax.swing.JMenuItem menuback;
    private javax.swing.JMenu menubooked;
    private javax.swing.JMenuItem menubookedflights;
    private javax.swing.JMenuItem menubookedrooms;
    private javax.swing.JMenuItem menubookedtours;
    private javax.swing.JMenuItem menuchangecontact;
    private javax.swing.JMenuItem menuchangeemail;
    private javax.swing.JMenuItem menuexit;
    private javax.swing.JMenuItem menuinvoicesent;
    private javax.swing.JMenuItem menupaidinvoice;
    private javax.swing.JMenuItem menupayment;
    private javax.swing.JMenuItem menusendinvoice;
    // End of variables declaration//GEN-END:variables
}
