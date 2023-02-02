public class People extends Character{

    private String PlaceOfOrigin;
    protected String Action;
    private String Clothes;
    private  boolean checking;
    private boolean speaking;
    private int age;

    public void Move(String Who, String Action, String Object1, String Object2){
        this.name = Who;
        this.Action = Action;
        System.out.println(Action + " " + Object1 + " " + Object2 );
    }

    public void setAction(String Action){
        this.Action = Action;
        System.out.println(Action);
    }

    public final String getAction() {
        return this.Action;
    }

    public void Move(String Who, String Action){
        this.Action = Action;
        System.out.println(Who + " " + Action);
    }

    public void Move(String Who, String Action, String Location){
        this.Action = Action;
        this.Location = Location;
        System.out.println(Who + " " + Action + " " + Location);
    }

    public void setLocation(String Location){
        this.Location = Location;
        //System.out.println(Location);
    }

    public boolean check(String Action){
        if ( Action == "стоял"){
            this.checking = true;
            //System.out.println( this.checking);
            return true;
        }
        return false;
    }

    public boolean speak(String Action){
        if (Action == "скажем"){
            this.speaking = true;
            return true;
        }
        return false;
    }

    public People (String name) {
        this.name = name;
    }

    public People (String name, String PlaceOfOrigin) {
        this.name = name;
        this.PlaceOfOrigin = PlaceOfOrigin;

    }

    public final int getAge() {
        return  this.age;
    }

    public People (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setCondition(String name, String Condition){
        this.name = name;
        this.Condition = Condition;
        System.out.println(name +  " " + Condition);
    }

    public void setClothes(String name, String Clothes){
        this.name = name;
        this.Clothes = Clothes;
        System.out.println(name +  " " + Clothes);
    }

    public void setCondition(int numberTalk, String name){
        PeopleTalk a[];
        a = PeopleTalk.values();
        this.name = name;
        //System.out.println(name +  " " + a[numberTalk]);
    }
    public void setCondition(String name, int numberFeel){
        PeopleFeel a[];
        a = PeopleFeel.values();
        this.name = name;
        System.out.println(name +  " " + a[numberFeel]);
    }

    public String BookName;
    public boolean mistake;

    public void read(String BookWhose) throws WrongBookException {
        System.out.println("Чья книжка?");
        if (BookName == "наша") {
            System.out.println("Наша книжка");
        } else {
            this.mistake = false;
            throw new WrongBookException("Книжка " + BookWhose);
        }
    }
    @Override
    public String toString() {
        return "Кто хочет какао?";
    }

}



