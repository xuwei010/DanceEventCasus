package Entity;

public class Dj implements java.io.Serializable {
    private long id;
    private String name;
    private int age;
    private String style;

    public Dj() {
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
