package Classes;

public class AppareilConnecte {
    String piece;

    public AppareilConnecte(String piece) {
        this.piece = piece;
    }

    public void diagnostiquer() {
        System.out.println("L'appareil situé dans " + piece + " fonctionne normalement.");
    }
}
