import java.util.Objects;

public class Kogtevran  extends Hogwarts{

    private  int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, int power, int transgressive, int smart, int wisdom, int wit, int creativity) {
        super(name, power, transgressive);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }


    @Override
    public String toString() {
        return "Kogtevran{" +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kogtevran)) return false;
        if (!super.equals(o)) return false;
        Kogtevran kogtevran = (Kogtevran) o;
        return smart == kogtevran.smart && wisdom == kogtevran.wisdom && wit == kogtevran.wit && creativity == kogtevran.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wisdom, wit, creativity);
    }
}
