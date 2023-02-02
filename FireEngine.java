public class FireEngine extends InanimateCharacters{

    public FireEngine (String name) {
        this.name = name;
    }
    public void Move(String Action, String Location, String name){
        System.out.println(Location + " " + Action + " " + name);
    }
    public void setLocation(String Location){
        this.Location = Location;
        //System.out.println(Location);
    }
    public final String getLocation() {
        return this.Location;
    }

    public void setAction(String Action){
        this.Action = Action;
        //System.out.println(Location);
    }

    public class Wheels{
        public void sound() {
            System.out.println("шины взвизгнули");
        }
    }
}

