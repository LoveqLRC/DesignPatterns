package prototype;

public class ElfBeast extends Beast {
    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new ElfBeast();
    }

    @Override
    public String toString() {
        return "Elven eagle";
    }
}
