package Day01.SimpleTestFramework;

public class Calculator {
    @Check
    public void add() {
        System.out.println("1 + 2 = " + (1 + 2));
    }
    @Check
    public void sub() {
        System.out.println("1 - 2 = " + (1 - 2));
    }
    @Check
    public void mul() {
        System.out.println("1 * 2 = " + (2 * 2));
    }
    @Check
    public void div() {
        System.out.println("1 / 2 = " + (1 / 0));
    }
}
