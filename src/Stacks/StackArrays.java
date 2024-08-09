package Stacks;

public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }
    //Check if it is empty

    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //check if stack is Full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    public int pop() {
        int value = peek();
        topOfStack--;
        return value;
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        } else {
            return arr[topOfStack];
        }
    }

    public void deleteStack(){
        arr = new int[arr.length];
        topOfStack = -1;
        System.out.println("The stack is successfully deleted");
    }

    // use the stack datastructure to check whether a word is a palindrome or not eg racecar  == racecar
    //Implement a stack datastructure using LinkedList instead of Arrays

}