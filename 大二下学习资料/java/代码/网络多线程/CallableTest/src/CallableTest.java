import java.util.concurrent.*;

public class CallableTest {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		
		//����һ���̳߳� 
		ExecutorService pool = Executors.newFixedThreadPool(2); 
		
		//���������з���ֵ������ 
		Callable c1 = new MyCallable("A"); 
		Callable c2 = new MyCallable("B"); 
		
		//ִ�����񲢻�ȡFuture���� 
		Future f1 = pool.submit(c1);
		Future f2 = pool.submit(c2); 
		
		//��Future�����ϻ�ȡ����ķ���ֵ�������������̨ 
		System.out.println(">>>"+f1.get().toString());
		System.out.println(">>>"+f2.get().toString());
		//�ر��̳߳�
		pool.shutdown();
		} 
}

class MyCallable implements Callable<String>{ 
    private String oid; 

    MyCallable(String oid) { 
            this.oid = oid;
    } 

    @Override 
    public String call() throws Exception {
            return oid+"���񷵻ص�����";

    } 
}

