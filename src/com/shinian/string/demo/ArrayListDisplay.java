package com.shinian.string.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayListDisplay {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        for (User user : new UserGenerator(10)) {
            users.add(user);
        }
        System.out.println(users);
    }
}

class UserGenerator implements Iterable<User> {

    private static Random random = new Random(47);
    private List<User> users;
    private int size;

    public UserGenerator(int size) {
        this.size = size;
        users = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            User user = new User();
            user.setId(i);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                sb.append((char) random.nextInt(100));
            }
            user.setName(sb.toString());
            users.add(user);
        }
        
    }

    /**
     * 实现迭代器
     */
    @Override
    public Iterator<User> iterator() {

        return new Iterator<User>() {

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            // 返回下一个
            @Override
            public User next() {
                return users.get(--size);
            }

            // 返回是否还有
            @Override
            public boolean hasNext() {
                return size > 0;
            }
        };
    }
}

class User {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }

}
