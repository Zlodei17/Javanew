package Dz.Steret;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Masiv {
    public static void main(String[] args) {

        File file = new File("src//Dz//text.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        String tutto = BR();
        try {
            PrintWriter printWriter = new PrintWriter(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {

                String z = bufferedReader.readLine();
                tutto += z;
                printWriter.print(tutto);
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(BR());
    }
    public static String BR(){
        BufferedReader buff= null;
        String resolt = null;
        try {
            String line;

            buff = new BufferedReader(new FileReader("src//Dz//text.txt"));
            while ((line = buff.readLine())!=null){
                resolt+=line+"\n";

            }
            buff.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return resolt;
    }
}
