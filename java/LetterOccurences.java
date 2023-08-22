import java.util.Scanner;

public class LetterOccurences {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string:");
        String str =sc.nextLine();

        System.out.println("Enter the target letter to count");
        char t=sc.nextLine().charAt(0);

        int count=CountOccurences(str,t);
        System.out.println("The letter '" + t + "' appears " + count + " times in the string.");
        sc.close();
    }
    public static int CountOccurences(String str,char t){
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==t)
            count++;
        }
        return count;
    }
    
}
