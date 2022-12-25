import java.util.*;

public class Main {


    public static void main(String[] args) {


        User user1 = new User("А", 1);
        User user2 = new User("А", 1);
        User user3 = new User("Г", 63);
        User user4 = new User("В", 92);
        User user5 = new User("Д", 54);
        User user6 = new User("Е", 7);
        User user7 = new User("Б", 1);
        Set<User> set = new HashSet<>(); //убирает повторы
        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);
        set.add(user6);
        set.add(user7);
        System.out.println(set); // выводим

        List<User> list = new ArrayList<>(set);

        list.sort(new Comparator<User>() { // сортирует по возрасту
            @Override
            public int compare(User p1, User p2) {
                if (p1.getAge() != p2.getAge()) {
                    return p1.getAge() - p2.getAge();
                }
                return p1.getName().compareTo(p2.getName());
            }
        });
        System.out.println(list);

        Collections.sort(list); // сортируем по имени
        System.out.println(list);

        old(set);

    }

    public static void old(Set<User> users) {
        int max = Integer.MIN_VALUE;
        String name = null;
        for (User user : users) {
            if (user.getAge() > max) {
                max = user.getAge();
                name = user.getName();
            }
        }
        System.out.println("Самый старый пользователь:" + name + " " + max);
    }
}