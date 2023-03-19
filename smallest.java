import java.util.Scanner;

import static java.lang.System.exit;

public class smallest {
    int numbers=2,userSum,sum,rem,i,y=0,j,cnt=0,cnt2=0,z,length=1,length2=1;

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the required sum: ");
        userSum=sc.nextInt();
        System.out.println("Number of Digits :");
        numbers=sc.nextInt();
    }
    public void calculations(){
        for(z=1;z<=numbers;z++){
            length=length*10;
        }
        for(z=1;z<numbers;z++){
            length2=length2*10;
        }
           for(i=length2;i<length;i++){
               j=i;
               sum=0;
               while(j>0){
                   rem=j%10;
                   sum=sum+rem;
                   j=j/10;
               }
               if(sum==userSum) {
                   cnt2++;
                   if(cnt2==2)
                   {
                       System.out.println(i);
                       exit(0);
                   }
               }
           }
    }
}



