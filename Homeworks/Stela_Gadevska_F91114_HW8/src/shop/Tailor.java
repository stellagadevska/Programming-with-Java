package shop;

public class Tailor {
    private String name;
    private int clothesDone;

    public Tailor(String name) {
        this.name = name;
        this.clothesDone = 0;
    }

    public String getName() {
        return name;
    }

    public int getClothesDone() {
        return clothesDone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClothesDone(int clothesDone) {
        this.clothesDone = clothesDone;
    }

    @Override
    public String toString() {
        return "Tailor{" +
                "name='" + name + '\'' +
                ", clothesDone=" + clothesDone +
                '}';
    }
}
