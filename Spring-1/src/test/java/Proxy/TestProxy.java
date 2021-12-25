package Proxy;

import com.test.Action;
import com.test.impl.Animal;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class TestProxy {


    class AnimalProxy implements InvocationHandler{

        private Animal animal;

        public void setAnimal(Animal animal){
            this.animal = animal;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            Object invoke = method.invoke(animal, args);
            return invoke;
        }
    }
    @Test
    public void t1(){
        Animal cat = new Animal("猫");

        System.out.println(cat);


        AnimalProxy animalProxy = new AnimalProxy();


        Action o = (Action)Proxy.newProxyInstance(
                cat.getClass().getClassLoader(),
                cat.getClass().getInterfaces(),
                animalProxy);
        animalProxy.setAnimal(cat);


        o.eat("🐟");
        o.speak("喵喵");

        List arrayList = new ArrayList();
        arrayList.add("111");
        arrayList.add("1122");

        List show = o.show(arrayList);

        for (int i = 0; i < show.size(); i++) {
            System.out.println("---"+show.get(i));
        }


    }
}
