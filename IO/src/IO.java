import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IO {
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
    public static int readInt() throws IOException {
        while (true) {
            try {
                return Integer.parseInt(readString());
            } catch (NumberFormatException e){
                System.out.println("Bitte gib eine Ganzzahl ein. Versuch es erneut.");
            }
        }
    }
    public static double readDouble() throws IOException {
        while (true) {
            try {
                return Double.parseDouble(readString().replace(',','.'));
            } catch (NumberFormatException e){
                System.out.println("Bitte gib eine Kommazahl ein. Versuch es erneut.");
            }
        }
    }
    public static boolean readBool() throws IOException {
        while (true) {
            switch (readString()) {
                case "ja", "yes" -> {
                    return true;
                }
                case "nein", "no" -> {
                    return false;
                }
                default -> System.out.println("Ja oder Nein?");
            }
        }

    }

}
