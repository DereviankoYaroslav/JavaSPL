public class Task3 {
    public static void main(String[] args) {
        Schoolboy schoolboy = new Schoolboy();
        schoolboy.surname = "Іванов";
        System.out.println(schoolboy.surname);

        //schoolboy.name = "Іван";
    }
}

class Schoolboy {
    private String name;
    public String surname;

}