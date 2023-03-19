
import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class maxTimeOccure {
    int arry[]={1,2,3,3,3,4,5,3,4,5,6,7,2},count=0,i=0,y=0,temp,input,arr2[]=new int[10],v=0;
    char c;
    Scanner sc=new Scanner(System.in);
    public void inputArray(){

    }
    public void countOccurance(){
        for(i=0;i<arry.length;i++) {
            int count2 = 0;
            temp = arry[i];
            for (int z = i - 1; z >= 0; z--) {
                if (arry[z] == arry[i]) {
                    count2++;
                }
            }
            if (count2 >= 1) {
                continue;
            } else {
                count = 0;
                for (y = 0; y < arry.length; y++) {
                    if (temp == arry[y]) {
                        count++;
                    }
                }
            }
            if (count >= 2) {
                // System.out.println(arry[i]);
                arr2[v] = arry[i];
                v++;
            }
        }
                    Toolkit.getDefaultToolkit().beep();
        if(v>0) {

            System.out.println("There Are "+v+" Repeated Elements :");
            System.out.print("Duplicates array elements are : ");
        }
        else
        {
            System.out.println("There are no duplicate arrray elements");
        }
                    for(int d=0;d<v;d++) {
                        if(d==(v-1)){
                            System.out.println("& "+arr2[d] + ".");
                        }
                        else if(d==(v-2)){
                            System.out.print(arr2[d]+" ");
                        }
                        else {
                            System.out.print(arr2[d] +",");
                        }
                    }
        }
    }
