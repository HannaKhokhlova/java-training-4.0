public class Student {
    private int rating;
    private String name;
    private static int studentCount = 0;
    private static int sumOfRatings = 0;

    public Student() { studentCount++; }

    public Student(String name) {
        this.name = name;
        studentCount++;
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        studentCount++;
        sumOfRatings += this.rating;
    }

    public static double getAvgRating() {
        if (studentCount != 0) {
            return (double) sumOfRatings / studentCount;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        sumOfRatings += this.rating;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    public void changeRating(int rating) {
        sumOfRatings += (rating - this.rating);
        this.rating = rating;
    }

    public static void removeStudent(Student student) {
        Student.studentCount--;
        Student.sumOfRatings -= student.rating;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", rating: " + rating;
    }
}