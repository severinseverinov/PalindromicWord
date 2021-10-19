import java.util.Scanner;

public class PalindromicWord {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word;
        boolean check;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a word : ");
        word=input.nextLine();

        check=isPalindrome(word);
        if(!check) {
            System.out.print(word+ " is not a palindromic word.");
        }
        else {
            System.out.print(word+ " is a palindromic word.");
        }


    }
}
