/**
 * Created by Admin on 26.04.2017.
 */
public class AdultBycicle extends  Bycicle {


    private int mass;
    private int Passengers;
    private int NumberOfWheels;


    public int getMass()

    {
        return mass;
    }

    public int getWheels()
    {
        return NumberOfWheels;
    }

    AdultBycicle(String name, int speed, int Imass, int Passengers, int InumberOfWheels)
    {

        super(name, speed, Passengers);
        NumberOfWheels = InumberOfWheels;
        mass = Imass;

    }

}
