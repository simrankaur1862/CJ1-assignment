import java.util.Scanner;
public class forsum {

    public int fsum(int n){
       int sum = 0;
       if(n==0)
           return n;
        for(int i = 1;i<=n;i++){
            sum = sum+i;

        }
        return sum;}
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            forsum obj = new forsum();
            System.out.println(obj.fsum(n));
        }


}
