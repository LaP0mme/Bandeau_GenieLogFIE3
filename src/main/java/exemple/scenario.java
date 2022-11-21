package exemple;

import java.util.*;

import bandeau.Bandeau;

public class scenario {
    private HashMap<animation, Integer> lEffets;

    public scenario(){
        this.lEffets = new HashMap<animation, Integer>();
    }

    public void addEffet(animation e, int nb){
        lEffets.put(e, nb);
    }

    public ArrayList<String> getlEffets(){
        ArrayList<String> ltmp = new ArrayList<String>();
        for(Map.Entry<animation, Integer> entry : this.lEffets.entrySet()){
            ltmp.add(entry.getKey().getNom());
        }
        return ltmp;
    }

    public void startScenario(Bandeau b){
        for(Map.Entry<animation, Integer> entry : this.lEffets.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                entry.getKey().jouer(b);
            }
        }
        b.close();
    }
}