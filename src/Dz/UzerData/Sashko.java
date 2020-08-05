package Dz.UzerData;

import java.io.*;
import java.sql.SQLOutput;

public class Sashko {


    public static void main(String[] args) {
        BufferedReader readname = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Vedite imya: ");
            String name = readname.readLine();
            if(name == null|| name.isEmpty()){
                System.out.println("Poprobuite ishe vesyi: ");
                name = readname.readLine();
            }
            System.out.println("Vedite login: ");
            String login = readname.readLine();
            if(login == null|| login.isEmpty()){
                System.out.println("Poprobuite ishe vesyi: ");
                login= readname.readLine();
            }
            System.out.println("Vedite vozrast: ");
            int age = Integer.parseInt(readname.readLine());
            //Uzer sasha = new Uzer(name,login, age);

            System.out.println("Vedite imya2: ");
            String name2 = readname.readLine();
            if(name2 == null|| name2.isEmpty()){
                System.out.println("Poprobuite ishe vesyi: ");
                name2 = readname.readLine();
            }
            System.out.println("Vedite login2: ");
            String login2 = readname.readLine();
            if(login2 == null|| login2.isEmpty()){
                System.out.println("Poprobuite ishe vesyi: ");
                login= readname.readLine();
            }
            System.out.println("Vedite vozrast2: ");
            int age2 = Integer.parseInt(readname.readLine());
            //Uzer lena = new Uzer(name2,login2, age2);

            Uzer[] uzers = {new Uzer(name,login, age), new Uzer(name2,login2, age2)};

            FileOutputStream fos1 = new FileOutputStream("src/Dz/UzerData/dati.users");
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
            oos1.writeObject(uzers);

            oos1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
