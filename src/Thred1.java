import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Thred1 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i=0; i<5;i++){
            executorService.submit(new Worck(i));
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Worck implements Runnable{
    private int ID;
    public Worck(int ID){
        this.ID=ID;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("helou: "+ID);
    }


//    Random random = new Random();
//    Object object1 = new Object();
//    Object object2 = new Object();
//    private List<Integer> list = new ArrayList<>();
//    private List<Integer> list2 = new ArrayList<>();
//    public void addToList1() {
//        synchronized (object1){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            list.add(random.nextInt(100));
//        }
//
//    }
//    public void addToList2() {
//        synchronized (object2){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            list2.add(random.nextInt(100));
//        }
//
//    }
//    public void worck(){
//            for(int i=0;i<1000;i++){
//                addToList1();
//                addToList2();
//            }
//    }
//    public void main() {
//        long before = System.currentTimeMillis();
//        Thread thr1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                worck();
//            }
//        });
//        Thread thr2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                worck();
//            }
//        });
//        thr1.start();
//        thr2.start();
//        try {
//            thr1.join();
//            thr2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        long after = System.currentTimeMillis();
//
//        System.out.println(after-before);
//        System.out.println("list1: "+ list.size());
//        System.out.println("List2: "+ list2.size());
//    }
}