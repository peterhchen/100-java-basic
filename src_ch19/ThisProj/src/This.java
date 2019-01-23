public class This {
    int num = 0;
    This () {
        System.out.println ("Example of this");
    }
    This (int num) {
        this (); // invoke default constructor
        this.num = num;
    }
    public void greet () {
        System.out.println ("Hi Welcome");
    }
    public void print () {
        int num = 20;
        System.out.println ("local value: " + num);
        System.out.println ("this.num: " + this.num);
        this.greet ();
    }
    public static void main (String[] args) {
        System.out.println ("Before obj1");
        This obj1 = new This ();
        System.out.println ("After obj1");
        System.out.println ("Print obj1");
        obj1.print();
        System.out.println ("Before obj2");
        This obj2 = new This (20);
        System.out.println ("After obj2");
        System.out.println ("Print obj2");
        obj2.print();
    }
}
