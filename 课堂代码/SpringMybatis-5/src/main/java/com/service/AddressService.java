package com.service;

import com.bean.AddressBean;
import com.bean.DeptBean;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AddressService {


    public int insert(AddressBean addressBean);
    public int delteById(String id);
    public int update(AddressBean deptBean);
    public AddressBean queryDataById(String id);
    public List<AddressBean> queryData(AddressBean addressBean);
    public PageInfo   queryDataByPage(AddressBean addressBean, int pageNum, int pageSize);

    public void batchInsert(List<AddressBean> list);


}
