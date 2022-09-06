package Day01.Reflect;

import ClassPackage.Person;

import java.lang.reflect.Field;

public class Reflect01 {
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class personClass = Person.class;
        //1. Field[] getFields()获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-------------------------");
        //获取成员变量a的值
        Field a = personClass.getField("a");
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        System.out.println("--------------------------");
        //设置a的值
        a.set(p, "张三");
        System.out.println(p);
        System.out.println("---------------------------");
        //Field[] getDeclaredFields():获取所有成员变量，不考虑修饰符
        Field[] fields1 = personClass.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        //忽略访问权限修饰符的安全检查
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);
        Object value2 = d.get(p);//暴力反射
        System.out.println(value2);
    }
}
