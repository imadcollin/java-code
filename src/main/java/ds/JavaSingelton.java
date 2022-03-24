package ds;

public class JavaSingelton {
    private static JavaSingelton instance = new JavaSingelton();

    public final static JavaSingelton getEagerInstance() {
        return instance;
    }

    public JavaSingelton() {
    }

    private static JavaSingelton static_instance;

    static {
        try {
            static_instance = new JavaSingelton();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public static JavaSingelton get_static_instance() {
        return static_instance;
    }

    protected int add(int a, int b) {
        return a + b;
    }

    protected int sub(int b, int a) {
        return (b - a > 0) ? b - a : 0;
    }
}
