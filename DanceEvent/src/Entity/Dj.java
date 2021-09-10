package Entity;

import java.io.Serializable;

public class Dj extends BaseEntity implements Serializable {

    private String name;
    private int age;
    private String style;

    public Dj() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getString() {
        return style;
    }
    public void setString(String string) {
        this.style = string;
    }
}
