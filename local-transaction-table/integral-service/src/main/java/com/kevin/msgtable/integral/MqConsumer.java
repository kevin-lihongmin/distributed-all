package com.kevin.msgtable.integral;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 *
 * @author kevin
 * @date 2021/7/4 14:30
 * @since 1.0.0
 */
@Slf4j
@Service
public class MqConsumer implements RocketMQListener<Object> {

    public void onMessage(Object o) {
        // 消费消息，执行为用户添加积分的业务，
        try {

        } catch (Exception e) {
            log.error("为用户添加积分失败！");

            // 执行失败，直接抛出异常，其他客户端还可以再消费
            throw new RuntimeException("");
        }
    }
}
