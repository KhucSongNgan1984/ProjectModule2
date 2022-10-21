package Module2Tuan2;

import java.util.Scanner;

public class ProductManager {
    public static Product[] product = new Product[4];
    ProductManager () {
    }
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Hay nhap gia: ");
        int price = scanner.nextInt();
        System.out.println("Hay nhap mo ta san pham: ");
        String description = scanner.next();
        System.out.println();
        Product product1 = new Product(name, price, description);
        product[0] = product1;
    }
    public void displayProduct() {
        for (int i = 0; i < product.length; i++) {
            System.out.println("San pham " + i + ": " + product[1].setName() + product[i].getPrice() + product[i].getDescription());
        }
    }


}
