public class InanimateCharacters extends Character{
    protected String nameWhose;
    protected String Action;
    private int Quantity;

    public InanimateCharacters(String name)  {
        this.name = name;
    }

    public InanimateCharacters() {
    }

    public void setLocation(String Location) {
        this.Location = Location;
        //System.out.println(Location);
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
        //System.out.println(Condition);
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
        //System.out.println(Condition);
    }

    public final int getQuantity() {
        return this.Quantity;
    }

    public void Move(String Who, String Action){
        this.Action = Action;
        System.out.println(Who + " " + Action);
    }
}






