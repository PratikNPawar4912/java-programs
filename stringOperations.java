import java.util.Scanner;

public class stringOperations {
    String name;
    String characters="",remCharacters="",wordlis;
    String rev="";
    char f,rf;
    int i;
    public void operation(){
        System.out.print("Enter Your Name: ");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Hello "+ name);
    }
    public void counter(){
        int cnt=0;
        String alphabets;
        for(i=0;i<name.length();i++){
            cnt++;
            System.out.println(name.charAt(i) + " | "+i);

        }
        System.out.println("There are "+ cnt +" Alphabets in your name");
    }
    public void reve(){
        for(i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("Your Name is Very Special It A Pallindrome Name ");
        }
    else {
            System.out.println("Let Me Show You A Funny Side Of Your Name  " + rev);
        }
    }
 public void wordList(){
     System.out.println("Called");

        for(i=1;i>=5;i++){
           for(int y=i+1;y<=4;y++){

           }
           System.out.println(wordlis);
        }
 }
}
