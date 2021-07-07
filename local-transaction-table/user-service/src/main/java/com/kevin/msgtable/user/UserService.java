package com.kevin.msgtable.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *  用户服务
 * @author kevin
 * @date 2021/7/4 14:38
 * @since 1.0.0
 */
@Slf4j
@Service
public class UserService {

    @Transactional
    public void createUser(User user) {

        saveUser(user);
        
        saveIntegralLog(new IntegralLog(user.getUserId(), 1));
        
    }

    /** 模拟调用数据库的方法 */
    private void saveIntegralLog(IntegralLog integralLog) {

    }

    /** 模拟调用数据库的方法 */
    private void saveUser(User user) {

    }

}
