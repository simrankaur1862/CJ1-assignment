import java.util.Scanner;
public class sumrecur {
    public int recurSum(int n)
    {
        if (n <= 1)
            return n;
        return n + recurSum(n - 1);
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumrecur obj = new sumrecur();
        System.out.println(obj.recurSum(n));
    }

}
