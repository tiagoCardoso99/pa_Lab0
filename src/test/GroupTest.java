package test;

import com.pa.Person;
import com.pa.Group;
import org.junit.Test;
import static org.junit.Assert.*;

public class GroupTest {

    @Test
    public void testAddMember() {
        Person p1 = new Person(1, "Tiago");
        Person p2 = new Person(2,"Churro");
        Person p3 = new Person(3, "Boneco");
        Group g1 = new Group(p1);
        g1.addMember(p2);
        g1.addMember(p1);
        g1.addMember(p3);
    }

    @Test
    public void testDeleteMember() {
        Person p1 = new Person(1, "Tiago");
        Person p2 = new Person(2,"Churro");
        Group g1 = new Group(p1);
        g1.addMember(p1);
        g1.addMember(p2);
        g1.deleteMember(p2);
    }

    @Test
    public void testChangeChief() {
        Person p4 = new Person(1, "Tiago");
        Person p2 = new Person(2,"Churro");
        Person p3 = new Person(3, "Boneco");
        Group g1 = new Group(p4);
        g1.addMember(p4);
        g1.addMember(p2);
        g1.changeChief(p2);
    }

    @Test
    public void testToString() {
        Person p3 = new Person(1, "Tiago");
        Person p4 = new Person(2,"Churro");
        Group g1 = new Group(p3);
        g1.addMember(p3);
        g1.addMember(p4);
        toString();
    }
}
