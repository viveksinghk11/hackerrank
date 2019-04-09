import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {

  // Complete the isBalanced function below.
  static String isBalanced(String s) {

    Stack bracketStack = new Stack();
    for(int i=0;i<s.length();i++){
      if(s.indexOf(i) == '[' || s.indexOf(i) == '{' || s.indexOf(i) == '('){
        bracketStack.push(s.indexOf(i));
      } else if(s.indexOf(i) == (Integer)bracketStack.get(bracketStack.size())){
        bracketStack.pop();
      }
    }
    if(bracketStack.size() ==0) {
      return "YES";
    }
    return "NO";
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int tItr = 0; tItr < t; tItr++) {
      String s = scanner.nextLine();

      String result = isBalanced(s);

      bufferedWriter.write(result);
      bufferedWriter.newLine();
    }

    bufferedWriter.close();

    scanner.close();
  }
}
