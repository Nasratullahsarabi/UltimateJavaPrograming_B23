package string;

import java.util.Scanner;

public class lengh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text");
        String word = scan.nextLine();

        int totalWord = word.length();

        System.out.println(totalWord);

        scan.close();

    }
}
/*
Write a program that will output length of the text (string).

Example:


```
Display message: "Please enter the text:"
```

```
input: java
```

```
Display message: "Length is: 4"
```
 */