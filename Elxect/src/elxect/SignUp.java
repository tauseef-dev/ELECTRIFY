/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elxect;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    
    Connection conn;
    Statement stmt;
    Random random = new Random();
    //Months Variable
    String January;
    String February;
    String March;
    String April;
    String May;
    String June;
    String July;
    String August;
    String September;
    String October;
    String November;
    String December;
    
    int series = 14562711;
    int rand = random.nextInt((999-100)+1)+100;
    String tmpmeterno = String.valueOf(series) +String.valueOf(rand);
    String otp = String.valueOf(random.nextInt(999999));
    
    public SignUp() {
        initComponents();
        nameField.setBackground(new Color(0,0,0,1));
        mobileField.setBackground(new Color(0,0,0,1));
        emailField.setBackground(new Color(0,0,0,1));
        passwordField.setBackground(new Color(0,0,0,1));
        areaField.setBackground(new Color(0,0,0,1));
        cityField.setBackground(new Color(0,0,0,1));
        stateField.setBackground(new Color(0,0,0,1));
        addressField.setBackground(new Color(0,0,0,1));
        verifyOTPField.setBackground(new Color(0,0,0,1));
        signInButton.setVisible(false);
        verifyOTP.setVisible(false);
        verifyOTPField.setVisible(false);
        verifybutton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
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

        jPanel1 = new javax.swing.JPanel();
        elxectLogo = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        signInLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        signInButton = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        areLabel = new javax.swing.JLabel();
        areaField = new javax.swing.JTextField();
        citylabel = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        verifyOTP = new javax.swing.JLabel();
        verifyOTPField = new javax.swing.JTextField();
        otpButton = new javax.swing.JButton();
        verifybutton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        elxectLogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        elxectLogo.setForeground(new java.awt.Color(255, 255, 255));
        elxectLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elxectLogo.setText("Electrify");
        jPanel1.add(elxectLogo);
        elxectLogo.setBounds(20, 10, 160, 40);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backButton.png"))); // NOI18N
        backButton.setPreferredSize(new java.awt.Dimension(34, 34));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(20, 470, 40, 40);

        signInLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(255, 255, 255));
        signInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signInLabel.setText("Sign Up");
        jPanel1.add(signInLabel);
        signInLabel.setBounds(390, 60, 140, 50);

        stateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stateLabel.setForeground(new java.awt.Color(255, 255, 255));
        stateLabel.setText("State");
        jPanel1.add(stateLabel);
        stateLabel.setBounds(510, 270, 40, 20);

        passwordField.setBackground(null);
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(passwordField);
        passwordField.setBounds(190, 290, 250, 20);

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");
        jPanel1.add(emailLabel);
        emailLabel.setBounds(190, 220, 70, 20);

        emailField.setBackground(null);
        emailField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(emailField);
        emailField.setBounds(190, 240, 250, 20);

        mobileLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mobileLabel.setForeground(new java.awt.Color(255, 255, 255));
        mobileLabel.setText("Mobile");
        jPanel1.add(mobileLabel);
        mobileLabel.setBounds(190, 170, 70, 20);

        mobileField.setBackground(null);
        mobileField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mobileField.setForeground(new java.awt.Color(255, 255, 255));
        mobileField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(mobileField);
        mobileField.setBounds(190, 190, 250, 20);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");
        jPanel1.add(nameLabel);
        nameLabel.setBounds(190, 120, 70, 20);

        nameField.setBackground(null);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(nameField);
        nameField.setBounds(190, 140, 250, 20);

        signInButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Sign Up");
        signInButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        signInButton.setContentAreaFilled(false);
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signInButton);
        signInButton.setBounds(420, 400, 110, 30);

        cancelButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelBut.png"))); // NOI18N
        cancelButton1.setPreferredSize(new java.awt.Dimension(34, 34));
        cancelButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButton1MouseClicked(evt);
            }
        });
        jPanel1.add(cancelButton1);
        cancelButton1.setBounds(890, 10, 40, 40);

        passwordLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setText("Password");
        jPanel1.add(passwordLabel1);
        passwordLabel1.setBounds(190, 270, 70, 20);

        stateField.setBackground(null);
        stateField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stateField.setForeground(new java.awt.Color(255, 255, 255));
        stateField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(stateField);
        stateField.setBounds(510, 290, 250, 20);

        areLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        areLabel.setForeground(new java.awt.Color(255, 255, 255));
        areLabel.setText("Address");
        jPanel1.add(areLabel);
        areLabel.setBounds(510, 120, 60, 20);

        areaField.setBackground(null);
        areaField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        areaField.setForeground(new java.awt.Color(255, 255, 255));
        areaField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(areaField);
        areaField.setBounds(510, 190, 250, 20);

        citylabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        citylabel.setForeground(new java.awt.Color(255, 255, 255));
        citylabel.setText("City");
        jPanel1.add(citylabel);
        citylabel.setBounds(510, 220, 40, 20);

        cityField.setBackground(null);
        cityField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityField.setForeground(new java.awt.Color(255, 255, 255));
        cityField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(cityField);
        cityField.setBounds(510, 240, 250, 20);

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Area");
        jPanel1.add(addressLabel);
        addressLabel.setBounds(510, 170, 40, 20);

        addressField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addressField.setForeground(new java.awt.Color(255, 255, 255));
        addressField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(addressField);
        addressField.setBounds(510, 140, 250, 20);

        verifyOTP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        verifyOTP.setForeground(new java.awt.Color(255, 255, 255));
        verifyOTP.setText("Verify OTP");
        jPanel1.add(verifyOTP);
        verifyOTP.setBounds(380, 360, 73, 17);

        verifyOTPField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verifyOTPField.setForeground(new java.awt.Color(255, 255, 255));
        verifyOTPField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(verifyOTPField);
        verifyOTPField.setBounds(460, 360, 80, 20);

        otpButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        otpButton.setForeground(new java.awt.Color(255, 255, 255));
        otpButton.setText("Get OTP");
        otpButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        otpButton.setContentAreaFilled(false);
        otpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otpButtonMouseClicked(evt);
            }
        });
        jPanel1.add(otpButton);
        otpButton.setBounds(420, 400, 110, 30);

        verifybutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verifybutton.setForeground(new java.awt.Color(255, 255, 255));
        verifybutton.setText("Verify");
        verifybutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        verifybutton.setContentAreaFilled(false);
        verifybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifybuttonActionPerformed(evt);
            }
        });
        jPanel1.add(verifybutton);
        verifybutton.setBounds(550, 360, 73, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 940, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        new SignIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked
    
    
    public String randomNumber() {
            return String.valueOf(random.nextInt((9999-1000)+1)+1000);    
    }  
    
     public String randomNumber1() {
            return String.valueOf(random.nextInt((999-100)+1)+100);    
    }
    
    public void fireQuery() throws SQLException  {
                
                
                //intializing by randomly generating
                January = randomNumber();
                February = randomNumber();
                March = randomNumber();
                April = randomNumber();
                May = randomNumber();
                June = randomNumber();
                July = randomNumber();
                August = randomNumber();
                September = randomNumber();
                October = randomNumber();
                November = randomNumber();
                December = randomNumber();
                try{

                //Query Part
                String sql = "Insert into billsbymonth values ('"+tmpmeterno+"', '"+nameField.getText()+"', '"+January+"', '"+February+"', '"+March+"', '"+April+"', '"+May+"', '"+June+"', '"+July+"', '"+August+"', '"+September+"', '"+October+"', '"+November+"', '"+December+"')";
                stmt.executeUpdate(sql);
                }
                catch(Exception ex){
                        
                        JOptionPane.showMessageDialog(this, ex.getMessage());
                }

               
    }
    
    
    public void fireQuery1() throws SQLException  {
                
                
                //intializing by randomly generating
                January = randomNumber1();
                February = randomNumber1();
                March = randomNumber1();
                April = randomNumber1();
                May = randomNumber1();
                June = randomNumber1();
                July = randomNumber1();
                August = randomNumber1();
                September = randomNumber1();
                October = randomNumber1();
                November = randomNumber1();
                December = randomNumber1();
                try{

                //Query Part
                String sql = "Insert into unitsbymonth values ('"+tmpmeterno+"', '"+nameField.getText()+"', '"+January+"', '"+February+"', '"+March+"', '"+April+"', '"+May+"', '"+June+"', '"+July+"', '"+August+"', '"+September+"', '"+October+"', '"+November+"', '"+December+"')";
                stmt.executeUpdate(sql);
                }
                catch(Exception ex){
                        
                        JOptionPane.showMessageDialog(this, ex.getMessage());
                }

               
    }
    
    
    
    public void insertIntoBill(){
            try{
            
            
            //generate meter no
            
            
            //generate month
            OptionalInt opt = random.ints(0, 12).findFirst();
            String tmpmonth = Month.of(opt.getAsInt()).getDisplayName(TextStyle.FULL, Locale.US);
            
            //generate units
            int tmpunit = random.nextInt((999-100)+1)+100;
            
            
            //generate amount
            int tmpamount = random.nextInt((9999-1000)+1)+1000;
            String sql = "INSERT INTO bill " + "VALUES ('"+tmpmeterno+"', '"+tmpmonth+"', "+tmpunit+", "+tmpamount+")";
            stmt.executeUpdate(sql);
            }
            catch(Exception ex){
            
                    JOptionPane.showMessageDialog(this, ex.getMessage());
            }
    
    }
    
    public void insertIntoMain(){
            
            try{
           
            
            //generate address
            //generate city
            //generate state
            
            
            String tmpadd = areaField.getText();
            String tmpcity = cityField.getText();
            String tmpstate = stateField.getText();
            String sql = "INSERT INTO main " + "VALUES ('"+nameField.getText()+"', '"+tmpmeterno+"', '"+tmpadd+"', '"+tmpstate+"', '"+tmpcity+"', '"+emailField.getText()+"', '"+mobileField.getText()+"', '"+addressField.getText()+"')";
            stmt.executeUpdate(sql);
            }
            catch(Exception ex){
            
                    JOptionPane.showMessageDialog(this, ex.getMessage());
            }
    
    
    
    }
    
    
    public void insertIntometerDetails(){
            
        try{
            String tmpmeterloc = "inside";
            String tmpmetertype = "electronic";
            String tmpphasecode = String.valueOf(random.nextInt((99-10)+1)+10);
            String tmpbilltype = "normal";
            String tmpdays = String.valueOf(random.nextInt((999-100)+1)+100);
            String tmpmeterrent = String.valueOf(random.nextInt((999-100)+1)+100);
            String tmpmcbrent = String.valueOf(random.nextInt((99-10)+1)+10);
            String tmpservice = String.valueOf(random.nextInt((999-100)+1)+100);
            String tmpgst = String.valueOf(random.nextInt((999-100)+1)+100);
            String sql = "INSERT INTO meterdetails " + "VALUES ('"+tmpmeterno+"', '"+tmpmeterloc+"', '"+tmpmetertype+"', '"+tmpphasecode+"', '"+tmpbilltype+"', '"+tmpdays+"', '"+tmpmeterrent+"', '"+tmpmcbrent+"', '"+tmpservice+"', '"+tmpgst+"')";
            stmt.executeUpdate(sql);
            }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
            }
    
    
    }
    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        
        connection();
            try{
            String name =  nameField.getText();
            String email =  emailField.getText();
            String pass = passwordField.getText();
            String mob =  mobileField.getText();
            String sql = "INSERT INTO newuser " + "VALUES (NULL, '"+name+"', '"+email+"', '"+pass+"', "+mob+")";
            stmt.executeUpdate(sql);
            fireQuery();
            fireQuery1();
            //insertIntoBill();
            insertIntoMain();
            insertIntometerDetails();
            sql = "INSERT INTO currentuser " +
                   "VALUES ('"+name+"', '"+pass+"')";
            int rs = stmt.executeUpdate(sql);
            
            if(rs == 0){
                
                this.dispose();
            }
            else{
                
                set();
            }
            }
            catch(Exception ex){
            
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        
        
    }//GEN-LAST:event_signInButtonActionPerformed

    private void cancelButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButton1MouseClicked
    
    
            public static boolean isValid(String s) 
        { 

            // The given argument to compile() method  
            // is regular expression. With the help of  
            // regular expression we can validate mobile 
            // number.  
            // 1) Begins with 0 or 91 
            // 2) Then contains 7 or 8 or 9. 
            // 3) Then contains 9 digits 
            Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 

            // Pattern class contains matcher() method 
            // to find matching between given number  
            // and regular expression 
            Matcher m = p.matcher(s); 
            return (m.find() && m.group().equals(s)); 
        } 
            
    public void sendSMS() {
		try {
			// Construct data
                       
                        
			String apiKey = "apikey=" + "3NOJc9egB1g-jby5O8VydpvjuOcuffhijvwiFvvtyr";
			String message = "&message=" + "Hello, " +nameField.getText()  +" This is your OTP " +otp +" for registration of Electrify App";
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" +"91" + mobileField.getText();
			
			// Send data
			HttpURLConnection connn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			connn.setDoOutput(true);
			connn.setRequestMethod("POST");
			connn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			connn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(connn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
                        JOptionPane.showMessageDialog(null, "OTP sent successfully");
		} catch (Exception e) {
                    
                        JOptionPane.showMessageDialog(this, "Error SMS" +e);
			JOptionPane.showMessageDialog(this, "error" +e);
		}
	}
           
    private void otpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otpButtonMouseClicked
        // TODO add your handling code here:
        
        boolean ans = isValid(mobileField.getText());
        
        if(ans == true)
        {   
                sendSMS();
                
                verifyOTP.setVisible(true);
                verifyOTPField.setVisible(true);
                verifybutton.setVisible(true);
                
                
        }
        else
        {
        JOptionPane.showMessageDialog(null, "invalid mobile number");
        }
        //visible parts
        
    }//GEN-LAST:event_otpButtonMouseClicked

    private void verifybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifybuttonActionPerformed
        // TODO add your handling code here:
        if(otp.equals(verifyOTPField.getText()))
        {
            JOptionPane.showMessageDialog(null, "OTP verified successfully");
            
            otpButton.setVisible(false);
            verifyOTP.setVisible(false);
            verifyOTPField.setVisible(false);
            verifybutton.setVisible(false);
            signInButton.setVisible(true);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Wrong OTP entered");
        }
    }//GEN-LAST:event_verifybuttonActionPerformed

     public void set(){
            this.dispose();
            SignIn ss = new SignIn();
            ss.setVisible(true);
            SignIn.usernameField.setText(nameField.getText());
            SignIn.passwordField.setText(passwordField.getText());
    }
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel areLabel;
    private javax.swing.JTextField areaField;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cancelButton1;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel citylabel;
    private javax.swing.JLabel elxectLogo;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mobileField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton otpButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JButton signInButton;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel verifyOTP;
    private javax.swing.JTextField verifyOTPField;
    private javax.swing.JButton verifybutton;
    // End of variables declaration//GEN-END:variables
}
