// Base class for the Online Learning Platform
public class Course {

    // Static variable shared across all courses
    public static String platformName = "LearnSphere";

    protected int courseId;
    protected String courseName;   // stored in Title Case
    protected double price;
    protected String instructor;

    public Course(int courseId, String courseName, double price, String instructor) {
        this.courseId   = courseId;
        this.courseName = toTitleCase(courseName);   // auto-convert to Title Case
        this.price      = price;
        this.instructor = instructor;
    }

    // Utility: converts any string to Title Case
    public static String toTitleCase(String input) {
        if (input == null || input.isEmpty()) return input;
        String[] words  = input.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1))
              .append(" ");
        }
        return sb.toString().trim();
    }

    // Base: no discount
    public double calculatePrice() {
        return price;
    }

    public void displayCourse() {
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Instructor  : " + instructor);
        System.out.printf ("Price       : ₹%.2f%n", calculatePrice());
    }
}
