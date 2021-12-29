class Num{
         static int seriesSum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        sum += i * (i + 1) / 2;
        return sum;
    }
     public static void main (String[] args)
    {
        int n = 4;
        System.out.println(seriesSum(n));
         
    }
}