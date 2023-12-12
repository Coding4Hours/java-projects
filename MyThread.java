package uki2;

public class MyThread {

	
	public static void main(String[] args) {
		//this is running in java stack
		//way 1
	    Thread t = new Thread(()->{System.out.println(" Thread Running...");
	     
	    });
	    t.start();
	   
	    System.out.println("Thread Started");
	    
	    //way 2
	    new Thread(()->{System.out.println(" Thread Running...");
	     
	    }).start();
	   
	    System.out.println("Thread Started");
	}

}
