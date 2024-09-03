package model.services;

import java.time.Duration;

import Entities.Games;
import Entities.CompanyGames;

public class paymentGames {
   
	private Double pricePerDay;
    private Double total;
	
	public paymentGames(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}
public void Payment(CompanyGames locadora,Games games) {
	 long day = Duration.between(locadora.getReservStart(), locadora.getReservFinish()).toDays();
		 total = pricePerDay * games.getQuantity() * day;
}
public Double getTotal() {
	return total;
}

public void setTotal(Double total) {
	this.total = total;
}
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(String.format("%.2f",total));
	return sb.toString();
}
}
