
public class InstVarTest {
    public String name;
    private double salary;
    public InstVarTest (String empName) {
        name = empName;
    }
    public void setSalary (double empSal) {
        salary = empSal;
    }
    public void printEmp () {
        System.out.println ("name: " + name);
        System.out.println ("salary: " + salary);
    }
    public static void main (String [] args) {
        InstVarTest empOne = new InstVarTest ("Peter");
        empOne.setSalary(120000);
        empOne.printEmp();
    }

}
