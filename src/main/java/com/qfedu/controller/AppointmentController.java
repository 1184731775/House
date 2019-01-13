package com.qfedu.controller;


import com.qfedu.pojo.Appointment;
import com.qfedu.service.AppointmentService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Api(produces = "这是Java编写的接口文档" ,value = "添加预约信息接口文档")
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @ApiOperation(notes = "传入越看信息用户的表单，参数name, gender, tel, checkingtime,message,以及当前房子信息的id为hid",value = "添加当前房子的客户预约信息")
    @PostMapping("addAppointment.do")
    public ResultVo addAppointment(Appointment appointment) {
        return service.addAppointment(appointment);
    }

}
