package Classes;

public class ArticleStock {
    private String nom;
    private int quantite;

    public ArticleStock(String nom, int quantite) {
        this.nom = nom;
        this.quantite = quantite;
    }

    public ArticleStock(String nom) {
        this.nom = nom;
        this.quantite = 0;
    }

    // GETTER
    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void approvisionner(int nb) {
        if (nb > 0) {
            this.quantite += nb;
        } else {
            System.out.println("Qauntité invalide, veuillez réessayer");
        }
    }

    public void expedier(int nb) {
        if (nb > 0 && nb <= this.quantite) {
            this.quantite -= nb;
            System.out.println("Expédition de " + nb + " unités validée.");
            System.out.println("Stock mis à jour : " + this.quantite + " unités restantes");
        } else {
            System.out.println("Erreur : stock insuffisant pour expédier " + nb + " unités.");
            System.out.println("Stock inchangé : " + nb + " unités restantes.");
        }
    }
}