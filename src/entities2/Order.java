package entities2;

import java.util.Date;

import entities.enums.OrderSatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderSatus status;

	//Construtor_vazio
	public Order() {
	}

	//Construtor_com_argumentos
	public Order(Integer id, Date moment, OrderSatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	//Get_and_set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderSatus getStatus() {
		return status;
	}

	public void setStatus(OrderSatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
}
