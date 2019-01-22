public class staticVarTest {
    private static double salary;
    public static final String DEPARTMENT = "Development";
    public static void main (String[] args) {
        salary = 12000;
        System.out.println (DEPARTMENT + "average salary: " + salary);
    }
}
