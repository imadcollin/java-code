package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserFactoryTest {
    private User user;
    private UserFactory userFactory;

    @Test
    public void testUser() {
        User user = new User("user", 24);
        assertEquals("user", user.getName());
        assertEquals(24, user.getAge());
    }

    @Test
    public void testUserBuilder() {
        UserFactory userFactory = new UserFactory();
        userFactory.SetName("user").SetAge(24);
        assertEquals("user", userFactory.getName());
        assertEquals(24, userFactory.getAge());
    }

    @Test
    public void testUserBuilderSalary() {
        UserFactory userFactory = new UserFactory();
        userFactory.SetName("user").SetAge(24).SetSalary(2000);
        assertEquals("user", userFactory.getName());
        assertEquals(24, userFactory.getAge());
        assertEquals(2000, userFactory.getSalary());
    }

    @Test
    public void testUserBuilderDepartment() {
        UserFactory userFactory = new UserFactory();
        userFactory.SetName("user").SetAge(24).SetSalary(2000).SetDepartment(Department.IT);
        assertEquals("user", userFactory.getName());
        assertEquals(24, userFactory.getAge());
        assertEquals(2000, userFactory.getSalary());
        assertEquals(Department.IT, userFactory.getDepartment());
    }

}