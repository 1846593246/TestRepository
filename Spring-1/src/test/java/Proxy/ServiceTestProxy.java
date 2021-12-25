package Proxy;

import com.test.Service;
import com.test.impl.GoodsService;
import com.test.impl.GoodsTypeService;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceTestProxy {
    class ServiceHandler implements InvocationHandler {

        private Service target;

        public void setTarget(Service service) {
            this.target = service;
        }


        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("代理开始.............");
            Object invoke = null;

            if (method.getName().equals("save")) {
                long starTime = System.currentTimeMillis();
                invoke = method.invoke(target, args);
                System.out.println(target.getClass().getName() + "执行了" + method.getName() + ",耗时:" + (System.currentTimeMillis() - starTime));

            } else if (method.getName().equals("delete")) {
                System.out.println(target.getClass().getName() + "开始执行" + method.getName() + "正在运行期监控");
                invoke = method.invoke(target, args);
                System.out.println(target.getClass().getName() + "结束了" + method.getName() + "，运行期监控结束");
            } else if (method.getName().equals("queryData")) {
                System.out.println(target.getClass().getName() + "开始执行" + method.getName());
                invoke = method.invoke(target, args);

            }

            return invoke;
        }
    }

    @Test
    public void t1() {
        Service goodsService = new GoodsService();

        ServiceHandler serviceHandler = new ServiceHandler();
        serviceHandler.setTarget(goodsService);

        Service o = (Service) Proxy.newProxyInstance(goodsService.getClass().getClassLoader(),
                goodsService.getClass().getInterfaces(),
                serviceHandler);

        o.save(new Object());
        o.delete("110");

        Object[] objects = o.queryData("select", new Object[]{"123", "123"});
        for (int i = 0; i < objects.length; i++) {
            System.out.println("-----" + objects[i]);
        }

    }
}
