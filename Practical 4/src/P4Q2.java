public class P4Q2 {

    public static void main(String[] args) {
        Student stud1 = new Student("24WM05935", "Trisha");

        stud1.addQuiz(10);
        stud1.addQuiz(9);
        stud1.addQuiz(8);

        System.out.println("Student ID: " + stud1.getStudentID());
        System.out.println("Student Name: " + stud1.getStudentName());
        System.out.println("Number of Quiz: " + stud1.getNumOfQuiz());
        System.out.println("Total Score: " + stud1.getTotalScore());
        System.out.println("Average Score: " + stud1.getAverageScore());
    }
}