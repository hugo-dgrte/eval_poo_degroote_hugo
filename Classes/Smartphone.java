package Classes;


// QUESTION 1 
// En fait la classe Smartphone dépend de sa batterie et la batterie n'est rien sans son Smartphone donc ils sont tous les deux dans une situation de symbiose qui les relies emsemble par le biais du destin (PS: J'ai pas compris la question 1...)

public class Smartphone {
    String modele;
    BatterieInterne batterie;

    public Smartphone(String modele, int capaciteMah) {
        this.modele = modele;
        batterie = new BatterieInterne(capaciteMah);
    }

    public void obtenirFicheTechnique() {
        System.out.println("Smartphone " + this.modele + " équipé d'une batterie scellée de " + batterie.getCapaciteMah() + " mAh.");
    }
}
