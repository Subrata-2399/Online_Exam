/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.*;
/**
 *
 * @author subrata
 */
public class Exam extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Exam
     */
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton op1, op2, op3, op4;
    ButtonGroup group;
    JButton next, submit;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Exam(String name) {
        this.name = name;
        setBounds(50,50,1440,650);
        getContentPane().setBackground(WHITE);
        setLayout(null);
        qno=new JLabel("");
        qno.setBounds(100,100 , 50, 30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(qno);
        
        
        
        
        question=new JLabel("");
        question.setBounds(150,100 , 800, 30);
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(question);
        questions[0][0] = "Which of the following language was developed as the first purely object programming language ?";
        questions[0][1] = "SmallTalk";
        questions[0][2] = "C++";
        questions[0][3] = "Kotlin";
        questions[0][4] = "Java";

        questions[1][0] = "Which of the following is not an OOPS concept ?";
        questions[1][1] = "Encapsulation";
        questions[1][2] = "Polymorphism";
        questions[1][3] = "Exception";
        questions[1][4] = "Abstraction";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        answers[0][1] = "SmallTalk";
        answers[1][1] = "Exception";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        op1=new JRadioButton("");
        op1.setBounds(170,200,700,30);
        op1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(op1);
        
        op2=new JRadioButton("");
        op2.setBounds(170,240,700,30);
        op2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(op2);
        
        op3=new JRadioButton("");
        op3.setBounds(170,280,700,30);
        op3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(op3);
        
        
        op4=new JRadioButton("");
        op4.setBounds(170,320,700,30);
        op4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(op4);
        
        
        
        
        group=new ButtonGroup();
        group.add(op1);
        group.add(op2);
        group.add(op3);
        group.add(op4);
        
        next=new JButton("Next");
        next.setBounds(1100,550,200,40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(0, 0, 255));
        next.setForeground(Color.CYAN);
        next.addActionListener( this);
        add(next);
        
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 500, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(Color.GREEN);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
        
        
  
        /*
        initComponents();
        setBounds(50,50,1440,650);
        getContentPane().setBackground(WHITE);
        
        
        qno=new JLabel("");
        qno.setBounds(100,100 , 50, 30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(qno);
        
        
        question=new JLabel("");
        question.setBounds(150,100 , 800, 30);
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(question);
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        op1=new JRadioButton("");
        op1.setBounds(170,200,700,30);
        op1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(op1);
        
        op2=new JRadioButton("");
        op2.setBounds(170,240,700,30);
        op2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(op2);
        
        op3=new JRadioButton("");
        op3.setBounds(170,280,700,30);
        op3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(op3);
        
        
        op4=new JRadioButton("");
        op4.setBounds(170,320,700,30);
        op4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(op4);
        group=new ButtonGroup();
        group.add(op1);
        group.add(op2);
        group.add(op3);
        group.add(op4);
        next=new JButton("Next");
        next.setBounds(1100,550,200,40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(0, 0, 255));
        next.setForeground(Color.CYAN);
        next.addActionListener( this);
        add(next);
        
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 500, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(Color.GREEN);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        start(count);
        setLayout(null);*/
    }

    
    
    
    
    
    
    
    public  void start(int count){
        
        /*qno.setText(""+(count+1)+". ");
        question.setText(questions[count][0]);
        op1.setText(questions[count][1]);
        op1.setActionCommand(questions[count][1]);
        
        op2.setText(questions[count][2]);
        op2.setActionCommand(questions[count][2]);
        
        op3.setText(questions[count][3]);
        op3.setActionCommand(questions[count][3]);
        
        op4.setText(questions[count][4]);
        op4.setActionCommand(questions[count][4]);
        
        group.clearSelection();*/
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        op1.setText(questions[count][1]);
        op1.setActionCommand(questions[count][1]);
        
        op2.setText(questions[count][2]);
        op2.setActionCommand(questions[count][2]);
        
        op3.setText(questions[count][3]);
        op3.setActionCommand(questions[count][3]);
        
        op4.setText(questions[count][4]);
        op4.setActionCommand(questions[count][4]);
        
        group.clearSelection();
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == next) {
            repaint();
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);
            
            ans_given = 1;
            if (group.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = group.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        
        } 
        else if (ae.getSource() == submit) {
            ans_given = 1;
            if (group.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = group.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void paint(Graphics g){
        /*super.paint(g);
        String time=" Time Left : "+ timer + " Seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
        if(timer>0){
            g.drawString(time, 1100, 500);
        }else{
            g.drawString("Times Up !! ", 1100, 500);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch (Exception e){
            e.printStackTrace();
        }
        if(ans_given ==1){
            ans_given=0;
            timer=25;
        }else if(timer<0){
            timer=25;
            if(group.getSelection()==null){
                useranswers[count][0]="";
            }else{
                useranswers[count][0]=group.getSelection().getActionCommand();
            }
            count++;
            start(count);
        }*/
        
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (group.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = group.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (group.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = group.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
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

        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Online Examination");
        jTextField1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
      new Exam("student");
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exam().setVisible(true);
            }
            
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
