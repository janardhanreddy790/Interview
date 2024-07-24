package com.nagam.interview.example.java.introduction.DifferenceBetweenJREJDKJVM;

/**
 * This class demonstrates a simple Java program that explains the differences between JRE, JDK, and JVM.
 */
public class JREJDKJVM {
    public static void main(String[] args) {
        System.out.println("Differences between JRE, JDK, and JVM:");

        System.out.println("\n1. **JVM (Java Virtual Machine):**");
        System.out.println("   - JVM is an abstract machine that provides the runtime environment for Java bytecode to be executed.");
        System.out.println("   - It converts the bytecode into machine code, which the underlying operating system can execute.");
        System.out.println("   - JVM is platform-specific, meaning different JVM implementations exist for different operating systems.");

        System.out.println("\n2. **JRE (Java Runtime Environment):**");
        System.out.println("   - JRE provides the environment necessary to run Java applications.");
        System.out.println("   - It includes the JVM, core libraries, and other components required for running Java programs.");
        System.out.println("   - JRE does not include development tools such as compilers or debuggers.");

        System.out.println("\n3. **JDK (Java Development Kit):**");
        System.out.println("   - JDK is a superset of JRE that includes everything found in JRE plus development tools.");
        System.out.println("   - It provides tools necessary for Java development, such as the Java compiler (`javac`), JavaDoc, and Java Debugger.");
        System.out.println("   - JDK is used to develop Java applications, whereas JRE is used to run them.");
    }
}