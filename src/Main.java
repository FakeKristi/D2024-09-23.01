import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vozidlo> vozidla = new ArrayList<>();

        vozidla.add(new Auto("abc", "Huyndai", "I30", 2012, 4));
        vozidla.add(new Motorka("abc01", "Suzuki", "V-Storm", 2020, "čtyř takt"));

        vozidla.forEach(System.out::println);
    }
}
