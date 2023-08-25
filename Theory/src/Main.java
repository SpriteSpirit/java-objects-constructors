public class Main {
    public static void main(String[] args) {
        Book_ warAndPeace = new Book_();

        warAndPeace.authorName = "Leo Tolstoy";
        System.out.printf("Author: %s%n", warAndPeace.authorName);

        warAndPeace.bookName = "War and Peace";
        System.out.printf("Title: \"%s\"%n", warAndPeace.bookName);

        warAndPeace.publishingYear = 1867;
        System.out.printf("Published: %d%n%n", warAndPeace.publishingYear);

        /* ------------------------------------------------------*/

        Person sarah = new Person("Sarah", 30);
        System.out.printf("Name: %s%nAge: %d%n%n", sarah.getName(), sarah.getAge());

        Person john = new Person("John", 13);
        john.setAge(john.getAge() + 10);
        System.out.printf("Name: %s%nAge: %d%n%n", john.getName(), john.getAge());

    }
}