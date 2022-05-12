import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    public Integer count = 0;

    @Override
    public Integer call() throws Exception {
            try {
                while (count < 5) {
                System.out.println("Я поток " + Thread.currentThread().getName() + "!");
                count++;
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {}
        return count;
    }
}