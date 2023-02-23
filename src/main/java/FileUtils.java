import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class FileUtils {

    private static final String FILE_NAME = "countries.csv";

    Map<String, TreeSet<Country>> readFile() throws FileNotFoundException {
        Map<String, TreeSet<Country>> countriesMap = new HashMap<>();
        try (Scanner fileReader = new Scanner(new File(FILE_NAME))) {
            while (fileReader.hasNextLine()) {
                String[] splitLine = fileReader.nextLine().split(";");
                String shortcut = splitLine[0];
                Country country = new Country(shortcut, splitLine[1], splitLine[2]);
                addCountryIntoMap(countriesMap, shortcut, country);
            }
        }
        return countriesMap;
    }

    private void addCountryIntoMap(Map<String, TreeSet<Country>> countriesMap, String shortcut, Country country) {
        if (countriesMap.containsKey(shortcut)) {
            countriesMap.get(shortcut).add(country);
        } else {
            TreeSet<Country> countriesSet = new TreeSet<>();
            countriesSet.add(country);
            countriesMap.put(shortcut, countriesSet);
        }
    }
}