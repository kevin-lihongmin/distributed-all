package com.kevin.msgtable.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  用户信息
 * @author kevin
 * @date 2021/7/4 14:39
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String userId;

    private String userName;

}
