package Problem_3;

public class Student {
    private int idNum;
    private String name;
    private int mark;
    private static int nextId = 1;
    
    {
        idNum = nextId++;
    }
    
    public Student() {}
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public int getIdNum() {
        return idNum;
    }
    
    public String getName() {
        return name;
    }
    
    public int getMark() {
        return mark;
    }
    
    public String toString() {
        return "\nID: " + getIdNum()+ "\nName: "+ getName() + "\nMark: " + getMark();
    }
}
