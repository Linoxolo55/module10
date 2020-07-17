package module10;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import java.awt.Color;
import sun.io.Win32ErrorMode;

public class Database {
        private JFrame frame;
        private JTextField LearnerName;
        private JTextField learnerSurname;
        private JTextField Gender;
        private JTextField Grade;
        private JTextField DateOfBirth;
        private JTextField ParentName;
        private JTextField ParentSurname;
        private JTextField ParentContact;
        private JTextField ParentAddress;
        private JTextField NoOfChildren;
        private JTextField UserName;
        private JTextField Password;
        
    public static void main(String[] args) {
        // TODO code application logic here
       EventQueue.invokeLater(new Runnable() {
              public void run() { 
                  try {
                     Database window = new Database();
                     window.frame.setVisible(true);
                  } catch (Exception e) {
                      e.printStackTrace();
                  }
                     
      }   
   });
       
       Connection con = null;
       String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
       String username = "root";
       String password = "Linoxolo55";
        try {
            try {
                  Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root","root","123SakheJita");
            System.out.println("Connected!");
        } catch (Exception ex) {
            throw new Error("Error",ex);
        } finally {
                try {
                    if (con != null) {
                        con.close();
                      }
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            
            }
            
        }
        
    }
         // creates the application
     public Database(){
         Win32ErrorMode.initialize();
     }
     
          //intializes the content of the frame

     private void initialize(){
     frame = new JFrame();
     frame.setBounds(100, 100, 508, 391);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.getContentPane().setLayout(null);
     
     JButton btnRegister = new JButton("Register");
     btnRegister.setBackground(Color.GREEN);
     btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "You are successfully registered!");
           
            }
     
}
     );
    btnRegister.setBounds(166, 173, 150, 23);
    frame.getContentPane().add(btnRegister);
    
    LearnerName = new JTextField();
    LearnerName.setBounds(98, 52, 72, 20);
    frame.getContentPane().add(LearnerName);
    LearnerName.setColumns(10);
    
    learnerSurname = new JTextField();
    learnerSurname.setBounds(108, 83, 62, 20);
    frame.getContentPane().add(learnerSurname);
    learnerSurname.setColumns(10);
     
    Gender = new JTextField();
    Gender.setBounds(60, 145, 110, 20);
    frame.getContentPane().add(Gender);
    Gender.setColumns(10);
   
    Grade = new JTextField();
    Grade.setBounds(216, 52, 110, 20);
    frame.getContentPane().add(Grade);
    Grade.setColumns(10);
    
    DateOfBirth = new JTextField();
    DateOfBirth.setBounds(84, 114,862, 20);
    frame.getContentPane().add(DateOfBirth);
    DateOfBirth.setColumns(10);
    
    ParentName = new JTextField();
    ParentName.setBounds(254, 83, 72, 20);
    frame.getContentPane().add(ParentName);
    ParentName.setColumns(10);
   
    ParentSurname = new JTextField();
    ParentSurname.setBounds(272, 114, 54, 20);
    frame.getContentPane().add(ParentSurname);
    ParentSurname.setColumns(10);
    
    ParentContact = new JTextField();
    ParentContact.setBounds(272, 145, 54, 20);
    frame.getContentPane().add(ParentContact);
    ParentContact.setColumns(10);
   
        
    ParentAddress = new JTextField();
    ParentAddress.setBounds(428, 52, 54, 20);
    frame.getContentPane().add(ParentAddress);
    ParentAddress.setColumns(10);
   
   JButton btnLogin = new JButton("Login");
   btnLogin.setBackground(Color.GREEN);
   btnLogin.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvente) {
           String iUsername = UserName.getText();
           String iPassword = Password.getText();
           
            if (iUsername.equals("abcde") && iPassword.equals("23645")) {
                JOptionPane.showMessageDialog(frame, "You have logged in successfully");
            } else {
                JOptionPane.showMessageDialog(frame, "invalied UserName or Password!");
            
            }
         
        }
        
   
   });
     btnLogin.setBounds(155, 318, 178, 23);
     frame.getContentPane().add(btnLogin);
     
     UserName = new JTextField();
     UserName.setBounds(247, 256, 86, 20);
     frame.getContentPane().add(UserName);
     UserName.setColumns(10);
         
     Password = new JTextField();
     Password.setBounds(247, 287, 86, 20);
     frame.getContentPane().add(Password);
     Password.setColumns(10);
    
     NoOfChildren = new JTextField();
     NoOfChildren.setBounds(422, 83, 62, 20);
     frame.getContentPane().add(NoOfChildren);
     NoOfChildren.setColumns(10);
    
     
     JTextPane txtpnAdmin = new JTextPane();
     txtpnAdmin.setBackground(Color.GRAY);
     txtpnAdmin.setFont(new Font("Berlin San FB", Font.BOLD, 25));
     txtpnAdmin.setText("Administrator");
     txtpnAdmin.setBounds(155, 222, 178, 30);
     frame.getContentPane().add(txtpnAdmin);
     
          JLabel lblNewLable1 = new JLabel("LearnerName");
          lblNewLable1.setBounds(10, 55, 78, 14);
          frame.getContentPane().add(lblNewLable1);
          
       
          JLabel lblNewLable_1 = new JLabel("LearnerSurname");
          lblNewLable_1.setBounds(10, 85, 99, 14);
          frame.getContentPane().add(lblNewLable_1);
          
     
          JLabel lblNewLable_2 = new JLabel("Grade");
          lblNewLable_2.setBounds(10, 117, 72, 14);
          frame.getContentPane().add(lblNewLable_2);
                            
    
          JLabel lblNewLable_3 = new JLabel("Gender");
          lblNewLable_3.setBounds(10, 148, 61, 14);
          frame.getContentPane().add(lblNewLable_3);
          
          
          JLabel lblNewLable_4 = new JLabel("DateOfBirth");
          lblNewLable_4.setBounds(176, 55, 43, 14);
          frame.getContentPane().add(lblNewLable_4);
          
          
          JLabel lblNewLable_5 = new JLabel("ParentName");
          lblNewLable_5.setBounds(178, 117, 99, 14);
          frame.getContentPane().add(lblNewLable_5);
          
          
          JLabel lblNewLable_6 = new JLabel("ParentSurname");
          lblNewLable_6.setBounds(10, 55, 78, 14);
          frame.getContentPane().add(lblNewLable_6);
          
          
          JLabel lblNewLable_7 = new JLabel("ParentAddress");
          lblNewLable_1.setBounds(336, 55, 99, 14);
          frame.getContentPane().add(lblNewLable_7);
           
          
          JLabel lblNewLable_8 = new JLabel("ParentContact");
          lblNewLable_8.setBounds(336, 86, 99, 14);
          frame.getContentPane().add(lblNewLable_8);
          
          
          JLabel lblNewLable_9 = new JLabel("NoOfChildrenErroled");
          lblNewLable_9.setBounds(155, 259, 82, 14);
          frame.getContentPane().add(lblNewLable_9);
          
          
          JLabel lblNewLable_10 = new JLabel("UserName");
          lblNewLable_10.setBounds(10, 55, 78, 14);
          frame.getContentPane().add(lblNewLable_10);
          
          
          JLabel lblNewLable_11 = new JLabel("Password");
          lblNewLable_11.setBounds(10, 55, 78, 14);
          frame.getContentPane().add(lblNewLable_11);
     }
}


}
