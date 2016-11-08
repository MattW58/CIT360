import java.io.Serializable;

public class JavaBean implements Serializable{
    private String type;
    private String location;
    private int beans;

    public JavaBean(String type, String location, int beans) {
        this.type = type;
        this.location = location;
        this.beans = beans;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getBeans() {
        return beans;
    }
    public void setBeans(int beans) {
        this.beans = beans;
    }

    @Override
    public String toString() {
        return "JavaBean{" +
                "type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", beans=" + beans +
                '}';
    }
}