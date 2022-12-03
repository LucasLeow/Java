import java.util.Scanner;
public class askQuestion {
    public static void main(String[] args) {
        System.out.println("Who is the first elected President of Singapore?");
        System.out.println("A : Yusof Bin Ishak");
        System.out.println("B : SR Nathan");
        System.out.println("C : Ong Teng Cheong");
        Scanner input = new Scanner(System.in);
        char userInput = input.next().charAt(0);
        while (userInput != 'C') {
            System.out.println("Incorrect, Please try again");
            System.out.println("Who is the first elected President of Singapore?");
            userInput = input.next().charAt(0);
        }
        System.out.println("Correct! Ong Teng Cheong was the first elected president in 1993");
    }
}
