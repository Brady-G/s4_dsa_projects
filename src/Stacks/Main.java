package Stacks;

public class Main {

    public static void main(String[] args) {
        StackArrays stack = new StackArrays(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.printf("Peek: %d\n", stack.peek());
        System.out.printf("Pop: %d\n", stack.pop());
        System.out.printf("Peek: %d\n", stack.peek());
        stack.deleteStack();
        for (int i = 1; i <= 6; i++) {
            try {
                stack.push(i);
            } catch (RuntimeException e) {
                System.out.printf("Error for %d: %s\n", i, e.getMessage());
            }
        }

        System.out.printf("Is %s a palindrome? %b\n", "racecar", isPalindrome("racecar"));

        StackLinkedList<String> linkedStack = new StackLinkedList<>(5);
        linkedStack.push("1");
        linkedStack.push("2");
        linkedStack.push("3");
        linkedStack.push("4");
        linkedStack.push("5");
        System.out.printf("Peek: %s\n", linkedStack.peek());
        System.out.printf("Pop: %s\n", linkedStack.pop());
        System.out.printf("Peek: %s\n", linkedStack.peek());
        linkedStack.deleteStack();
        for (int i = 1; i <= 6; i++) {
            try {
                linkedStack.push(String.valueOf(i));
            } catch (RuntimeException e) {
                System.out.printf("Error for %d: %s\n", i, e.getMessage());
            }
        }
    }

    private static boolean isPalindrome(String str) {
        StackArrays stack = new StackArrays(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String reversedString = "";
        for (int i = 0; i < str.length(); i++) {
            reversedString += (char) stack.pop();
        }
        return str.equals(reversedString);
    }
}
