public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void printInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + ", Office Number: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTextbookTitle() + " by " + textbook.getTextbookAuthor() + ". Publisher: " + textbook.getTextbookPublisher());
    }

}
