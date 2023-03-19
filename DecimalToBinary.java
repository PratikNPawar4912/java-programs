public class DecimalToBinary {
    int num=10,sqr=0,rem,i=1;
    int arry[]=new int[10];
    public void convertor(){
        sqr=num/2;
        rem=num%2;
        arry[0]=rem;
        while(sqr>0){
            rem=sqr%2;
            arry[i]=rem;
            sqr=sqr/2;
            i++;
        }
        System.out.print("The Binarry Code For "+ num +" Is :" );
        for(int y=i-1;y>=0;y--){
            System.out.print(arry[y]);
        }
    }

}
