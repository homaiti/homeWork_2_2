import java.util.Objects;

public class Hogwarts {

    private String name;
    private int power;
    private int transgressive;

    public Hogwarts(String name, int power, int transgressive) {
        this.name = name;
        this.power = power;
        this.transgressive = transgressive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgressive() {
        return transgressive;
    }

    public void setTransgressive(int transgressive) {
        this.transgressive = transgressive;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", transgressive=" + transgressive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hogwarts)) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return power == hogwarts.power && transgressive == hogwarts.transgressive && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, transgressive);
    }
}
