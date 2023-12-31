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
public class tours extends javax.swing.JFrame {
    Connection con; // for establishing a connection
    Statement st;  //sql statement
    String cs;  //database path
    ResultSet rs; //for the resultset
    
    String user;  //database username
    String password;  //database password
    String query;
    /**
     * Creates new form tours
     */
    public tours() {
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
        txttourname = new javax.swing.JTextField();
        txtdestination = new javax.swing.JTextField();
        lbltourname = new javax.swing.JLabel();
        lbldestination = new javax.swing.JLabel();
        lblcategory = new javax.swing.JLabel();
        txtcategory = new javax.swing.JTextField();
        lblprice = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                    .addComponent(btnfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprevious)
                    .addComponent(btnnext)
                    .addComponent(btnexit))
                .addGap(15, 15, 15))
        );

        txtdestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdestinationActionPerformed(evt);
            }
        });

        lbltourname.setText("TOUR NAME");

        lbldestination.setText("DESTINATION");

        lblcategory.setText("CATEGORY");

        lblprice.setText("PRICE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldestination, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltourname, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcategory)
                    .addComponent(txttourname, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(txtdestination)
                    .addComponent(txtprice))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttourname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltourname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldestination)
                    .addComponent(txtdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcategory)
                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprice)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdestinationActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        
         if(txtcategory.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the tour category");
            txtcategory.setText("");
            txtcategory.requestFocus();
        }
        if(txtdestination.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the destination");
            txtdestination.setText("");
            txtdestination.requestFocus();
        }
        if(txttourname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the tour name \nwhere the vehicle has moved to");
            txttourname.setText("");
            txttourname.requestFocus();
        }
        if(txtprice.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the Price of the tour");
            txtprice.setText("");
            txtprice.requestFocus();
        }
        String s1,s2,s3,s4;
        s1 = txttourname.getText();
        s2 = txtdestination.getText();
        s3 = txtcategory.getText();
        s4 = txtprice.getText();
        try{
        query = "select tourname from tour";
        rs = st.executeQuery(query);
        while(rs.next()){
            if(s2.equals(rs.getString("tourname"))){
                JOptionPane.showMessageDialog(null,"the vehicle already exists \n please try entering another vehicle or delete the above vehicle");
                txttourname.setText("");
                txttourname.requestFocus();
            }
        }      
        query = "insert into tour (tourname,destination,category,price) values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"'";
        JOptionPane.showConfirmDialog(null,"do you really want to add the above information");
        st.executeUpdate(query);
        JOptionPane.showMessageDialog(null,"record added");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"p;ease check your information and try again \n Thanks");
            txtdestination.setText("");
            txtcategory.setText("");
            txttourname.setText("");
            txtprice.setText("");
            txttourname.requestFocus();
        }
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        
        try{
          
        query = "select tourname,destination,category,price from tour";      
        rs=st.executeQuery(query);
        while(rs.next()){
            if(rs.isFirst()){
            txtdestination.setText(rs.getString("destination"));
            txtcategory.setText(rs.getString("category"));
            txttourname.setText(rs.getString("tourname"));
            txtprice.setText(rs.getString("price"));
            }
        }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"There is no record at this position\n Thanks");
            txtdestination.setText("");
            txtcategory.setText("");
            txttourname.setText("");
            txtprice.setText("");
            txttourname.requestFocus();
        }
        
        
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        
        try{
          
        query = "select tourname,destination,category,price from tour";
        rs=st.executeQuery(query);
        while(rs.next()){
            if(rs.isLast()){
            txtdestination.setText(rs.getString("destination"));
            txtcategory.setText(rs.getString("category"));
            txttourname.setText(rs.getString("tourname"));
            txtprice.setText(rs.getString("price"));
            }
        }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"There is no record at this position\n Thanks");
            txtdestination.setText("");
            txtcategory.setText("");
            txttourname.setText("");
            txtprice.setText("");
            txttourname.requestFocus();
        }
        
        
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        
        try{
            String s1 = txttourname.getText();
            query = "select tourid from tour where tourname='"+s1+"'";
            rs = st.executeQuery(query);
            rs.next();
            int i = rs.getInt("tourid");
            int m = i+1;
            
            query = "select tourname,destination,category,price from tour where tourid='"+m+"'";
        rs=st.executeQuery(query);
        rs.next();
            txtdestination.setText(rs.getString("destination"));
            txtcategory.setText(rs.getString("category"));
            txttourname.setText(rs.getString("tourname"));
            txtprice.setText(rs.getString("price"));
                  
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"There is no record at this position");
            txtdestination.setText("");
            txtcategory.setText("");
            txttourname.setText("");
            txtprice.setText("");
            txttourname.requestFocus();
        }
        
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        
        try{
            String s1 = txttourname.getText();
            query = "select tourid from tour where tourname='"+s1+"'";
            rs = st.executeQuery(query);
            rs.next();
            int i = rs.getInt("tourid");
            int m = i-1;
            
            query = "select tourname,destination,category,price from tour where tourid='"+m+"'";
        rs=st.executeQuery(query);
        rs.next();
            txtdestination.setText(rs.getString("destination"));
            txtcategory.setText(rs.getString("category"));
            txttourname.setText(rs.getString("tourname"));
            txtprice.setText(rs.getString("price"));
                  
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"There is no record at this position");
           
            txtdestination.setText("");
            txtcategory.setText("");
            txttourname.setText("");
            txtprice.setText("");
            txttourname.requestFocus();
        }
        
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
           JOptionPane.showConfirmDialog(null,"Do u really want to exit ");    
        System.exit(0);

    }//GEN-LAST:event_btnexitActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       txtdestination.setText("");
            txtcategory.setText("");
            txttourname.setText("");
            txtprice.setText("");
            txttourname.requestFocus();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
       try{
        String s1 = txttourname.getText();
        
        query = "DELETE from tour where tourname='"+s1+"'";
        JOptionPane.showConfirmDialog(null,"Do you really want to delete "+s1);
        st.executeUpdate(query);
        JOptionPane.showMessageDialog(null,"Record deleted");
        txtdestination.setText("");
            txtcategory.setText("");
            txttourname.setText("");
            txtprice.setText("");
            txttourname.requestFocus();
       }
       catch(SQLException ex){
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null,"There is no record at this position");
           txtdestination.setText("");
            txtcategory.setText("");
            txttourname.setText("");
            txtprice.setText("");
            txttourname.requestFocus();
       }
        
    }//GEN-LAST:event_btndelActionPerformed

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
            java.util.logging.Logger.getLogger(tours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tours().setVisible(true);
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
    private javax.swing.JLabel lblcategory;
    private javax.swing.JLabel lbldestination;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lbltourname;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtdestination;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txttourname;
    // End of variables declaration//GEN-END:variables
}
