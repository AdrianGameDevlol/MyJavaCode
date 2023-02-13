public class Car{
    private String type, colour, transmissionType;
    private long cost;
    public Car(String tp, String clr, String tType, long c){
        type = tp;
        colour = clr;
        transmissionType = tType;
        cost = c;
    }
    public long getCost(){
        return cost;
    }
    public String getType(){
        return type;
    }
    public String getColour(){
        return colour;
    }
    public String getTransmissionT(){
        return transmissionType;
    }
}