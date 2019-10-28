package DatingGuitars;

public class Guitar {

    private String serialnumber;
    public Guitar (String serialnumber){
        this.serialnumber = serialnumber;

    }

    public String getYearOfProduction(){
        char c = serialnumber.charAt (0);
        char cl = serialnumber. charAt (4);
        return "19" + c + cl;
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar ("51887642");
        System.out.println ();
    }

}



