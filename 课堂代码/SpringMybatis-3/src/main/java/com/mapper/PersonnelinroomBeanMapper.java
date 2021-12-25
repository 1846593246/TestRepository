package com.mapper;

import com.bean.PersonnelinroomBean;
import com.bean.PersonnelinroomBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelinroomBeanMapper {
    int countByExample(PersonnelinroomBeanExample example);

    int deleteByExample(PersonnelinroomBeanExample example);

    int deleteByPrimaryKey(String inroomid);

    int insert(PersonnelinroomBean record);

    int insertSelective(PersonnelinroomBean record);

    List<PersonnelinroomBean> selectByExample(PersonnelinroomBeanExample example);

    PersonnelinroomBean selectByPrimaryKey(String inroomid);

    int updateByExampleSelective(@Param("record") PersonnelinroomBean record, @Param("example") PersonnelinroomBeanExample example);

    int updateByExample(@Param("record") PersonnelinroomBean record, @Param("example") PersonnelinroomBeanExample example);

    int updateByPrimaryKeySelective(PersonnelinroomBean record);

    int updateByPrimaryKey(PersonnelinroomBean record);
}