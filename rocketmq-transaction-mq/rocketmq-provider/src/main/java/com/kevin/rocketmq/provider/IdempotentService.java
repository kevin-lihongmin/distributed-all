package com.kevin.rocketmq.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *  数据库 判断幂等的实例
 *
 *  {@link IdempotentValid} 是幂等的数据库 ORM类 {@link IdempotentValid#txNo} 可以是数据库唯一索引的
 *
 *  所有幂等方法执行前先判断是否执行过
 *      执行正常的事务业务
 *  最后 将唯一数据插入，表示处理过了
 *
 * @author kevin
 * @date 2021/7/4 13:40
 * @since 1.0.0
 */
@Service
@Slf4j
public class IdempotentService {

    @Transactional
    public void idempotentMethodDemo(String txNo) {

        if (validExist(txNo)) {
            log.error("事务已经执行过了");
            return;
        }

        saveExist(txNo);
    }

    public boolean validExist(String txNo) {

        return false;
    }

    public boolean saveExist(String txNo) {

        return false;
    }

    public static class IdempotentValid {
        private String txNo;

        private String no;
    }
}
