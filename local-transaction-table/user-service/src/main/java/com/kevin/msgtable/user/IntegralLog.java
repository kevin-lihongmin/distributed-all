package com.kevin.msgtable.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  用户积分
 *
 * @author kevin
 * @date 2021/7/4 14:41
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IntegralLog {

    /** 用户id */
    private String userId;

    /** 消息是否发送：1、未发生 2、已发送。 定时任务处理后会来修改该标识 */
    private Integer isSend;

}
