In Java, you can insert variable values into a string using several methods:

### 1. Using `String.format()`
`String.format()` allows you to use format specifiers, similar to `printf`, to insert values into a string.

```java
String name = "Alice";
int age = 25;
String message = String.format("My name is %s and I am %d years old.", name, age);
System.out.println(message); // Output: My name is Alice and I am 25 years old.
```

### 2. Using `+` Operator for Concatenation
The simplest way is to concatenate strings using the `+` operator.

```java
String name = "Alice";
int age = 25;
String message = "My name is " + name + " and I am " + age + " years old.";
System.out.println(message); // Output: My name is Alice and I am 25 years old.
```

### 3. Using `StringBuilder` or `StringBuffer`
For more complex string manipulations, `StringBuilder` (or `StringBuffer` for thread safety) is efficient.

```java
String name = "Alice";
int age = 25;
StringBuilder message = new StringBuilder();
message.append("My name is ").append(name).append(" and I am ").append(age).append(" years old.");
System.out.println(message.toString()); // Output: My name is Alice and I am 25 years old.
```

### 4. Using `System.out.printf()`
You can print directly to the console using `System.out.printf()`, which also supports format specifiers.

```java
String name = "Alice";
int age = 25;
System.out.printf("My name is %s and I am %d years old.\n", name, age);
// Output: My name is Alice and I am 25 years old.
```

### 5. Using `MessageFormat`
`MessageFormat` is helpful when you’re working with localization or if you want to avoid format specifiers.

```java
import java.text.MessageFormat;

String name = "Alice";
int age = 25;
String message = MessageFormat.format("My name is {0} and I am {1} years old.", name, age);
System.out.println(message); // Output: My name is Alice and I am 25 years old.
```

### 6. Using Text Blocks (Java 13+)
In Java 13 and later, you can use text blocks for multiline strings, and `String.format()` can be combined with this for easier formatting.

```java
String name = "Alice";
int age = 25;
String message = String.format("""
        My name is %s
        and I am %d years old.
        """, name, age);
System.out.println(message);
```

These methods let you easily fit variables into strings depending on your needs for readability, performance, and code style.