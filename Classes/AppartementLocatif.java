package Classes;

public class AppartementLocatif extends Hebergement {
    protected int fraisMenageFixes;

    public AppartementLocatif(String reference, int tarifJournalier, int fraisMenageFixes) {
        super(reference, tarifJournalier);
        this.fraisMenageFixes = fraisMenageFixes;
    }
    
    public double calculerPrixSejour(double nbNuits) {
        return this.tarifJournalier * nbNuits + this.fraisMenageFixes ;
    }
}
