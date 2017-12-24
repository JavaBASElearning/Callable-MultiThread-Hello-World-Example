import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallTest {
public int res;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		SumTask sumTask = new SumTask(2);
	//	FutureTask<Integer> task = new FutureTask(sumTask);
		
		Future<Integer> task = executor.submit(sumTask);
		
	//	Thread t = new Thread(task);
	//	t.start();
		
		Integer result = task.get();
		System.out.println(result);

	}

}

class SumTask implements Callable<Integer> {
	
	private int num = 0;
	public SumTask(int num){
	        this.num = num;
    }
	
	@Override
	public Integer call() throws Exception {
		
		int result = 0;
		//for(int i=1;i<=num;i++){
			result = num*2;
		//}
		return result;
	
	}
}