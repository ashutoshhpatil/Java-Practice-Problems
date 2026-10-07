package Strings;

public class StringComparisonDemo {

    public static void main(String[] args) {

        String s1 = new String("you cannot change me");
        String s2 = new String("you cannot change me");
        System.out.println(s1 == s2); // false

        String s3 = "you cannot change me";
        System.out.println(s1 == s3); // false

        String s4 = "you cannot change me";
        System.out.println(s3 == s4); // true

        String s5 = "you cannot" + " change me";
        System.out.println(s4 == s5); // true

        String s6 = "you cannot";
        String s7 = s6 + " change me";

        System.out.println(s4 == s7); // false
        final String s8 = "you cannot";
        String s9 = s8 + " change me";
        System.out.println(s4 == s9); // true
    }
}


/*
* | Step | Statement                                         | New Object(s) Created | SCP Objects                    | Heap Objects                       | Variable Points To                 |
| ---- | ------------------------------------------------- | --------------------- | ------------------------------ | ---------------------------------- | ---------------------------------- |
| 1    | `String s1 = new String("you cannot change me");` | 2                     | `"you cannot change me"`       | `Object1 : "you cannot change me"` | `s1 → Object1`                     |
| 2    | `String s2 = new String("you cannot change me");` | 1                     | No new SCP object              | `Object2 : "you cannot change me"` | `s2 → Object2`                     |
| 3    | `String s3 = "you cannot change me";`             | 0                     | Already exists                 | None                               | `s3 → SCP("you cannot change me")` |
| 4    | `String s4 = "you cannot change me";`             | 0                     | Already exists                 | None                               | `s4 → SCP("you cannot change me")` |
| 5    | `String s5 = "you cannot" + " change me";`        | 2                     | `"you cannot"`, `" change me"` | None                               | `s5 → SCP("you cannot change me")` |
| 6    | `String s6 = "you cannot";`                       | 0                     | Already exists                 | None                               | `s6 → SCP("you cannot")`           |
| 7    | `String s7 = s6 + " change me";`                  | 1                     | No new SCP object              | `Object3 : "you cannot change me"` | `s7 → Object3`                     |
| 8    | `final String s8 = "you cannot";`                 | 0                     | Already exists                 | None                               | `s8 → SCP("you cannot")`           |
| 9    | `String s9 = s8 + " change me";`                  | 0                     | Compile-time optimization      | None                               | `s9 → SCP("you cannot change me")` |
* */