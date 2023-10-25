import java.io.IOException;

public class MethodenMuxiMax {
    public static void punktZahl(int plife1,int plife2,int plife3,int plife4,int playercount) {
        if (playercount>3){
            System.out.println("P1: "+plife1+" P2: "+plife2+" P3: "+plife3+" P4: "+plife4);
        } else if (playercount>2) {
            System.out.println("P1: "+plife1+" P2: "+plife2+" P3: "+plife3);
        } else {
            System.out.println("P1: "+plife1+" P2: "+plife2);
        }
    }
    public static void statistik(int plife1,int plife2,int plife3,int plife4,int pantilife1,int pantilife2,int pantilife3,int pantilife4,int playercount) {
        System.out.println("Statistik:");
        System.out.println("\nSpieler1:");
        System.out.println("Leben: "+plife1+"\nAbgezogendes Leben: "+pantilife1);
        System.out.println("\nSpieler2:");
        System.out.println("Leben: "+plife2+"\nAbgezogendes Leben: "+pantilife2);
        switch (playercount) {
            case 3:
                System.out.println("\nSpieler3:");
                System.out.println("Leben: "+plife3+"\nAbgezogendes Leben: "+pantilife3);
            case 4:
                System.out.println("\nSpieler3:");
                System.out.println("Leben: "+plife3+"\nAbgezogendes Leben: "+pantilife3);
                System.out.println("\nSpieler4:");
                System.out.println("Leben: "+plife4+"\nAbgezogendes Leben: "+pantilife4);
        }
    }
    public static int punkteSystem(int wurf1,int wurf2) {
        if ((wurf1 == 1 && wurf2 == 2) || (wurf1 == 2 && wurf2 == 1)) {
            System.out.println("Mäxchen!!\nDas sind 1 Lebensabzüge und du heilst ein Leben.");
            return 2;
        } else if (wurf1 == wurf2) {
            System.out.println("Pasch!\nDas ist 1 Lebensabzug");
            return 1;
        } else {
            System.out.println("Das ist leider nichts wert der nächste ist dran.");
            return 0;
        }
    }
    public static void end(int plife1,int plife2,int plife3,int plife4,int pantilife1,int pantilife2,int pantilife3,int pantilife4, int playercount) throws IOException {
        String sieger = "Error";
        if (plife1>plife2&&plife1>plife3&&plife1>plife4) {
            sieger="Spieler 1";
        }else if (plife2>plife1&&plife2>plife3&&plife2>plife4) {
            sieger="Spieler 2";
        }else if (plife3>plife2&&plife3>plife1&&plife3>plife4) {
            sieger="Spieler 3";
        }else if (plife4>plife2&&plife4>plife3&&plife4>plife1) {
            sieger="Spieler 4";
        }
        System.out.println("Das Spiel ist zu Ende.\nDer Sieger ist "+sieger);
        System.out.println("Möchtest du die Statistik sehen?");
        boolean input = IO.readBool();
        if (input) {
            statistik(plife1,plife2,plife3,plife4,pantilife1,pantilife2,pantilife3,pantilife4,playercount);
        }
    }
    public static int wurfeln() throws IOException {
        while (true) {
            int input = IO.readInt();
            switch (input) {
                case 1, 2, 3, 4, 5, 6:
                    return input;
                default:
                    System.out.println("Bitte gib eine Zahl zwischen 1 und 6 ein");
            }
        }
    }
    public static int menu() throws IOException {
        System.out.println("Wieviele Spieler spielen mit?");
        return IO.readInt();
    }
}
