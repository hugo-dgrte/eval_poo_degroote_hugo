package Classes;

public class Thermostat extends AppareilConnecte {

    public Thermostat(String piece) {
        super(piece);
    }

    @Override
    public void diagnostiquer() {
        System.out.println("Le thermostat de " + piece + " régule la température à 20°C.");
    }

    public void activerModeEco() {
        System.out.println("Le thermostat de " + piece + " passe en mode économique.");
    }
}
