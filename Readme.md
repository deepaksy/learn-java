# learn-java
A repository for java learning path


# Exception Handling

Exception handling is the mechanism to solve the runtime errors so that normal flow of the application can be maintained.

**Exception** stands for abnormal condition.
<fig>
![Hierarchy of Java Exception class](./assets/Exception.PNG)
<figcaption align="center"><b>Fig.1 Hierarchy of Java Exception class.</b></figcaption>
</fig>

## Types of Java Exceptions: -

There are mainly two types of exceptions. 
- Checked Exception
- Unchecked Exception
- Error

- ***Checked Exception: -***
The class that directly inherit the Throwable class except RuntimeException and Error are known as checked exception.
Ex: IOException, SQLException, etc. are checked at compile-time.

- ***Unchecked Exception: -***
The classes that inherit the RuntimeException are known as unchecked exception. ex:- ArithmeticException, NullPointException, ArrayIndexOutOfBoundException etc.

- **Error: -**
Errrors are irrecoverable some of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.