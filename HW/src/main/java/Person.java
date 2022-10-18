public class Person implements Actions {
    int age;
    String name;
    String surname;

    // Перегрузка и переопределение методов.
    public Person(int age) {
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public void sayHi() {
        System.out.println("Hi! my name is: " + getName() + " " + getSurname() + " and I'm " + getAge() + " yo");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye! whatever your name is... ");
    }
}
