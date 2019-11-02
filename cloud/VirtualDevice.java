package cloud;

abstract class VirtualDevice
{

    //protected final int key;

    /*
    public VirtualDevice(int key, int unitNumber)
    {
        this.key = key;
        this.unitNumber = unitNumber;
    }
    */
    /*
    public int getKey()
    {
        return this.key;
    }
    */

    protected int unitNumber;
    protected Description description; //TODO

    public VirtualDevice(int unitNumber)
    {
        this.unitNumber = unitNumber;
    }

    public int getUnitNumber()
    {
        return this.unitNumber;
    }

    public Description getdescription()
    {
        return this.description;
    }

    public void setUnitNumber(int unitNumber)
    {
        this.unitNumber = unitNumber;
    }

    public void setdescription(Description description)
    {
        this.description = description;
    }

}