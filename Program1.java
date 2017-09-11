import java.util.Scanner;
public class Program1{
    private final int MAX_CAP = 100;
    private int top; //location of top item on the stack
   
    public static void main(String[] args){
        CharStack stack = new CharStack();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your infix notation: ");
        String line = scan.nextLine();

        for(int i=0; i<line.length(); i++){
            char current = line.charAt(i);
            if(current == '('){
                stack.push (current);
            }else if (isOperand(current)){
                System.out.print(current);
            }else if (isOperator(current)){
                while(stack.isEmpty()!=true && isOperator(stack.peek())&& precedenceOrder(stack.peek())>=precedenceOrder(current)){
                    System.out.print(stack.pop());
                } 
                stack.push(current);
            }else if (current == ')'){
                while (stack.peek() != '(' ){
                    System.out.print(stack.pop());
                }
                stack.pop();
            }
        }
        while(stack.isEmpty() == false){
            System.out.print(stack.pop());
        }
        System.out.println();
    }
    
    public static boolean isOperand(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean isOperator(char c){
        return c=='+' || c=='-' || c=='*' || c=='/';
    }
    
    public static int precedenceOrder(char c){
        if(c == '*' || c == '/' ){
            return 2;
        }else {
            return 1;
        }
    }
}