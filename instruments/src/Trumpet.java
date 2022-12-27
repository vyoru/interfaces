import java.util.Objects;

public class Trumpet implements Instrument{
    private String name;
    private double diameter;

    @Override
    public void play() {
        System.out.println("Играет " + getName()+" | " +getDiameter()+" см");
    }

    public Trumpet(String name) {
        this.name = name;
    }

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiameter() {
        diameter = 20;
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return Double.compare(trumpet.diameter, diameter) == 0 && Objects.equals(name, trumpet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, diameter);
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
