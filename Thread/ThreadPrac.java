// public class Main extends Thread{
//     public static void main(String[] args) {
//         Main main=new Main();
//         main.start();
//         System.out.println("the code is outside of the thread");
//     }
//     public void run(){
//         System.out.println("The code is Running in a Thread");
//     }
// }

public class ThreadPrac implements Runnable{
    public static void main(String[] args) {
        ThreadPrac tp =new ThreadPrac();
        Thread thread=new Thread(tp);
        thread.start();
        System.out.println("The code is running outside of Thread");
    }
    public void run(){
        System.out.println("The code is running in a Thread");
    }

}