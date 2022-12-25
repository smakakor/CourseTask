import java.util.Objects;

public class User implements Comparable<User> {
    private final String name;
    private final Integer age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(User o) {
        int result = this.name.compareTo(o.name);
        if ( result == 0) {
            result = this.age.compareTo(o.age);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Имя-" + name + " возраст-" + age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
