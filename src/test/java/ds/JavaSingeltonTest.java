package ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaSingeltonTest {

    private JavaSingelton javaSingelton;
    private JavaSingelton static_javaSingelton;

    @BeforeEach
    void setup() {
        javaSingelton = JavaSingelton.getEagerInstance();
        static_javaSingelton = JavaSingelton.get_static_instance();
    }

    @Test
    void testAdd() {
        assertEquals(3, javaSingelton.add(1, 2));
        assertEquals(3, static_javaSingelton.add(1, 2));
    }

    @Test
    void testSub() {
        assertEquals(2, javaSingelton.sub(3, 1));
        assertEquals(2, static_javaSingelton.sub(3, 1));
    }
}