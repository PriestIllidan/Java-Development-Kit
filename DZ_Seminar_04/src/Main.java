import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person(1, "111", "Alex", 20),
                new Person(2, "101", "Maxim", 10),
                new Person(3, "110", "Margarita", 2),
                new Person(4, "200", "Si", 0),
                new Person(5, "105", "Semen", 25),
                new Person(6, "200", "Semen", 0)
        ));
        List<Person> personList1 = findExperience(people, 0);
        for (int i = 0; i < personList1.size(); i++) {
            System.out.println(personList1.get(i));
        }
        System.out.println("----------первый метод----------");
        List<Person> personList2 = findName(people, "Semen");
        for (int i = 0; i < personList2.size(); i++) {
            System.out.println(personList2.get(i));
        }
        System.out.println("----------второй метод----------");

        System.out.println(findId(people, 2));
        System.out.println("----------третий метод----------");

        addPerson(people, new Person(7, "888", "Lev", 0));
        System.out.println(people.get(people.size() - 1));
        System.out.println("----------четвертый метод----------");


    }

    // 1 метод: Добавить метод, который ищет сотрудника по стажу (может быть список)
    public static List<Person> findExperience(List<Person> people, int experience) {
        List<Person> personList = new ArrayList<>();
        for (Person person : people) {
            if (person.getExperience() == experience) {
                personList.add(person);
            }

        }
        return personList;
    }

    // 2 метод: Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    public static List<Person> findName(List<Person> people, String name) {
        List<Person> personList = new ArrayList<>();
        for (Person person : people) {
            if (person.getName().equals(name)) {
                personList.add(person);
            }

        }
        return personList;
    }

    // 3 метод: Добавить метод, который ищет сотрудника по табельному номеру
    public static Person findId(List<Person> people, int id) {
        for (Person person : people) {
            if (person.getPersonId() == id) {
                return person;
            }

        }
        return null;
    }

    // 3 метод: Добавить метод добавление нового сотрудника в справочник сотрудников
    public static List<Person> addPerson(List<Person> people, Person person) {
        List<Person> personList = new ArrayList<>();
        for (Person p : people) {
            if (p.getPersonId() == person.getPersonId()) {
                return people;
            }
        }
        people.add(person);
        return people;

    }

}
