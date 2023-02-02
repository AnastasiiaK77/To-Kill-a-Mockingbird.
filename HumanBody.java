public class HumanBody {
    protected String name;
    protected String nameWhose;
    protected String Location;
    protected String Condition;
    private String Direction;
    private int coordinates;

    public HumanBody(String name) {
        this.name = name;
        // System.out.println(name);
    }
    public HumanBody(String name, String nameWhose) {
        this.name = name;
        this.nameWhose = nameWhose;
        // System.out.println(nameWhose + " " + name);
    }
    public HumanBody(String name, String nameWhose, String Location) {
        this.name = name;
        this.nameWhose = nameWhose;
        this.Location = Location;
        System.out.println(nameWhose + " " + name + " " + Location);
    }
    public void setDirection(String Direction, int coordinates){
        this.Direction = Direction;
        this.coordinates = coordinates;
        //System.out.println(Direction);
    }
    public void setLocation(String Location){
        this.Location = Location;
        //System.out.println(Direction);
    }

    public final String getLocation() {
        return this.Location;
    }

    public void setCondition(String name, String Condition){
        this.name = name;
        this.Condition = Condition;
        System.out.println(name +  " " + Condition);
    }

    public final String getCondition(){
        return this.Condition;
    }

    public void cold() throws FireException {
        if (Math.random()>0.4) {
            System.out.println("замерзли");
        } else {
            throw new FireException("Ноги замерзли, отогреть невозможно");
        }
    }



}
