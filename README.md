# MyExercise

### Transitive Dependencies

    If A depends on B and B depends on C, then A depends on both B and C.
    In this sample program, tried to create the same model
        The UserInterface class is depends on ProcessEmpDataV1 class to save the user input. 
        The ProcessEmpDataV1 depends on Employee POJO to print the user intput
    To find transtive dependencies(From Java 8), jdeps command is being used. By passing the class name, 
    the dependencies for the supplied class can be predicted. This is helpful to avoid issues related to 
    dependencies when deploying an entierprise application

Attached screenshots in the following folder to show the outcome of jdeps command.

    screenshots\