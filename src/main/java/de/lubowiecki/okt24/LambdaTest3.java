package de.lubowiecki.okt24;

public class LambdaTest3 {

    public static void main(String[] args) {

        // T exec(T element1, T element2);
        Operation<Double> doubleOperation = (a, b) -> a % b;
        runDoubleOperation(doubleOperation, 10, 15);

    }

    private static void runDoubleOperation(Operation<Double> op, double a, double b) {
        System.out.println(op.exec(a, b));
    }
}

interface Operation<T> {

    T exec(T element1, T element2);

}
