import java.io.FileWriter;
public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            file.write("Hello Java!");
            file.write("\nThis is a file writing program.");
            file.close();
            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}