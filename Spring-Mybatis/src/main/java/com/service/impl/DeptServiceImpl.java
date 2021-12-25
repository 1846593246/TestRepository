package com.service.impl;

import com.bean.DeptBean;
import com.mapper.DeptBeanMapper;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * @author Administrator
 */
@Service(value = "DeptServiceImpl")
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptBeanMapper deptBeanMapper;


    /**
     * 插入
     *
     * @param deptBean
     * @return
     */

    public int insert(DeptBean deptBean) {
        return deptBeanMapper.insertSelective(deptBean);

    }

    /**
     * 批量插入数据
     *
     * @param deptBeanList
     */
    //表示这个方法实施了实务操作，即插入多条数据，一旦有一个是错误的，就开启事务回滚，所有的数据都全部不插入
    @Transactional
    public void batchInsert(List<DeptBean> deptBeanList) {
        for (DeptBean deptBean :
                deptBeanList) {
            deptBeanMapper.insert(deptBean);
        }
    }

    /**
     * 查询
     *
     * @param deptBean
     * @return
     */
    public List<DeptBean> select(DeptBean deptBean) {
        return deptBeanMapper.selectByExample(null);
    }
}
