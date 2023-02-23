public class Country implements Comparable<Country> {
    static String shortcutName;
    String name;
    String population;

    public Country(String shortcutName, String name, String population) {
        Country.shortcutName = shortcutName;
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getPopulation() {
        return population;
    }

    @Override
    public int compareTo(Country o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Nazwa kraju: " + name + " w skrócie: " + shortcutName +
                " ma w przybliżeniu liczbę ludności: " + population;
    }
}