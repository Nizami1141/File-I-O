import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MallDemo {
    public static void main(String[] args) {
        try {
            List<Mall> malls = FileManager.loadMalls();

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss_SSS");
            String time = now.format(formatter);

            sortByCountry(malls);
            sortByCity(malls);

            FileManager.saveMalls(malls, "sorted_malls_" + time + ".csv");
            sortByShops(malls);
            FileManager.saveMalls(malls, "sorted_malls_by_shops_" + time + ".csv");
            List<Mall> chinaMalls = filterByCountry(malls, "China");
            FileManager.saveMalls(chinaMalls, "china_malls_" + time + ".csv");
            List<Mall> filteredMalls = filterByAreaSqFt(malls, 4000000, 6000000);
            FileManager.saveMalls(filteredMalls, "filtered_malls_" + time + ".csv");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void sortByCountry(List<Mall> malls) {
        malls.sort(Comparator.comparing(Mall::getCountry));
    }

    public static void sortByCity(List<Mall> malls) {
        malls.sort(Comparator.comparing(Mall::getCity));
    }

    public static void sortByShops(List<Mall> malls) {
        malls.sort(Comparator.comparing(Mall::getShops));
    }

    public static List<Mall> filterByCountry(List<Mall> malls, String countryName) {
        List<Mall> filteredMalls = new ArrayList<>();

        for (Mall mall : malls) {
            if (mall.getCountry().equalsIgnoreCase(countryName)) {
                filteredMalls.add(mall);
            }
        }

        return filteredMalls;
    }

    public static List<Mall> filterByAreaSqFt(List<Mall> malls, Integer lower, Integer upper) {
        List<Mall> filteredMalls = new ArrayList<>();

        for (Mall mall : malls) {
            int glaSqft = mall.getGlaSqt();
            if (glaSqft >= lower && glaSqft <= upper) {
                filteredMalls.add(mall);
            }
        }

        return filteredMalls;
    }
}