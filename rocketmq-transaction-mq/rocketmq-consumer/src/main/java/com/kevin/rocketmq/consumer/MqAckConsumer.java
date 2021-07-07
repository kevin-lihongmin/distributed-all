package com.kevin.rocketmq.consumer;

import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author kevin
 * @date 2021/7/3 21:58
 * @since 1.0.0
 */
//@Service
//@RocketMQMessageListener(consumerGroup = "transaction-half-mq", topic = "test_topic")
//public class MqAckConsumer implements RocketMQListener {
//
//    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
//        try {
//            for (MessageExt messageExt : list) {
//                if (messageExt.getReconsumeTimes() > 1){
//                    continue;
//                }
//                String topic = messageExt.getTopic();
//                int queueId = messageExt.getQueueId();
//                String message = new String(messageExt.getBody(), RemotingHelper.DEFAULT_CHARSET);
//                System.out.println("the topic: " + topic + "\tqueueId:" + queueId + "\t body：" + message);
//            }
//        } catch (Exception e) {
//            //retry
//            return ConsumeConcurrentlyStatus.RECONSUME_LATER;
//        }
//        throw new RuntimeException("hahh");
////        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//    }
//
//    public void onMessage(Object o) {
//
//    }
//}
