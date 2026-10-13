import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStreamDemo {
    public static void main(String[] args) {
        try {
            // 1. Open file for writing
            FileOutputStream out = new FileOutputStream("data.txt");

            // 2. Write data to file
            String text = "Hello Java I/O Streams!\n";
            text += "This is a file handling program.";

            out.write(text.getBytes());

            // 3. Close output stream
            out.close();

            System.out.println("Data written successfully.");

            // 4. Open file for reading
            FileInputStream in = new FileInputStream("data.txt");

            // 5. Read data from file
            System.out.println("\nData read from file:");

            int ch;
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }

            // 6. Close input stream
            in.close();

            System.out.println("\n\nFile closed successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}