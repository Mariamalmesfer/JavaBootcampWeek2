// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        System.out.println("Shape class (Super Class)");

        Shape s1 = new Shape();

        Shape s2 = new Shape("red",true);

        //////// first shape object

        System.out.println("The first object:");

        System.out.println("");

        System.out.println("to string method");

        System.out.println(s1.toString());

        System.out.println("");

        System.out.println("The first object get and set");

        System.out.println("");

        s1.setColor("blue");
        s1.setFilled(false);

        System.out.println(s1.getColor() +","+s1.isFilled());


        //////// second shape object

        System.out.println("The second object:");

        System.out.println("");

        System.out.println("to string method");

        System.out.println(s2.toString());

        System.out.println("");

        System.out.println("The first object get and set");

        System.out.println("");

        s2.setColor("pink");
        s2.setFilled(false);

        System.out.println(s2.getColor() +","+s2.isFilled()+"\n");

        /////////  Circle object

        System.out.println("Circle object \n");

        Circle c1 = new Circle();

        Circle c2 = new Circle(2.0);

        Circle c3 = new Circle("baby blue" , true,3.3);

        // to String methods

        System.out.println("to String methods \n");


        System.out.println(c1.toString());
        System.out.println("");
        System.out.println(c2.toString());
        System.out.println("");
        System.out.println(c3.toString());
        System.out.println("");

        System.out.println("get and set for the  Circle object \n");

        c1.setColor("orange");
        c1.setRadius(1.0);
        c1.setFilled(false);

        System.out.println(c1.getColor()+","+c1.getRadius()+","+c1.isFilled()+"\n");


        System.out.println("getArea and getPerimeter methods\n");

        System.out.println("the area of object 3 is "+c3.getArea()+"\n");


        System.out.println("the Perimeter of object 3 is "+c3.getPerimeter()+"\n");


        /////////  Rectangle object


        System.out.println("Rectangle objects \n");

        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle(3.0,4.0);

        Rectangle r3 = new Rectangle("gold",true,3.0,4.0);


        System.out.println("to String methods \n");



        System.out.println(r1.toString());
        System.out.println("");
        System.out.println(r2.toString());
        System.out.println("");
        System.out.println(r3.toString());
        System.out.println("");


        System.out.println("get and set for the  Rectangle object \n");

        r1.setColor("purple");
        r1.setFilled(false);
        r1.setLength(5.5);
        r1.setWidth(2.0);

        System.out.println(r1.getColor()+","+r1.isFilled()+","+r1.getLength()+","+r1.getWidth()+"\n");

        System.out.println("getArea and getPerimeter methods\n");

        System.out.println("the area of object 3 is "+r3.getArea()+"\n");

        System.out.println("the Perimeter of object 3 is "+r3.getPerimeter()+"\n");


       // Square object

        System.out.println("Square objects \n");

        Square q1 = new Square();

        Square q2 = new Square(2.0);

        Square q3 = new Square("black",true,2.0);

        System.out.println("to String methods \n");


        System.out.println(q1.toString());
        System.out.println("");
        System.out.println(q2.toString());
        System.out.println("");
        System.out.println(q3.toString());
        System.out.println("");

        System.out.println("get and set for the  Square object \n");

        q1.setColor("white");
        q1.setFilled(false);
        q1.setSide(3.8);

        System.out.println(q1.getColor()+","+q1.isFilled()+","+q1.getSide()+"\n");

        System.out.println("getArea and getPerimeter methods\n");

        System.out.println("the area of object 3 is "+q3.getArea()+"\n");

        System.out.println("the Perimeter of object 3 is "+q3.getPerimeter()+"\n");



    }
}