package exemple;
import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;


public class Effet3 implements animation{
private String nom;
    
    public Effet3(String name){
        this.nom=name;
    }

    public String getNom(){
        return this.nom;
    }
    public void jouer(Bandeau Bando){
        int i;
        Bando.setMessage("On écrit en jaune maintenant");
        Bando.setForeground(Color.YELLOW);
        Bando.sleep(1000);
        Bando.setMessage("On execute l'Effet: "+this.getNom());
        Bando.sleep(1000);
        Bando.setMessage("On met le clignotant");
        for(i = 0; i <= 10; i++){
            Bando.setMessage("On execute l'Effet: "+this.getNom());
            Bando.sleep(50);
            Bando.setMessage("");
        }
        Bando.setForeground(Color.BLACK);
        Bando.setBackground(Color.WHITE);


    }
}
