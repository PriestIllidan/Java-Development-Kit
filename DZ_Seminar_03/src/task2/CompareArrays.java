package task2;

public class CompareArrays {
    public <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].equals(array2[i])) {
                    return true;
                } else return false;
            }
        }
        return false;
    }
}
