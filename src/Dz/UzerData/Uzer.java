package Dz.UzerData;

import java.io.Serializable;
import java.util.Random;

public class  Uzer implements UzerInterface, Serializable {
    private String name;
    private String login;
    private int age;
    @Override
    public EnumXoi Hobi() {
        EnumXoi [] enumXoi = EnumXoi.values();
        Random random = new Random();
        int index = random.nextInt(enumXoi.length);
        return enumXoi[index];
    }
    public Uzer(String name,String login,int age){
        this.name = name;
        this.age = age;
        this.login = login;
        Hobi();
    }
    public String toString(){
        return ("Vashe imya: " + name + "\nVash Login: " + login + "\nVash Vozrast: " + age + "\nVashe xobi:" + Hobi());
    }

}
