package com.test.impl;

import com.test.Service;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component(value = "GoodsTypeService")
public class GoodsTypeService implements Service {
    /**
     * s
     *
     * @param obj
     * @return
     */
    public Object save(Object obj) {
        System.out.println("GoodsTypeService  save");
        return obj;
    }

    /**
     * s
     *
     * @param id
     * @return
     */
    public String delete(String id) {
        System.out.println("GoodsTypeService delete");
        return null;
    }

    /**
     * s
     *
     * @param obj
     * @return
     */
    public Object update(Object obj) {
        System.out.println("GoodsTypeService update");
        return null;
    }

    /**
     * s
     *
     * @param obj
     * @return
     */
    public Object delete(Object obj) {
        System.out.println("GoodsTypeService delete");
        return null;
    }

    /**
     * s
     *
     * @param hql
     * @param values
     * @return Object[]
     */
    public Object[] queryData(String hql, Object[] values) {
        System.out.println("GoodsTypeService queryData");
        return values;
    }
}
