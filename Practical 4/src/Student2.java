public class Student2 {
    private String Student_ID;
    private String Student_Name;
    private int numOfQuiz;
    private double totalScore;
    private static double contributionQuiz;

    public Student2() {
        this("", "");
    }

    public Student2(String student_ID, String student_Name) {
        this.Student_ID = student_ID;
        this.Student_Name = student_Name;
        numOfQuiz = 0;
        totalScore = 0;
    }

    public String getStudentID() {
        return Student_ID;
    }

    public String getStudentName() {
        return Student_Name;
    }

    public int getNumOfQuiz() {
        return numOfQuiz;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public static double getContributionQuiz() {
        return contributionQuiz;
    }

    public void setStudentID(String student_ID) {
        this.Student_ID = student_ID;
    }

    public void setStudentName(String student_Name) {
        this.Student_Name = student_Name;
    }

    public void addQuiz(int score) {
        totalScore += score;
        numOfQuiz++;
    }

    public double getAverageScore() {
        return totalScore / numOfQuiz;
    }

    public static void setContributionQuiz(double Quizcontribution) {
        Student2.contributionQuiz = Quizcontribution;
    }
}