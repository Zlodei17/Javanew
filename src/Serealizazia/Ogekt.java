package Serealizazia;

import java.io.Serializable;

public class Ogekt implements Serializable {
    private transient int id;
    private String name;
    public Ogekt(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Vashe imya: "+name+", vam: "+id+" let!";
    }

}
