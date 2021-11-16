package streams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectors {
    @Test
    public void array_to_list() {
        String[] arr = new String[]{"a", "c", "b"};
        List<String> stringList = Arrays.asList(arr);
        assertEquals(arr.length, stringList.size());
    }

    @Test
    public void filteringByName() {
        List<User> users = Arrays.asList(new User("adam"), new User("eva"), new User("shad"));
        List<User> filteredList = users.stream().filter(u -> u.getName().startsWith("s")).collect(Collectors.toList());

        assertSame(filteredList.get(0).getName(), users.get(2).getName());
    }

    @Test
    public void filterUserByAge() {
        List<UsersAge> usersWithAges = Arrays.asList(new UsersAge("adam", 18), new UsersAge("eva", 22), new UsersAge("shad", 15));

        usersWithAges.sort(Comparator.comparingInt(UsersAge::getAge));
        assertEquals(usersWithAges.get(0).getAge(), 15);
        assertEquals(usersWithAges.get(1).getAge(), 18);
        assertEquals(usersWithAges.get(2).getAge(), 22);

    }
}


class User {
    private final String name;

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class UsersAge {
    private String name;
    private int age;

    UsersAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
