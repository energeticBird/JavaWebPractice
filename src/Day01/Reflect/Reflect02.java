package Day01.Reflect;

import ClassPackage.Person;

import java.lang.reflect.Constructor;

public class Reflect02 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Object p = constructor.newInstance("张三", 20);
        System.out.println(p);
        System.out.println("------------------------------");
        //无参构造
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        Person person = constructor1.newInstance();
        System.out.println(person);
        System.out.println("-------------------------------");

        //无参构造简化
        Person person1 = personClass.newInstance();
        System.out.println(person1);

    }
}
