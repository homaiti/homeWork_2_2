import java.util.Objects;

public class Grifindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public Grifindor(String name, int power, int transgressive, int nobility, int honor, int courage) {
        super(name, power, transgressive);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Grifindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grifindor)) return false;
        if (!super.equals(o)) return false;
        Grifindor grifindor = (Grifindor) o;
        return nobility == grifindor.nobility && honor == grifindor.honor && courage == grifindor.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }
}
