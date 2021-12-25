package com.mapper;

import com.bean.FacemachineBean;
import com.bean.FacemachineBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FacemachineBeanMapper {
    int countByExample(FacemachineBeanExample example);

    int deleteByExample(FacemachineBeanExample example);

    int deleteByPrimaryKey(String machineid);

    int insert(FacemachineBean record);

    int insertSelective(FacemachineBean record);

    List<FacemachineBean> selectByExample(FacemachineBeanExample example);

    FacemachineBean selectByPrimaryKey(String machineid);

    int updateByExampleSelective(@Param("record") FacemachineBean record, @Param("example") FacemachineBeanExample example);

    int updateByExample(@Param("record") FacemachineBean record, @Param("example") FacemachineBeanExample example);

    int updateByPrimaryKeySelective(FacemachineBean record);

    int updateByPrimaryKey(FacemachineBean record);
}