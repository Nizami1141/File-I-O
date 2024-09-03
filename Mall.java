public class Mall {
    private int rank;
    private String name;
    private String country;
    private String city;
    private int yearOpened;
    private int glaSqt;
    private int glaSqm;
    private int shops;

    public Mall() {

    }

    public Mall(int rank, String name, String country, String city, int yearOpened, int glaSqt, int glaSqm, int shops) {
        this.rank = rank;
        this.name = name;
        this.country = country;
        this.city = city;
        this.yearOpened = yearOpened;
        this.glaSqt = glaSqt;
        this.glaSqm = glaSqm;
        this.shops = shops;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getYearOpened() {
        return yearOpened;
    }

    public int getGlaSqt() {
        return glaSqt;
    }

    public int getGlaSqm() {
        return glaSqm;
    }

    public int getShops() {
        return shops;
    }

    public static Mall parseFrom(String malls) {
        try {
            String[] mall = malls.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

            for (int i = 0; i < mall.length; i++) {
                mall[i] = mall[i].replaceAll("[\",()]", "");
            }

            int rank = Integer.parseInt(mall[0].trim());
            String name = mall[1].trim();
            String country = mall[2].trim();
            String city = mall[3].trim();
            int yearOpened;
            try {
                yearOpened = Integer.parseInt(mall[4].trim());
            } catch (NumberFormatException e) {
                yearOpened = 0;
            }

            int shops = Integer.parseInt(mall[6].trim());

            String[] gla = mall[5].trim().split(" ");
            int glaSqt = Integer.parseInt(gla[0]);
            int glaSqm = Integer.parseInt(gla[2]);

            return new Mall(rank, name, country, city, yearOpened, glaSqt, glaSqm, shops);

        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid record");
        }
    }

    public String parseTo() {
        return String.format("%d,%s,%s,%s,%d,%d %d,%d", rank, name, country, city, yearOpened, glaSqt, glaSqm, shops);
    }

}