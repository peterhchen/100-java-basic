public class RevArr {
    public static int [] reverse (int [] list) {
        int [] result = new int [list.length];
        for (int i = 0, j = result.length-1; i < list.length; i++, j--) {
            result [j] = list[i];
        }
        return result;
    }
    public static void main (String[] args) {
        int [] list = {0, 1, 2, 3, 4, 5};
        int[] result = reverse (list);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
