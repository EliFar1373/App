package com.learn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;


public class healthsoft {
	public static void main(String[]arg) {
		JFrame frame=new JFrame("Health & Sports Course");
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		
		JPanel loginPanel=new JPanel();
		loginPanel.setLayout(new GridLayout(3,2));
		JLabel userlabel=new JLabel("username");
		JTextField userfield=new JTextField();
		JLabel passlabel=new JLabel("Password");
		JPasswordField passfield=new JPasswordField();
		JButton loginButton=new JButton("login");
		
		 // Add components to the loginPane
		loginPanel.add(userlabel);
		loginPanel.add(userfield);
		loginPanel.add(passlabel);
		loginPanel.add(passfield);
		loginPanel.add(loginButton);
		
		loginPanel.setVisible(true);
		frame.add(loginPanel);
		
        
		
		
     
       
        
        
        // Main Panel (After Login)
        JPanel mainpanel=new JPanel();
        mainpanel.setLayout(new BorderLayout());
        mainpanel.setVisible(false);
        
        
        // Image Display
		JLabel imageLabel=new JLabel();
		imageLabel.setHorizontalAlignment(JLabel.CENTER);
		ImageIcon defaultImage=new ImageIcon("C:\\Users\\elham\\OneDrive\\Desktop\\image\\1.jpg");
		imageLabel.setIcon(defaultImage);
        
 
        // Dropdown for course selection
        String[] courses= {"Yoga", "Cardio", "Strength Training", "Nutrition"};
        JComboBox<String> coursedropdown=new JComboBox<>(courses);
        JLabel courselabel=new JLabel("Select Course:"); 
        
        
        
     // Progress Bar
        JProgressBar progressbar=new JProgressBar(0,100);
        progressbar.setStringPainted(true);
        
        // File Upload
        
       JButton uploadButton=new JButton("Upload Progress");
       JLabel fileLabel=new JLabel("No file selected");
       
       uploadButton.addActionListener(e->{
    	   JFileChooser fileChooser=new JFileChooser();
    	   int returnValue =fileChooser.showOpenDialog(frame);
    	   if(returnValue==JFileChooser.APPROVE_OPTION) {
    		   File selectedFile = fileChooser.getSelectedFile();
    		   fileLabel.setText("Uploaded: "+selectedFile.getName()) ;
    		   
    	   }
    	   
       });
       
    	    
    	


        JPanel bottomPanel =new JPanel();
        bottomPanel.add(uploadButton);
        bottomPanel.add(fileLabel);
        bottomPanel.add(progressbar);
        
       
        
     // Layout
        JPanel toppanel=new JPanel();
        toppanel.add(coursedropdown);
        toppanel.add(courselabel);
        
        
        JPanel bottompanel=new JPanel();
        
        
        mainpanel.add(toppanel,BorderLayout.NORTH);
//        mainpanel.add(BorderLayout.CENTER);
        mainpanel.add(bottomPanel,BorderLayout.SOUTH);
        
        
        mainpanel.add(imageLabel, BorderLayout.CENTER);
       
        
     // Login Button Action
        loginButton.addActionListener(e->{
        	String username=userfield.getText();
        	String password=new String(passfield.getPassword());
        	if(username.equals("user")&&password.equals("pass")) {
        		loginPanel.setVisible(false);
        		mainpanel.setVisible(true);
        		frame.add(mainpanel);
        		
        		// Revalidate to refresh the layout after changes
                frame.validate();  // Recalculates and updates layout

                // Repaint the frame to show the new panel
                frame.repaint();
        		
        	}else {
        		JOptionPane.showMessageDialog(frame,"invalid credential");
        		
        	}
        	
        });
        
        
          
        
        frame.setVisible(true);
               
         
      

       
       
     
        
        
    
	
        

		
	}}
	
    
  


	


