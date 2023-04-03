import java.util.Objects;

public class Puffenduy  extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, int power, int transgressive, int diligence, int loyalty, int honesty) {
        super(name, power, transgressive);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Puffenduy)) return false;
        if (!super.equals(o)) return false;
        Puffenduy puffenduy = (Puffenduy) o;
        return diligence == puffenduy.diligence && loyalty == puffenduy.loyalty && honesty == puffenduy.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diligence, loyalty, honesty);
    }
}
