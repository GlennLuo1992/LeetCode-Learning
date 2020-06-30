package practise2020;

public class _4_monkeyEatApple {
    public static void main(String[] args) {
        int leftApple = 1;
        int day = 9;
        System.out.println(1);
        eat(day, leftApple);
    }

    private static void eat(int day, int leftApple) {
        if (day < 1) {
            return;
        }
        leftApple = (leftApple + 1) * 2;
        System.out.println(leftApple);
        eat(day - 1, leftApple);
    }
}
