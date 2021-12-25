package com.service.impl;

import com.bean.DeptBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.DeptBeanMapper;
import com.service.DeptService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


@Service
public class DeptServiceImpl implements  DeptService {


    @Autowired  //依赖注入
    DeptBeanMapper deptBeanMapper;

    /**
     *  DeptBeanMapper deptBeanMapper = sqlSession.getMapper(DeptBeanMapper.class);
     *  deptBeanMapper.insert();
     *  sqlsession.commit();
     *  sqlsession.close();
     * 传入一个list集合，表示多个部门信息，这些部门信息只要有一条插入失败了就应该回滚
     * @param list
     * @return
     */
     @Transactional  //表示为此方法实施事务，只要该方法内部在操作数据库的过程中其中有一条失败，spring会自动回滚

    //加了Transactional注解后，spring就在Transactional对象的事务管理器中DataSourceTransactionManager中调用  batchInsert方法

     //在batchInser方法执行前实施了前置通知(开启数据库连接)

    //在batchInser方法没有抛出异常，实施了返回通知( 提交事务，关闭连接)

    //在batchInser方法出现了异常，实施异常通知( 回滚事务，关闭连接。)



    public void batchInsert(List<DeptBean> list){
         //加了@Transactional注解的方法，在方法内部捕获了异常，那么事务管理 是否能够生效
         //保存 四个部门  d1,d2,d3,d4

         //   A  是否全部保存进去了，
         //   B 还是只保存了d1和d2   正确答案是B
         //   C  者是一个都没保存成功

       //try {
             for (DeptBean deptBean : list) {
                 //循环四次，按理来说应该得到四个SqlSession，执行insert保存到数据
                 deptBeanMapper.insert(deptBean);
            }
        // }catch (Exception e){
       //      e.printStackTrace();
        // }
    }

   // @Autowired
    //DefaultSqlSessionFactory defaultSqlSessionFactory;


    public int insert(DeptBean deptBean) {
      // SqlSession sqlSession =  defaultSqlSessionFactory.openSession();
      // sqlSession.getMapper(DeptBeanMapper.class)

      //  try {
            return deptBeanMapper.insert(deptBean);
      /** }catch (Exception e){
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("d:\\log.log");
                String error = "DeptServiceImpl 的 insert执行时出现了异常，异常信息为:"+e.getMessage();
                fileOutputStream.write(error.getBytes());
                fileOutputStream.close();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        return -1;*/
    }

    public int delteById(String deptid) {
        return deptBeanMapper.deleteByPrimaryKey(deptid);
    }

    public int update(DeptBean deptBean) {
        return deptBeanMapper.updateByPrimaryKeySelective(deptBean);
    }

    public List<DeptBean> queryData(DeptBean deptBean) {
        //..

        return deptBeanMapper.selectByExample(null);
    }

    public PageInfo queryDataByPage(DeptBean deptBean, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        List<DeptBean> deptBeanList = deptBeanMapper.selectByExample(null);

        PageInfo pageinfo = new PageInfo(deptBeanList);

        return pageinfo;
    }
}
