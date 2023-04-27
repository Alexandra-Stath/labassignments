# Lab Assignments

The purpose of this repository is to submit and work on assignments from the lab projects of our 
course lesson Software Engineering In Practice (SEIP).

In this repository there is a ***Maven*** Project used to create a Frequency Histogram and display 
it to the user. This can be done through the ***Histogram Generator*** file inside the Child 
directory.

You can also find the grades.txt file in the resources directory of the Child directory.

### Tools to build and run the project
In order to run and build the project ***jdk 20*** is required.

### How to build the project 
In order to build the project run the following command:

``` 
mvn clean package
```

### Run the project 
Go to child's module target folder 

```
cd Child/target
```

and run the following command:

```
java -jar gradeshistogram-1.0-SNAPSHOT-jar-with-dependencies.jar
```

in the command prompt that will appear give the ***absolute path*** to the grades file.
