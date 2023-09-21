import java.util.Scanner;

public class QUIZ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String[] questions = new String[] {
            "What is the capital of Maharastra?",
            "What is the Language of India?",
            "What is the name of the Indian Flag?"
        };

        String[] answers = new String[] {
            "Mumbai",
            "Hindi",
            "Tiranga"
        };

        int timeLimit = 10;
        int remainingTime = timeLimit;
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            String answer = scanner.next();

            if (answer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }

            remainingTime--;

            if (remainingTime == 0) {
                System.out.println("Time's up!");
                break;
            }
        }

        
        System.out.println("Your score is " + score);
    }
}