package TestXmlContextApplication;

import com.test.impl.Person;
import org.junit.Test;

public class Tes {
    @Test
    public void t1(){
        Person person = new Person();

        System.out.println(person.hashCode());
        System.out.println(person);

        Person person1 = person;
        System.out.println(person1);
    }
}
