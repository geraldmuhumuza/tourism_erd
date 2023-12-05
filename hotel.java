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
public class hotel extends javax.swing.JFrame {
    Connection con; // for establishing a connection
    Statement st;  //sql statement
    String cs;  //database path
    ResultSet rs; //for the resultset
    
    String user;  //database username
    String password;  //database password
    String query;
    /**
     * Creates new form hotel
     */
    public hotel() {
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

        jPanel2 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnfirst = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txthotelname = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        lblhotelname = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel");

        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setText("UPDATE");

        btndel.setText("DELETE");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnfirst.setText("FIRST");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnlast.setText("LAST");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnprevious.setText("PREVIOUS");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnnext.setText("NEXT");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnnext)
                    .addComponent(btnfirst)
                    .addComponent(btnsave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlast, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnupdate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnprevious, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnexit, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btndel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnclear))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(btnclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndel)
                    .addComponent(btnlast)
                    .addComponent(btnfirst))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprevious)
                    .addComponent(btnnext)
                    .addComponent(btnexit))
                .addGap(15, 15, 15))
        );

        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });

        lblhotelname.setText("HOTEL NAME");

        lblcity.setText("CITY");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhotelname, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txthotelname)
                    .addComponent(txtcity))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthotelname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhotelname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcity))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        
        
          if(txthotelname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the hotel name");
            txthotelname.setText("");
            txthotelname.requestFocus();
            
        }
        if(txtcity.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the city name");
            txtcity.setText("");
            txtcity.requestFocus();
            
        }
        String s1,s2;
        s1 = txthotelname.getText();
        s2 = txtcity.getText();
        try{
            query="SELECT hotelName from hotel";
            rs = st.executeQuery(query);
            while(rs.next()){
            if(s1.equals(rs.getString("cityname"))){
                JOptionPane.showMessageDialog(null,"the hotel already exists\n please enter another hotel name");
                txthotelname.setText("");
                txtcity.setText("");
                return;
            }
            }
            
            query="SELECT cityid from city where cityname ='"+s2+"'";
            rs = st.executeQuery(query);
            rs.next();
            int i = rs.getInt("cityid");
            
        query = "INSERT INTO hotel(hotelName,city_cityid) values('"+s1+"','"+i+"')";
        JOptionPane.showConfirmDialog(null,"Do u really want to add the above hotel");
        st.executeUpdate(query);
        txthotelname.setText("");
        txtcity.setText("");
        txthotelname.requestFocus();
        
        }
        catch(SQLException ex){
            
             JOptionPane.showMessageDialog(null,"The record not available please press previous" );
            txthotelname.setText("");
            txtcity.setText("");
            txthotelname.requestFocus();
        }
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        
           if(txthotelname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the hotel name");
            txthotelname.setText("");
            txthotelname.requestFocus();
            
        }
        if(txtcity.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the city name");
            txtcity.setText("");
            txtcity.requestFocus();
            
        }
        String s1,s2;
        s1 = txthotelname.getText();
        s2 = txtcity.getText();
        try{
            query="SELECT hotelName,city_cityid from hotel";
            rs = st.executeQuery(query);
            while(rs.next()){
            if(rs.isFirst()){
                txthotelname.setText(rs.getString("hotelName"));
                int i =rs.getInt("city_cityid");
                
                query="SELECT cityname from city where cityid ='"+i+"'";
                rs = st.executeQuery(query);
                rs.next();
                txtcity.setText(rs.getString("cityname"));
            }
            }
        }
        catch(SQLException ex){
            
           JOptionPane.showMessageDialog(null,"The record not available please press previous" );
            txthotelname.setText("");
            txtcity.setText("");
            txthotelname.requestFocus();
        }
        
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
           if(txthotelname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the hotel name");
            txthotelname.setText("");
            txthotelname.requestFocus();
            
        }
        if(txtcity.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the city name");
            txtcity.setText("");
            txtcity.requestFocus();
            
        } 
        String s1,s2;
        s1 = txthotelname.getText();
        s2 = txtcity.getText();
        try{
            query="SELECT hotelName,city_cityid from hotel";
            rs = st.executeQuery(query);
            while(rs.next()){
            if(rs.isLast()){
                txthotelname.setText(rs.getString("hotelName"));
                int i =rs.getInt("city_cityid");
                
                query="SELECT cityname from city where cityid ='"+i+"'";
                rs = st.executeQuery(query);
                rs.next();
                txtcity.setText(rs.getString("cityname"));
            }
            }
        }
        catch(SQLException ex){
            
           JOptionPane.showMessageDialog(null,"The city name already exists \nPlease reenter another cityy name");
            txthotelname.setText("");
            txtcity.setText("");
            txthotelname.requestFocus();
        }
        
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        
           if(txthotelname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the hotel name");
            txthotelname.setText("");
            txthotelname.requestFocus();
            
        }
        if(txtcity.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the city name");
            txtcity.setText("");
            txtcity.requestFocus();
            
        }
         String s1,s2;
        s1 = txthotelname.getText();
        s2 = txtcity.getText();
        try{
            query="SELECT idHotel from hotel where hotelName='"+s1+"'";
            rs = st.executeQuery(query);
            rs.next();
            int i =rs.getInt("idHotel");
            
            int m = i+1;
                query = "SELECT hotelName,city_cityid from hotel where idHotel ='"+m+"'";
                rs = st.executeQuery(query);
                rs.next();
                txthotelname.setText(rs.getString("hotelName"));
                int k = rs.getInt("city_cityid");
                
                query="SELECT cityname from city where cityid ='"+k+"'";
                rs = st.executeQuery(query);
                rs.next();
                txtcity.setText(rs.getString("cityname"));
            
        }
        catch(SQLException ex){
            
           JOptionPane.showMessageDialog(null,"The record not available please press previous" );
            txthotelname.setText("");
            txtcity.setText("");
            txthotelname.requestFocus();
        }
        
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        
           if(txthotelname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the hotel name");
            txthotelname.setText("");
            txthotelname.requestFocus();
            
        }
        if(txtcity.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the city name");
            txtcity.setText("");
            txtcity.requestFocus();
            
        }
         String s1,s2;
        s1 = txthotelname.getText();
        s2 = txtcity.getText();
        try{
            query="SELECT idHotel from hotel where hotelName='"+s1+"'";
            rs = st.executeQuery(query);
            rs.next();
            int i =rs.getInt("idHotel");
            
            int m = i-1;
                query = "SELECT hotelName,city_cityid from hotel where idHotel ='"+m+"'";
                rs = st.executeQuery(query);
                rs.next();
                txthotelname.setText(rs.getString("hotelName"));
                int k = rs.getInt("city_cityid");
                
                query="SELECT cityname from city where cityid ='"+k+"'";
                rs = st.executeQuery(query);
                rs.next();
                txtcity.setText(rs.getString("cityname"));
            
        }
        catch(SQLException ex){
            
           JOptionPane.showMessageDialog(null,"The record not available please press next" );
            txthotelname.setText("");
            txtcity.setText("");
            txthotelname.requestFocus();
        }
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
            JOptionPane.showConfirmDialog(null,"Do u really want to exit ");    
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed

         txthotelname.setText("");
            txtcity.setText("");
            txthotelname.requestFocus();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
           if(txthotelname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the hotel name");
            txthotelname.setText("");
            txthotelname.requestFocus();
            
        }
        
        try{
        String s1;
        s1=txthotelname.getText();
        query = "DELETE from hotel where hotelName='"+s1+"'";
        JOptionPane.showConfirmDialog(null, "Do you really want to delete"+s1);
        st.executeUpdate(query);
        JOptionPane.showMessageDialog(null,"Record deleted");
        txthotelname.setText("");
            txtcity.setText("");
            txthotelname.requestFocus();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "record not available");
            txthotelname.setText("");
            txtcity.setText("");
            txthotelname.requestFocus();
        }
    }//GEN-LAST:event_btndelActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Hotel() {
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
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblhotelname;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txthotelname;
    // End of variables declaration//GEN-END:variables
}