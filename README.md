[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18657393)
# unit-8-1-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## Problem 1
Write a public static method `sumOfDiag`, which takes a 2D array of int values as an input, and returns the sum of the elements in the lead diagonal as an int value. The lead diagonal is defined as the diagonal line of values starting in the top left corner and proceeding one step right and down for each value until either the bottom or right edge of the array is reached. For example, in the array represented below, the numbers in bold make up the lead diagonal.
|||||
|---|---|---|---|
|**8**|	7|	5|	8|
|1|	**3**|	9|	5|
|3|	4|	**6**|	2|

## Problem 2
Write a public static method named `productTable` which returns a 2D array which represents a multiplication table. Each element in the array should be equal to the product (multiplication) of the indices of the cell. The method should take 2 parameters which are equal to the number of rows and number of columns of the multiplication table. For example, the call `productTable(6, 5)` should return the array represented by the table below:
||||||
|---|---|---|---|---|
|0|	0	|0	|0	|0|
|0|	1	|2	|3	|4|
|0|	2	|4	|6	|8|
|0|	3	|6	|9	|12|
|0|	4	|8	|12|	16|
|0| 5	|10	|15|	20|
