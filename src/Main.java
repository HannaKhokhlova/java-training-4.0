public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Anna");
        student1.setRating(3);
        Student student2 = new Student("Andrii");
        student2.setRating(4);
        Student student3 = new Student("Olga", 2);

        System.out.println("Avg rating is " + Student.getAvgRating());

        student3.changeRating(5);

        System.out.println("New avg rating is " + Student.getAvgRating());
    }
}
