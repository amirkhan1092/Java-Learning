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


In Java, you can control the width and justification of variable values within strings primarily using `String.format()` or `System.out.printf()`, which both support width and alignment options. Here’s how:

### 1. Using Width and Right Justification
By default, values are right-justified within their specified width. You can specify the width of a variable by including a number in the format specifier:

```java
int number = 42;
String text = "Java";

// `%5d` sets the width for the integer to 5 spaces (right-aligned by default)
System.out.printf("Number: %5d%n", number); // Output: "Number:    42"

// `%10s` sets the width for the string to 10 spaces (right-aligned by default)
System.out.printf("Text: %10s%n", text);    // Output: "Text:      Java"
```

### 2. Using Left Justification
To left-justify, add a `-` (minus sign) before the width number in the format specifier:

```java
int number = 42;
String text = "Java";

// `%-5d` sets the width to 5 and left-justifies the integer
System.out.printf("Number: %-5d%n", number); // Output: "Number: 42   "

// `%-10s` sets the width to 10 and left-justifies the string
System.out.printf("Text: %-10s%n", text);    // Output: "Text: Java      "
```

### 3. Combining Width, Precision, and Justification
For floating-point numbers, you can specify both width and precision. For example, `%10.2f` means a width of 10 characters and 2 decimal places:

```java
double price = 123.45678;

// Right-justified with width 10 and 2 decimal places
System.out.printf("Price: %10.2f%n", price); // Output: "Price:     123.46"

// Left-justified with width 10 and 2 decimal places
System.out.printf("Price: %-10.2f%n", price); // Output: "Price: 123.46    "
```

### 4. Padding with Zeros
You can also pad numbers with zeros by using `0` before the width specifier, which is especially useful for right-justifying numbers with leading zeros:

```java
int number = 42;

// Pads with zeros to ensure width of 5
System.out.printf("Padded Number: %05d%n", number); // Output: "Padded Number: 00042"
```

### Example of Width and Justification with Multiple Variables
```java
String item = "Apple";
int quantity = 4;
double price = 5.50;

// Using widths to align items in a table-like format
System.out.printf("%-10s %10s %10s%n", "Item", "Quantity", "Price");
System.out.printf("%-10s %10d %10.2f%n", item, quantity, price);
// Output:
// Item           Quantity      Price
// Apple                 4       5.50
```

### Summary of Common Specifiers:
- `%5d`: Right-justify an integer within a 5-character width.
- `%-5d`: Left-justify an integer within a 5-character width.
- `%10.2f`: Right-justify a floating-point number in a 10-character width with 2 decimal places.
- `%05d`: Pad an integer with zeros to fill a 5-character width.

These formatting options allow you to control the presentation of text, ensuring consistent alignment and layout.


No, `"%n"` and `"\n"` are not exactly the same in Java, though they both introduce a new line. Here’s the difference:

### 1. `"%n"`
- `"%n"` is a platform-independent newline specifier in `printf` and `String.format`.
- It automatically converts to the correct line separator for the operating system.
  - On Windows, it will convert to `\r\n`.
  - On Unix/Linux/Mac, it will convert to `\n`.
- It’s recommended for code that will run across different platforms to ensure consistent line breaks.

### 2. `"\n"`
- `"\n"` is a newline character that explicitly represents a Unix-style newline.
- It’s not platform-independent. On Windows, `"\n"` might not behave as expected if you need compatibility with Windows-style line breaks (`\r\n`).

### Example
Here’s a demonstration of the difference:

```java
System.out.printf("Hello World!%n"); // Platform-independent newline
System.out.printf("Hello World!\n");  // Unix-style newline
```

### When to Use Each
- Use `"%n"` in `printf` or `String.format` for cross-platform compatibility.
- Use `"\n"` when platform-specific behavior is acceptable (e.g., in Unix-based systems only) or if you're working outside of `printf` and `String.format`.