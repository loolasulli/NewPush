package mentor22.CustomerService;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("C1", 9999, 1);
        Customer customer2 = new Customer("C2", 8888, 4);
        Customer customer3 = new Customer("C3", 7777, 3);
        Customer customer4 = new Customer("C4", 6666, 2);

        System.out.println("FIFO:");
        Queue<Customer> customersRegular = new LinkedList<>();
        customersRegular.add(customer1);
        customersRegular.add(customer2);
        customersRegular.add(customer3);
        customersRegular.add(customer4);
        for (Customer customer : customersRegular) {
            System.out.println(customer);
        }


        System.out.println("Priority:");
        PriorityQueue<Customer> customersPriority = new PriorityQueue<>(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return Integer.compare(o2.getPriority(), o1.getPriority());
            }
        });
        customersPriority.add(customer1);
        customersPriority.add(customer2);
        customersPriority.add(customer3);
        customersPriority.add(customer4);
        while (!customersPriority.isEmpty()) {
            Customer customer = customersPriority.poll();
            System.out.println(customer);
        }
    }
}
