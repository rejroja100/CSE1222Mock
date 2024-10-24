public class Director extends Supervisor{

    public Director(String name, double wage, String division) {
        super(name, wage, division);
    }


    @Override
    public String toString() {
        return "Director - Name: " + name + ", Division: " + division + ", Wage: " + wage;
    }

}
