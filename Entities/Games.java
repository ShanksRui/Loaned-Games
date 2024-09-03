
package Entities;
import Entities.enums.OrderType;

public class Games {
	private String game;
	private Integer quantity;
	private OrderType type;
	
	public Games(String game,Integer quantity, OrderType type) {
		this.game = game;
		this.quantity = quantity;
		this.type = type;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public OrderType getType() {
		return type;
	}
	public void setType(OrderType type) {
		this.type = type;
	}
 public String toString() {
	 StringBuilder sb = new StringBuilder();
	 sb.append("Name:"+game+"\n");
	 sb.append("Quantity:"+quantity+"\n");
	 sb.append("Type Game:"+type+"\n");
	 return sb.toString();
 }
	
}
