package test;

import com.pa.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

     @Test
    public void testGetName() {
        Person p1 = new Person(1, "Tiago");
        assertEquals("Tiago", p1.getName());
    }

    @Test
    public void testGetId() {
         Person p2 = new Person(2, "Tiago");
         assertEquals(2, p2.getId());
    }

    @Test
    public void testSetId() {
        Person p3 = new Person(3, "Tiago");
        p3.setId(1);
        assertEquals(1, p3.getId());
    }

    @Test
    public void testSetName(){
        Person p4 = new Person(4, "Tiago");
        p4.setName("Joao");
        assertEquals("Joao", p4.getName());
    }


}
