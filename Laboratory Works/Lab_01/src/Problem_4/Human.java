package Problem_4;

public class Human {
    private double age;
    private String name;
    private String gender;
    private static final String HOME_PLANET = "Earth";
    private Months monthOfBirthday;
    private int id;
    private static int nextId = 1;
    {
        setId(nextId++);
    }
    
    public Human() {}
    
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public Human(int age, String name, Months monthOfBirthday, String gender) {
        this(age, name);
        this.monthOfBirthday = monthOfBirthday;
        this.gender = gender;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setAge(double age) {
        this.age = age;
    }
        
    public void setMonthOfBirthday(Months monthOfBirthday) {
        this.monthOfBirthday = monthOfBirthday;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getAge() {
        return age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public Months getMonths() {
        return monthOfBirthday;
    }
    
    public int getId() {
        return id;
    }
    
    public static String getHomePlanet() {
        return HOME_PLANET;
    }
    
    public String toString() {
        return "Age: " + age + "\nName: " + name + "\nGender: " + gender + 
                "\nMonth of Birthday: " + monthOfBirthday + "\nID: " + id ;
    }

}
