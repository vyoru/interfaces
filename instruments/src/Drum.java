import java.util.Objects;

public class Drum implements Instrument{
    private String name;
    private double size;

    @Override
    public void play() {
        System.out.println("Играет " + getName()+" | " +getSize()+" см");
    }

    public Drum(String name) {
        this.name = name;
    }

    public Drum(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        size = 80;
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return Double.compare(drum.size, size) == 0 && Objects.equals(name, drum.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "Drum{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
