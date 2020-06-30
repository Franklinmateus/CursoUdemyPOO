package application2;

import java.util.Date;

import entities.enums.OrderSatus;
import entities2.Order;

public class ProgramComEnum {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderSatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(order);
		
		OrderSatus os1 = OrderSatus.ENTREGUE;
		OrderSatus os2 = OrderSatus.valueOf("ENTREGUE");
		
		System.out.println("-------------------");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
