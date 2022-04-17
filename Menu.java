
import javax.swing.JFrame;

import java.security.cert.LDAPCertStoreParameters;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{

    JLabel befehl;
    JTextField eingabe;
    JButton wort;
    JLabel tf;

    Menu(JFrame f){

        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(f.getX() - getWidth(),f.getY());
        setResizable(false);
        setTitle("Menu");
        setLayout(null);

        befehl = new JLabel("Geben Sie ein Wort ein");
        befehl.setBounds(0,0,500,20);
        add(befehl);

        eingabe = new JTextField();
        eingabe.setBounds(1,21,100,20);
        add(eingabe);

        wort = new JButton("Eingabe");
        wort.setBounds(0,42,100,20);
        wort.addActionListener(new Eingabe());
        add(wort);

        tf = new JLabel();
        tf.setBounds(0,63,500,20);
        add(tf);
        
    }

    public void wortInSprache(boolean b){}
    


    private class Eingabe implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
            Automat automat = new Automat();

            int geprüft = automat.wortPruefen(eingabe.getText());


            eingabe.setText("");

            if(geprüft == 0){
               tf.setText("false");
            }
            else if(geprüft == 1){
                tf.setText("true");
            }
            else if(geprüft == 3){
                tf.setText("Wort nicht in Sprache");
            }

            
        }

    }

}