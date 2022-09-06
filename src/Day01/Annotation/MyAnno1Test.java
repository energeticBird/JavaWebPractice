package Day01.Annotation;

import ClassPackage.Person;

import java.lang.reflect.Constructor;

@MyAnno1(className = "ClassPackage.Person", methodName = "eat")
public class MyAnno1Test {
    public static void main(String[] args) throws Exception{
        //获取class对象（字节码文件）
        Class<MyAnno1Test> myAnno1TestClass = MyAnno1Test.class;
        Class<Person> personClass = Person.class;

        //创建无参对象
        Person person = personClass.getConstructor().newInstance();
        //创建有参对象
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Person person1 = constructor.newInstance("张三", 12);
        //解析注解
        MyAnno1 an = myAnno1TestClass.getAnnotation(MyAnno1.class);
        //调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();

        person.eat();
        System.out.println(person1);
        System.out.println(className);
        System.out.println(methodName);
    }
}
