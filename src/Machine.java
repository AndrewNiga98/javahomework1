/**
 * Created by Admin on 26.04.2017.
 */
abstract class Machine implements  Run {
    private final int MAXSPEED = 150;
    private final int MINSPEED = 1;
    private final int MINPASS = 1;
    private final int MAXPASS = 20;
    private String name;
    private int speed;

    public String getName()
    {
        return name;

    }

    public int getSpeed()
    {
        return speed;
    }


    Machine(String iName, int iSpeed)
    {
        name = iName;
        if(iSpeed < MINSPEED)
        {
            speed = MINSPEED;
        }
        if(iSpeed > MAXSPEED)
        {
            speed = MAXSPEED;
        }
        else
        {
            speed = iSpeed;
        }

    }
}
