package com.boss.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.boss.demo.domain.Remark;
import com.boss.demo.service.RemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remark")
public class RemarkController {

    @Autowired
    private RemarkService remarkService;

    @GetMapping("add")
    public Object add(String msg){
        Remark remark = new Remark();
        remark.setContent("11111");
        remark.setCreatedAt("2020-11-02 08:44:16");
//        remark.setDeletedAt();
        remark.setUpdatedAt("2020-11-02 08:44:16");
        remark.setOrId(9999);
        remark.setUid(9999);
        int id = remarkService.add(remark);

        return JSON.toJSONString(id);
    }
}
