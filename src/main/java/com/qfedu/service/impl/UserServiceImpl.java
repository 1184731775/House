package com.qfedu.service.impl;

import com.qfedu.dao.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVo login(User user) {
        User user1 = userMapper.selectByName(user);
        if (user1!=null){
            if (user1.getPassword().equals(user.getPassword())){
                return ResultVo.setOK(user1);
            }
            return ResultVo.setERROR();
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo save(User user) {
        int i = userMapper.insertSelective(user);
        if (i>0){
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo update(User user) {
        int i = userMapper.updateByPhone(user);
        if (i>0){
            return ResultVo.setOK(null);
        }

        return ResultVo.setERROR();
    }
}
