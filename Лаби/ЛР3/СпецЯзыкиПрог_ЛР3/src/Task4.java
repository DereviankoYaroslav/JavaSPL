public class Task4 {
    public static void main(String[] args) {

        Student students[] = new Student[4];

        students[0] = new Student();
        students[1] = new Student("Петро", 20, "ФКН", 4, "Кібербезпека");
        students[2] = new Student("ФКН", 3, "Комп'ютерна інженерія");
        students[3] = new Student("ФКН", 1, "Комп'ютерні науки");

        for (Student s : students) {
            System.out.println("Ім'я: " + s.getName());
            System.out.println("Вік: " + s.getAge());
            System.out.println("Факультет: " + s.getFaculty());
            System.out.println("Курс: " + s.getCourse());
            System.out.println("Спеціальність: " + s.getSpecialty());
            System.out.println();
        }
    }
}

class Student {
    private String name;
    private int age;
    private String faculty;
    private int course;
    private String specialty;

    //конструктор за замовчуванням
    public Student() {
    }

    //конструктор з заданими параметрами
    public Student(String name, int age, String faculty, int course, String specialty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.course = course;
        this.specialty = specialty;
    }

    //створення копії іншого об'єкта
    public Student(String faculty, int course, String specialty) {
        this("Іван", 20, faculty, course, specialty);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getSpecialty() {
        return specialty;
    }
}