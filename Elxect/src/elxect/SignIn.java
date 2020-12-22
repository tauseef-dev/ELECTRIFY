
package elxect;


import static elxect.Home.cbamountField;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */

public class SignIn extends javax.swing.JFrame {
    
    Connection conn;
    Statement stmt;
    
    public SignIn() {
        initComponents();
        usernameField.setBackground(new Color(0,0,0,1));
        passwordField.setBackground(new Color(0,0,0,1));
        
    }

  
     public void connection(){
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electrify", "sam", "sam22");
        stmt = conn.createStatement();
        }
        catch(Exception ex)
        {
        JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        secondCoreLayer = new javax.swing.JPanel();
        adminCheck = new javax.swing.JCheckBox();
        newLabel = new javax.swing.JLabel();
        elxectLogo = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        signInLabel = new javax.swing.JLabel();
        backGroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        secondCoreLayer.setLayout(null);

        adminCheck.setForeground(new java.awt.Color(255, 255, 255));
        adminCheck.setText("admin");
        adminCheck.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        secondCoreLayer.add(adminCheck);
        adminCheck.setBounds(350, 330, 90, 17);

        newLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newLabel.setForeground(new java.awt.Color(255, 255, 255));
        newLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newLabel.setText("New Customer ??");
        newLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newLabelMouseClicked(evt);
            }
        });
        secondCoreLayer.add(newLabel);
        newLabel.setBounds(410, 420, 120, 20);

        elxectLogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        elxectLogo.setForeground(new java.awt.Color(255, 255, 255));
        elxectLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elxectLogo.setText("Electrify");
        secondCoreLayer.add(elxectLogo);
        elxectLogo.setBounds(20, 10, 160, 40);

        signInButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Sign In");
        signInButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        signInButton.setContentAreaFilled(false);
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        secondCoreLayer.add(signInButton);
        signInButton.setBounds(410, 370, 110, 30);

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelBut.png"))); // NOI18N
        cancelButton.setPreferredSize(new java.awt.Dimension(34, 34));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        secondCoreLayer.add(cancelButton);
        cancelButton.setBounds(890, 10, 40, 40);

        passwordField.setBackground(null);
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        secondCoreLayer.add(passwordField);
        passwordField.setBounds(350, 280, 250, 30);

        usernameField.setBackground(null);
        usernameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        secondCoreLayer.add(usernameField);
        usernameField.setBounds(350, 190, 250, 30);

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        secondCoreLayer.add(passwordLabel);
        passwordLabel.setBounds(350, 260, 70, 20);

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");
        secondCoreLayer.add(usernameLabel);
        usernameLabel.setBounds(350, 170, 70, 20);

        signInLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(255, 255, 255));
        signInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signInLabel.setText("Sign In");
        secondCoreLayer.add(signInLabel);
        signInLabel.setBounds(390, 80, 140, 80);

        backGroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image.png"))); // NOI18N
        secondCoreLayer.add(backGroundImage);
        backGroundImage.setBounds(0, 0, 940, 545);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(secondCoreLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(secondCoreLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void setMyProfile(String user){
        String tmpname;
        String tmpemail;
        String tmpmob;
        String tmpadd;
        String tmpmeter;
        String tmpstate;
        connection();
        
        try{
        String sql = "select * from main where name = '"+user+"'";
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
         new Home().setVisible(true);
         tmpname = rs.getString("name");
         Home.mpNameField.setText(tmpname);
         tmpemail = rs.getString("email");
         Home.mpEmailField.setText(tmpemail);
         tmpmob  = rs.getString("phone");
         Home.mpMobField.setText(tmpmob);
         tmpadd = rs.getString("localadd");
         Home.mpAddField.setText(tmpadd);
         tmpmeter = rs.getString("meter_number");
         Home.mpMeterField.setText(tmpmeter);
         tmpstate = rs.getString("state");
         Home.mpStateField.setText(tmpstate);
        }
        }
        
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
    public void setCurrentBill(String user){
        String tmpmeterno;
        String tmpmonth = "October";
        String tmpunit;
        String tmpamount;
        String met = "";
        connection();
        
        try{
        String sql = "select meter_number from billsbymonth where name = '"+user+"'";
        ResultSet r = stmt.executeQuery(sql);
        while(r.next()){
        met = r.getString("meter_number");
        }
        String upsql = "select * from billsbymonth where meter_number = '"+met+"'";
        ResultSet rs = stmt.executeQuery(upsql);
        
        while(rs.next()){
         tmpmeterno = rs.getString("meter_number");
         Home.cbmeterNoField.setText(tmpmeterno);
         Home.cbmonthField.setText(tmpmonth);
         tmpamount = rs.getString("october");
         Home.cbamountField.setText(tmpamount);
        }
        
        String upsql2 = "select * from unitsbymonth where meter_number = '"+met+"'";
        ResultSet rs1 = stmt.executeQuery(upsql2);
        
        while(rs1.next())
        {
        tmpunit  = rs1.getString("october");
         Home.cbunitField.setText(tmpunit);
        }
        }
        
        
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
     public void setGenerateBill(String user){
        String tmpname = usernameField.getText();
        String tmpmeterno;
        String tmpmetertype;
        String tmpmonth;
        String tmpunit;
        String tmpbilltype;
        String tmpservice;
        String tmpgst;
        String tmpamount;  
        String met = "";
        connection();
        
        try{
        String sql = "select meter_number from main where name = '"+user+"'";
        ResultSet r = stmt.executeQuery(sql);
        while(r.next()){
        met = r.getString("meter_number");
        }
        String upsql = "select * from billsbymonth where meter_number = '"+met+"'";
        ResultSet rs = stmt.executeQuery(upsql);
        Home.gbnameField.setText(tmpname);
        while(rs.next()){
         tmpmeterno = rs.getString("meter_number");
         Home.gbmeterField.setText(tmpmeterno);
         tmpamount = rs.getString("january");
         Home.gbamountField.setText(tmpamount);
        }
        
        
        String upsql2 = "select * from unitsbymonth where meter_number = '"+met+"'";
        ResultSet rss = stmt.executeQuery(upsql2);
        while(rss.next())
        {
         tmpunit  = rss.getString("january");
         Home.gbunitField.setText(tmpunit);
        }
        
        String sql1 = "select * from meterdetails where meter_number = '"+met+"'";
        ResultSet rs1 = stmt.executeQuery(sql1);
        while(rs1.next()){
         tmpmetertype = rs1.getString("meter_type");
         Home.gbmetertypeField.setText(tmpmetertype);
         tmpbilltype = rs1.getString("bill_type");
         Home.gbbilltypeField.setText(tmpbilltype);
         tmpservice  = rs1.getString("service_rent");
         Home.gbserviceField.setText(tmpservice);
        tmpgst = rs1.getString("gst");
        Home.gbgstField.setText(tmpgst);
        }
        
        }
        
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
    public void setMeterDetails(String user){
        String tmpmeterno;
        String tmpmetertype;
        String tmpphase;
        String tmpregion;
        String tmpmcb;
        String met = "";
        connection();
        
        try{
        String sql = "select * from main where name = '"+user+"'";
        ResultSet r = stmt.executeQuery(sql);
        while(r.next()){
        met = r.getString("meter_number");
        tmpregion = r.getString("address");
        Home.mdreigonField.setText(tmpregion);
        }
        String upsql = "select * from meterdetails where meter_number = '"+met+"'";
        ResultSet rs = stmt.executeQuery(upsql);
        
        while(rs.next()){
         tmpmeterno = rs.getString("meter_number");
         Home.mdmeterField.setText(tmpmeterno);
         tmpmetertype = rs.getString("meter_type");
         Home.mdmetertypeField.setText(tmpmetertype);
         tmpphase  = rs.getString("phase_code");
         Home.mdphaseField.setText(tmpphase);
         tmpmcb = rs.getString("mcb_rent");
         Home.mdmcbField.setText(tmpmcb);
        }
        }
        
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    } 
     
     
    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        if(!adminCheck.isSelected()){
        connection();
        String user = usernameField.getText();
        String pass = passwordField.getText();
        try{
        String sql = "select username, password from currentUser where username = '"+user+"' AND password = '"+pass+"'";
        ResultSet rs = stmt.executeQuery(sql);
        
        if(rs.next()){
         this.dispose();
         
         setMyProfile(user);
         setCurrentBill(user);
         setGenerateBill(user);
         setMeterDetails(user);
         Home.payamountField.setText(cbamountField.getText());
        }
        else{
        JOptionPane.showMessageDialog(null, "Invalid Login");

        }
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }}
        
        else{
        
        connection();
        String user = usernameField.getText();
        String pass = passwordField.getText();
        try{
        String sql = "select username, password from admin where username = '"+user+"' AND password = '"+pass+"'";
        ResultSet rs = stmt.executeQuery(sql);
        
        if(rs.next()){
         new AdminHome().setVisible(true);
         this.dispose();
        }
        else{
                JOptionPane.showMessageDialog(null, "wrong credentials");
        }
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        }
    }//GEN-LAST:event_signInButtonActionPerformed

    
    
    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void newLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newLabelMouseClicked
        
        new SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newLabelMouseClicked

   
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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adminCheck;
    private javax.swing.JLabel backGroundImage;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel elxectLogo;
    private javax.swing.JLabel newLabel;
    public static javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel secondCoreLayer;
    public javax.swing.JButton signInButton;
    private javax.swing.JLabel signInLabel;
    public static javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
