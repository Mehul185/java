public class InstanceAndStaticVariablesPart3 {

    public static void main(String[] args) {

        InstanceAndStaticVariablesPart1 temp2 = new InstanceAndStaticVariablesPart1();

        System.out.println(temp2.getB());
        // output should be 30. Since we have set a value for static variable in class InstanceAndStaticVariablesPart2, and static variable has only one copy
        temp2.setA(50);
        System.out.println(temp2.getA()); // 50 value to be printed
    }
}
