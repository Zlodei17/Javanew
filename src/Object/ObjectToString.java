package Object;

import java.io.Serializable;

public class ObjectToString implements Serializable {
    private String title;
    private int id;
    public ObjectToString(String title, int id){
        this.id = id;
        this.title = title;
    }
    public String toString(){
        return id+" - "+title;
    }
    public boolean equals(Object object){
        ObjectToString objectToString = (ObjectToString) object;
        return this.title == objectToString.title;
    }
}
