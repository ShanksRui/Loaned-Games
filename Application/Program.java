package Application;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import Entities.Client;
import Entities.Games;
import Entities.CompanyGames;
import Entities.enums.OrderType;
import model.Exception.DomainException;
import model.services.paymentGames;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	  System.out.println("rental company \n "+"say the name of the game-\n"+" a quantity-\n"+" Type-");
      System.out.print("-");
      String name = sc.nextLine();
      System.out.print("-");
      int quantity = Integer.parseInt(sc.nextLine());
      System.out.print("-");
      String type = sc.nextLine();
	   Games games = new Games(name, quantity, OrderType.valueOf(type));
	   System.out.println();
	   System.out.println("the end date must be equal to or greater than one day(24h)");
	   System.out.println("Enter the data in the format (dd/MM/yyyy HH:mm)");   
	   System.out.print("Start Time:");
	   LocalDateTime start = LocalDateTime.parse(sc.nextLine(),CompanyGames.f1);
	   System.out.print("Finish Time");
	   LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),CompanyGames.f1);	
	   System.out.print("customer name:");
	   String nameclient = sc.nextLine();
	   System.out.print("PricePerDay:");
	   Double priceday = sc.nextDouble();
	   System.out.println();
	   try {
       CompanyGames locadora = new CompanyGames(start, finish, new Client(nameclient),new paymentGames(priceday));
       locadora.addGames(games);
	   locadora.getPayment().Payment(locadora, games);   
	   System.out.println(locadora.toString());
	   System.out.println("total payable:"+locadora.getPayment().toString());
	  }catch(DomainException e) {
		  System.out.println("Error "+e.getMessage());
	  }sc.close();
	}
}