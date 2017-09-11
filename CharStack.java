public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack(){
    //PRE:
    //POS:
    //TAS: Create an empty stack with a default capacity
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element){
    //PRE: Stack can't be full
    //POS: Stack must have at least 1 element in it
    //TAS: Add a new item to the stack
    top ++;
    s[top] = element;
  }
  
  public char peek(){
  //PRE: Stack must have at least 1 element in it
  //POS: Stack must remain unchanged
  //TAS: return the top element without removing it from the stack
  return s[top];
  }
  
  public char pop (){
    //PRE: Stack must have at least 1 element in it
    //POS: Stack will have the top element removed
    //TAS: remove and return the element on the top of the stack
    char result = s[top];
    top--;
    return result;
  }

  public boolean isEmpty(){
    //PRE: 
    //POS:
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.
    if(top>-1){
      return false;
    }else return true;
  }

  public boolean isFull(){
    //PRE:
    //POS:
    //TAS: return whether or not the stack is full
    if(top == MAX_CAP-1){
      return true;
    } else return false;
  }

  public String toString(){
    String array = "";
    for (int x=top; x < top + 1; x++){
      array += s[x];
    }
    return array;
  }
}