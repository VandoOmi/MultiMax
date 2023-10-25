import java.io.IOException;

public class MuxiMax {
    static Player player1 = new Player();
    static Player player2 = new Player();
    static Player player3 = new Player();
    static Player player4 = new Player();
    //public static int singelWurfel(int aktivPlayer,int playercount) {

    //}
    public static void main(String[] args) throws IOException {
        int herz = 5;
        int herzHP = 1000;

        player1.life = 1000;
        player2.life = 1000;
        boolean playercountTrue = false;
        int playercount;
        do {
            playercount = MethodenMuxiMax.menu();
            switch (playercount) {
                case 2:
                    System.out.println("");
                case 3:
                    player3.life = 1000;
                    break;
                case 4:
                    player3.life = 1000;
                    player4.life = 1000;
                    break;
                default:
                    System.out.println("Das ist nicht möglich, 2-4 Spieler zuläsig.");
            }
        } while (playercountTrue);
        Player[] playerist = new Player[]{player1, player2, player3, player4};
        int aktivPlayer = 1;
        boolean end = true;
        String input;
        do {
            if (aktivPlayer>playercount) {
                aktivPlayer = 1;
            }
            switch (playercount) {
                case 2 -> {
                    if (player1.life == 0 || player2.life == 0) {
                        end = false;
                    }
                }
                case 3 -> {
                    if (player1.life == 0 || player2.life == 0 || player3.life == 0) {
                        end = false;
                    }
                }
                case 4 -> {
                    if (player1.life == 0 || player2.life == 0 || player3.life == 0 || player4.life == 0) {
                        end = false;
                    }
                }
            }
            System.out.println("Spieler"+aktivPlayer+" ist am Zug.");
            switch(aktivPlayer) {
                case 1:
                    System.out.print("Erster Wurf:  ");
                    int wurf1 = MethodenMuxiMax.wurfeln();
                    System.out.print("Zweiter Wurf: ");
                    int wurf2 = MethodenMuxiMax.wurfeln();
                    switch (MethodenMuxiMax.punkteSystem(wurf1,wurf2)) {
                        case 1:
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P2 / P3 / P4");
                            input = IO.readString();
                            player1.damageDealed(wurf1*100);
                            switch (input.toLowerCase()) {
                                case "p2":
                                    player2.damageTaked(wurf1*100);
                                    break;
                                case "p3":
                                    player3.damageTaked(wurf1*100);
                                    break;
                                case "p4":
                                    player4.damageTaked(wurf1*100);
                                    break;
                            }
                            break;
                        case 2:
                            player1.heal();
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P2 / P3 / P4");
                            input = IO.readString();
                            player1.damageDealed(1000);
                            switch (input.toLowerCase()) {
                                case "p2":
                                    player2.damageTaked(1000);
                                    break;
                                case "p3":
                                    player3.damageTaked(1000);
                                    break;
                                case "p4":
                                    player4.damageTaked(1000);
                                    break;
                            }
                            break;
                        case 0:
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P2 / P3 / P4");
                            input = IO.readString();
                            player1.damageDealed((wurf1+wurf2)*20);
                            switch (input.toLowerCase()) {
                                case "p2":
                                    player2.damageTaked((wurf1+wurf2)*20);
                                    break;
                                case "p3":
                                    player3.damageTaked((wurf1+wurf2)*20);
                                    break;
                                case "p4":
                                    player4.damageTaked((wurf1+wurf2)*20);
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Erster Wurf:  ");
                    wurf1 = MethodenMuxiMax.wurfeln();
                    System.out.print("Zweiter Wurf: ");
                    wurf2 = MethodenMuxiMax.wurfeln();
                    switch (MethodenMuxiMax.punkteSystem(wurf1,wurf2)) {
                        case 1:
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P1 / P3 / P4");
                            input = IO.readString();
                            player2.damageDealed(wurf1*100);
                            switch (input.toLowerCase()) {
                                case "p1":
                                    player1.damageTaked(wurf1*100);
                                    break;
                                case "p3":
                                    player3.damageTaked(wurf1*100);
                                    break;
                                case "p4":
                                    player4.damageTaked(wurf1*100);
                                    break;
                            }
                            break;
                        case 2:
                            player2.heal();
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P1 / P3 / P4");
                            input = IO.readString();
                            player2.damageDealed(1000);
                            switch (input.toLowerCase()) {
                                case "p1":
                                    player1.damageTaked(1000);
                                    break;
                                case "p3":
                                    player3.damageTaked(1000);
                                    break;
                                case "p4":
                                    player4.damageTaked(1000);
                                    break;
                            }
                            break;
                        case 0:
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P1 / P3 / P4");
                            input = IO.readString();
                            player2.damageDealed((wurf1+wurf2)*20);
                            switch (input.toLowerCase()) {
                                case "p1":
                                    player1.damageTaked((wurf1+wurf2)*20);
                                    break;
                                case "p3":
                                    player3.damageTaked((wurf1+wurf2)*20);
                                    break;
                                case "p4":
                                    player4.damageTaked((wurf1+wurf2)*20);
                                    break;
                            }
                            break;

                    }
                    break;
                case 3:
                    System.out.print("Erster Wurf:  ");
                    wurf1 = MethodenMuxiMax.wurfeln();
                    System.out.print("Zweiter Wurf: ");
                    wurf2 = MethodenMuxiMax.wurfeln();
                    switch (MethodenMuxiMax.punkteSystem(wurf1,wurf2)) {
                        case 1:
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P1 / P2 / P4");
                            input = IO.readString();
                            player3.damageDealed(wurf1*100);
                            switch (input.toLowerCase()) {
                                case "p1":
                                    player1.damageTaked(wurf1*100);
                                    break;
                                case "p2":
                                    player2.damageTaked(wurf1*100);
                                    break;
                                case "p4":
                                    player4.damageTaked(wurf1*100);
                                    break;
                            }
                            break;
                        case 2:
                            player3.heal();
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P1 / P2 / P4");
                            input = IO.readString();
                            player3.damageDealed(1000);
                            switch (input.toLowerCase()) {
                                case "p1":
                                    player1.damageTaked(1000);
                                    break;
                                case "p2":
                                    player2.damageTaked(1000);
                                    break;
                                case "p4":
                                    player4.damageTaked(1000);
                                    break;
                            }
                            break;
                        case 0:
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P1 / P2 / P4");
                            input = IO.readString();
                            player3.damageDealed((wurf1+wurf2)*20);
                            switch (input.toLowerCase()) {
                                case "p1":
                                    player1.damageTaked((wurf1+wurf2)*20);
                                    break;
                                case "p2":
                                    player2.damageTaked((wurf1+wurf2)*20);
                                    break;
                                case "p4":
                                    player4.damageTaked((wurf1+wurf2)*20);
                                    break;
                            }
                            break;

                    }
                    break;
                case 4:
                    System.out.print("Erster Wurf:  ");
                    wurf1 = MethodenMuxiMax.wurfeln();
                    System.out.print("Zweiter Wurf: ");
                    wurf2 = MethodenMuxiMax.wurfeln();
                    switch (MethodenMuxiMax.punkteSystem(wurf1,wurf2)) {
                        case 1:
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P1 / P2 / P3");
                            input = IO.readString();
                            player4.damageDealed(wurf1*100);
                            switch (input.toLowerCase()) {
                                case "p1":
                                    player1.damageTaked(wurf1*100);
                                    break;
                                case "p2":
                                    player2.damageTaked(wurf1*100);
                                    break;
                                case "p3":
                                    player3.damageTaked(wurf1*100);
                                    break;
                            }
                            break;
                        case 2:
                            player4.heal();
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P1 / P2 / P3");
                            input = IO.readString();
                            player4.damageDealed(1000);
                            switch (input.toLowerCase()) {
                                case "p2":
                                    player1.damageTaked(1000);
                                    break;
                                case "p3":
                                    player2.damageTaked(1000);
                                    break;
                                case "p4":
                                    player3.damageTaked(1000);
                                    break;
                            }
                            break;
                        case 0:
                            System.out.println("Welchem Spieler möchtest du das Leben abziehen? P1 / P2 / P3");
                            input = IO.readString();
                            player4.damageDealed((wurf1+wurf2)*20);
                            switch (input.toLowerCase()) {
                                case "p1":
                                    player1.damageTaked((wurf1+wurf2)*20);
                                    break;
                                case "p2":
                                    player2.damageTaked((wurf1+wurf2)*20);
                                    break;
                                case "p3":
                                    player3.damageTaked((wurf1+wurf2)*20);
                                    break;
                            }
                            break;
                    }
                    break;
            }
            MethodenMuxiMax.punktZahl(player1.life,player2.life,player3.life,player4.life,playercount);
            aktivPlayer++;
        } while(end);
        MethodenMuxiMax.end(player1.life,player2.life,player3.life,player4.life,player1.antilife,player2.antilife,player3.antilife,player4.antilife,playercount);
    }
}
