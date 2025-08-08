public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Alice", 20, "BSIT", 85, 90, 88);
        Student s2 = new Student("Bob", 21, "BSCS", 65, 70, 60);
        Student s3 = new Student("Charlie", 19, "BSIS", 50, 55, 58);

        Student[] list = {s1, s2, s3};

        int passCount = 0;

        for (Student s : list) {
            s.showInfo();
            double avg = s.getAverage();
            String grade = s.getGrade();
            boolean pass = s.isPass();

            System.out.printf("Average: %.2f\n", avg);
            System.out.println("Grade: " + grade);
            System.out.println("Status: " + (pass ? "PASSING" : "FAILING"));
            System.out.println("-----------------------------");

            if (pass) {
                passCount++;
            }
        }

        System.out.println("Number of students who passed: " + passCount);
    }
}
