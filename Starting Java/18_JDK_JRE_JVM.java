class JDK_JRE_JVM
{
    public static void main( String arr[])
    {



        /*
         1. JVM (Java Virtual Machine)
                --> The JVM is the engine that runs Java applications. It provides an environment for Java bytecode to be executed. 
                --> The JVM is platform-dependent, meaning each operating system has its own version of the JVM.
                    
                Key Roles of JVM:
                 -> Load the bytecode (compiled Java program).
                 -> Verify the bytecode for security and correctness.
                 -> Execute the bytecode by converting it into machine code specific to the operating system 
                    (OS) via Just-In-Time (JIT) compilation.
                 -> Manage system memory (e.g., garbage collection).
                 -> The JVM is a crucial part of both the JRE and the JDK.
                    
         2. JRE (Java Runtime Environment)
                --> The JRE is the environment required to run Java applications. 
                --> It consists of the JVM and core libraries (e.g., class libraries like java.lang, java.util, etc.) 
                    necessary to execute Java programs.
                    
                Components of JRE:
                 -> JVM: The runtime engine that executes bytecode.
                 -> Java Class Libraries: Pre-written code that Java applications use for tasks like data structures, 
                    file handling, networking, etc.
                 -> JRE does not contain tools for developing Java applications (such as a compiler).
                    
         3. JDK (Java Development Kit)
                --> The JDK is a full-featured software development kit for Java developers. 
                --> It includes everything found in the JRE, plus tools needed for developing, 
                    compiling, and debugging Java programs.
                    
                Components of JDK:
                 -> JRE: The runtime environment to execute Java applications.
                 -> Development Tools:
                        >> javac (Java compiler): Converts Java source code into bytecode.
                        >> jdb (Java debugger): Tool for debugging Java programs.
                        >> jar (Java archive): Packages multiple files into a single JAR file.
                        >> javadoc: Generates documentation from comments in source code.

         Summary of Differences:
                Feature	               JVM	                                                          JRE	                                                    JDK
                
                Purpose	        Runs the Java bytecode	                                Provides an environment to run Java                         Provides tools to develop, 
                                                                                                    applications	                                compile, and run Java applications                


                Contains	    Bytecode interpreter, JIT, memory management	          JVM + Class Libraries	                                    JRE + Development Tools (javac, jar, etc.)


                Who Uses It	    End-users (runs apps)	                                  End-users (runs apps)	                                    Developers (write, compile, debug)
         
        
        
        Visual Representation:
        +----------------------------+
        |         Java Code           |
        +----------------------------+
                      ↓
                (Compile with javac)
                      ↓
        +----------------------------+
        |         Bytecode            |
        +----------------------------+
                      ↓
               (Executed by JVM)
                      ↓
        +----------------------------+
        |  Machine-specific Code      |
        +----------------------------+
         
        */
    }
}
