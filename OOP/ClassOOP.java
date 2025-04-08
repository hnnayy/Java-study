package OOP;

class Person {
    String name;
    int age;
    String MBTI;
    final String degree = "Teknik Komputer";

    Person(String name, int age, String MBTI) {
        this.name = name;
        this.age = age;
        this.MBTI = MBTI;
    }

    @Override
    public String toString(){
        return "Nama: " + name + " Age: " + age + " MBTI : " + MBTI + " Degree: " + degree;

    }
}