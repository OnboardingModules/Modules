import java.util.*;
class HomeTask_Stack{

    public static boolean ifBalanced(String input, char opening, char closing){
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < input.length();i++){
            char c = input.charAt(i);
            if(c == closing){
                if(!stack.empty()){
                    stack.pop();
                }else{
                    return false;
                }
            }
            if(c == opening){
                stack.push(String.valueOf(c));
            }
        }
        return stack.empty();
    }

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input= sc.next();
            System.out.println(ifBalanced(input,'{', '}')&&ifBalanced(input,'[', ']')&&ifBalanced(input,'(', ')'));
        }
    }


}
