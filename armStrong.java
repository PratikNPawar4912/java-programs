import java.util.Scanner;

public class armStrong {
    int num, temp, rem, sum;

    public void armstrong(int input) {
        while (input > 0) {
            rem = input %10;
            sum = sum+rem*rem*rem;
            input = input / 10;
        }
        if (num == sum) {
            System.out.println(num + " is an armstrong number");
        }
        else {
            System.out.println(num + " is not an armstrong number");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        armStrong obj = new armStrong();
        System.out.println("Enter a Number to check is that number is armstrong or not");
        obj.num = sc.nextInt();
        obj.armstrong(obj.num);
    }
}
