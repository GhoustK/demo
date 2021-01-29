package com.boss.demo.service.Impl;

import com.boss.demo.domain.Remark;
import com.boss.demo.mapper.RemarkMapper;
import com.boss.demo.service.RemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemarkServiceImpl implements RemarkService {

    @Autowired
    private RemarkMapper remarkMapper;

    @Override
    public int add(Remark remark) {
        remarkMapper.insert(remark);
        int rId = remark.getRId();
        return rId;
    }
}
