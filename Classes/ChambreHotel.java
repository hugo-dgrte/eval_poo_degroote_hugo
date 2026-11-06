package Classes;

public class ChambreHotel extends Hebergement  {
    protected double supplementPetitDejeuner;
    
    public ChambreHotel(String reference, int tarifJournalier, double supplementPetitDejeuner) {
        super(reference, tarifJournalier);
        this.supplementPetitDejeuner = supplementPetitDejeuner;
    }

    public double calculerPrixSejour(double nbNuits) {
        return (tarifJournalier + supplementPetitDejeuner) * nbNuits;
    }
}
