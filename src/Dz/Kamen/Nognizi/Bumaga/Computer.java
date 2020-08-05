package Dz.Kamen.Nognizi.Bumaga;

import java.util.Random;

public class Computer {
    public Muve getMuve(){
        Muve [] muves = Muve.values();
        Random random = new Random();
        int index = random.nextInt(muves.length);
        return muves[index];
    }
}
