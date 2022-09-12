package feature;


public class NewFeature {

    public String switchCase(String str) {
        return switch (str) {
            case "hello" -> "hello world";
            case "bye" -> "good bye";
            default -> "not valid input";
        };
    }

    public String switchCase2(String day) {
        return switch (day) {
            case "mon", "tues":
                yield "working";
            case "sat", "sun":
                yield "holiday";
            default:
                yield "none";
        };
    }

    public int stringLengthinstanse(String str) {
        Object obj = str;
        if (obj instanceof String) {
            String value = ((String) obj);
            return ((String) value).length();
        }
        return 0;
    }

    public int stringLEngthNewWay(String str) {
        Object obj = str;
        if (obj instanceof String value) return value.length();
        return 0;
    }

    public String stringNewLine() {

        return """ 
                one 
                two 
                three
                """;
    }

    public String getFormatedString(String s1, String s2) {
        return
                """
                        Name: %s 
                        NickName: %s
                        """.formatted(s1, s2);
    }
}

class Person {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


}