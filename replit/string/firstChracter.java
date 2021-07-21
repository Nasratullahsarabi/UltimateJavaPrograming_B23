package string;

import java.util.Scanner;

public class firstChracter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        char firstChar = word.charAt(0);

        System.out.println(firstChar);
        scan.close();
    }
}
/*
Write a program that will print out the first character of the word.

Ex:

```
Input: jump
```
```
Output: j
 */