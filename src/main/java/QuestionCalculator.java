public class QuestionCalculator {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;

        int y = (totalMarks - 5 * totalQuestions) / 5;
        int x = totalQuestions - y;

        System.out.println("5 marks question is " + x);
        System.out.println("10 marks question is " + y);
    }
}
