import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.payment.Items;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("beans.xml");
		Items i = (Items) ac.getBean("item");
		System.out.println("***Payment Class Information***");
		System.out.println("Total Amount: "+
		i.getPay().      // Payment Object
		getTotalAmount() //Payment Object : getting payment amount
		);
		System.out.println("***Items Class Information***");
		System.out.println("Items Name: "+i.getItemName());
		
		System.out.println("***Order Class Information***");
		System.out.println("Order ID: "+i.getOrder().getOrderId());
		System.out.println("Order No: "+i.getOrder().getOrderNo());
		
	}
}
