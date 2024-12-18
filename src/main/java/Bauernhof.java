public class Bauernhof {
    public String name;

    public Bauernhof() {
        Kuh emma = new Kuh(5);
        Pferd johan = new Pferd(7);
        emma.setAge(33);
        emma.setName("emma");
        johan.setName("johan");
        johan.setAge(18);


        System.out.println("Kuh BodySize: " + emma.getBodySize());
        System.out.println("Pferd BodySize: " + johan.getBodySize());
        emma.speak();
        johan.move();
    }
}
