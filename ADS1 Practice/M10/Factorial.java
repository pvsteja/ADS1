import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        int n, m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = s.nextInt();
        Factorial obj = new Factorial();
        m = obj.fact(n);
        System.out.println("Factorial of "+n+" :"+m);
    }
    int fact(int x)
    {
        if(x > 1)
        {
            return(x * fact(x - 1));
        }
        return 1;
    }
}