package com.service.impl;

import com.bean.AddressBean;
import com.bean.PersonnelBean;
import com.bean.PersonnelinroomBean;
import com.github.pagehelper.PageInfo;
import com.mapper.AddressBeanMapper;
import com.mapper.PersonnelBeanMapper;
import com.mapper.PersonnelinroomBeanMapper;
import com.service.AddressService;
import com.service.PersonneInroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonnelInroomServiceImpl implements PersonneInroomService {


    @Autowired
    PersonnelinroomBeanMapper personnelinroomBeanMapper;


    @Autowired
    AddressService addressService;//注入addressService

        //
    @Transactional    //实施事务  T1
    public int insert(PersonnelinroomBean personnelinroomBean) {
      ///  1某个人入到到某个房间（往tbl_personnel_inroom）表示插入一条数据
        // 2 然后更新该人所入住的房间的余床数

        //注入AddressService,调用addressServcier的相关方法获得余床数，再余床数据基础上-1，再更新
        //根据personneBean中的addressid获得address对象
        AddressBean addressBean =   addressService.queryDataById(personnelinroomBean.getAddresscode());
       //得到余床数
        Integer bedNum =   addressBean.getBennum();
        bedNum = bedNum-1;
        addressBean.setBennum(bedNum);
        addressService.update(addressBean);//实施事务  T2

        personnelinroomBeanMapper.insert(personnelinroomBean);
        return 0;
    }

    public int delteById(String id) {
        return 0;
    }

    public int update(PersonnelinroomBean personnelinroomBean) {
        return 0;
    }

    public List<PersonnelinroomBean> queryData(PersonnelinroomBean personnelinroomBean) {
        return null;
    }

    public PageInfo queryDataByPage(PersonnelinroomBean personnelinroomBean, int pageNum, int pageSize) {
        return null;
    }

    public void batchInsert(List<PersonnelinroomBean> list) {

    }


}
