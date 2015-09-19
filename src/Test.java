/**
 * Created by Gregg on 19/09/2015.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Instantiate Class
//       Car sedan = new Car();
//        sedan.setColor("Blue");
//        sedan.setMake("Toyota");
//       Car suv = new Car();
//       Car van = new Car();
//
//        System.out.println(sedan.getColor());
//        System.out.println(sedan.getMake());

        //Inheritance
        Sedan vios = new Sedan();
        vios.setColor("Red");
        vios.setMake("Toyota");

        System.out.println(vios.getColor());
        System.out.println(vios.getMake());

//        Sedan vios = new Sedan("Black","Honda");
//
//        System.out.println(vios.getColor());
    }
}
