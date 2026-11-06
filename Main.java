import Classes.*;

public class Main {
    public static void main() {

        // EXERCIE 1
        ArticleStock clavierMecanique = new ArticleStock("Clavier Mécanique");

        clavierMecanique.approvisionner(15);   
        System.out.println(clavierMecanique.getQuantite());

        clavierMecanique.expedier(6);
        clavierMecanique.expedier(12);

        System.out.println(clavierMecanique.getQuantite());


        // EXERCICE 2
        AppareilConnecte appareilConnecte = new AppareilConnecte("Couloir");
        Thermostat thermostat = new Thermostat("Salon");
        CameraSecurite cameraSecurite = new CameraSecurite("Entrée");

        appareilConnecte.diagnostiquer();
        thermostat.diagnostiquer();
        cameraSecurite.diagnostiquer();

        thermostat.activerModeEco();


        // EXERCICE 3
        ChambreHotel chambreHotel = new ChambreHotel("CH-101", 85, 12.5);
        AppartementLocatif appartementLocatif = new AppartementLocatif("APT-4B", 110, 50);

        chambreHotel.decrire();
        appartementLocatif.decrire();

        System.out.println(chambreHotel.calculerPrixSejour(4));
        System.out.println(appartementLocatif.calculerPrixSejour(4));


        // EXERCICE 4
        Smartphone smartphone = new Smartphone("Pixel Pro", 5000);
        smartphone.obtenirFicheTechnique();
    }
}