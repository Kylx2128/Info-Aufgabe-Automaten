//import java.util.Scanner;

import javax.swing.JFrame;
public class Main {
    

    public static void main(String args[]){

        //Scanner inp = new Scanner(System.in);
        //String wort;
        
        //System.out.println("Geben Sie ein Wort der Sprache ein");
        

        JFrame sprache = new Sprache();
        JFrame menu = new Menu(sprache);

       /* Automat automat = new Automat();

        wort = inp.nextLine();

        boolean geprüft = automat.wortPruefen(wort);

        if(geprüft == false){
            System.out.println("false");
        }
        else if(geprüft == true){
            System.out.println("true");
        }
        else{
            System.out.println("Error");
            System.exit(0);
        }
        inp.close();*/
    }


}
