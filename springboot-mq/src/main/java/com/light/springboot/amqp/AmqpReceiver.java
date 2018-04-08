package com.light.springboot.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class AmqpReceiver {

	/**
	 * 简单模式接收
	 * 
	 * @param message
	 */
	@RabbitListener(queues = AmqpConfirguration.SIMPLE_QUEUE)
	public void simpleReceive(String message) {
		System.out.println("接收消息:" + message);
	}

	/**
	 * 发布/订阅模式接收
	 * 
	 * @param message
	 */
	@RabbitListener(queues = AmqpConfirguration.PS_QUEUE_1)
	public void psReceive1(String message) {
		System.out.println(AmqpConfirguration.PS_QUEUE_1 + "接收消息:" + message);
	}

	@RabbitListener(queues = AmqpConfirguration.PS_QUEUE_2)
	public void psReceive2(String message) {
		System.out.println(AmqpConfirguration.PS_QUEUE_2 + "接收消息:" + message);
	}

	/**
	 * 路由模式接收
	 * 
	 * @param message
	 */
	@RabbitListener(queues = AmqpConfirguration.ROUTING_QUEUE_1)
	public void routingReceive1(String message) {
		System.out.println(AmqpConfirguration.ROUTING_QUEUE_1 + "接收消息:" + message);
	}

	@RabbitListener(queues = AmqpConfirguration.ROUTING_QUEUE_2)
	public void routingReceive2(String message) {
		System.out.println(AmqpConfirguration.ROUTING_QUEUE_2 + "接收消息:" + message);
	}

	/**
	 * 主题模式接收
	 * 
	 * @param message
	 */
	@RabbitListener(queues = AmqpConfirguration.TOPIC_QUEUE_1)
	public void topicReceive1(String message) {
		System.out.println(AmqpConfirguration.TOPIC_QUEUE_1 + "接收消息:" + message);
	}
	
	@RabbitListener(queues = AmqpConfirguration.TOPIC_QUEUE_2)
	public void topicReceive2(String message) {
		System.out.println(AmqpConfirguration.TOPIC_QUEUE_2 + "接收消息:" + message);
	}
}
