public class PascalTriangle {
    public static void main(String[] args) {
        printPascal(6);
    }

    static void printPascal(int n)
    {
        for (int line = 0; line < n; line++)
        {
            for (int i = 0; i <= line; i++)
                System.out.print(countNumber(line, i)+" ");


        }
    }
    static int countNumber(int n, int k)
    {
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
