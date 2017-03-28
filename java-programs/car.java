// Programmed by:   Stephen Brower


public class Car  implements Comparable<Car>
{
    private int yearModel;
    private String make;
    private int speed;

    public Car(int newYearModel, String newMake)
    {
        yearModel = newYearModel;
        make = newMake;
        speed = 0;
    }

    public int getYearModel()
    {
        return yearModel;
    }

    public String getMake()
    {
        return make;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void accelerate()
    {
        // i am ommitting a regulator
        speed += 5;
    }

    public void brake()
    {
        speed-=5;
        if (speed < 0)
            speed = 0;
    }

    // Note: What's passed in is really an "Object" not a "Car"
    public boolean equals(Object obj)
    {
        Car otherCar = (Car) obj;  // cast the Object to a Car

        if (make.equalsIgnoreCase(otherCar.getMake())
            && yearModel == otherCar.getYearModel())
            return true;
        else
            return false;
    }

    public int compareTo(Car anotherCar)
    throws ClassCastException
    {
        if (!(anotherCar instanceof Car))
            throw new ClassCastException("A Car object expected.");

        if (getYearModel() < anotherCar.getYearModel())
            return -1;
        else if (getYearModel() > anotherCar.getYearModel())
            return 1;
        else
            return make.compareToIgnoreCase(anotherCar.getMake());
    }


    public String toString()
    {
        return "[Car " + yearModel +" "+ make+"]";
    }

}
