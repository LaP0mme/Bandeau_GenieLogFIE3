package exemple;
import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;
public class Effet2 implements animation {
private String nom;

    public Effet2(String name){
        this.nom=name;
    }

    public String getNom(){
        return this.nom;
    }

    public void jouer(Bandeau Bando){
        double i;
        Bando.setForeground(Color.BLACK);
        Bando.setBackground(Color.WHITE);
        Bando.setMessage("On commence l'Effet2");
        for(i=Math.PI/10.0f; i < Math.PI*2+Math.PI/10.0f; i+=Math.PI/10.0f){
            Bando.setRotation(i);
            Bando.sleep(100);
        }
        
        Bando.sleep(1000);
        Bando.setFont(new Font("SansSerif", Font.PLAIN, 25));
        Bando.setMessage("Encore un tour ? (dans l'autre sens)");

        for(i=Math.PI*2; i >-Math.PI/10.0f; i-=Math.PI/10.0f){
            Bando.setRotation(i);
            Bando.sleep(100);
        }
        Bando.sleep(1000);
       

    }
}
