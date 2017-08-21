/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Alumno
 */


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Cal extends JFrame implements ActionListener
{

   
    private JButton factorial, sumar, multiplicar, dividir, cerrar, acerca;
    int resultado=0;
    public JTextField numA, numB, numC;
    public JTextField resul;
    public JButton darle;

      public Cal(){
          
          configuraVentana();
          iniciarComponentes();
      }


      public void configuraVentana() {

         setTitle("CALCULADORA" );
         setSize(500, 500);
          setLayout(null);
          setResizable(false);
         
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          setLocationRelativeTo(null);
      }

      public void iniciarComponentes() 
      {
            JLabel tit = new JLabel("Binomio al cuadrado");
            numA  =new JTextField();          
            numB= new JTextField();
            resul = new JTextField();
            darle = new JButton("Calcular");
            
            darle.setBounds(150, 310, 200,50 );
            darle.setVisible(true);
          
            darle.addActionListener(this);
            add(darle);
                        
            tit.setBounds(200, 50, 200,50);            
            add(tit);
           
            numA.setBounds(100, 150, 100,50);            
            add(numA);
            
            numB.setBounds(300, 150, 100,50);            
            add(numB);
            
            resul.setBounds(50, 230, 400, 50);
            add(resul);
            resul.setVisible(true);
            
      }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource()== darle)
        {
           int a = Integer.parseInt(numA.getText());
           int b = Integer.parseInt(numB.getText());
           int aa=0;
           int bb=0;
           int c=0;
           aa = a*a;
           bb = 2*a*b;
           c = b*b;
           
           resul.setText(aa+"x^2+ "+bb+"x+ "+c);
           
           
           

        }
        
    }
      
      
}   
  
