package threads;

class ThreadDemo extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running.....");
    }


}
public class ThreadExample1 {
    public static void main(String[] args) {
        ThreadDemo td=new ThreadDemo();
        td.start();
    }
}
