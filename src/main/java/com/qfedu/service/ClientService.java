package com.qfedu.service;

import com.qfedu.pojo.Client;
import com.qfedu.vo.ResultVo;

/**
 * @Auther: lay
 * @Date: 2019/1/11 20:46
 * @Description:
 */
public interface ClientService {

    ResultVo save(Client client);

    ResultVo showList();
}
