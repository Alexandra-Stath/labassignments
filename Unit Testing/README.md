# Unit Testing

The purpose of this directory is to test and practice Unit testing in several examples.

You can find the txt files for testing in the resources directory of the test folder of the unittesting module.

## Tools to build and run the project
In order to run the project **jdk 20** is required.
You will also need **Maven** installed in your local environment, as well as, the **jacoco plugin** and 
the **mockito dependency**.

### How to build the project
In order to build the project run the following command:

``` 
mvn clean package jacoco:report
```

### How to run the project
Go to Unit Testing's module target folder

```
cd Unit Testing/target/site/jacoco
```
And open index.html