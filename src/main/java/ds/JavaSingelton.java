package ds;

public class JavaSingelton {
    private static JavaSingelton instance = new JavaSingelton();
    private static JavaSingelton lazyInstance = new JavaSingelton();
    private static JavaSingelton threadSafeInstance = new JavaSingelton();

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

    public static JavaSingelton getLazyInstance() {
        if (lazyInstance != null) {
            return lazyInstance;
        }
        return new JavaSingelton();
    }

    public static JavaSingelton get_static_instance() {
        return static_instance;
    }

    public static synchronized JavaSingelton getThreadSafeInstance() {
        if (threadSafeInstance == null) {
            threadSafeInstance = new JavaSingelton();
        }
        return threadSafeInstance;
    }

    protected int add(int a, int b) {
        return a + b;
    }

    protected int sub(int b, int a) {
        return (b - a > 0) ? b - a : 0;
    }

    protected String appendComma(String s) {
        s = s.trim();
        return s != null ? s.substring(0, s.length() - 1).concat(".") : "";
    }
}
