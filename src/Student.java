public class Student {
    String first;
    String last;
    int gradYear;
    double gpa;
    String major;

    public Student(String first, String last, int grad, double gpa,
                   String major) {
        this.first = first;
        this.last = last;
        this.gradYear = grad;
        this.gpa = gpa;
        this.major = major;
    }

    public int performance() {
        if (this.gpa > 3) {
            return this.gradYear;
        }
        return this.gradYear+1;
    }
}
