//4.1

/* Design and write an OldMacdonald class that sings several verses of “Old MacDonald Had a Farm.” 
 * Use methods to generalize the verses.
 */
class OldMacdonald {
    public static void Sing(String Animal, String Sound) {
        System.out.println("Old MacDonald had a farm, e i e i o");
        System.out.println("And on his farm he had some " + Animal + ", e i e i o");
        System.out.println("with an " + Sound + " " + Sound + " here and an " + Sound + " " + Sound + " there");
        System.out.println("here an " + Sound + " there an " + Sound);
        System.out.println("everywhere an " + Sound + " " + Sound);
        System.out.println("Old MacDonald had a farm, e i e i o");
        System.out.print("\n");
    }
}
public class Verse {
    public static void main(String args[]) {
        System.out.println("Old MacDonald had a farm");
        System.out.print("\n");
        OldMacdonald.Sing("chicks","chick");
        OldMacdonald.Sing("cows","moo");
        OldMacdonald.Sing("ducks","quack");
        OldMacdonald.Sing("pigs","oink");
    }
}
