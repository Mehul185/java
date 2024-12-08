public class InstanceAndStaticVariablesPart2 {

    public static void main(String[] args) {

        InstanceAndStaticVariablesPart1 temp1 = new InstanceAndStaticVariablesPart1();

        temp1.setA(20); // instance variable needs to be called by creating an object of the class
        temp1.setB(30); // static variable can also be called by creating an object of the class. However, it will through a warning sign

        // static variable needs to be called by appending the static variable with its class name
        System.out.println("B= "+InstanceAndStaticVariablesPart1.getB()); // output should be 30
        System.out.println("A= "+temp1.getA()); // output should be 20



    }
}
