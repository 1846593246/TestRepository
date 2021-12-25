package com.service;

import com.bean.AddressBean;
import com.bean.PersonnelBean;
import com.bean.PersonnelinroomBean;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface PersonneInroomService {


    public int insert(PersonnelinroomBean personnelinroomBean);
    public int delteById(String id);
    public int update(PersonnelinroomBean personnelinroomBean);
    public List<PersonnelinroomBean> queryData(PersonnelinroomBean personnelinroomBean);
    public PageInfo   queryDataByPage(PersonnelinroomBean personnelinroomBean, int pageNum, int pageSize);

    public void batchInsert(List<PersonnelinroomBean> list);


}
