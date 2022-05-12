import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Callable<Integer>> list = Arrays.asList(new MyCallable(), new MyCallable(), new MyCallable(), new MyCallable());
        try {
             executorService.invokeAll(list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(executorService.invokeAny(list));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}