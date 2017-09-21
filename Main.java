import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Sally", "markentash", 1, 1));
        students.add(new Student("frank", "markentash", 2, 1));
        students.add(new Student("john", "markentash", 3, 1));
        students.add(new Student("kelly", "markentash", 4, 1));
        students.add(new Student("Beckah", "markentash", 5, 1));
        students.add(new Student("Gloria", "markentash", 6, 1));
        students.add(new Student("Jeanne", "markentash", 7, 1));
        students.add(new Student("Kenna", "markentash", 8, 1));
        students.add(new Student("Matt", "markentash", 9, 1));
        students.add(new Student("Rachel", "Markentosh", 10, 1));
        students.add(new Student("Melanie", "Markentosh", 11, 1));
        students.add(new Student("Samantha", "Markentosh", 12, 1));
        students.add(new Student("Thommy", "markentosh", 13, 1));
        students.add(new Student("Josh", "markentosh", 14, 1));
        students.add(new Student("potato", "markentosh", 15, 1));

        List<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("becky", "yelverton", 1, 1));
        teachers.add(new Teacher("Krystin", "Larsen", 2, 1));
        teachers.add(new Teacher("Carol", "Metcalf", 3, 1));


        //this part will retrieve each teacher add as key and their value pairs
        Map<Teacher, Set<Student>> teachersMap = new HashMap<>();
        for (int i = 0; i < teachers.size(); i++) {
            teachersMap.put(teachers.get(i), createNewClassRoom(students));
        }

//        for (Teacher t : teachersMap.keySet()) {
//            System.out.println("this is the key of teachers:" + t.getFirstName());
//       }

        for (Map.Entry<Teacher, Set<Student>> entry : teachersMap.entrySet()) {
            System.out.println("Teacher = " + entry.getKey().getFirstName() + ", Students in their class ...");

            for (Student s : entry.getValue()){
                System.out.println(s.getFirstName());
            }
        }

    }

    private static Set<Student> createNewClassRoom(List<Student> students) {

        Set<Student> studentSet = new HashSet<>();   //creates a set
        Random random = new Random();                 //establishes random method to select students at random
        while (studentSet.size() < 5) {               //while loop grabs students
            int index = random.nextInt(students.size());
            studentSet.add((Student) students.toArray()[index]);
        }
        return studentSet;
    }


}