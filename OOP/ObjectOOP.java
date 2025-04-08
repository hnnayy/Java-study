package OOP;

public class ObjectOOP {
    public static void main(String[] args) {
//        var person1 = new Person();
//        person1.name = "John Doe";
//        person1.age = 19;
//        person1.MBTI = "ISFP";
//
//
//        System.out.println(person1.name.toUpperCase());
//        Person person2 = new Person();
          Person person1 = new Person("hanin", 19, "mbti");
          System.out.println(person1);


//        System.out.println(person2);
//        System.out.println(person3);

        }

    }

/*
output kalo ga masukin apa2
yang keluar cuma kaya gini
"C:\Program Files\Java\jdk-23\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.2\lib\idea_rt.jar=59458:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\HANIN\IdeaProjects\main\out\production\main OOP.ObjectOOP
OOP.Person@6acbcfc0
OOP.Person@5f184fc6
OOP.Person@3feba861

dengan kodingan seperti ini
public class ObjectOOP {
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2 = new Person();
        var person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

//ngapain bikin object kalo gada daata di dalma kelas itu neh isinya tu apa
misal class person terus di dalmenya ada name, age, dll
membuat field sama dnegan membuat class
*/