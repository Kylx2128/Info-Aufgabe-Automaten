import javax.swing.JFrame;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sprache extends JFrame {
    
JLabel A;
JLabel V;
JLabel S;
JLabel q01;
JLabel q02;
JLabel q11;
JLabel q12;
JLabel q13;

public Sprache(){

setVisible(true);
setSize(500,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setResizable(false);
setTitle("Sprache");
setLayout(null);

A = new JLabel("A = {a,b}");
V = new JLabel("V = q0,q1");
S = new JLabel("S = q0");
q01 = new JLabel("q0 = 'a' q0");
q02 = new JLabel("q0 = 'b' q1");
q11 = new JLabel("q1 = 'b' q1");
q12 = new JLabel("q1 = 'a' q0");
q13 = new JLabel("q1 = ε");

A.setBounds(0, 0, 500, 20);
V.setBounds(0, 22, 500, 20);
S.setBounds(0, 34, 500, 20);

q01.setBounds(0, 60, 500, 20);
q02.setBounds(0, 72, 500, 20);
q11.setBounds(0, 84, 500, 20);
q12.setBounds(0, 96, 500, 20);
q13.setBounds(0, 108, 500, 20);

add(A);
add(V);
add(S);
add(q01);
add(q02);
add(q11);
add(q12);
add(q13);
}



}
