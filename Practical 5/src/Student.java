public class Student {
    String studID;
    String name;
    String school;

    public Student(String studID, String name, String school) {
        this.studID = studID;
        this.name = name;
        this.school = school;
    }

    public static boolean validateStudID(Student s) {
        String id = s.studID;
        char schoolCode = Character.toUpperCase(id.charAt(0));
        String regNo = id.substring(1, id.length());
        if (!Character.isLetter(schoolCode) || regNo.length() != 5)
            return false;
        else {
            for (int i = 0; i < regNo.length(); i++) {
                if (!Character.isDigit(regNo.charAt(i)))
                    return false;

            }
        }
        boolean valid = true;
        switch (schoolCode) {
            case 'A':
                valid = s.school.equals("FASC");
                break;
            case 'B':
                valid = s.school.equals("FAFB");
                break;
        }
        return valid;
    }

}
