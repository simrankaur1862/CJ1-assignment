import java.util.Scanner;
public class Recur {
    int count = 0;
  public  void recursion(int x){
      if(x==0){
          return;
      }

           recursion(x-1);
       System.out.print(" " + x);
      }


    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        Recur obj = new Recur();
        obj.recursion(n);

    }
}
