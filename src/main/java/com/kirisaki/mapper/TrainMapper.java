package com.kirisaki.mapper;

import com.kirisaki.pojo.Train;
import com.kirisaki.pojo.TrainExample;
import java.util.List;

public interface TrainMapper {
    int deleteByPrimaryKey(Integer train_id);

    int insert(Train record);

    int insertSelective(Train record);

    List<Train> selectByExample(TrainExample example);

    Train selectByPrimaryKey(Integer train_id);

    int updateByPrimaryKeySelective(Train record);

    int updateByPrimaryKey(Train record);
}