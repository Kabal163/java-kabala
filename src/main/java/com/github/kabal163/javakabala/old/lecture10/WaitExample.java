package com.github.kabal163.javakabala.old.lecture10;

/**
 * wait() - заставляет поток уснуть. Метод бросает InterruptedException
 * в случае, если поток был прерван.
 * notifyAll() - пробуждает все потоки, которые уснули по тому же самому
 * монитору.
 *
 * @see "https://metanit.com/java/tutorial/8.5.php"
 */
public class WaitExample {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
       new WaitExample().doExecute();
    }

    private void doExecute() throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                count++;
            }
            synchronized (this) {
                notifyAll();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        synchronized (this) {
            wait();
        }

        System.out.println(count);
    }
}
