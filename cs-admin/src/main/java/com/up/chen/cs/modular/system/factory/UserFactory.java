package com.up.chen.cs.modular.system.factory;

import com.up.chen.cs.modular.system.model.User;
import com.up.chen.cs.modular.system.transfer.UserDto;
import org.springframework.beans.BeanUtils;

/**
* @Description: 用户创建工厂
* @author chenchen
* @date 2018/6/27 11:49
*/
public class UserFactory {

    public static User createUser(UserDto userDto){
        if(userDto == null){
            return null;
        }else{
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            return user;
        }
    }
}
