public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tom", 20);
        System.out.println(person.getPerson());
        System.out.println(person.getPerson());
        System.out.println(person.getPerson());
        System.out.println(person.getPerson());
        System.out.println(person.getPerson());
        // Нет toString для просмотра ссылок
    }
}
