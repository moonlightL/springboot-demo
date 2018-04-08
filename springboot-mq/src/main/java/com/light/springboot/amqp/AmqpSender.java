package com.light.springboot.amqp;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmqpSender {

	@Autowired
	private AmqpTemplate amqpTemplate;

	/**
	 * 简单模式发送
	 * 
	 * @param message
	 */
	public void simpleSend(String message) {
		this.amqpTemplate.convertAndSend(AmqpConfirguration.SIMPLE_QUEUE, message);
	}

	/**
	 * 发布/订阅模式发送
	 * 
	 * @param message
	 */
	public void psSend(String message) {
		this.amqpTemplate.convertAndSend(AmqpConfirguration.FANOUT_EXCHANGE, "", message);
	}

	/**
	 * 路由模式发送
	 * 
	 * @param message
	 */
	public void routingSend(String routingKey, String message) {
		this.amqpTemplate.convertAndSend(AmqpConfirguration.DIRECT_EXCHANGE, routingKey, message);
	}

	/**
	 * 主题模式发送
	 * 
	 * @param routingKey
	 * @param message
	 */
	public void topicSend(String routingKey, String message) {
		this.amqpTemplate.convertAndSend(AmqpConfirguration.TOPIC_EXCHANGE, routingKey, message);
	}
}
