package multiThreading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaThreadsTest {
    private JavaThreads javaThreads;

    @Test
    void test_thread_run() {
        JavaThreads javaThreads = new JavaThreads();
        javaThreads.run();
        assertEquals(1, JavaThreads.counter);
    }

}