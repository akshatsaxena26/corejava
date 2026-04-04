package objectOrienedProgramming;

class Course {
    static int maxCapacity;
    String courseName;
    int enrollments;

    {
        maxCapacity = 100;
    }

    String enrollStudents[] = new String[maxCapacity];

    void enrollStudents(String studentName) {
        this.enrollStudents[enrollments] = studentName;
        enrollments++;

    }

    void unenrollStudents(String studentName) {
        System.out.println("delete a student enrolllment");
        enrollments--;

    }

    public static void setMaxCapacity(int maxCapacity) {

        Course.maxCapacity = maxCapacity;

    }

}