import java.util.Random;

class MyThread extends Thread{
	private int sleepTime;
	private static Random generator=new Random();
	public MyThread(String n){
		super(n);
		} //n���߳�����
    public void run(){
	    for(int i=0;i<5;i++){
  	 	    // ˯��һ�����ʱ��
  	 	    try{
  	 	    	sleepTime=generator.nextInt(1000);
  	 	    	Thread.sleep(sleepTime);
  	 	    }catch (InterruptedException e) 
                     {e.printStackTrace();	}        
		    //��ʾ���߳�����
		    System.out.print(getName()+"    "); 	
	    }  
	}
}

public class MultiThreadExample{
	public static void main(String []args){
		new MyThread("A").start(); //�����߳�A
		new MyThread("B").start(); //�����߳�B	
	}
}

