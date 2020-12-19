package Person;

import java.util.Objects;

public abstract class Human {
    private int age;
    private String name;

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public abstract void go(String where);
    public abstract void go(String where, Engineer engineer) throws InterruptedException;
    public abstract void go();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
