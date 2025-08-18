import java.util.Scanner;

public class Practice{
public static void main (String[] args) throws java.lang.Exception
{
		// your code goes here
        System.out.print("Enter the string: ");
		Scanner read=new Scanner(System.in);
		String word=read.nextLine();
		System.out.println(word);
		String rev="";
		for(int i=word.length()-1;i>=0;i--){
		    rev=rev+word.charAt(i);
		}
	System.out.println(rev);
	if(word.equals(rev)){
	    System.out.println("The string is Palindrom "+rev);
	}else{
	    System.out.println("The string is not a Palindrom "+rev);
	}
}
}
