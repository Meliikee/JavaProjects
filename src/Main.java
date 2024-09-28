public class Main {
    public static void main(String[] args) {
       MyList<String> sehirler = new MyList<String>();
       sehirler.add("Ankara");
       sehirler.add("İstanbul");

       MyList<Customer> customer = new MyList<>();
       customer.add(new Customer());
    }
}