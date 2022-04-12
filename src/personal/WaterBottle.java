package personal;

public class WaterBottle {

    private String brand;
    private double oz;

    public WaterBottle(String brand, double oz) {
        setBrand(brand);
        setOz(oz);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!brand.contains(" ") && brand != null){
            this.brand = brand;
        }
    }

    public double getOz() {
        return oz;
    }

    public void setOz(double oz) {
        if (oz > 0){
            this.oz = oz;
        }
    }
}

class Sport{

    private String name;
    private int numOfPlayers;
    private boolean teambased;

    public Sport(String name, int numOfPlayers, boolean teambased) {

        setName(name);
        setNumOfPlayers(numOfPlayers);
        setTeambased(teambased);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        if (numOfPlayers > 0){
            this.numOfPlayers = numOfPlayers;
        }
    }

    public boolean isTeambased() {
        return teambased;
    }

    public void setTeambased(boolean teambased) {
        this.teambased = teambased;
    }
}
