package Problem_3;
public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisite;
    
    public Course() {}

    public Course(String name, String description, int credits, String prerequisite) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public String getPrerequisite() {
        return prerequisite;
    }

    public String toString() {
        return "\nObject: " + name + "\nDescription: " + description + 
                "\nCredits: " + credits + "\nPrerequisite: " + prerequisite;
    }
}