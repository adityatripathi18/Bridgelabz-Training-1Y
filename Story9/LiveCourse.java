// LiveCourse — 5% discount on base price
public class LiveCourse extends Course {

    private static final double DISCOUNT_RATE = 0.05;
    private String schedule;    // e.g. "Mon/Wed/Fri 7:00 PM"

    public LiveCourse(int courseId, String courseName, double price,
                       String instructor, String schedule) {
        super(courseId, courseName, price, instructor);
        this.schedule = schedule;
    }

    // Override: apply 5% discount
    @Override
    public double calculatePrice() {
        return price - (price * DISCOUNT_RATE);
    }

    @Override
    public void displayCourse() {
        System.out.println("Type        : Live Course (5% Discount)");
        super.displayCourse();
        System.out.println("Schedule    : " + schedule);
    }
}
