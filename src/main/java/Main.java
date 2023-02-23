import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    // nie zmieniaj nic w main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.run(scanner);
    }

    void run(Scanner scanner) {
        FileUtils fileUtils = new FileUtils();
        Map<String, TreeSet<Country>> countries;
        try {
            countries = fileUtils.readFile("countries.csv");
            if (countries.size() == 0) {
                System.out.println("Brak pliku countries.csv.");
                scanner.close();
            } else {
                getAndPrintInfoAboutCountry(scanner, countries);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku countries.csv.");
        }
        // usupełnij metodę
    }

    private static void getAndPrintInfoAboutCountry(Scanner scanner, Map<String, TreeSet<Country>> countries) {
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String userInput = scanner.nextLine();
        if (countries.containsKey(userInput)) {
            Iterator<Country> iterator = countries.get(userInput).iterator();
            Country country = iterator.next();
            System.out.println(country.getName() + " (" + userInput + ") ma " + country.getPopulation() + " ludności.");
        } else {
            System.out.println("Kod kraju " + userInput + " nie został znaleziony.");
        }
    }
}