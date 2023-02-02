import java.util.Objects;
public class NaturalPhenomena extends Character{
    private String time;
    public NaturalPhenomena (String Condition, String name) {
        this.Condition = Condition;
        this.name = name;
        System.out.println(Condition + " " + name );
    }
    public NaturalPhenomena (String Location1, String Location2, String Condition, String name, String time) {
        this.Condition = Condition;
        this.name = name;
        this.time = time;
        System.out.println(Condition + " " + name + " " + "от" + " " +  Location1 + " " + Location2);
    }
    public NaturalPhenomena (String Condition, String name, String Location,String time) {
        this.Condition = Condition;
        this.name = name;
        this.Location = Location;
        this.time = time;
        System.out.println(Condition + " " + name + " " + Location);
    }

    @Override
    public boolean equals(Object A)
    {
        if (A == this) {
            return true;
        }
        if (A == null || A.getClass() != getClass()) {
            return false;
        }
        NaturalPhenomena B = (NaturalPhenomena) A;
        if (time != B.time) return false;
        return Objects.equals(time, B.time);
    }

    public final String getCondition() {
        return this.Condition;
    }



}

