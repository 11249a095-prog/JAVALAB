import java.io.FileWriter;
public class CloseFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            file.write("File is opened and data is written.");
            file.close();
            System.out.println("File closed successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}