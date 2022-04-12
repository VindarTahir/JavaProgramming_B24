package day57_polymorphism.driver;

public class Link implements WebElement{

    @Override
    public void sendKeys(String txt) {
        System.out.println("Not Valid");
    }

    public String getUrl(){
        return "google.com";
    }

    @Override
    public void click() {
        System.out.println("Opening Link");
    }

    @Override
    public String getText() {
        return "Links text";
    }
}
