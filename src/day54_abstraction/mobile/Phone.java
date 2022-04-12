package day54_abstraction.mobile;

public class Phone {

    public static void main(String[] args) {

        MobileApp app1 = new MobileApp();
        app1.setName("Generic");
        app1.setVersion(1.2);
        app1.useApp(10);
        app1.download();

        System.out.println();
        Instagram instagram = new Instagram();

        instagram.setName("Instagram");
        instagram.setVersion(2.3);
        instagram.useApp(10);
        instagram.download();

    }
}
