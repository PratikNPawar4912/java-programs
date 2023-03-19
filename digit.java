import java.util.Scanner;

public class digit{
    int input,Digit,count,sum,i=0,Length;
    public void starPrint(){
        for(int star=0;star<40;star++)
        {

            if(star%2==0){
                System.out.print("*");
            }

            else if(star==39) {
                System.out.print("\n");
            }
            else if(star%2==1){
                System.out.print("==");
            }
        }

    }
    public void Split(){
       int tempInput,showNum;
       tempInput=input;
       showNum=tempInput;
        while(tempInput>0) {
            Digit = tempInput % 10;
            Length++;
            tempInput=tempInput/10;
        }
        int Array[]=new int[Length];
        while(input>0){
            Digit=input%10;
            sum=sum+Digit;
            count++;
            Array[i]=Digit;
            i++;
            input=input/10;
        }
        System.out.println("there are total " + count + " number(digit)");
        starPrint();
        System.out.print(showNum + " The Sum Of ");
        for(i=count-1;i>=0;i--)
        {
            System.out.print(Array[i] + " + ");
        }
        System.out.print(" Is " + sum);
    }
    public static void main(String args[]){
        digit digitObj=new digit();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get its digit sum");
        digitObj.starPrint();
        digitObj.input= sc.nextInt();
        digitObj.Split();
    }
}