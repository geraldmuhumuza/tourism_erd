/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tour;

/**
 *
 * @author Jrad
 */
import com.itextpdf.text.BadElementException;
import static com.itextpdf.text.BaseColor.BLACK;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
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
    room rooms = new room();
    tours tour = new tours();
    flight flights = new flight();
    vehicle veh = new vehicle();
    hotel hot = new hotel();
    paymentmethod method = new paymentmethod();
    driver drive = new driver();
    branch bra = new branch();
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

        jPanel1 = new javax.swing.JPanel();
        panel2 = new java.awt.Panel();
        lbltitle = new java.awt.Label();
        panel8 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
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
        menuproperty = new javax.swing.JMenu();
        menubranch = new javax.swing.JMenuItem();
        menuvehicle = new javax.swing.JMenuItem();
        menuavailablerooms = new javax.swing.JMenuItem();
        menuavailabletours = new javax.swing.JMenuItem();
        menuavailableflights = new javax.swing.JMenuItem();
        menuhotel = new javax.swing.JMenuItem();
        menupayment = new javax.swing.JMenuItem();
        menupaymentmethod = new javax.swing.JMenuItem();
        menudriver = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menusendinvoice = new javax.swing.JMenuItem();
        menuinvoicesent = new javax.swing.JMenuItem();
        menupaidinvoice = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("staff");
        setLocationByPlatform(true);

        panel2.setBackground(new java.awt.Color(0, 51, 0));

        lbltitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        lbltitle.setText("GERALD TOURS AND TRAVEL");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tour/R1.jpg"))); // NOI18N

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, Short.MAX_VALUE)
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

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

        menuproperty.setText("Property");

        menubranch.setText("Branch");
        menubranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubranchActionPerformed(evt);
            }
        });
        menuproperty.add(menubranch);

        menuvehicle.setText("Vehicle");
        menuvehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuvehicleActionPerformed(evt);
            }
        });
        menuproperty.add(menuvehicle);

        jMenu3.add(menuproperty);

        menuavailablerooms.setText("Available Rooms");
        menuavailablerooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuavailableroomsActionPerformed(evt);
            }
        });
        jMenu3.add(menuavailablerooms);

        menuavailabletours.setText("Available Tours");
        menuavailabletours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuavailabletoursActionPerformed(evt);
            }
        });
        jMenu3.add(menuavailabletours);

        menuavailableflights.setText("Available Flights");
        menuavailableflights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuavailableflightsActionPerformed(evt);
            }
        });
        jMenu3.add(menuavailableflights);

        menuhotel.setText("Available hotel");
        menuhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuhotelActionPerformed(evt);
            }
        });
        jMenu3.add(menuhotel);

        menupayment.setText("Payment");
        jMenu3.add(menupayment);

        menupaymentmethod.setText("Available payment methods");
        menupaymentmethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupaymentmethodActionPerformed(evt);
            }
        });
        jMenu3.add(menupaymentmethod);

        menudriver.setText("Available drivers");
        menudriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudriverActionPerformed(evt);
            }
        });
        jMenu3.add(menudriver);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menudriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudriverActionPerformed
        drive.Driver();
    }//GEN-LAST:event_menudriverActionPerformed

    private void menupaymentmethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupaymentmethodActionPerformed
        method.Paymentmethod();
    }//GEN-LAST:event_menupaymentmethodActionPerformed

    private void menuhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuhotelActionPerformed
        hot.Hotel();
    }//GEN-LAST:event_menuhotelActionPerformed

    private void menuavailableflightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuavailableflightsActionPerformed
        flights.Flight();
    }//GEN-LAST:event_menuavailableflightsActionPerformed

    private void menuavailabletoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuavailabletoursActionPerformed
        tour.Tour();
    }//GEN-LAST:event_menuavailabletoursActionPerformed

    private void menuavailableroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuavailableroomsActionPerformed
        rooms.Room();
    }//GEN-LAST:event_menuavailableroomsActionPerformed

    private void menuvehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuvehicleActionPerformed
        veh.Vehicle();
    }//GEN-LAST:event_menuvehicleActionPerformed

    private void menubranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubranchActionPerformed
        bra.Branch();
    }//GEN-LAST:event_menubranchActionPerformed

    private void menubookedflightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubookedflightsActionPerformed

        String query2,query3;
        ResultSet rs2,rs3;
        try{
            Document doc =new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(doc, new FileOutputStream("bookedflight.pdf"));

            doc.open();
            try {
               Image img = Image.getInstance("C:\\Users\\Jrad\\Downloads\\R1.jpg");
               img.scaleToFit(100, 100);
               Paragraph par = new Paragraph();
               par.add(img);
               par.setIndentationLeft(350);
               doc.add(par);
           } catch (BadElementException ex) {
               Logger.getLogger(TouristMenu.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(TouristMenu.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           Paragraph para =new Paragraph("GERALD TOURS AND TRAVEL",FontFactory.getFont(FontFactory.TIMES_BOLD,24,Font.BOLD,BLACK));
            para.setAlignment(24);
            para.getSpacingAfter();
            para.setIndentationLeft(250);
            doc.add(para);
            Paragraph para6 =new Paragraph("P.O. BOX 435,IBANDA",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BLACK));
            para6.setAlignment(24);
            para6.getSpacingAfter();
            para6.setIndentationLeft(300);
            doc.add(para6);
            Paragraph para7 =new Paragraph("TEL: 0789232518/0707401776",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BLACK));
            para7.setAlignment(24);
            para7.getSpacingAfter();
            para7.setIndentationLeft(270);
            doc.add(para7);
            
            //para.setFont(font);
            
            doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD)));
            Paragraph para3 =new Paragraph("\n");
            doc.add(para3);
            Paragraph para2 =new Paragraph("FLIGHTS BOOKED",FontFactory.getFont(FontFactory.COURIER_BOLD,18,Font.UNDERLINE));
            para2.setIndentationLeft(250);
            doc.add(para2);
            Paragraph para4 =new Paragraph("\n");
            doc.add(para4);
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

            query ="SELECT bookingid,flight_flightid,tourist_detail_touristid FROM booking";
            rs = st.executeQuery(query);
            while(rs.next()){
                String s1,s2,s3;
                String s4,s5;
                String s6,s7;
                
                s2 = rs.getString("bookingid");
                s1 = rs.getString("flight_flightid");
                s3 = rs.getString("tourist_detail_touristid");

                query2 = "SELECT firstname,lastname FROM tourist_detail where touristid='"+s3+"'";
                rs2 = st.executeQuery(query2);
                rs2.next();
                    table.addCell(rs2.getString("firstname"));
                    table.addCell(rs2.getString("lastname"));
                
                query3 ="SELECT flightname,destiname FROM flight where flightid='"+s1+"'";
                rs3 = st.executeQuery(query3);
                rs3.next();
                    table.addCell(rs3.getString("flightname"));
                    table.addCell(rs3.getString("destiname"));
                
                 String query4 = "SELECT bookeddate from booking where bookingid='"+s2+"'";
                 ResultSet rs4 = st.executeQuery(query4);
                 rs4.next();
                    table.addCell(rs4.getString("bookeddate"));
                    
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

    private void menubookedroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubookedroomsActionPerformed

        String query2,query3;
        ResultSet rs2,rs3;
        try{
            Document doc =new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(doc, new FileOutputStream("bookedroom.pdf"));

            doc.open();
            try {
               Image img = Image.getInstance("C:\\Users\\Jrad\\Downloads\\R1.jpg");
               img.scaleToFit(100, 100);
               Paragraph par = new Paragraph();
               par.add(img);
               par.setIndentationLeft(350);
               doc.add(par);
           } catch (BadElementException ex) {
               Logger.getLogger(TouristMenu.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(TouristMenu.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           Paragraph para =new Paragraph("GERALD TOURS AND TRAVEL",FontFactory.getFont(FontFactory.TIMES_BOLD,24,Font.BOLD,BLACK));
            para.setAlignment(24);
            para.getSpacingAfter();
            para.setIndentationLeft(250);
            doc.add(para);
             Paragraph para6 =new Paragraph("P.O. BOX 435,IBANDA",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BLACK));
            para6.setAlignment(24);
            para6.getSpacingAfter();
            para6.setIndentationLeft(300);
            doc.add(para6);
            Paragraph para7 =new Paragraph("TEL: 0789232518/0707401776",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BLACK));
            para7.setAlignment(24);
            para7.getSpacingAfter();
            para7.setIndentationLeft(270);
            doc.add(para7);
            //para.setFont(font);
            
            doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD)));
            
            Paragraph para3 =new Paragraph("\n");
            doc.add(para3);
            doc.add(new Paragraph("ROOMS BOOKED",FontFactory.getFont(FontFactory.COURIER_BOLD,18,Font.UNDERLINE)));
            Paragraph para4 =new Paragraph("\n");
            doc.add(para4);
            
            
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

                query2 = "SELECT firstname,lastname FROM tourist_detail where touristid='"+s3+"'";
                rs = st.executeQuery(query2);
                rs.next();
                    table.addCell(rs.getString("firstname"));
                    table.addCell(rs.getString("lastname"));

                
                query3 ="SELECT RoomName,Price FROM Room where idRoom='"+s1+"'";
                rs = st.executeQuery(query3);
                rs.next();
                    table.addCell(rs.getString("RoomName"));
                    table.addCell(rs.getString("Price"));

                
                table.addCell(s2);
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

    private void menubookedtoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubookedtoursActionPerformed
        String query2,query3;
        ResultSet rs2,rs3;
        //Statement st1,st2;
        try{
            Document doc =new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(doc, new FileOutputStream("bookedtours.pdf"));

            doc.open();
            try {
               Image img = Image.getInstance("C:\\Users\\Jrad\\Downloads\\R1.jpg");
               img.scaleToFit(100, 100);
               Paragraph par = new Paragraph();
               par.add(img);
               par.setIndentationLeft(350);
               doc.add(par);
           } catch (BadElementException ex) {
               Logger.getLogger(TouristMenu.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(TouristMenu.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           Paragraph para =new Paragraph("GERALD TOURS AND TRAVEL",FontFactory.getFont(FontFactory.TIMES_BOLD,24,Font.BOLD,BLACK));
            para.setAlignment(24);
            para.getSpacingAfter();
            para.setIndentationLeft(250);
            
            //para.setFont(font);
            doc.add(para);
             Paragraph para6 =new Paragraph("P.O. BOX 435,IBANDA",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BLACK));
            para6.setAlignment(24);
            para6.getSpacingAfter();
            para6.setIndentationLeft(300);
            doc.add(para6);
            Paragraph para7 =new Paragraph("TEL: 0789232518/0707401776",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BLACK));
            para7.setAlignment(24);
            para7.getSpacingAfter();
            para7.setIndentationLeft(270);
            doc.add(para7);
            doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD)));
            Paragraph para2 =new Paragraph("\n");
            doc.add(para2);
            Paragraph para3 =new Paragraph("\n");
            doc.add(para3);
            doc.add(new Paragraph("BOOKED TOURS",FontFactory.getFont(FontFactory.COURIER_BOLD,18,Font.UNDERLINE)));
            Paragraph para4 =new Paragraph("\n");
            doc.add(para4);
            

     
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

            String s1,s2,s3;
            String s4,s5;
            String s6,s7;
            query ="SELECT bookeddate,tourist_detail_touristid,tour_tourid FROM booking";
            rs = st.executeQuery(query);
            while(rs.next()){
                s2 = rs.getString("bookeddate");
                s3 = rs.getString("tourist_detail_touristid");
                s1 =rs.getString("tour_tourid");
                query2 = "SELECT firstname,lastname FROM tourist_detail where touristid='"+s3+"'";
                rs = st.executeQuery(query2);
                rs.next();
                    table.addCell(rs.getString("firstname"));
                    table.addCell(rs.getString("lastname"));
                    
                    query3 ="SELECT tourname,category FROM tour where tourid='"+s1+"'";
                rs = st.executeQuery(query3);
                rs.next();
                    table.addCell(rs.getString("tourname"));
                    table.addCell(rs.getString("category"));
                    table.addCell(s2);
                
                
                
                

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

    private void menubackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menubackActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label lbltitle;
    private javax.swing.JMenuItem menuavailableflights;
    private javax.swing.JMenuItem menuavailablerooms;
    private javax.swing.JMenuItem menuavailabletours;
    private javax.swing.JMenuItem menuback;
    private javax.swing.JMenu menubooked;
    private javax.swing.JMenuItem menubookedflights;
    private javax.swing.JMenuItem menubookedrooms;
    private javax.swing.JMenuItem menubookedtours;
    private javax.swing.JMenuItem menubranch;
    private javax.swing.JMenuItem menuchangecontact;
    private javax.swing.JMenuItem menuchangeemail;
    private javax.swing.JMenuItem menudriver;
    private javax.swing.JMenuItem menuexit;
    private javax.swing.JMenuItem menuhotel;
    private javax.swing.JMenuItem menuinvoicesent;
    private javax.swing.JMenuItem menupaidinvoice;
    private javax.swing.JMenuItem menupayment;
    private javax.swing.JMenuItem menupaymentmethod;
    private javax.swing.JMenu menuproperty;
    private javax.swing.JMenuItem menusendinvoice;
    private javax.swing.JMenuItem menuvehicle;
    private java.awt.Panel panel2;
    private java.awt.Panel panel8;
    // End of variables declaration//GEN-END:variables
}