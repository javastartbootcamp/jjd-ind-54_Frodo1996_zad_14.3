public class Country implements Comparable<Country> {
    static String shortcutName;
    String name;
    String population;

    public Country(String shortcutName, String name, String population) {
        Country.shortcutName = shortcutName;
        this.name = name;
        this.population = population;
    }

    public static String getShortcutName() {
        return shortcutName;
    }

    public static void setShortcutName(String shortcutName) {
        Country.shortcutName = shortcutName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
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
