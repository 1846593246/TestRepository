package com.service.impl;

import com.bean.AddressBean;
import com.github.pagehelper.PageInfo;
import com.mapper.AddressBeanMapper;
import com.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressBeanMapper addressBeanMapper;


    @Transactional
    public int insert(AddressBean addressBean) {


        return addressBeanMapper.insert(addressBean);
    }

    public int delteById(String id) {
        return addressBeanMapper.deleteByPrimaryKey(id);
    }


    @Transactional
    public int update(AddressBean deptBean) {
        return addressBeanMapper.updateByPrimaryKeySelective(deptBean);
    }

    public AddressBean queryDataById(String id) {
        return addressBeanMapper.selectByPrimaryKey(id);
    }

    public List<AddressBean> queryData(AddressBean addressBean) {
        return addressBeanMapper.selectByExample(null);
    }

    public PageInfo queryDataByPage(AddressBean addressBean, int pageNum, int pageSize) {


        return null;
    }

    public void batchInsert(List<AddressBean> list) {

    }
}
