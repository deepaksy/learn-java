package threads;

class Book implements Runnable{

    @Override
    public void run() {
        System.out.println("Books Thread is running.....");
        
    }
    
}
public class ThreadsExample2{
    public static void main(String[] args) {
        Book book = new Book();
        Thread t1=new Thread(book);
        t1.start();
    }
}
