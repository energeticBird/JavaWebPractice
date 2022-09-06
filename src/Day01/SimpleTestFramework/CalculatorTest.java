package Day01.SimpleTestFramework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

@SuppressWarnings("all")
public class CalculatorTest {
    public static void main(String[] args) throws Exception {
        Class<Calculator> calculatorClass = Calculator.class;
        Calculator calculator = calculatorClass.getConstructor().newInstance();
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Day01\\SimpleTestFramework\\bug.txt"));
        Method[] methods = calculatorClass.getMethods();
        int number = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                   number++;
                   bw.write(method.getName() + "方法出异常了");
                   bw.newLine();
                   bw.write("异常名称：" + e.getCause().getClass().getSimpleName());
                   bw.newLine();
                   bw.write("异常原因：" + e.getCause().getMessage());
                   bw.newLine();
                   bw.write("-------------------------");
                   bw.newLine();
                }
            }
        }
        bw.write("本次测试出现" + number + "次异常");
        bw.flush();
        bw.close();
    }
}
