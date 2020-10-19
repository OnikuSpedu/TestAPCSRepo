public class Demo {
    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]); //Parses for int
        printLoop(arg); //Calls printLoop
    }
    public static void printLoop(int arg) {
        for (int i = 1; i <= arg; i++) {
            for (int j = arg; j >= 0 + i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
