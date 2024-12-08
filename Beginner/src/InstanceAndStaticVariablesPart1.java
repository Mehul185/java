public class InstanceAndStaticVariablesPart1 {

    // instance variable
    int a;

    // static variable
    static int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        InstanceAndStaticVariablesPart1.b = b;
    }
}
