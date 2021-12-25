package mapper;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.UUID;

public class TestRedisCon {
    @Test
    public void redisJava(){
        Jedis localhost = new Jedis("localhost");
        long start = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 1000000; i++) {

            arrayList.add(UUID.randomUUID().toString().substring(10));
        }
        System.out.println("ArrayList添加1000000个字符串数据耗费时间："+(System.currentTimeMillis()-start));

        for (int i = 0; i < 1000000; i++) {
            localhost.lpush("muq", UUID.randomUUID().toString().substring(10));
        }
        start = System.currentTimeMillis();
        System.out.println("Redis添加1000000个字符串数据耗费时间："+(System.currentTimeMillis()-start));

        System.out.println("查看是否运行"+localhost.ping());


        System.out.println("redis存储的字符串为："+localhost.get("dq"));
    }
    @Test
    public void t2(){



        int i=0;

        //outloop这个标示是可以自定义的比如outloop1,ol2,out5
        outl:
        for ( i= 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i+":"+j);
                if(j==5) {
                    //i=10;
                    break outl;
                }
            }

        }
    }
    @Test
    public void t3(){
        Jedis localhost = new Jedis("localhost");

        System.out.println(localhost.ping());


        System.out.println(localhost.get("dq"));
    }
}

