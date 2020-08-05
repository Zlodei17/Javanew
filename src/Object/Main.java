package Object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ObjectToString ver = new ObjectToString("Sasha", 39);
        ObjectToString ver2 = new ObjectToString("Sasha", 38);
//        List<ObjectToString> list = new ArrayList<>();
//        list.add(new ObjectToString("Sasha",38));
//        list.add(new ObjectToString("Lena", 34));
//
//        printList(list);
//
//        List<Lesons> list2 = new ArrayList<>();
//        list2.add(new Lesons("Sasha",382));
//        list2.add(new Lesons("Lena", 342));
//
//        printList(list2);

        try {
            FileOutputStream fos = new FileOutputStream("gopa.top");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(ver);
            oos.writeObject(ver2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public static void printList(List <? extends ObjectToString> list){
//        for(ObjectToString element: list){
//            System.out.println(element);
//        }
    }

