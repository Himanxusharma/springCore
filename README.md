# springCore
### This is the maven project, where We'll see the implementation of the core concept of the spring.
## Description
- This is Maven project so we have added our all the dependencies in the [pom.xml](https://github.com/Himanxusharma/springCore/blob/main/pom.xml).
- Our bean classes(POJO) that consist of methods(getters & setters) & constructors also we have override the to string() method to print the value instead of hashcode.
- Beans are located in the respective package. 
- config.xml where we declared the beans and its dependencies are located in the packages.

- we have inject the three types of dependencies using Setter injection as follows :
  *   i. Primitive datatype( int, short, float, double, etc.)   you'll see the implementation at the package ["com.springCore"](https://github.com/Himanxusharma/springCore/tree/main/src/main/java/com/springCore)
  *  ii. Collection (list, set, map, properties )   you'll see the implementation at the package ["com.springCore.collections"](https://github.com/Himanxusharma/springCore/tree/main/src/main/java/com/springCore/collections)
  *  iii. Refrence Type (other class object )   you'll see the implementation at the package ["com.springCore.ref"](https://github.com/Himanxusharma/springCore/tree/main/src/main/java/com/springCore/ref)
  
 
 
 <br><br>
## Roadmap
  - Create Maven Project
  - Add the dependencies => Springcore, Spring-context
  - Create Bean class
  - Write getters and setters in bean class
  - Create configuration file => config.xml
  - Main class => which can pull the object and use
  
  
  <br><br>
## Softwares
- Eclipse/Netbeans/IntelliJ
- Tomcat Server
- Oracle Database
