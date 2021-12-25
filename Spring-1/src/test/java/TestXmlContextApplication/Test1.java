package TestXmlContextApplication;

import com.servlet.ServletUser;
import com.servlet.impl.ServletUserImp;
import com.test.impl.Person;
import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Test1 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Person person = context.getBean("Person", Person.class);

        person.show();

    }

    @Test
    public void t2() {
        final int a = 10000000;
        ArrayList arrayList = new ArrayList();

        long start = System.currentTimeMillis();
        for (long i = 0; i < a; i++) {
            arrayList.add(i);
        }
        System.out.println("耗费时间：" + (System.currentTimeMillis() - start));

        Vector vector = new Vector();

        long start1 = System.currentTimeMillis();
        for (long i = 0; i < a; i++) {
            vector.add(i);
        }
        System.out.println("耗费时间：" + (System.currentTimeMillis() - start1));
    }

    @Test
    public void t3() {
        Stack<String> stack = new Stack<String>();
        System.out.println("栈大小：" + stack.size());
// 需要把这个字符串里面的每个字符都压入栈。
        String data = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
// 按照空格切分
        String[] array = data.split(" ");

        // FOR循环压入栈
        for (String str : array) {
// 入栈
            stack.push(str);
        }
        System.out.println("栈大小：" + stack.size());
        System.out.println("栈顶元素：" + stack.peek()); // 最后入栈的元素。
        int index = stack.search("t"); // 查找t元素
        System.out.println("查找't'元素：" + index);
        index = stack.search("aa"); // 查找元素；返回的是元素的位置
        System.out.println("查找'aa'元素：" + index); // 如果位置<0，意味

// 单个出栈
// String s = stack.pop();
// System.out.println(s);
// 出栈不能使用for的stack.size()来进行判断。
        /*
         * for(int i=0; i<stack.size(); i++) { String s = stack.pop();
         * System.out.println("出栈：" + s); }
         */
// 栈不为空的时候可以出栈。
        while (!stack.empty()) {
            String s = stack.pop();
            System.out.println("出栈：" + s);
        }
        System.out.println("栈大小：" + stack.size());

    }

    @Test
    public void t4() {
        HashSet hashSet = new HashSet();

        hashSet.add(1);
        hashSet.add(1);
        System.out.println(hashSet.size());
        for (int i = 0; i < 10; i++) {
            hashSet.add(i);
        }
        System.out.println(hashSet.size());

    }

    @Test
    public void t5() {
        HashMap<String, Object> hashMap = new HashMap();

        hashMap.put("1", 1);
        hashMap.put(null, 2);

        //键值都可以为空，且🗡一旦重复，会覆盖上一个的值

        System.out.println(hashMap.size());
        System.out.println(hashMap.get(null));


        Hashtable<String, Object> stringObjectHashtable = new Hashtable<String, Object>();

        //Hashtable的键值对不能为空，其他的都与HashMap相同
        stringObjectHashtable.put(null, 1);
        stringObjectHashtable.put("1", 2);
        System.out.println(stringObjectHashtable.size());
        System.out.println(stringObjectHashtable.get("1"));
    }

    @Test
    public void t6() {
        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<Object, Object>();

        objectObjectTreeMap.put(1, 2);
        objectObjectTreeMap.put(1, 3);//相同键，其值会被覆盖
        objectObjectTreeMap.put(null, 1);//键值对不能为空
        System.out.println(objectObjectTreeMap.size());
        System.out.println(objectObjectTreeMap.get(1));
    }

    @Test
    public void t7() {
        Hashtable<Object, Integer> objectObjectHashtable = new Hashtable<Object, Integer>();

        for (int i = 0; i < 10; i++) {
            objectObjectHashtable.put(i, (int) (Math.random() * 1000));
        }
        ArrayList<Map.Entry<Object, Integer>> entries = new ArrayList(objectObjectHashtable.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Object, Integer>>() {
            public int compare(Map.Entry<Object, Integer> o1, Map.Entry<Object, Integer> o2) {
                return o1.getValue() > o2.getValue() ? 1 : -1;
            }
        });

        for (Map.Entry<Object, Integer> ma : entries) {
            System.out.println(ma.getKey() + "----->" + ma.getValue());
        }
        int i = 0;
        while (entries.iterator().hasNext()) {
            System.out.println(entries.size());
        }
    }


    @Test
    public void t8() {


        try {
            Object o = new Object();

            Person o1 =  (Person)o;
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("继续执行");

    }
    @Test
    public void t10() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /**
         * 方法一
         */
        Integer o = (Integer)(Class.forName("java.lang.Integer").newInstance());

        /**
         * 方法二
         */
        Integer integer = o.getClass().newInstance();

        /**
         * 方法三
         */
        Integer integer1 = Integer.class.newInstance();



    }

}
