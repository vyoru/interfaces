import java.util.Objects;

public class Guitar implements Instrument{
    private String name;
    private int stringsNum;

    @Override
    public void play() {
        System.out.println("Играет " + getName()+" | " +getStringsNum()+" струн");
    }

    public Guitar(String name) {
        this.name = name;
    }

    public Guitar(int stringsNum) {
        this.stringsNum = stringsNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStringsNum() {
        stringsNum = 6;
        return stringsNum;
    }

    public void setStringsNum(int stringsNum) {
        this.stringsNum = stringsNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return stringsNum == guitar.stringsNum && Objects.equals(name, guitar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stringsNum);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "name='" + name + '\'' +
                ", stringsNum=" + stringsNum +
                '}';
    }
}
