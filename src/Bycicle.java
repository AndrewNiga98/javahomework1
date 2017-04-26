/**
 * Created by Admin on 26.04.2017.
 */
public  class Bycicle extends Machine {

    private final int MINPASS = 1;
    private final int MAXPASS = 20;
    private int mass;
    private int NumberOfWheels;
    private int Passengers;


    public int getMass()

    {
        return mass;
    }

    public int getWheels()
    {
        return NumberOfWheels;
    }

    public int getPass()
    {

        return Passengers;
    }

    Bycicle(String name, int speed, int Ipassengers) {
        super(name, speed);

        if(Ipassengers < MINPASS)
        {
            Passengers = MINPASS;
        }
        else if(Ipassengers > MAXPASS)
        {
            Passengers = MAXPASS;
        }
        else {
            Passengers = Ipassengers;
        }

    }


}
