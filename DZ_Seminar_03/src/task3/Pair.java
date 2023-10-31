package task3;

public class Pair<T, K> {
    //    3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
//Класс должен иметь методы getFirst(), getSecond() для получения значений пары, а также переопределение метода toString(),
//возвращающее строковое представление пары.
    private T first;
    private K second;

    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirts() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return first.toString() + " " + second.toString();
    }
}