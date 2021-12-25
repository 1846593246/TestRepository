package com.mapper;

import com.bean.PersonnelBean;
import com.bean.PersonnelBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelBeanMapper {
    int countByExample(PersonnelBeanExample example);

    int deleteByExample(PersonnelBeanExample example);

    int deleteByPrimaryKey(String personnelid);

    int insert(PersonnelBean record);

    int insertSelective(PersonnelBean record);

    List<PersonnelBean> selectByExampleWithBLOBs(PersonnelBeanExample example);

    List<PersonnelBean> selectByExample(PersonnelBeanExample example);

    PersonnelBean selectByPrimaryKey(String personnelid);

    int updateByExampleSelective(@Param("record") PersonnelBean record, @Param("example") PersonnelBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") PersonnelBean record, @Param("example") PersonnelBeanExample example);

    int updateByExample(@Param("record") PersonnelBean record, @Param("example") PersonnelBeanExample example);

    int updateByPrimaryKeySelective(PersonnelBean record);

    int updateByPrimaryKeyWithBLOBs(PersonnelBean record);

    int updateByPrimaryKey(PersonnelBean record);
}