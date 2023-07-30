import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class theproject {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        char[][] tictactoe = new char[3][3];
        for (int i = 0; i < tictactoe.length; i++) {
            for (int j = 0; j < tictactoe.length; j++) {
                tictactoe[i][j] = ' ';
            }
        }


        char player = 'X';
        char cpmputer = '0';
        int pTurn;
        int cTurn;
        Random random = new Random();
        // int randomNumber = random.nextInt(9) + 1;

        boolean loop = true;

        while (loop) {

            try {


                printarray(tictactoe);
                System.out.println();
                System.out.println("Where do you want to play ? between (1-9)");
                pTurn = data.nextInt();


                while (true) {

                    if (pTurn == 1) {
                        if (tictactoe[0][0] == ' ') {
                            tictactoe[0][0] = player;
                            break;
                        }
                    }
                    if (pTurn == 2) {
                        if (tictactoe[0][1] == ' ') {
                            tictactoe[0][1] = player;
                            break;
                        }
                    }
                    if (pTurn == 3) {
                        if (tictactoe[0][2] == ' ') {
                            tictactoe[0][2] = player;
                            break;
                        }
                    }
                    if (pTurn == 4) {
                        if (tictactoe[1][0] == ' ') {
                            tictactoe[1][0] = player;
                            break;
                        }
                    }
                    if (pTurn == 5) {
                        if (tictactoe[1][1] == ' ') {
                            tictactoe[1][1] = player;
                            break;
                        }
                    }
                    if (pTurn == 6) {
                        if (tictactoe[1][2] == ' ') {
                            tictactoe[1][2] = player;
                            break;
                        }
                    }
                    if (pTurn == 7) {
                        if (tictactoe[2][0] == ' ') {
                            tictactoe[2][0] = player;
                            break;
                        }
                    }
                    if (pTurn == 8) {
                        if (tictactoe[2][1] == ' ') {
                            tictactoe[2][1] = player;
                            break;
                        }
                    }
                    if (pTurn == 9) {
                        if (tictactoe[2][2] == ' ') {
                            tictactoe[2][2] = player;
                            break;
                        }
                    } else {
                        System.out.println("already taken try again");
                        try {
                            pTurn = data.nextInt();
                        } catch (InputMismatchException e1) {
                        System.out.println("you have to enter the string");
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                    }


                }
            } catch (InputMismatchException e1) {
                System.out.println("you have to enter the string");
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }

            boolean sta = full(tictactoe);
            if (!sta) {
                System.out.println();
                System.out.println("No one win");
                break;
            }

            printarray(tictactoe);

            int randomNumber = random.nextInt(9) + 1;


            if (Winner(tictactoe) != " ") {
                System.out.println();
                System.out.println(Winner(tictactoe));
                break;

            }


            while (sta) {

                if (randomNumber == 1) {
                    if (tictactoe[0][0] == ' ') {
                        tictactoe[0][0] = cpmputer;
                        break;
                    }
                }
                if (randomNumber == 2) {
                    if (tictactoe[0][1] == ' ') {
                        tictactoe[0][1] = cpmputer;
                        break;
                    }
                }
                if (randomNumber == 3) {
                    if (tictactoe[0][2] == ' ') {
                        tictactoe[0][2] = cpmputer;
                        break;
                    }
                }
                if (randomNumber == 4) {
                    if (tictactoe[1][0] == ' ') {
                        tictactoe[1][0] = cpmputer;
                        break;
                    }
                }
                if (randomNumber == 5) {
                    if (tictactoe[1][1] == ' ') {
                        tictactoe[1][1] = cpmputer;
                        break;
                    }
                }
                if (randomNumber == 6) {
                    if (tictactoe[1][2] == ' ') {
                        tictactoe[1][2] = cpmputer;
                        break;
                    }
                }
                if (randomNumber == 7) {
                    if (tictactoe[2][0] == ' ') {
                        tictactoe[2][0] = cpmputer;
                        break;
                    }
                }
                if (randomNumber == 8) {
                    if (tictactoe[2][1] == ' ') {
                        tictactoe[2][1] = cpmputer;
                        break;
                    }
                }
                if (randomNumber == 9) {
                    if (tictactoe[2][2] == ' ') {
                        tictactoe[2][2] = cpmputer;
                        break;
                    }
                } else {
                    randomNumber = random.nextInt(9) + 1;
                }

            }
            System.out.println("\nComputer Chose " + randomNumber);


        }

    }


    public static boolean full(char[][] tictactoe) {
        try {
            for (int i = 0; i < tictactoe.length; i++) {
                for (int j = 0; j < tictactoe[0].length; j++) {
                    if (tictactoe[i][j] == ' ') {
                        return true;
                    }
                }
            }

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
        } catch (InputMismatchException e1) {
            System.out.println("you have to enter the string");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
        return false;
    }

    private static String Winner(char[][] tictactoe) {


        // Check all the cases

        // case 1
        try {
            if (tictactoe[0][0] != ' ' && tictactoe[0][1] != ' ' && tictactoe[0][2] != ' ') {
                if (tictactoe[0][0] == tictactoe[0][1] && tictactoe[0][0] == tictactoe[0][2]) {
                    return "The end of the game the winner is " + tictactoe[0][0];
                }
            }


            if (tictactoe[1][0] != ' ' && tictactoe[1][1] != ' ' && tictactoe[1][2] != ' ') {
                if (tictactoe[1][0] == tictactoe[1][1] && tictactoe[1][0] == tictactoe[1][2]) {
                    return "The end of the game the winner is " + tictactoe[1][0];
                }
            }

            if (tictactoe[2][0] != ' ' && tictactoe[2][1] != ' ' && tictactoe[2][2] != ' ') {
                if (tictactoe[2][0] == tictactoe[2][1] && tictactoe[2][0] == tictactoe[2][2]) {
                    return "The end of the game the winner is " + tictactoe[2][0];
                }
            }


            ///////////

            if (tictactoe[0][0] != ' ' && tictactoe[1][0] != ' ' && tictactoe[2][0] != ' ') {
                if (tictactoe[0][0] == tictactoe[1][0] && tictactoe[0][0] == tictactoe[2][0]) {
                    return "The end of the game the winner is " + tictactoe[0][0];
                }
            }

            if (tictactoe[0][1] != ' ' && tictactoe[1][1] != ' ' && tictactoe[2][1] != ' ') {
                if (tictactoe[0][1] == tictactoe[1][1] && tictactoe[0][1] == tictactoe[2][1]) {
                    return "The end of the game the winner is " + tictactoe[0][1];
                }
            }

            if (tictactoe[0][2] != ' ' && tictactoe[1][2] != ' ' && tictactoe[2][2] != ' ') {
                if (tictactoe[0][2] == tictactoe[1][2] && tictactoe[0][2] == tictactoe[2][2]) {
                    return "The end of the game the winner is " + tictactoe[0][2];
                }
            }


            if (tictactoe[0][0] != ' ' && tictactoe[1][1] != ' ' && tictactoe[2][2] != ' ') {
                if (tictactoe[0][0] == tictactoe[1][1] && tictactoe[0][0] == tictactoe[2][2]) {
                    return "The end of the game the winner is " + tictactoe[0][0];
                }

            }

            if (tictactoe[0][2] != ' ' && tictactoe[1][1] != ' ' && tictactoe[2][0] != ' ') {
                if (tictactoe[0][2] == tictactoe[1][1] && tictactoe[0][2] == tictactoe[2][0]) {
                    return "The end of the game the winner is " + tictactoe[0][2];
                }

            }


        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
        } catch (InputMismatchException e1) {
            System.out.println("you have to enter the string");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
        return " ";
    }

    private static void printarray(char[][] tictactoe) {
        try {


            for (int i = 0; i < tictactoe.length; i++) {
                System.out.println("\n-+-+-");
                for (int j = 0; j < tictactoe.length; j++) {
                    System.out.print(tictactoe[i][j] + "|");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
        } catch (InputMismatchException e1) {
            System.out.println("you have to enter the string");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }


    }
}