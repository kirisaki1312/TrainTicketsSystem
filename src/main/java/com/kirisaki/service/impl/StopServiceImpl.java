package com.kirisaki.service.impl;

import com.kirisaki.mapper.StopMapper;
import com.kirisaki.pojo.Stop;
import com.kirisaki.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopServiceImpl implements StopService {
    @Autowired
    StopMapper stopMapper;

    @Override
    public List<Stop> queryAllStop() {

        return stopMapper.selectAll();
    }
}
