package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first > second) {
            return first;
        } else if (second > first) {
            return second;
        } else {
            return first;
        }
    }
}
