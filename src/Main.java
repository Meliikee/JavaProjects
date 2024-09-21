import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Melike ", "Dönmez"));
        customers.add(new Customer(2, "Açelya ", "Dönmez"));
        customers.add(new Customer(3, "Sude ", "Dönmez"));

        Customer customer4 = new Customer(4, "Ahmet ", "Mehmet");
        customers.add(customer4);

        for (Customer customer : customers) {
            System.out.print(customer.firstName);
            System.out.println(customer.lastName);
        }

        System.out.println("*********************");
        customers.remove(customer4);

        for (Customer customer : customers) {
            System.out.print(customer.firstName);
            System.out.println(customer.lastName);
        }
    }
}