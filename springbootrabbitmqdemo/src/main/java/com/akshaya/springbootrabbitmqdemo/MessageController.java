package com.akshaya.springbootrabbitmqdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

	@Qualifier("beanAsecondObject")
	BeanA beanA;
	@Autowired
	@Qualifier("beanAfirstObject")
	BeanA beanAfirstObject;
	private final OrderMessageSender orderMessageSender;

	@Autowired
	public MessageController(OrderMessageSender orderMessageSender) {
		this.orderMessageSender = orderMessageSender;
	}

	/*
	 * @PostMapping("/sendMsg") public String handleMessage(Order order,
	 * RedirectAttributes redirectAttributes) {
	 * orderMessageSender.sendOrder(order);
	 * redirectAttributes.addFlashAttribute("message",
	 * "Order message sent successfully"); return "test"; }
	 */
	//
	@RequestMapping(value = "/sendMessageToQueue", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody String handleMessage(@RequestHeader(value="username") String username,@RequestBody Product Product) {
		System.out.println("username username................"+username);
		/*System.out.println("Product Product........." + Product);
		System.out.println(beanA.getName());
		System.out.println(beanAfirstObject.getName());*/
		//orderMessageSender.sendProduct(Product);
		return "Product message sent successfully";
	}

	@RequestMapping(value = "/sendMessage", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody String handleMessage(@RequestBody Order order) {
		System.out.println("Order order........." + order);
		//orderMessageSender.sendOrder(order);
		return "Product message sent successfully";

	}
	@RequestMapping(value="/Sendmessagetoconsumer",method=RequestMethod.POST,consumes="application/json")
	public @ResponseBody Product handleMessage(@RequestHeader(value="username")String username,@RequestHeader(value="Password")String Password,@RequestBody Product product){
		return product;
		
	}

}
