package com.service;

import com.bean.DeptBean;

import java.util.List;

/**
 * @author Administrator
 */
public interface DeptService {

    /**
     * 批量插入数据
     * @param deptBeanList
     */
    public void batchInsert(List<DeptBean> deptBeanList);



    /**
     * 查询
     * @param deptBean
     * @return
     */
    public List<DeptBean> select(DeptBean deptBean);

    /**
     * 插入
     * @param deptBean
     * @return
     */

    public int insert(DeptBean deptBean);
}
