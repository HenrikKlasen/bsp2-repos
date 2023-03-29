# bsp2-repos

Repository for the second Bachelor Semester Project in the Bachelor in Computer Science Program at the University of Luxembourg

## Requirements

Linux/Ubuntu/Debian based, recommended, MacOS should work fine, if windows machine: please use WSL2 Ubuntu 20.04, available on Microsoft Store!
Maven install:

```bs
sudo apt install maven
```

Java install:

```sh
sudo apt install default-jdk
```

## Execution

For execution first:

```sh
mvn compile
```

Run the console interface:

```sh
mvn exec:java -Dexec.mainClass="sha.MainExec"
```

## Testing

For testing with the tesing file, please use:

```sh
mvn test
```

## Guide on Using:

After compiling and Executing using the commands in the Execution section, the user should be asked to input numbers as follows:

```sh
Please enter a string you want to hash!
```

On the next line the user should input a random String, as e.g.

```sh
Please enter a string you want to hash!
abc
```

Next, the program will calculate the hash. And output it in the console.


