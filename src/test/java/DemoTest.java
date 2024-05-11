import org.junit.jupiter.api.Test;
import org.udemy.junit.Person;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {
    @Test
    void testDemo() {
        System.out.println("test demo !!!");
    }

    @Test
    void testequalityPrimitiveVar() {
        int a =1;
        int b=2;
        int c=1;

        assertNotEquals(a, b);
        assertEquals(a, c);
    }

    @Test
    void testequalityObjects() {
        Person p = new Person();
        p.setAge(23);
        p.setName("israe");
        Person p2 = new Person();
        p2.setName("salim");
        p2.setAge(34);
        Person p3 = new Person();
        p3.setName("israe");
        p3.setAge(23);
         //assertNotEquals(p, p2);
        // equals fonctionne si on redefinit la methode equals dans le classe person qui compare les valeurs de l'objet
        // par default il compare si les deux objets pointe sur la meme adresse memoire et elle retourne false
        //assertEquals(p, p3);
        assertTrue(p.equals(p3));
      //  assertTrue(p==p3);
    }


   @Test
    void testequalityStringObj() {
       String a="Hello";
        String b="Hello";
        assertTrue(a.equals(b));
    }


    @Test
    void testequalsInt() {
        Integer a=10;
        // we can't use equqls to compare primitifs types
        assertTrue(a.equals(10));
    }

}
