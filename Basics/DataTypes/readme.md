In Java, there are several numeric data types, each designed to handle specific ranges and types of numbers. Here’s an overview:

### 1. **`int`** (Integer)
   - **Size**: 32 bits (4 bytes)
   - **Range**: `-2,147,483,648` to `2,147,483,647`
   - **Usage**: Used for whole numbers without decimals.
   - **Default Value**: `0`
   - **Example**:
     ```java
     int myInt = 42;
     ```

### 2. **`long`** (Long Integer)
   - **Size**: 64 bits (8 bytes)
   - **Range**: `-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807`
   - **Usage**: Used for large whole numbers outside the range of `int`.
   - **Default Value**: `0L`
   - **Example**:
     ```java
     long myLong = 10000000000L; // 'L' suffix indicates a long literal
     ```

### 3. **`float`** (Single-Precision Floating Point)
   - **Size**: 32 bits (4 bytes)
   - **Range**: Approximately `1.4E-45` to `3.4E+38`
   - **Precision**: Up to 7 decimal digits
   - **Usage**: Used for decimal numbers with less precision.
   - **Default Value**: `0.0f`
   - **Example**:
     ```java
     float myFloat = 3.14f; // 'f' suffix indicates a float literal
     ```

### 4. **`double`** (Double-Precision Floating Point)
   - **Size**: 64 bits (8 bytes)
   - **Range**: Approximately `4.9E-324` to `1.7E+308`
   - **Precision**: Up to 15 decimal digits
   - **Usage**: Used for decimal numbers with higher precision.
   - **Default Value**: `0.0d` (or just `0.0`)
   - **Example**:
     ```java
     double myDouble = 3.14159265359;
     ```

### 5. **`byte`**
   - **Size**: 8 bits (1 byte)
   - **Range**: `-128` to `127`
   - **Usage**: Used for small integers and to save memory in large arrays.
   - **Default Value**: `0`
   - **Example**:
     ```java
     byte myByte = 100;
     ```

### 6. **`short`**
   - **Size**: 16 bits (2 bytes)
   - **Range**: `-32,768` to `32,767`
   - **Usage**: Used for small integers within the range, and to save memory.
   - **Default Value**: `0`
   - **Example**:
     ```java
     short myShort = 30000;
     ```

### 7. **`char`**
   - **Size**: 16 bits (2 bytes)
   - **Range**: `0` to `65,535` (unsigned, represents Unicode characters)
   - **Usage**: Used to store a single character or Unicode value.
   - **Default Value**: `'\u0000'` (null character)
   - **Example**:
     ```java
     char myChar = 'A';
     ```

### Key Points
- **Memory efficiency**: Use `byte`, `short`, or `int` over `long` for smaller numbers if memory is a concern.
- **Precision**: Use `float` or `double` for decimal numbers, but remember `double` has higher precision.
- **Suffixes**: `L` for `long`, `f` for `float`, and `d` for `double` (optional for `double`).
- **Default**: By default, Java interprets decimal numbers as `double`, so `float` literals need the `f` suffix.

### Example Usage of Each Type
```java
public class NumericTypesExample {
    public static void main(String[] args) {
        int myInt = 123;
        long myLong = 123456789L;
        float myFloat = 3.14f;
        double myDouble = 3.14159265359;
        byte myByte = 100;
        short myShort = 30000;
        char myChar = 'A';

        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("char: " + myChar);
    }
}
```

This program shows how to declare and use each of the numeric types in Java, with output reflecting their default precision and capacity for numbers.