public class Supervisor extends Worker{

    protected String division;

    public Supervisor(String name, double wage, String division) {
        super(name, wage);
        this.division = division;
    }


    @Override
    public String toString(){
        return "Name: " + name + ", Division: " + division + ", Wage: " + wage;
    }

}
