/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author subrata
 */
public class Score extends JFrame implements ActionListener{
    Score(String name,int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score-icon-38586.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        
        JLabel heading=new JLabel("Thank You !!!! "+ name+" for the Online Exam ");
        heading.setBounds(45,30 , 700, 30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(heading);
        setVisible(true);
        
        
        
        JLabel xscore=new JLabel("Your Score is : "+ score);
        xscore.setBounds(350,200 , 300, 30);
        xscore.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(xscore);
        setVisible(true);
        
        JButton submit = new JButton("Log Out and Exit");
        submit.setBounds(400, 270, 240, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submit.setBackground(Color.red);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
        setVisible(true);
        
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login_area();
    }
    public static void main(String[] args){
        new Score("student",0);
    }
}
