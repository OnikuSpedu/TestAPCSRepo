public class Demo {
    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);
        for (int i = 1; i <= arg; i++) {
            for (int j = arg; j >= 0 + i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}