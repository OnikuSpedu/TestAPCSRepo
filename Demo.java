public class Demo {
    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println("printLoop");
            int arg = Integer.parseInt(args[0]);
            printLoop(arg);
        }
        System.out.println("arrToString");
        int[] arr = {0, 0, 2, 3, 4, 5, 3};
        System.out.println(arrToString(arr));
        System.out.println("arrayDeepToString");
        int[][] deep = {{0, 1, 2}, {0, 1}, {1, 2}, {9, 1, 2}, {1}, {2, 3}, {3, 6, 7}};
        System.out.println(arrayDeepToString(deep));
        System.out.println("create2DArray(5, 4, 5)");
        int[][]arr2D = create2DArray(5, 4, 5);
        System.out.println(arrayDeepToString(arr2D).replace("},", "},\n"));
        System.out.println("create2DArrayRandomized(5, 4, 5)");
        int[][]arrRandom = create2DArrayRandomized(5, 4, 5);
        System.out.println(arrayDeepToString(arrRandom).replace("},", "},\n"));	
    }
    public static void printLoop(int arg) {
        for (int i = 1; i <= arg; i++) {
            for (int j = arg; j >= 0 + i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static String arrToString(int[]arr){
        String res = "{";
        for (int i = 0; i < arr.length; i++) {
          res += arr[i];
          if (i != arr.length - 1) res += ", ";
        }
        res += "}";
        return res;
    }
    public static String arrayDeepToString(int[][]arr){
        String res = "{";
        for (int i = 0; i < arr.length; i++) {
          res += arrToString(arr[i]);
          if (i < arr.length - 1) res += ",";
        }
        res += "}";
        return res;
    } 
    public static int[][] create2DArray(int row, int col, int maxValue) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int) Math.floor(Math.random() * (maxValue+ 1));
            }
        }
        return arr;
    }
    public static int[][] create2DArrayRandomized(int row, int col, int maxValue) {
        int[][] arr = new int[row][];
        for (int i = 0; i < row; i++) {
            int columns = (int) Math.floor(Math.random() * (col+ 1));
            int[] subArr = new int[columns]; 
            for (int j = 0; j < columns; j++) {
                subArr[j] = (int) Math.floor(Math.random() * (maxValue+ 1));
            }
            arr[i] = subArr;
        }
        return arr;
    }
}