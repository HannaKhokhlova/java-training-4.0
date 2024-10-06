public class Student {
    int rating;
    private String name;
    private static int studentCount = 0;
    private static int sumOfRatings = 0;

    // TODO implement Student class according to the instructions provided in the README.md file

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
        // TODO return average rating of all students
        if (studentCount > 0) {
            return (double) sumOfRatings / studentCount;
        }
        return 0;
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
        // TODO return the result of comparing this.student's rating with the student's rating
        return this.rating > student.rating;
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average rating of all students
        sumOfRatings = sumOfRatings - this.rating + rating;
        this.rating = rating;
    }

    public static void removeStudent(Student student) {
        Student.studentCount--;
        Student.sumOfRatings -= student.rating;
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "Stubent's name is " + name + ", rating is " + rating;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Anna");
        student1.setRating(5);
        Student student2 = new Student("Andrii");
        student2.setRating(4);
        Student student3 = new Student("Olga",  3);
        System.out.println(sumOfRatings);
        System.out.println(studentCount);
        System.out.println(Student.getAvgRating());
        student3.changeRating(5);
        System.out.println("New avg rating is " + Student.getAvgRating());
    }
}