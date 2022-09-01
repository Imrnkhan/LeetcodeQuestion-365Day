package Collection_Map_Day12;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue_ex implements Comparable<Priority_Queue_ex> {
    // this side is you using the comparable than ompare on one obj and if using on the comparator than compare two argument
    private int orderId;
    private double orderAmount;
    private String customerName;

    public Priority_Queue_ex() {
        super();
    }


    @Override
    public String toString() {
        return "Priority_Queue_ex{" +
                "orderId=" + orderId +
                ", orderAmount=" + orderAmount +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public Priority_Queue_ex(int orderId, double orderAmount, String customerName) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.customerName = customerName;

    }

    @Override
    public int compareTo(Priority_Queue_ex s) {
        return s.orderId>this.orderId?1:-1;
    }
}
class main{
    public static void main(String[] args) {
        Priority_Queue_ex c1 = new Priority_Queue_ex(1, 100.0, "customer1");
        Priority_Queue_ex c2 = new Priority_Queue_ex(3, 50.0, "customer3");
        Priority_Queue_ex c3 = new Priority_Queue_ex(2, 300.0, "customer2");

        Queue<Priority_Queue_ex> ts = new PriorityQueue<>();
        ts.add(c1);
        ts.add(c2);
        ts.add(c3);
//        System.out.println(ts);
        while (!ts.isEmpty()){
            System.out.println(ts.poll());
        }
    }
}