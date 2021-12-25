package com.test.impl;

import com.test.Service;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component(value = "GoodsService")
public class GoodsService implements Service {
    /**
     * s
     *
     * @param obj
     * @return
     */
    public Object save(Object obj) {
        System.out.println("GoodsService  save");
        return obj;
    }

    /**
     * s
     *
     * @param id
     * @return
     */
    public String delete(String id) {
        System.out.println("GoodsService delete");
        return null;
    }

    /**
     * s
     *
     * @param obj
     * @return
     */
    public Object update(Object obj) {
        System.out.println("GoodsService update");
        return null;
    }

    /**
     * s
     *
     * @param obj
     * @return
     */
    public Object delete(Object obj) {
        System.out.println("GoodsService delete");
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
        System.out.println("GoodsService queryData");
        return values;
    }
}
