import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //  Класс, в котором будет показана работа и создание всех примитивов в Java
        int a = 1;
        String b = "2";
        byte c = 3;
        long d = 4L;
        char e = 5;
        float f = (float) 6.1;
        double g = 7.1;
        boolean h = true;

        // Пример полиформизма (как ArrayList, LinkedList и List)
        List list = new ArrayList();
        List list1 = new LinkedList();
        list.addAll(List.of(a,  b,  c,  d,  e,  f,  g, h));
        list.size();
        System.out.println(list);

        list1.addAll(List.copyOf(list));
        System.out.println(list1);
        list1.size();


        //  Пример upcast и downcast

        Person person = new Person(10);
        Person will = new Person("Will", "Fang"); //Upcast
        Person tom = new Person("Tom", "Trech");   //Upcast
        Person george = (Person) person;
        george.setName("George");               //Downcast
        george.setSurname("Javac");
        if (george instanceof Person) {
            george.sayHi();
            System.out.println(george);
        }

        tom.setAge(20);
        tom.sayHi();
//        tom.sayBye();
        will.setAge(22);
        will.sayHi();
//        will.sayBye();
        System.out.println("==========================");
        System.out.println(will);
        System.out.println(tom);

        //  Пример работы с переменными по значению и по ссылке.

        getNumber(a, b, c, d, e, f, g, h);
        System.out.println(
                "a:" + a + "\n" + "b:" + b + "\n" + "c:" + c + "\n" + "d:" + d + "\n" + "e:" + e + "\n" + "f:" + f + "\n" + "g:" + g + "\n" + "h:" + h + "\n"
        );

        //  Реализовать equals и hashcode
        System.out.println("------a == b------");
        equalsNum(1, 1);
        equalsNum(1, 2);
        System.out.println("-----a equals b-----");
        equalsObj(will, tom);
        equalsObj(person, george);
    }

    public static void equalsNum(int a, int b) {
        if (a == b) {
            System.out.println(a + " and " + b + " Are equals");
        } else {
            System.out.println(a + " and " + b + " Are not equals");
        }
    }

    public static void equalsObj(Object a, Object b) {
        if (a.equals(b)) {
            System.out.println(a.hashCode() + " equals " + b.hashCode());
        } else {
            System.out.println(a.hashCode() + " not equals " + b.hashCode());
        }
    }

    public static void getNumber(int a, String b, byte c, long d, char e, float f, double g, boolean h) {
        a++;
        b = b + "bb";
        c++;
        d = d * 2;
        e += 10;
        f = f += 2.4;
        g = g * 4;
        h = false;
        System.out.println(
                "a:" + a + "\n" + "b:" + b + "\n" + "c:" + c + "\n" + "d:" + d + "\n" + "e:" + e + "\n" + "f:" + f + "\n" + "g:" + g + "\n" + "h:" + h + "\n"
        );
    }
}
