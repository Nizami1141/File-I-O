import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static final String MALLS_FILE = "C:\\Users\\n" + //
            "izam\\OneDrive\\\u0414\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u044B\\GitHub\\as2-simple-java-app-for-implementing-file-i-o-NizamiGuliyev\\Largest-Malls.csv";

    public static List<Mall> loadMalls() throws IOException {
        List<Mall> malls = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(MALLS_FILE))) {
            String line;
            boolean isFirstLine = true;
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (fields.length != 7) {
                    throw new IllegalArgumentException("Invalid mall record");
                }

                Mall mall = Mall.parseFrom(line);
                System.out.println(mall.parseTo());
                malls.add(mall);
            }
        }

        return malls;
    }

    public static void saveMalls(List<Mall> malls, String fileName) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            throw new IOException("File already exists: " + fileName);
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("id,mallName,country,city,yearOpened,gla_sqft,gla_sqmt,shops");

            for (Mall mall : malls) {
                writer.println(mall.parseTo());
            }
        }
    }
}
