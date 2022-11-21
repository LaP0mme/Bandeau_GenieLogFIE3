package exemple;
import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;
public class Effet1  implements animation {
private String nom;

    public Effet1(String name){
        this.nom=name;
    }
    
    public String getNom(){
        return this.nom;
    }

    public void jouer(Bandeau Bando){
        Bando.setForeground(Color.BLACK);
        Bando.setBackground(Color.WHITE);
        Bando.setMessage("Cet effet change les couleurs du background");
        Bando.sleep(1000);
        Bando.setBackground(Color.GREEN);
        Bando.sleep(1000);
        Bando.setBackground(Color.ORANGE);
        Bando.sleep(1000);
        Bando.setBackground(Color.RED);
        Bando.setMessage("C'est rouge, on s'arrête");
        Bando.sleep(1000);
        Bando.setBackground(Color.WHITE);

    }
}
