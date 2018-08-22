package com.akshaya.springbootrabbitmqdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OrderMessageSender {
	private final RabbitTemplate rabbitTemplate;
	private final ObjectMapper objectMapper;
	

	@Autowired
	public OrderMessageSender(RabbitTemplate rabbitTemplate, ObjectMapper objectMapper) {
		this.rabbitTemplate = rabbitTemplate;
		this.objectMapper = objectMapper;
	}

	public void sendOrder(Order order) {
		this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_ORDERS, order);

		// try {
		// String orderJson = objectMapper.writeValueAsString(order);
		// Message message = MessageBuilder
		// .withBody(orderJson.getBytes())
		// .setContentType(MessageProperties.CONTENT_TYPE_JSON)
		// .build();
		// this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_ORDERS,
		// message);
		// } catch (JsonProcessingException e) {
		// e.printStackTrace();
		// }
		//
	}

	public void sendProduct(Product product) {
		this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_ORDERS, product);
		/*
		 * try { String orderJson = objectMapper.writeValueAsString(order);
		 * Message message = MessageBuilder .withBody(orderJson.getBytes())
		 * .setContentType(MessageProperties.CONTENT_TYPE_JSON) .build();
		 * this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_ORDERS,
		 * message); } catch (JsonProcessingException e) { e.printStackTrace();
		 * }
		 */
	}
}
