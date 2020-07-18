package com.spring.springboot.service;

import com.spring.springboot.dao.XtFunMapper;
import com.spring.springboot.entity.XtFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springbootmybatis
 * @description:
 * @author: xyx
 * @create: 2020-07-18 07:27
 */
@Service
public class XtFunService {
    @Autowired
    XtFunMapper xtFunMapper;

    public List<XtFun> findAll(){
        List<XtFun> list = xtFunMapper.selectAll();
        return list;
    }


    public XtFun findByid(int id){
        XtFun xtFun = xtFunMapper.selectById(id);
        return xtFun;
    }

}
