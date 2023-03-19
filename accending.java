import java.util.Scanner;

public class accending {
    public static void main(String args[]) {
        digit digiObj=new digit();
        int array[] = new int[5];
        int z=0;
        Scanner sc = new Scanner(System.in);
        for (int y = 0; y < 5; y++) {
            array[y] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++)
        {
            for( z=i+1;z<5;z++)
            {
                if(array[i]>array[z])
                {
                    int c=array[i];
                    array[i]=array[z];
                    array[z]=c;
                }

            }
            
            System.out.print(array[i]+"   ");
        }
    }
}

