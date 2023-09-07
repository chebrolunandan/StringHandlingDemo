public class StringHandlingDemo 
{
    public static void main(String[] args) 
	{
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("String length: " + length);
        String greeting = "Hello";
        String name = "Alice";
        String message = greeting + ", " + name + "!";
        System.out.println("Concatenated message: " + message);
        String subStr = str.substring(7); 
        System.out.println("Substring: " + subStr);

        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);

        int indexOfComma = str.indexOf(",");
        System.out.println("Index of comma: " + indexOfComma);

        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced string: " + replacedStr);

        String uppercaseStr = str.toUpperCase();
        String lowercaseStr = str.toLowerCase();
        System.out.println("Uppercase: " + uppercaseStr);
        System.out.println("Lowercase: " + lowercaseStr);

        boolean containsHello = str.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);

        String[] words = str.split(" ");
        System.out.println("Split string into words:");
        for (String word : words) 
	{
            System.out.println(word);
        }
    }
}
