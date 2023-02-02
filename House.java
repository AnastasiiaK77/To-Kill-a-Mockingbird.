public class House extends InanimateCharacters{

    public void setCondition(int number, String nameWhose, String name){
        ÑonditionHouse a[];
        a = ÑonditionHouse.values();
        this.name = name;
        this.nameWhose = nameWhose;
        System.out.println(nameWhose + " " + name +  " " + a[number]);
    }

    public House(String nameWhose, String name) {
        this.name = name;
        this.nameWhose = nameWhose;
       // System.out.println(nameWhose + " " + name);
    }
}
