/*
    This is a sample Java program

    I named this Example.java for good reason. In Java, the name of the file is very important
    this source file; a file that contiains program instructions is officially called a compilation unit
    it is a text file that contains one or more class definitions. The Java compiler requires you to use the .java
    filename extension.

    The name of the class Example is also spelled exactly as our filename. The reason being, that in Java, all code
    must reside in a class. The name of the main class should match the name of the file
 */

class Example {
    // A Java program begins with a call to main().
    public static void main(String[] args) {
        System.out.println("Java drives the web.");
    }
}

/* Compiling the program
Go into your terminal and type javac Example.java.
What this does is create a file called Example.class that contains a bytecode version of your program.
Note that bytecode is not executable code! Bytecode must instead be executed via VM.

in your terminal type java Example and then you should see your program run.

 When Java source code is compiled, each individual class is put into its own output file named after the class and is
 using the .class extension. That's why naming the file the same as the class is great practice; you can organize and
 recognize the code a lot better.
 */

// I will give a breakdown of all the code in this file:

/* The /* and // are comments that you can make. Comments are ignored by the code. You use comments to explain how your
code works. /* is multiline comments and // is single line comments
 */

/* The next line of code looks like this: class Example {   This line uses class to declare that a new class is made.
 class is Java's way of declaring that a new class is being made, followed by the name: Example
 The elements between the {} are members of the class. In Java all program activity occurs within a class
 */

// public static void main(String[] args) {

/* The line above is where the program starts to execute. Note that in general, Java programs usually execute by
running main().

The public keyword is an access modifier. That determines how other parts of our program OUTSIDE the code can have
access to the members of the class. Remember in the java_concept.java file we discussed public and private?

private means that no where else in the program can our block of code be accessed.

In the case with our code the main() must be declared as public since it must be called OUTSIDE of its class
once we start the program. That is how we are presented with the string that we left in there.

The keyword static allows the main() to be called before an object has been created. It's necessary because JVM calls
main() first before any object is created as well.

The keyword void is saying to the compiler that main() won't return any value.
 */

// main(String[]args) {

/* in main() we are able to pass in information that the code must use. Information inside the () are called parameters.
In this case, we are setting the parameters to be a string. String[]args passes a parameter named args.
This is an array of objects type string. Objects of type strings store a sequence of characters.
NOTE THAT OUR PROGRAM DOESN'T USE OF THIS INFORMATION!
 */

// The last characther of main(String[]args) is a {. This signifies the start of the main() body.

// System.out.println("Java drives the Web.");
/* The output of our program is actually because of the println() method. System.out is a bit complicated, for now just
know that the System means that it's just giving access to your system (System is a predefined class).
out is the what is connected to the console.

For now we will keep using I/O methods to print our output

the ; means the end of our statement. It is also used in JavaScript
 */

