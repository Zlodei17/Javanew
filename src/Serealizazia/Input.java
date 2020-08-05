package Serealizazia;

import sun.plugin.javascript.navig.Array;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        try {
            FileInputStream fise = new FileInputStream("text.txt");
            ObjectInputStream oseIn = new ObjectInputStream(fise);

//            Ogekt sasha = (Ogekt) oseIn.readObject();
//            Ogekt lena = (Ogekt) oseIn.readObject();
            Object[] obs = (Object[]) oseIn.readObject();
            System.out.println(Arrays.toString(obs));
            oseIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
