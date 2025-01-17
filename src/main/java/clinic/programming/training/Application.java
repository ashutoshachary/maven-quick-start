package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
public class Application {

    public void greet(){
        List<String> args = new ArrayList<>();
        args.add("Hello");

        for (String arg : args) {
            System.out.println("Greeting " + arg);
        }
      
    }
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    app.greet();
    }
}