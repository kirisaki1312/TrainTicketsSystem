package com.kirisaki.mapper;

import com.kirisaki.pojo.Stop;
import com.kirisaki.pojo.StopExample;
import java.util.List;

public interface StopMapper {
    int deleteByPrimaryKey(Integer stop_id);

    int insert(Stop record);

    int insertSelective(Stop record);

    List<Stop> selectByExample(StopExample example);

    Stop selectByPrimaryKey(Integer stop_id);

    int updateByPrimaryKeySelective(Stop record);

    int updateByPrimaryKey(Stop record);

    List<Stop> selectAll();
}