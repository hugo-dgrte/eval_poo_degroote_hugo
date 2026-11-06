package Classes;

abstract class Hebergement {
    protected String reference;
    protected int tarifJournalier;

    public Hebergement(String reference, int tarifJournalier) {
        this.reference = reference;
        this.tarifJournalier = tarifJournalier;
    }

    public abstract double calculerPrixSejour(double nbNuits);

    public void decrire() {
        System.out.println("Hébergement " + reference + "; Tarif de base : " + tarifJournalier + " €/nuit");
    }
}
