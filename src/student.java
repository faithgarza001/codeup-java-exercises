import java.util.Date;

public class student {
    String name;
    String cohort;
    Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args) {
        student daniel = new student();
        daniel.name = "Daniel";

        student zach = new student();
        zach.name = "Zach";
        zach.drinksCoffee = true;
        if(zach.drinksCoffee)
            System.out.println("Yum");
        System.out.println(daniel.name);
        System.out.println(zach.name);
        System.out.println(daniel.report());
    }
    public String report() {
        String output = "";
        output += "My name is " + this.name;
        output += " I started learning " + this.program + "with" + this.cohort + "on" + this.startDate + ". ";
        if (this.drinksCoffee)
            output += "I drink coffee in " + this.location + ".";
            return output;

    }
}
