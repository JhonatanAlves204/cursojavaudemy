package OrientacaoObjeto;

import OrientacaoObjeto.entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class EnterProduct {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product.name + ", $ " + product.price + ", " + product.quantity + " units, Total: $ " + product.TotalValueInStock());
        System.out.println("Enter the number of products to be added in stock: ");
        int quantityToAdd = sc.nextInt();
        product.AddProducts(quantityToAdd);
        sc.nextLine();

        System.out.println("Updated data: " + product.name + ", $ " + product.price + ", " + product.quantity + " units, Total: $ " + product.TotalValueInStock());
        System.out.println("Enter the number of products to be removed in stock: ");
        int quantityToRemove = sc.nextInt();
        product.RemoveProducts(quantityToRemove);
        sc.nextLine();

        System.out.println("Updated data: " + product.name + ", $ " + product.price + ", " + product.quantity + " units, Total: $ " + product.TotalValueInStock());



    }
}
