import java.io.FileReader;
public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            int ch;
            while ((ch = file.read()) != -1) {
                System.out.print((char) ch);
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}