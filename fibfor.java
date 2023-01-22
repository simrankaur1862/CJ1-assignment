import java.util.Scanner;
public class fibfor {

    public int fib(int n){
        int n1=0,n2=1,n3;
        if(n==0)
        return n1;
        for(int i = 2;i<=n;i++){
         n3 = n1 + n2;
         n1=n2;
         n2=n3;
        }
        return n2;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibfor obj = new fibfor();
        System.out.println(obj.fib(n));

    }
}
