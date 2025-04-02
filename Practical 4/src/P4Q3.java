public class P4Q3 {

    public static void main(String[] args) {
        Student2.setContributionQuiz(20.0);
        Student stud = new Student("24WM05935", "Trisha");

        stud.addQuiz(10);
        stud.addQuiz(9);
        stud.addQuiz(8);

       System.out.print("Name: ");
       System.out.println(stud.getStudentName());

       System.out.print("Total socre: ");
       System.out.println(stud.getTotalScore());

       System.out.print("Average: ");
         System.out.println(stud.getAverageScore());

         System.out.print("Total marks obtained from quiz: ");
         System.out.println(stud.getAverageScore() / 10 * Student2.getContributionQuiz());
    }
}
