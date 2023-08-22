import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Main {

//    abstract static class TestNode {
//        public TestNode prev;
//    }
//
//    private static volatile TestNode head;

    public static void main(String[] args) throws IOException {

        System.out.println(MutiThread.GetBinaryExpression(1.1));
        System.out.println(MutiThread.GetBinaryExpression(1.234242323));

//        ！！！type... 编译器会处理成type[]数组
//        int res = MutiThread.max(1, 2,3,4);
////        System.out.println(res);
//        byte[] input = new byte[4];
//
//        System.in.read(input);
//
//        int res = Integer.parseInt(new String(input).trim());
//        System.out.println(res);
////        switch 语句必须在每个case之后添加break；否则，命中第一个case条件之后，剩余所有的条件都会被执行
//        switch(res) {
//            case 1:
//                System.out.println("1");
////                break;
//            case 2:
//                System.out.println("2");
////                break;
//            default:
//                System.out.println("default");
////                break;
//        }
//        int[] testList = new int[100];
//        Class<?> classRes = testList.getClass();
//        System.out.println(classRes);

//        boolean first = false;
//        TestNode pred = null, node = null;                // predecessor of node when enqueued
//
//        System.out.println(head);
        // 看了遍编译之后的javac，发现if条件是一个一个执行的，对于全&运算，一个不满足，后面不会执行
//        System.out.println(!first && (pred = (node == null) ? null : node.prev) != null && !(first = (head == pred)));
//        if (first = (head == pred)) {
//            System.out.println(first);
//        }
//        System.out.println(head == pred);
//        System.out.println(first);
//        System.out.println(pred);
//        System.out.println(node);

//        Thread threadA =  new Thread(() -> {
//            try {
//                synchronized (resourceA) {
//                    System.out.println("threadA get resourceA lock");
//                    synchronized (resourceB) {
//                        System.out.println("threadA get resourceB lock");
//                        System.out.println("threadA release resourceA lock");
//                        resourceA.wait();
//                    }
//                }
//            } catch(InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread threadB =  new Thread(() -> {
//            try {
//                Thread.sleep(1000);
//                synchronized (resourceA) {
//                    System.out.println("threadB get resourceA lock");
//                    System.out.println("threadB try get resourceB lock");
//                    synchronized (resourceB) {
//                        System.out.println("threadB get resourceB lock");
//                        System.out.println("threadB release resourceA lock");
//                        resourceA.wait();
//                    }
//                }
//            } catch(InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        threadA.start();
//        threadB.start();
//
//        threadA.join();
//        threadB.join();
//
//        System.out.println("main over");


//        FutureTask<String> tasks = new FutureTask<>(new MutiThread());
//
//        new Thread(tasks).start();
//
//        try {
//            String result = tasks.get();
//            System.out.println(result);
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }
}