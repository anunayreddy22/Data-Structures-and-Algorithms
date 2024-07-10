Basic problem of reversing a String using Stack

      import java.util.*;
      public class Main
      {
      	public static void main(String[] args) {
      		Scanner sc = new Scanner(System.in);
      		String s = sc.nextLine();
      		StringBuilder sb = new StringBuilder();
      		Stack<Character> st = new Stack<>();
      		for(int i=0;i<s.length();i++){
      		    st.push(s.charAt(i));
      		}
      		while(!st.isEmpty()){
      		    sb.append(st.pop());
      		}
      		System.out.println(sb.toString());
      	}
      }

Explanation:

As we Stack Follow LIFO i.e the last element inserted will be returned first so if iwe add all characters from string to stack and returnelement by element from stack the characters will be 
retunred reversely so take using of Stringbuilder or  new String and collects the characters return from stack.
