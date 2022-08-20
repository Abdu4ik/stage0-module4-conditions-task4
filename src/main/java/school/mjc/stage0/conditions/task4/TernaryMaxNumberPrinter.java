package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        int max= first;

        max = (max<second)? second : (first<third)? third : first ;

    }
}
