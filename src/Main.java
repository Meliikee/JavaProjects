public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.ID = 1;
        product.name = "Laptop";
        product.description = "Huawei Laptop";
        product.price = 38000.00;
        product.stockAmount = 5;
        System.out.println(product.name);
        System.out.println(product.description);
        System.out.println(product.price);
        System.out.println(product.stockAmount);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}