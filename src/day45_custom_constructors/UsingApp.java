package day45_custom_constructors;

public class UsingApp {

    public static void main(String[] args) {

        App snapChat = new App();

        snapChat.name = "SnapChat";
        snapChat.version = 2.19;
        snapChat.isFree = true;

        snapChat.update();

//        System.out.println(snapChat); -> Prints out location in hash memory
        System.out.println();


        System.out.println("App Information");
        System.out.println("Name: " + snapChat.name);
        System.out.println("Version: " + snapChat.version);
        System.out.println(snapChat.isFree ? "App is free" : "App is not free");
    }

}
