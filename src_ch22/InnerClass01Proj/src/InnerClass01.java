class Outer_Demo {
    // Inner Class
    private class Inner_Demo {
        public void print () {
            System.out.println ("This is an inner class");
        }
    }

    void display_Inner () {
        Inner_Demo inner = new Inner_Demo ();
        inner.print();
    }
}

public class InnerClass01 {
    public static void main (String[] args) {
        Outer_Demo outer = new Outer_Demo ();
        outer.display_Inner();
    }
}

