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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {


    @Autowired  //依赖注入
    DeptBeanMapper deptBeanMapper;

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
