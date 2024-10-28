package Task14;

public class App {
    public static void main(String[] args) {
        // recursiveFunction(10);
        // ascFunction(0);

        int values[] = {2, 5, 18, 9, 73, 15, 4, 24};
        int arraySize = values.length;

        Minimax mm = new Minimax();
        int level = mm.calculateLevel(arraySize);
        
        //int level = mm.calculateLevel(8);
        // given 8 numbers, > 4 > 2 > 1 result
        // therere           max, min, max
        System.out.println("# times it will do deep into/depth of recursing the fibbonaci seq: " + level);

        int result = mm.minimax(0, true, values, 0, level);
        System.out.println("Result of minimax for an array of integer: " + result);
    }

    public static void recursiveFunction(int n)
    {
        System.out.println(n);

        if (n > 5)
        {
            recursiveFunction(n-1);
        }

        // R10 > R9 > R8 > R7 > R6> 5 thn not met cannot R anymore
        // starts throwing out the values?
        // 10 < 9 < 8 < 7 < 6
    }
    public static void ascFunction(int n)
    {
        System.out.println(n);

        if (n<5)
        {
            ascFunction(n+1);
        }
    }
}
