import com.bean.DeptBean;
import com.mapper.DeptBeanMapper;
import com.service.impl.DeptServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpringMyBatis {



    @Test
    public void t1(){
        //实例化Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        //DefaultSqlSessionFactory sfb =  context.getBean("sqlSessionFactory", DefaultSqlSessionFactory.class);
       // System.out.println(sfb);
       // SqlSession sqlSession =  sfb.openSession();
       // DeptBeanMapper deptBeanMapper =   sqlSession.getMapper(DeptBeanMapper.class);
       // System.out.println(deptBeanMapper.selectByExample(null));



        //用Spring整合Mybatis后，
        // 发现我们不需要通过SqlSessionFactory.openSession()打开连接，也不需通过sqlSession.getMapper()得到Mapper接口了
        // 因为我们在配置文件 中配置的 SqlSessionFactoryBean,以及 通过 mybatis-spring扫描  com.mapper包下的接口
        // com.mapper包下的所有Mppaer接口自动纳入Spring容器管理 了

        DeptServiceImpl deptService =   context.getBean("deptServiceImpl", DeptServiceImpl.class);

        List<DeptBean> deptBeanList =   deptService.queryData(null);

        System.out.println(deptBeanList);
    }



    @Test
    public void t2(){
        //实例化Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

         //用Spring整合Mybatis后，
        // 发现我们不需要通过SqlSessionFactory.openSession()打开连接，也不需通过sqlSession.getMapper()得到Mapper接口了
        // 因为我们在配置文件 中配置的 SqlSessionFactoryBean,以及 通过 mybatis-spring扫描  com.mapper包下的接口
        // com.mapper包下的所有Mppaer接口自动纳入Spring容器管理 了

        DeptServiceImpl deptService =   context.getBean("deptServiceImpl", DeptServiceImpl.class);

        DeptBean deptBean = new DeptBean();
        deptBean.setDeptname("SpringMybatis");
        deptBean.setLevel(1);
        deptBean.setDeptid("18888");

        int res =  deptService.insert(deptBean);

        System.out.println("保存结果为:"+res);
    }
}



