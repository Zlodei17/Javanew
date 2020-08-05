package Object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lesons {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("gopa.top");
            ObjectInputStream oisa = new ObjectInputStream(fis);
            ObjectToString sasha = (ObjectToString) oisa.readObject();
            System.out.println(sasha);

            oisa.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
