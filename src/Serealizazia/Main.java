package Serealizazia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Object[] obg = {
                new Ogekt(33,"Sasha"),
                new Ogekt(30,"Lena")};

        Ogekt sasha = new Ogekt(33,"Sasha");
        Ogekt lena = new Ogekt(30,"Lena");
        try {
            FileOutputStream fos = new FileOutputStream("text.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obg);
            //oos.writeObject(lena);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
