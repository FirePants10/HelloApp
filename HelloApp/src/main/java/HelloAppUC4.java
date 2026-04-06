public class HelloAppUC4 {
    public static void main(String[] args) {

        String output;

        if (args.length > 0) {
            String names = String.join(", ", args);
            output = "Hello, " + names + "!";
        } else {
            output = "Hello, World!";
        }

        System.out.println(output);
    }
}
