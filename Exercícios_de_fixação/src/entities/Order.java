package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enun.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderIntem> orderIntem = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderIntem> getOrderIntem() {
		return orderIntem;
	}
	
	public void addOrderIntem (OrderIntem orderItem) {
		orderIntem.add(orderItem);
	}
	
	public void removeOrderIntem (OrderIntem orderItem) {
		orderIntem.remove(orderItem);
	}
	

}
