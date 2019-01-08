package com.qfedu.service;

import com.qfedu.pojo.User;
import com.qfedu.vo.ResultVo;

public interface UserService {

    ResultVo login(User user);

    ResultVo save(User user);

    ResultVo update(User user);
}
