package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String words) {
        // Rename local variable to avoid shadowing the parameter
        String[] splitWords = StringUtils.split(words, ' ');
        return (splitWords == null) ? 0 : splitWords.length;
    }

    public void greet() {
        List<String> args = new ArrayList<>();
        args.add("Hello");

        for (String arg : args) {
            System.out.println("Greeting " + arg);
        }
    }

    public Application() {
        System.out.println("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main(String[] args) {
        System.out.println("Starting Application");
        Application app = new Application();
        app.greet();
        app.countWords("Hello World");
    }
}
