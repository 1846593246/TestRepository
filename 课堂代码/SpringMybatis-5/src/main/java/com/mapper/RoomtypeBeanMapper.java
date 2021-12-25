package com.mapper;

import com.bean.RoomtypeBean;
import com.bean.RoomtypeBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomtypeBeanMapper {
    int countByExample(RoomtypeBeanExample example);

    int deleteByExample(RoomtypeBeanExample example);

    int deleteByPrimaryKey(String roomtypeid);

    int insert(RoomtypeBean record);

    int insertSelective(RoomtypeBean record);

    List<RoomtypeBean> selectByExample(RoomtypeBeanExample example);

    RoomtypeBean selectByPrimaryKey(String roomtypeid);

    int updateByExampleSelective(@Param("record") RoomtypeBean record, @Param("example") RoomtypeBeanExample example);

    int updateByExample(@Param("record") RoomtypeBean record, @Param("example") RoomtypeBeanExample example);

    int updateByPrimaryKeySelective(RoomtypeBean record);

    int updateByPrimaryKey(RoomtypeBean record);
}