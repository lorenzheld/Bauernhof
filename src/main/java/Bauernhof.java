import java.util.ArrayList;
import java.util.List;

public class Bauernhof {
    public String name;
    private ArrayList<Tier> tiere; // Liste für alle Tiere

    public Bauernhof() {
        tiere = new ArrayList<>(); // Initialisierung der Liste

        // Tiere erstellen
        Kuh emma = new Kuh(5);
        Pferd johan = new Pferd(7);

        // Attribute setzen
        emma.setAge(33);
        emma.setName("emma");
        johan.setName("johan");
        johan.setAge(18);

        // Tiere zur Liste hinzufügen
        tiere.add(emma);
        tiere.add(johan);

        // Tiere aus der Liste ausgeben
        for (Tier tier : tiere) {
            System.out.println("Name: " + tier.getName() + ", Age: " + tier.getAge());
            if (tier instanceof Huftier) {
                System.out.println("BodySize: " + ((Huftier) tier).getBodySize());
            }
            tier.speak();
            tier.move();
        }
    }
}
