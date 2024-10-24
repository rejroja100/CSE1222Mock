public class Test {
    public static void main(String[] args) {

        Supervisor supervisor = new Supervisor("Abdul Gofur", 70000, "Engineering");
        System.out.println(supervisor.toString());


        Director director = new Director("Jaman Gazi", 100000, "Marketing");
        System.out.println(director.toString());
    }
}
