import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your text here: ");
        String words = scanner.nextLine();
        int countWords = words.split("\\s").length;
        if(countWords < randomNum){
            System.out.println("try again");
        }
        else {
            System.out.println("Number of words is: " + countWords + " word(s)");
        }


    }
}