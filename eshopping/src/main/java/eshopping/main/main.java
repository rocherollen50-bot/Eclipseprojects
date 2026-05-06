package eshopping.main;

import java.util.Scanner;

import eshopping.dao.ProductDAO;
import eshopping.model.Product;

public class main {
	public static void main(String[] args)
	{
		
		ProductDAO dao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("\n1. Add product");
		System.out.println("2. View product");
		System.out.println("3. Update product");
		System.out.println("4. Delete product");
		System.out.println("5. Exit");
		int choice = sc.nextInt();
		
		switch(choice)
		{

		case 1:
		    System.out.println("Enter name");
		    String name = sc.next();

		    System.out.println("Enter price");
		    double price = sc.nextDouble();

		    dao.addProduct(new Product(name, price));
		    break;

		case 2:
		    dao.getAllProducts();
		    break;

		case 3:
		    System.out.println("Enter product ID to update");
		    int id = sc.nextInt();

		    System.out.println("Enter new name");
		    String newName = sc.next();

		    System.out.println("Enter new price");
		    double newPrice = sc.nextDouble();

		    dao.updateProduct(new Product(id, newName, newPrice));
		    break;

		case 4:
		    System.out.println("Enter product ID to delete");
		    int deleteId = sc.nextInt();

		    dao.deleteProduct(deleteId);
		    break;

		case 5:
		    System.exit(0);

		
		}
		}
		
	}

}