/**
 * Created by Admin on 26.04.2017.
 */
public class ChilderBycicle extends  Bycicle {
    private int mass;
    private int Passengers;
    private int NumberOfWheels;



    ChilderBycicle(String name, int speed, int Imass, int Passengers, int InumberOfWheels)
    {

        super(name, speed, Passengers);
        NumberOfWheels = InumberOfWheels;
        mass = Imass;

    }

}


