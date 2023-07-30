import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EX7HW4 {


    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        int [] opp ;
        int request = 0;
        boolean test = true;

        try {
            System.out.println("please enter the size of the array");
            int size = data.nextInt();
            opp = new int[size];
            request = 0;
            test = true;

            do {

                System.out.println();
                System.out.println("please select your request");
                System.out.print("\n" + " 1. Accept elements of an array\n" +
                        "\n" +
                        " 2. Display elements of an array\n" +
                        "\n" +
                        "3. Search the element within array\n" +
                        "\n" +
                        " 4. Sort the array\n" +
                        "\n" +
                        " 5. To Stop\n");

                request = data.nextInt();


                if (request == 1) {

                    try {
                        for (int i = 0; i < opp.length; i++) {
                            System.out.print("please your array elements");
                            int el = data.nextInt();
                            opp[i] = el;
                        }
                        System.out.println("the Array is full");
                    } catch (ArrayIndexOutOfBoundsException e1) {
                        System.out.println(e1.getMessage());

                    } catch (InputMismatchException e1) {
                        System.out.println("you have to enter the string");
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }


                if (request == 2) {
                    try {

                        System.out.print("elements of an array : ");
                        for (int i = 0; i < opp.length; i++) {
                            System.out.print(opp[i] + " ");
                        }
                    }catch (ArrayIndexOutOfBoundsException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }

                boolean res2 = false;
                int elment = 0;

                if (request == 3) {
                    try {


                        System.out.print("what is the element you trying to Search for?");
                        int ser = data.nextInt();

                        for (int i = 0; i < opp.length; i++) {

                            if (ser == opp[i]) {
                                res2 = true;
                            }
                        }


                        if (res2 == true) {
                            System.out.println("the element" + ser + " exist");
                        } else {
                            System.out.println("the element " + ser + " not exist");
                        }
                    } catch (ArrayIndexOutOfBoundsException e1) {
                        System.out.println(e1.getMessage());
                    } catch (InputMismatchException e1) {
                        System.out.println("you have to enter the string");
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }

                if (request == 4) {
                    try {
                        System.out.println("the sorted array :");

                        for (int i = 0; i < opp.length; i++) {
                            for (int j = i + 1; j < opp.length; j++) {
                                if (opp[i] > opp[j]) {
                                    int temp2 = opp[i];
                                    opp[i] = opp[j];
                                    opp[j] = temp2;
                                }
                            }
                        }

                        System.out.println(Arrays.toString(opp));

                    } catch (ArrayIndexOutOfBoundsException e1) {
                        System.out.println(e1.getMessage());
                    }  catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }

                if (request == 5) {
                    test = false;
                }


            } while (test);


        } catch (InputMismatchException e1) {
            System.out.println("you have to enter the a number");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }














    }
}
