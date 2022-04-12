package day50_inheritance;

public class FlightTicket {

    private String type;
    private String depLocation;
    private String arivLocation;

    public FlightTicket(String type, String depLocation, String arivLocation) {
        setType(type);
        this.depLocation = depLocation;
        this.arivLocation = arivLocation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        switch (type){
            case "first":
            case "business":
            case "economy":
                this.type = type;
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }

    public String getDepLocation() {
        return depLocation;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }

    public String getArivLocation() {
        return arivLocation;
    }

    public void setArivLocation(String arivLocation) {
        this.arivLocation = arivLocation;
    }
}
