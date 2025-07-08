# Number Summer Application

This is a simple Java 8 application that demonstrates how to sum two numbers using a Calculator class. The project is built with Maven.

## Requirements

- Java 8 or higher
- Maven 3.x

## Building the Project

To build the project, run:

```bash
mvn clean install
```

## Running the Application

After building, you can run the application using:

```bash
java -cp target/number-summer-1.0-SNAPSHOT.jar com.example.Main
```

## Project Structure

- `Calculator.java`: Contains the sum method implementation
- `CalculatorTest.java`: Contains unit tests for the Calculator class
- `Main.java`: Contains a simple demonstration of the Calculator usage

## Testing

To run the tests:

```bash
mvn test
```