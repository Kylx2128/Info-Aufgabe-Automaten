public class Automat{

    int zustand=0;

    public Automat(){
        
    }



    public void zustandWechseln(char eingabe){

        
       switch(zustand){
        case 0 :    if(eingabe == 'a'){
                        zustand = 0 ;
                    }
                    else if(eingabe == 'b'){
                        zustand = 1 ;
                    }
                    else{
                        System.out.println("Wort nicht in Sprache");
                        zustand=3;
                    }
                    break;
        
        
        case 1 :    if(eingabe == 'a'){
                        zustand = 0 ;
                    }
                    else if(eingabe == 'b'){
                        zustand = 1 ;
                    }
                    else{
                        System.out.println("Wort nicht in Sprache");
                        zustand = 3;
                    }
                    break;

        }

    }

    public int wortPruefen(String wort){
        
        char alph[] = wort.toCharArray();

        for(int i=0;i<alph.length;i++){

            zustandWechseln(alph[i]);
            if(zustand==3){

                return 3;

            }
        }
        if(zustand == 1){
            return 1;
        }

        return 0;
    }



}