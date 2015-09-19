/**
 * Created by Gregg on 19/09/2015.
 */
public class Car {
   private String color = "default";
    private String make = "default";

    public String getColor(){
        return color;
    }
    public String getMake(){
        return make;
    }
    public void setColor(String carColor){
        color = carColor;
    }
    public void setMake(String carMake){
        make = carMake;
    }
}
