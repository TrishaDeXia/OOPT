public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames;
    private static int courseCount = 0; 

    public Course(String courseTitle, double feesPerStudent) {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        this.noOfStudents = 0;
        this.studentNames = new String[100]; 
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public static int getCourseCount() { 
        return courseCount;
    }

   
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public void addStudent(String StudentName) {
            studentNames[noOfStudents] = StudentName;
            noOfStudents++;
        }

    public double calcFeesCollected() {
        return feesPerStudent * noOfStudents;
    }

    public void displayInfo() {
        System.out.println("Course Title: " + courseTitle + "\nFees per student: " + feesPerStudent + "\nNumber of students: " + noOfStudents + "\nFees collected: " + calcFeesCollected());
    }
}
