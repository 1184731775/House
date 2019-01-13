package com.qfedu.service.impl;

import com.qfedu.dao.AppointmentMapper;
import com.qfedu.pojo.Appointment;
import com.qfedu.service.AppointmentService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentMapper dao;


    @Override
    public ResultVo addAppointment(Appointment appointment) {
        if (dao.addAppointment(appointment) > 0) {
            return  ResultVo.setOK(null);
        }
        return  ResultVo.setERROR();
    }
}
