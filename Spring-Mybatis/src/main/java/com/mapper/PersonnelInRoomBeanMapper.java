package com.mapper;

import com.bean.PersonnelInRoomBean;
import com.bean.PersonnelInRoomBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelInRoomBeanMapper {
    int countByExample(PersonnelInRoomBeanExample example);

    int deleteByExample(PersonnelInRoomBeanExample example);

    int deleteByPrimaryKey(String inroomid);

    int insert(PersonnelInRoomBean record);

    int insertSelective(PersonnelInRoomBean record);

    List<PersonnelInRoomBean> selectByExample(PersonnelInRoomBeanExample example);

    PersonnelInRoomBean selectByPrimaryKey(String inroomid);

    int updateByExampleSelective(@Param("record") PersonnelInRoomBean record, @Param("example") PersonnelInRoomBeanExample example);

    int updateByExample(@Param("record") PersonnelInRoomBean record, @Param("example") PersonnelInRoomBeanExample example);

    int updateByPrimaryKeySelective(PersonnelInRoomBean record);

    int updateByPrimaryKey(PersonnelInRoomBean record);
}