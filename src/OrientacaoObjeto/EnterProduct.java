package OrientacaoObjeto;

import OrientacaoObjeto.entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class EnterProduct {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        System.out.println("Enter the number of products to be added in stock: ");
        int quantityToAdd = sc.nextInt();
        product.AddProducts(quantityToAdd);
        sc.nextLine();

        System.out.println("Updated data: " + product.getName() + ", $ " + product.getPrice() + ", " + product.getQuantity() + " units, Total: $ " + product.TotalValueInStock());
        System.out.println("Enter the number of products to be removed in stock: ");
        int quantityToRemove = sc.nextInt();
        product.RemoveProducts(quantityToRemove);
        sc.nextLine();

        System.out.println("Updated data: " + product.getName() + ", $ " + product.getPrice() + ", " + product.getQuantity() + " units, Total: $ " + product.TotalValueInStock());



    }
}
