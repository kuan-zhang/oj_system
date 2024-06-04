package com.yupi.yuojbackendquestionservice.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * ClassName: MyMessageProducer
 * Package: com.yupi.yuojbackendquestionservice.rabbitmq
 * Description:
 *
 * @Author 张宽
 * @Create 2024/6/3 21:19
 * @Version 1.0
 */
@Component
public class MyMessageProducer {

    @Resource
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送消息
     * @param exchange
     * @param routingKey
     * @param message
     */
    public void sendMessage(String exchange, String routingKey, String message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }

}
