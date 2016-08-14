package edu.snnu.carrent.controller;

import java.util.Date;

import org.json.simple.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.snnu.carrent.hibernate.Methods;
import edu.snnu.carrent.model.Order;
import edu.snnu.carrent.model.User;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

	ApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	private Order order = (Order) context.getBean("order");

	private User user = (User) context.getBean("user");

	public OrderController() {
		// // InputStream in = new FileInputStream("test.png");
		// // byte[] photo = new byte[in.available()];
		// // in.read(photo);
		// // in.close();
	}

	@RequestMapping(value = "/orders")
	public String list(Model model) { // , HttpHttpServletRequest request
		Methods methods = new Methods();
		order.setDrivername("张");
		order.setBirthday(new Date());
		order.setTelephone(137765489);
		order.setTakeday(new Date());
		order.setBackday(new Date());
		order.setTakeplace("洛杉矶");
		order.setBackplace("加拿大");
		order.setPayway("线下支付");
		order.setPrice(234);
		order.setCompany("安飞士");
		order.setCarname("宝马X6");
		order.setService("向导+GPS");
		order.setIsPay(0);
		// order.setPhoto(photo);

		user.setUsername("王茂");
		user.setPassword("1233");
		methods.Save((edu.snnu.carrent.model.User) user, order);

		System.out.println(order);
		User user = methods.getById(1);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", order.getId());
		jsonObject.put("telephone", order.getTelephone());
		// java.lang.reflect.Field[] fields =
		// model.getClass().getDeclaredFields();
		// for (java.lang.reflect.Field f : fields) {
		// // System.out.println(f.getName());
		// jsonObject.put(f.getName(), f.getName());
		// }
		System.out.println(order);
		System.out.println(jsonObject.toJSONString());
		return "/order";
	}
	// <property name="viewClass" , method = RequestMethod.GET
	// value="org.springframework.web.servlet.view.Jst1View"></property>
}
