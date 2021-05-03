package Problem_5;
public class Person {
    
    Gender gender;
    String name;
    int age;
    
    public Person () {}
    
    public Person (Gender gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
    
    public Person (Gender gender) {
        this.gender = gender;
    }
    
    public String toString() {
        if (gender == Gender.BOY)
            return "BOY";
        else
            return "GIRL";
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
}