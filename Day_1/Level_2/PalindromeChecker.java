import java.util.*;
public class PalindromeChecker {
    String text;
    public PalindromeChecker(String text){
        this.text=text;
    }
    public boolean isPalindrome(){
        String reverse="";
        for(int i=text.length()-1;i>=0;i--){
            reverse+=text.charAt(i);
        }
        if(reverse.equals(text)){
            return true;
        }
        else{
            return false;
        }

    }
    public void display(){
        if(isPalindrome()){
            System.out.println(text+" is a palindrome");
        }
        else{
            System.out.println(text+" is not a palindrome"); 
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the text: ");
        String text=sc.nextLine();
        PalindromeChecker pc=new PalindromeChecker(text);
        pc.display();
    }

}
