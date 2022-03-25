package ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaSingeltonTest {

    private JavaSingelton javaSingelton;
    private JavaSingelton static_javaSingelton;
    private JavaSingelton lazy_javaSingelton;

    @BeforeEach
    void setup() {
        javaSingelton = JavaSingelton.getEagerInstance();
        static_javaSingelton = JavaSingelton.get_static_instance();
        lazy_javaSingelton = JavaSingelton.getLazyInstance();
    }

    @Test
    void testAdd() {
        assertEquals(3, javaSingelton.add(1, 2));
        assertEquals(3, static_javaSingelton.add(1, 2));
        assertEquals(3, lazy_javaSingelton.add(1, 2));
    }

    @Test
    void testSub() {
        assertEquals(2, javaSingelton.sub(3, 1));
        assertEquals(2, static_javaSingelton.sub(3, 1));
        assertEquals(2, lazy_javaSingelton.sub(3, 1));
    }

    @Test
    void testAppend() {
        assertEquals("test1; test2; test3.", lazy_javaSingelton.appendComma("test1; test2; test3;"));
        assertEquals("test1; test2; test3.", lazy_javaSingelton.appendComma("test1; test2; test3; "));
    }
}