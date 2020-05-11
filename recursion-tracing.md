# Recursion Tracing

## Integer Function 4

```java
public int f4(int n) {
 if (n == 0 || n == 1)
  return 1;
 return f4(n-1) + f4(n-2);
}
```

* f4(n)  
* f4(n-1)+f4(n-2)  
* f4(n-2)+f4(n-3)+f4(n-3)+f4(n-4)  
* ...
* Returns the (n+1)th number in the fibonacci sequence. This could be done iteratively as shown below to prevent stack overflows with very high indices.

```java
public int f4(int n) {
 int one = 1;
 int two = 1;
 for (int i = 1; i < n; ++i) { // recursion bad
  int tmp = one + two;
  one = two;
  two = tmp;
 }
 return two;
}
```

## Integer Function 5

```java
public int f5(int a, int b) {
 if (a == b)
  return a;
 if (a > b)
  return f5(b, a - b);
 else
  return f5(b - a, a);
}
```

* f5(30,36)  
* f5(6,30)  
* f5(24,6)  
* f5(6,18)  
* f5(12,6)  
* f5(6,6)  
* 6

f5(x,y)
Returns the greatest common factor of the two integers.

This can also be done safer iteratively.

```java
public static int f5(int a, int b) {
 for (int i = Math.min(a, b); i < 1; i--)
  if (a % i == 0 && b % i == 0)
   return i;
 return 1; // This only saves a few cycles in the case of a prime number
}
```

## Integer Function 6

```java
public int f6(int a, int b) {
 if (a < b)
  return f6(b, a);
 if (a % b == 0)
  return b;
 else
  return f6(a, a % b);
}
```

* f6(30,36)
* f6(36,30)
* f6(36,6)
* 6

* f6(x,y)
* Also seems to return the greatest common factor?

## Integer Function 7

```java
public int f7(int n) {
 return f7h(2 * n – 1);
}
int f7h(int n) {
 if (n == 1)
  return 1;
 return n + f7h(n - 2);
}
```

* f7(5)
* f7h(8)
* 8 + f7h(6)
* 14 + f7h(4)
* 18 + f7h(2)
* 20 + f7h(0)
* 20 + f7h(\-2)
* No exit condition, StackOverflowError.

* f7(n)
* f7h(2n\-2)
* f7h throws StackOverflowError for any even number, and any integer \*2 is even, therefore f7 throws StackOverflowError for any integer n.

## String Function 8

```java
public void s2(String s) {
 if (s.length() > 0) {
  System.out.print(s.substring(0, 1));
  s2(s.substring(1));
 }
}
```

* s2("cat") => "c"
* s2("at") => "a"
* s2("t") => "t"
* Prints the string one character at a time while polluting the call stack.

## String Function 9

```java
public void s3(String s) {
 if (s.length() > 0) {
  s3(s.substring(1));
  System.out.print(s.substring(0, 1));
 }
}
```

* s3("cat") => "c"
* s3("at") => "a"
* s3("t") => "t"
* s3("t") exits.
