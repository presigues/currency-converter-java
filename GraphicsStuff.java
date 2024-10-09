/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphics.stuff;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.BoxLayout; 
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JTextField;

/**
 *
 * @author pres2590
 */
public class GraphicsStuff extends JPanel {

    /**
     * @param args the command line arguments
     */
    
 
    
    
    
    
   public void paint( Graphics g )
    {
        
         
    }
   
   
  
    
       
  
  

    public static void main( String[] args )
    {
        Color darkblue  = new Color(46, 52, 80);
        Color lightblue = new Color(39, 158, 194);

        
 
        
        // You can change the title or size here if you want.
        JFrame f = new JFrame("Currency Converter");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new GraphicsStuff());
        f.setBackground(darkblue);
        f.setSize(700, 700);
        f.setLocation(600, 100);
        f.setLayout(null);
        f.setResizable(false);
        
        
        
      
   
     
    
  Font main = new Font("Arial", Font.BOLD, 30);
   Font small = new Font("Arial", Font.BOLD, 16);
       
   DecimalFormat df = new DecimalFormat("#.##"); // creates a new decimal format to limit dobules to 2 decimal places
        df.setRoundingMode(RoundingMode.CEILING); // sets rounding mode to ceiling
    
      
      
      JLabel title = new JLabel("CURRENCY CONVERTER");  
      title.setForeground(darkblue);
      title.setBounds(160, 50, 500, 100);
      title.setFont(main);
        
      f.add(title);
      
      JTextField current = new JTextField("0.00", 50);
      current.setBounds(100, 275,90,40);
      
       JLabel currentdollar = new JLabel("$");
      currentdollar.setBounds(80, 275,90,40);
    
      current.setFont(main);
      f.add(current);
      
       JLabel converted = new JLabel("0.00");  
      converted.setForeground(darkblue);
       converted.setBounds(510, 250, 500, 100);
       converted.setFont(main);
       f.add(converted);
      
      
       JButton b = new JButton("CONVERT");  
       b.setBackground(lightblue); 
       b.setBounds(285, 400,120,20);
       b.setFont(small);
       f.add(b);
       currentdollar.setFont(main);
       f.add(currentdollar);
       
       
           
        
      String[] currentchoices = { "USD", "BTC", "CAD", "EUR", "YPY" };
        
      final JComboBox<String> currentbox = new JComboBox<String>(currentchoices);
      currentbox.setMaximumSize(currentbox.getPreferredSize() );
      currentbox.setBackground(lightblue);  
       currentbox.setBounds(100, 400,90,20);
       currentbox.setFont(small);
       
      

     f.add(currentbox);
         
      String[] convertchoices = { "USD", "BTC", "CAD", "EUR", "YPY" };
        
      final JComboBox<String> convertbox = new JComboBox<String>(currentchoices);
      convertbox.setMaximumSize(convertbox.getPreferredSize() );
      convertbox.setBackground(lightblue); 
      convertbox.setBounds(500, 400,90,20);
        convertbox.setFont(small);
       f.add(convertbox);
       
       //
      //Double.parseDouble(mainmoney);
      
       
        
        
         
          b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
         String currentselect = (String)currentbox.getSelectedItem();
        String convselect = (String)convertbox.getSelectedItem();  
        
        if(current.getText().equals("")){
            current.setText("0.00");
            
        }
        
       
        
        double sum;
        
         String stringsum;
         
        double money = Double.parseDouble(current.getText());
         
         System.out.println(currentselect +" " + "to" + " " + convselect);
         
         switch(currentselect){
             case "USD":
                 switch(convselect){
                     
                     case "USD":
                         
                         sum = money * 1;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                     
                     case "BTC":
                         
                         sum = money * .000016;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                            case "CAD":
                         
                         sum = money * 1.35;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "EUR":
                         
                         sum = money * .9;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "YPY":
                         
                         sum = money * 143.55;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                 }
                 break;
                  case "BTC":
                 switch(convselect){
                     
                     case "USD":
                         
                         sum = money * 63224.00;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                     
                     case "BTC":
                         
                         sum = money *1;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                            case "CAD":
                         
                         sum = money * 85073.68;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "EUR":
                         
                         sum = money * 56674.13;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "YPY":
                         
                         sum = money * 9072605.78;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                 }
                 break;
  
                 case "CAD":
                 switch(convselect){
                     
                     case "USD":
                         
                         sum = money * .74;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                     
                     case "BTC":
                         
                         sum = money *.000012;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                            case "CAD":
                         
                         sum = money * 1;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "EUR":
                         
                         sum = money * .67;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "YPY":
                         
                         sum = money * 106.61;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                 }
                 break;
              case "EUR":
                 switch(convselect){
                     
                     case "USD":
                         
                         sum = money * 1.12;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                     
                     case "BTC":
                         
                         sum = money *.000018;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                            case "CAD":
                         
                         sum = money * 1.5;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "EUR":
                         
                         sum = money * 1;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "YPY":
                         
                         sum = money * 160.04;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                 }
                 break;
             case "YPY":
                 switch(convselect){
                     
                     case "USD":
                         
                         sum = money * .0070;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                     
                     case "BTC":
                         
                         sum = money *.00000011;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                            case "CAD":
                         
                         sum = money * .0094;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "EUR":
                         
                         sum = money * .0062;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                               case "YPY":
                         
                         sum = money * 1;
                         stringsum = String.valueOf(sum);
                         converted.setText("$"+stringsum);
                         break;
                 }
                 break;
                     
         }
         
         
            }             
     });
            
         
       
       
        f.setVisible(true);
       
       
    }


    
}



    