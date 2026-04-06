public class HelloAppUC7 {
    public static void main(String[] args) {

        String output;

        if (args.length == 0) {
            output = "Hello, World!";
        } else {
            String names = String.join(", ", args);
            output = "Hello, " + names + "!";
        }

        System.out.println(output);
    }
}