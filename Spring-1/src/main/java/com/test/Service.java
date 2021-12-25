package com.test;

/**
 * @author Administrator
 */
public interface Service {

    /**
     * s
     * @param obj
     * @return
     */
   public Object save(Object obj);

    /**
     * s
     * @param id
     * @return
     */
    public String delete(String id);

    /**
     * s
     * @param obj
     * @return
     */
    public Object update(Object obj);

    /**
     * s
     * @param hql
     * @param values
     * @return Object[]
     */
    public Object[] queryData(String hql, Object[] values);
}
