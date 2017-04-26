/**
 * Created by Admin on 26.04.2017.
 */
public class main {
    public static void main (String[] args)
    {
        Bycicle bike = new Bycicle ("Venum", 30, 2);
        System.out.println("Name :" + bike.getName() + " speed :" + bike.getSpeed() + " Pass" + bike.getPass());
        ChilderBycicle bike2 = new ChilderBycicle("Dick", 2, 2, 2, 2 );
        System.out.println("D " + bike.getName() + "S " + bike.getSpeed() + "Q " + bike.getPass() + "W " + bike.getMass() + "Y " + bike.getWheels());

    }
}
