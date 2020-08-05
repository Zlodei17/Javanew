package Dz.UzerData;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class UsersLege {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("src/Dz/UzerData/dati.users");
            ObjectInputStream ois1 = new ObjectInputStream(fis1);
            Uzer []sasha = (Uzer[]) ois1.readObject();
            System.out.println(Arrays.toString(sasha));

            ois1.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
