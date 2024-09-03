package Entities;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.Exception.DomainException;
import model.services.paymentGames;

public class CompanyGames {
     private paymentGames payment;
     private LocalDateTime reservStart;
     private LocalDateTime reservFinish;
     private List<Games> list = new ArrayList<>();
     private Client client;
     
     public static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
     
public CompanyGames() { 
  }

public CompanyGames(LocalDateTime start, LocalDateTime finish, Client client,paymentGames payment) throws DomainException{
	 if(finish.isBefore(start)||(start.isAfter(finish))){
    	throw new DomainException("Date Invalid!!");
      }else {
    	  this.reservStart = start;
    	  this.reservFinish = finish;
          this.client = client;
          this.payment = payment;
      }    
}
public LocalDateTime getReservStart() {
	return reservStart;
}
public void setReservStart(LocalDateTime reservStart) {
	this.reservStart = reservStart;
}
public LocalDateTime getReservFinish() {
	return reservFinish;
}
public void setReservFinish(LocalDateTime reservFinish) {
	this.reservFinish = reservFinish;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public List<Games> getList() {
	return list;
}
public void addGames(Games lists) {
	list.add(lists);
}
public void removeGames(Games lists) {
	list.remove(lists);
}

public paymentGames getPayment() {
	return payment;
}

public void setPayment(paymentGames payment) {
	this.payment = payment;
}
public String toString() {
	StringBuilder sb = new StringBuilder();
	      sb.append("reserved:\n");
	      sb.append(client.toString()+"\n");
		   for(Games x:list) {
			  sb.append(x);
		  }
	return sb.toString();
}
}