import java.io.FileReader;
public class OpenFile {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            System.out.println("File opened successfully.");
            file.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}