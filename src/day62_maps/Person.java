package day62_maps;

public class Person {

    String name;
    int age;
    String favoriteHobby;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favoriteHobby='" + favoriteHobby + '\'' +
                '}';
    }
}
