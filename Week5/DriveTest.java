import java.util.Scanner;

public class DriveTest {
    public static String result (int totalScore, int failingSentences){
        if(totalScore < 0 || totalScore >25 || failingSentences <0 || failingSentences >5){
            return "Invalid data";
        } else if (totalScore >= 21 && failingSentences == 0) {
            return "Passed!";
        } else {
            return "failed";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;
        int failingSentences = 0;
        while (true){
            System.out.println("Please enter...");
            System.out.println("totalScore :");
            totalScore = sc.nextInt();
            System.out.println("failingSentences :");
            failingSentences = sc.nextInt();
            System.out.println(result(totalScore, failingSentences));
        }

    }
}
