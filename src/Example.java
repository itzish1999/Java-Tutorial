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
 */
