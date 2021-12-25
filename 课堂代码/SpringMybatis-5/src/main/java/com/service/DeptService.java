package com.service;

import com.bean.DeptBean;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DeptService {


    public int insert(DeptBean deptBean);
    public int delteById(String deptid);
    public int update(DeptBean deptBean);
    public List<DeptBean> queryData(DeptBean deptBean);
    public PageInfo   queryDataByPage(DeptBean deptBean,int pageNum,int pageSize);

    public void batchInsert(List<DeptBean> list);


}
