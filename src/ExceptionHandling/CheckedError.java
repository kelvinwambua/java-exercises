package ExceptionHandling;

public class CheckedError {
    public static void main(String[] args)  {

            // Code that might throw an IOException, e.g., file reading
            java.io.FileReader reader = new java.io.FileReader("example.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();



    }
}
