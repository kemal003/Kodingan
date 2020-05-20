package UAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainUAP {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Avatar[] avatarMain = new Avatar[7];

        //------------------------PROSES INPUT AVATAR-----------------------//
        try {
            String[] input = reader.readLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                if (input[i].toUpperCase().contains("WARRIOR")) {
                    avatarMain[i] = new Warrior(Integer.parseInt(input[i].substring(8)));
                } else if (input[i].toUpperCase().contains("ASSASSIN")) {
                    avatarMain[i] = new Assassin(Integer.parseInt(input[i].substring(9)));
                } else if (input[i].toUpperCase().contains("TANK")) {
                    avatarMain[i] = new Tank(Integer.parseInt(input[i].substring(5)));
                } else if (input[i].toUpperCase().contains("HEALER")) {
                    avatarMain[i] = new Healer(Integer.parseInt(input[i].substring(7)));
                }
            }

//            //--------------------CHECKING INPUT---------------------------//
//            for (int i = 0; i < avatarMain.length; i++) {
//                System.out.println(avatarMain[i]);
//            }
//            System.out.println();
            Game main = new Game(avatarMain);
            int turn = 1;

            while (!main.adaYangHabis()) {
                System.out.println("TURN " + turn);
                int team1 = 0;
                int team2 = 0;
                while (team1 < 3 || team2 < 3) {
                    for (int i = 0; i < main.getTeam2().length; i++) {
                        if (main.getTeam1()[team1].isLifeStatus()) {
                            if (main.getTeam2()[i].isLifeStatus()) {
                                System.out.println("--TEAM 1 MOVES--");
                                System.out.print(main.getTeam1()[team1].getTipeAvatar() + " attack ");
                                System.out.println(main.getTeam2()[i].getTipeAvatar());
                                main.getTeam1()[team1].attack(main.getTeam2()[i]);
                                System.out.printf("Other team's %s remaining HP: %d\n", main.getTeam2()[i].getTipeAvatar(), main.getTeam2()[i].getHealthPoint());
                                if (main.getTeam1()[team1].getTipeAvatar().equalsIgnoreCase("HEALER")) {
                                    System.out.println("Healer heals all team member");
                                    main.getTeam1()[team1].healAllMember(main.getTeam1());
                                    //                            System.out.println("All team members's HP now: ");
                                    //                            for (int j = 0; j < main.getTeam1().length; j++) {
                                    //                                System.out.print(main.getTeam1()[j].getTipeAvatar() + ": " + main.getTeam1()[j].getHealthPoint() + " ");
                                    //                            }
                                    //                            System.out.println();
                                }
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < main.getTeam2().length; i++) {
                        if (main.getTeam2()[team2].isLifeStatus()) {
                            if (main.getTeam1()[i].isLifeStatus()) {
                                System.out.println("--TEAM 2 MOVES--");
                                System.out.print(main.getTeam2()[team2].getTipeAvatar() + " attack ");
                                System.out.println(main.getTeam1()[i].getTipeAvatar());
                                main.getTeam2()[team2].attack(main.getTeam1()[i]);
                                System.out.printf("Other team's %s remaining HP: %d\n", main.getTeam1()[i].getTipeAvatar(), main.getTeam1()[i].getHealthPoint());
                                if (main.getTeam2()[team2].getTipeAvatar().equalsIgnoreCase("HEALER")) {
                                    System.out.println("Healer heals all team member");
                                    main.getTeam1()[team2].healAllMember(main.getTeam2());
                                    //                            System.out.println("All team members's HP now: ");
                                    //                            for (int j = 0; j < main.getTeam2().length; j++) {
                                    //                                System.out.print(main.getTeam2()[j].getTipeAvatar() + ": " + main.getTeam2()[j].getHealthPoint() + " ");
                                    //                            }
                                    //                            System.out.println();
                                }
                                break;
                            }
                        }
                    }
                    team1++;
                    team2++;
                }
                turn++;
                System.out.println();
            }
            if (main.isTeam2SemuaMati()) System.out.println("TEAM 1 MENANG");
            if (main.isTeam1SemuaMati()) System.out.println("TEAM 2 MENANG");
        } catch (NullPointerException x) {
            System.err.println("INPUT SALAH");
        } catch (ArrayIndexOutOfBoundsException x){
            System.err.println("MAAF SOURCE CODE INI HANYA COMPITABLE DENGAN 3vs3 :'");
        }
    }
}
