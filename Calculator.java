import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
//        System.out.println("Please enter the index");
//        int in = data.nextInt();
//        printindex(names , in);



        do {
            int lastres = 0;
            int num1 = 0;
            int num2=0;
            try {
                System.out.println("Please enter tow numbers");
                num1 = data.nextInt();
                num2 = data.nextInt();
            } catch (InputMismatchException e2) {
                System.out.println("you have to enter a number");
                break;
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            break;}


            try {


                System.out.println("Please Select your option and 0 to exit");

                System.out.println("Enter 1 to addition the numbers\n" +
                        "\n" +
                        "Enter 2 to subtraction the numbers\n" +
                        "\n" +
                        "Enter 3 to multiplication the numbers\n" +
                        "\n" +
                        "Enter 4 to division the numbers\n" +
                        "\n" +
                        "Enter 5 to modulus the numbers\n" +
                        "\n" +
                        "Enter 6 to find minimum number\n" +
                        "\n" +
                        "Enter 7 to find maximum number\n" +
                        "\n" +
                        "Enter 8 to find the average of numbers\n" +
                        "\n" +
                        "Enter 9 to print the last result in calculator\n" +
                        "\n" +
                        "Enter 10 to print the list of all results in calculator");

                int opp = data.nextInt();


                if (opp == 1) {
                    try {
                        lastres = addition(num1, num2);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }}

                if (opp == 2) {
                    try {
                        lastres = subtraction(num1, num2);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }

                if (opp == 3) {
                    try {
                        lastres = multiplication(num1, num2);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }}


                if (opp == 4) {
                    try {
                        lastres = division(num1, num2);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }

                if (opp == 5) {
                    try{
                        lastres = modulus(num1, num2);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }

                if (opp == 6) {
                    try {
                        lastres = minimum(num1, num2);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }

                if (opp == 7) {
                    try {
                        lastres = maximum(num1, num2);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }}


                if (opp == 8) {
                    try {
                        lastres = average(num1, num2);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }


                if (opp == 9) {
                    try {

                        lastResul(num1, num2, lastres);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }}

                if (opp == 10) {

                    try {
                        allResults(num1, num2);
                    } catch (ArithmeticException e1) {
                        System.out.println(e1.getMessage());
                    } catch (Exception e1) {
                        System.out.println(e1.getMessage());
                    }
                }

            } catch (InputMismatchException e2) {
                System.out.println("you have to enter a number");
                break;
            } catch (Exception e3) {
                System.out.println(e3.getMessage());
                break;
            }
        }while (true) ;

    }


    private static int addition(int num1, int num2){
        System.out.println(num1 + " + " + num2 + "= " + num1 + num2);
        return num1 + num2;

    }

    private static int subtraction(int num1, int num2) {



        System.out.println(num1 + " - " + num2 + "= " + (num1 - num2));
        return num1 - num2;

    }

    private static int multiplication(int num1, int num2) {
        System.out.println(num1+" x "+num2+"= "+num1*num2);
        return num1*num2;
    }

    private static int division(int num1, int num2) {
        System.out.println(num1+" / "+num2+"= "+num1/num2);
        return num1/num2;
    }


    private static int modulus(int num1, int num2) {
        System.out.println(num1+" mod "+num2+"= "+num1%num2);
        return num1%num2;
    }

    private static int minimum(int num1, int num2) {
        if (num1 < num2){ System.out.println(num1+"is the minimum");  return num1;}
        else {System.out.println(num2+"is the minimum"); return num2;}
    }

    private static int maximum(int num1, int num2) {
        if (num1 > num2){ System.out.println(num1+"is the maximum");return num1; }
        else {System.out.println(num2+"is the maximum");return num2;}
    }

    private static int average(int num1, int num2) {
        int avg = num1+num2/2;
        System.out.println("the average is"+avg);
        return avg;
    }

    private static void lastResul(int num1, int num2 , int lastres) throws Exception {

        // System.out.println("the last result is "+lastres);
        throw new Exception("the last result is "+lastres);
    }

    private static void allResults(int num1, int num2) {
        addition(num1,num2);
        subtraction(num1,num2);
        multiplication(num1,num2);
        division(num1,num2);
        modulus(num1,num2);
        minimum(num1,num2);
        maximum(num1,num2);
        average(num1,num2);
    }


}