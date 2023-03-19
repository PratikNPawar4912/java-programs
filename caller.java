import java.util.Scanner;

public class caller {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        maxTimeOccure maxocr=new maxTimeOccure();
        maxocr.inputArray();
        maxocr.countOccurance();
        DecimalToBinary d2b=new DecimalToBinary();
        d2b.convertor();
    }
}
