public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {                   // create constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {                               // create getter
        return this.name;
    }
    public int getAge() {                                   // create getter
        return this.age;
    }
}
