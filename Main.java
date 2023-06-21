import java.util.Scanner;

public class MainAskisi {

    public static void main(String[] args) {
	    int a,b,c,d;
	    Scanner n = new Scanner(System.in);
        System.out.println("Give me 4 numbers:");
	    a = n.nextInt();
        b = n.nextInt();
        c = n.nextInt();
        d = n.nextInt();
        System.out.println("Your numbers: " + a + " and " + b + " and " + c + " and " + d);
        if (a < b && b < c && c < d )
        {
            System.out.println("The numbers increasing");
        }
        else if (a > b && b > c && c > d )
        {
            System.out.println("The numbers decreasing");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}
