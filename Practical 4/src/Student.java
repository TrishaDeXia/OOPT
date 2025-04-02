public class Student {
    private String Student_ID;
    private String Student_Name;
    private int numOfQuiz;
    private double totalScore;

    public Student() {
        Student_ID = "";
        Student_Name = "";
        numOfQuiz = 0;
        totalScore = 0;
    }

    public Student(String studentID, String studentName) {
        Student_ID = studentID;
        Student_Name = studentName;
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

    public void setStudentID(String studentID) {
        Student_ID = studentID;
    }

    public void setStudentName(String studentName) {
        Student_Name = studentName;
    }

    public void addQuiz(int score) {
        totalScore += score;
        numOfQuiz++;
    }

    public double getAverageScore() {
        return totalScore / numOfQuiz;
    }
}