import java.util.Scanner;
public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1 :-");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number 2 :-");
        int num2 = sc.nextInt();
        int result = 1;
        for(int i = 2;i<num2+1;i++ ){
            if(num1 % i == 0 && num2 % i == 0){
                num1 = num1/i;
                num2 = num2/i;
                result = result * i;
                i = i-1;
            }
        }
        System.out.print(result);
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the n1 :- ");
    //     int n1 = sc.nextInt();
    //     System.out.print("Enter the n2 :- ");
    //     int n2 = sc.nextInt();

    //     int original_n1 = n1;
    //     int original_n2 = n2;

    //     while(n1%n2 != 0){
    //         int remainder = n1%n2;
    //         n1 = n2;
    //         n2 = remainder;
    //     }
    //     int gcd = n1;
    //     System.out.println("GCD :- " + gcd);

    //     int lcm = (original_n1 + original_n2)/gcd;
    //     System.out.print("LCM :- " + lcm);
    // }
}
