package Classes;

public class BatterieInterne {

    public BatterieInterne(int capaciteMax){
        this.capaciteMah = capaciteMax;
    }

    private int capaciteMah;

    // GETTER
    public int getCapaciteMah() {
        return capaciteMah;
    }
}
