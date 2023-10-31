import task1.Calculator;
import task2.CompareArrays;
import task3.Pair;

public class Main {
    public static void main(String[] args) {
        // task1
        int num1 = 3;
        double num2 = 0.2;
        System.out.println(Calculator.sum(num1, num2));
        System.out.println(Calculator.subtract(num1, num2));
        System.out.println(Calculator.multiply(num1, num2));
        System.out.println(Calculator.divide(num1, num2));
        System.out.println("______________task1_______________");
        // task2
        Integer [] arrray1 = {1,2,3,4,5};
        Integer [] arrray2 = {1,2,3,4,5};
        Integer [] arrray3 = {5,4,3,2,1};
        Integer [] arrray4 = {};
        CompareArrays compare = new CompareArrays();
        System.out.println(compare.compareArrays(arrray1, arrray2));
        System.out.println(compare.compareArrays(arrray1, arrray3));
        System.out.println(compare.compareArrays(arrray1, arrray4));
        System.out.println("______________task2_______________");
        //task3
        Pair<Integer, String> pair = new Pair<>(5, "Alex");
        System.out.println(pair.getFirts());
        System.out.println(pair.getSecond());
        System.out.println(pair);
        System.out.println("______________task3_______________");



    }
}