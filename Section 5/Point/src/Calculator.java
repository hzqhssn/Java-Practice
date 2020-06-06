public class Calculator {
    private Floor floor = null;
    private Carpet carpet = null;


    public Calculator(Floor floor, Carpet carpet)
    {
       this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost()
    {
        return floor.getArea()* carpet.getCost();
    }
}
