public class Main {
    public static void main(String args[]){
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Pearson");

        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        course1.printInfo();

        Instructor instructor2 = new Instructor("Malik", "Nasla", "3-1000");
        Textbook textbook2 = new Textbook("Computer Science", "Nima Davarpanah", "CPP");

        Course course2 = new Course("School Class", instructor2, textbook2);
        System.out.println();
        course2.printInfo();
    }
}
