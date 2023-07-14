package java0608_;

public class StaticExercis02 {
}
    class Person {
        private int id;
        private static int total = 0;

        public static int getTotalPerson() {
            //id++;
            return total;
        }

        public Person() {
            total++;
            id = total;
        }
    }

     class TestPerson {
        public static void main(String[] args) {
            System.out.println("Number of total is" + Person.getTotalPerson());
            Person p1 = new Person();
            System.out.println("Number of total is" + Person.getTotalPerson());

        }

}

