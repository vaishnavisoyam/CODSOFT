
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {
    private static final int QUIZ_DURATION_SECONDS = 30 ; 
    private static int score = 0;
    static Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        Timer timer = new Timer();

        System.out.println("Welcome to the Quiz Application!");
        System.out.println("You have " + QUIZ_DURATION_SECONDS + " seconds to answer the questions.");
    
    
        TimerTask timerTask = new TimerTask() {
        
            int remainingSeconds = QUIZ_DURATION_SECONDS;

         @Override
            public void run() 
            {
                if (remainingSeconds > 0) {
                    System.out.println("Time remaining: " + remainingSeconds + " seconds");
                    remainingSeconds--;
                } else {
                    endQuiz();
                    cancel(); // Stop the timer
                }
            }
        };

        // Schedule the timer task
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);

        // Quiz questions
        askQuestion("Which continent is the most populous?", "A) Asia", "B) Africa", "C) Europe", "D) North America", "A");
        askQuestion("Which planet is known as the Red Planet?", "A) Venus", "B) Mars", "C) Jupiter", "D) Saturn", "B");
    


        // End the quiz after all questions are asked
        endQuiz();
    }

    private static void askQuestion(String question, String optionA, String optionB, String optionC, String optionD, String correctAnswer) {
        System.out.println("\n" + question);
        System.out.println(optionA);
        System.out.println(optionB);
        System.out.println(optionC);
        System.out.println(optionD);

        System.out.print("Your answer: ");
        String userAnswer = scanner.next();

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer);
        }
    }

    private static void endQuiz() {
        System.out.println("\nQuiz ended!");
        System.out.println("Your score: " + score);
        System.exit(0);    
        
    }
}