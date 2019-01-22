public class LocalVarTest {
    public void age() {
        int age = 0;
        age = age + 7;
        System.out.println ("age is: " + age);
    }
    public static void main (String [] args) {
        LocalVarTest localVar = new LocalVarTest ();
        localVar.age ();
    }
}
