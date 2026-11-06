package Classes;

public class CameraSecurite extends AppareilConnecte {
    
    public CameraSecurite(String piece) {
        super(piece);
    }

    @Override
    public void diagnostiquer() {
        System.out.println("La caméra de " + piece + " filme en haute définition.");
    }
}
