public class Person {

    Person person;
    String name;
    int age;

    public Person getPerson(){
        if(person == null){
            person = new Person(getName(), getAge());
        }
        return person;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
