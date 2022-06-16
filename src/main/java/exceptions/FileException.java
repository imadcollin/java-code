package exceptions;

public class FileException extends Exception {
    private String msg;
    private static ErrorCode errorCode = new ErrorCode();
    private STATUS status;

    public FileException(String msg) {

        super(msg);
    }

    public FileException(String msg, Throwable e) {
        super(msg, e);
    }

    public FileException(String msg, ErrorCode errorCode) {
        super(msg);
        this.errorCode = errorCode;
    }

    public FileException(String msg, STATUS s) {
        super(msg);
        this.status = s;
    }

    public FileException(String s, String bad_name) {
        super(s);
        this.errorCode.msg = bad_name;
    }

    public enum STATUS {
        TEST("Some test "), GREEN("some test");

        private String message;

        STATUS(String s) {
            this.message = s;
        }
    }

    public static class ErrorCode {
        private String msg;
        public static String Bad_NAME = "FILE NAME IS BAD";

        public ErrorCode(String msg) {
            this.msg = msg;
        }

        public ErrorCode() {
        }

    }

    public static void main(String[] args) throws FileException {
        for (int i = 1; i < 3; i++) {
            switch (i) {
                case 1:
                    //   throw new FileException("1");
                    throw new FileException("1", ErrorCode.Bad_NAME);
                case 2:
                    //        throw  new FileException("2", new Throwable());
                case 3:
                    System.out.println(STATUS.TEST.message);
                    throw new FileException("3", STATUS.GREEN);
            }
        }

    }
}
