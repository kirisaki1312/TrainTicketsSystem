package com.kirisaki.mapper;

import com.kirisaki.pojo.Line;
import com.kirisaki.pojo.LineExample;
import com.kirisaki.pojo.LineKey;
import java.util.List;

public interface LineMapper {
    int deleteByPrimaryKey(LineKey key);

    int insert(Line record);

    int insertSelective(Line record);

    List<Line> selectByExample(LineExample example);

    Line selectByPrimaryKey(LineKey key);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
}