package DatingGuitars;

public abstract class GibsonGuitar {

    public String name;
    private int serial1, serial2, serial3, serial4, serial5, serial6, serial7, serial8;


    public GibsonGuitar(String name, int serial1, int serial2, int serial3, int serial4, int serial5, int serial6,
                         int serial7, int serial8){
        this.name = name;
        this.serial1 = serial1; // Year
        this.serial2 = serial2; // Day
        this.serial3 = serial3; // D
        this.serial4 = serial4; // D
        this.serial5 = serial5; // Y
        this.serial6 = serial6; // Part
        this.serial7 = serial7; // P
        this.serial8 = serial8; // P
        // LesPaul Serial 52694146



    }
    public Integer setyear1(){
        return (serial1);
    }
    public Integer setyear2(){
        return (serial5);
    }
}
