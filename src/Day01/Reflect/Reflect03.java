package Day01.Reflect;

import ClassPackage.Person;

import java.lang.reflect.Method;

public class Reflect03 {
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        //执行方法
        eat_method.invoke(person);
        //获取有参数的方法
        Method eat_method2 = personClass.getMethod("eat", String.class);
        eat_method2.invoke(person, "apple");
        //person.eat("banana");
        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }


}
