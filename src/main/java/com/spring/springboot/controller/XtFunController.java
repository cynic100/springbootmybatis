package com.spring.springboot.controller;

import com.spring.springboot.entity.XtFun;
import com.spring.springboot.service.XtFunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
public class XtFunController {

    @Autowired
    XtFunService xtFunService;

    //http://localhost:8080/findAll
    @GetMapping("/findAll")
    public List<XtFun> findAll(){
        List<XtFun> list = xtFunService.findAll();
        return list;
    }

    //http://localhost:8080/findByid?id=3
    @GetMapping("/findByid")
    //缓存
    @Cacheable(value = "xtFun",key="#id")
    public XtFun findByid(int id){
        XtFun xtFun = xtFunService.findByid(id);
        return xtFun;
    }

}
