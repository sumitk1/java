
#### Scanning input
``` 
Scanner sc = new Scanner(System.in);
String str = sc.next();
int a = sc.nextInt(); // no \n
sc.nextLine(); // takes \n
long x = sc.nextLong();

while (sc.hasNext()) {
    sc.nextLine();
}
sc.close();
```
#### Formatting output
```
System.out.printf("%1$-15s%2$03d\n", s1, x);
System.out.printf("%d x %d = %d\n", N, i, N*i);

```

#### Utils
```
    sum += Math.pow(2,j) * b;
    MIN_VALUE, Byte/Short/Integer/Long/Float/Double
    
    static { /*logic*/ }
    
    input could be 0
    
    import java.time.*;
    LocalDate dt = LocalDate.of(year, month, day);
    System.out.print(dt.getDayOfWeek());

    int chars[] = new int[256];  // all 0
    str.toLowerCase().toCharArray().length()
    String delims = "[ !,?._'@]+";
    String[] tokens = str.split(delims);

    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    str.matches(patternStr);
    
    char [] arr = new char[10]; // all chars are \0
    new String(new char[10]).replace("\0, "#");
```

#### Matrix
```
Matrix other diag - if(r+c == n+1) // r,c starts from 1, n is sq matrix size
Spiral matrix = bounds

```
