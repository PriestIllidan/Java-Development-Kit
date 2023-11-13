import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static void main(String[] args) {
        AtomicBoolean canEat = new AtomicBoolean(true); // true - может, false - не может


        Thread thread1 = new Thread(() -> {
            int count = 0;
            while (count != 3) {
                if (canEat.get() == true) {
                    canEat.set(false);
                    count++;
                    System.out.println("Первый философ ест " + count + " раз.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    canEat.set(true);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            int count = 0;
            while (count != 3) {
                if (canEat.get() == true) {
                    canEat.set(false);
                    count++;
                    System.out.println("Второй философ ест " + count + " раз.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    canEat.set(true);
                }
            }
        });
        Thread thread3 = new Thread(() -> {
            int count = 0;
            while (count != 3) {
                if (canEat.get() == true) {
                    canEat.set(false);
                    count++;
                    System.out.println("Третий философ ест " + count + " раз.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    canEat.set(true);
                }
            }
        });

        Thread thread4 = new Thread(() -> {
            int count = 0;
            while (count != 3) {
                if (canEat.get() == true) {
                    canEat.set(false);
                    count++;
                    System.out.println("Четвертый философ ест " + count + " раз.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    canEat.set(true);
                }
            }
        });
        Thread thread5 = new Thread(() -> {
            int count = 0;
            while (count != 3) {
                if (canEat.get() == true) {
                    canEat.set(false);
                    count++;
                    System.out.println("Пятый философ ест " + count + " раз.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    canEat.set(true);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}