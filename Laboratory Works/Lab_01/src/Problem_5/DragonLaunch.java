package Problem_5;
import java.util.Vector;

public class DragonLaunch {
    Vector<Person> students = new Vector<Person>();

    public DragonLaunch() {}
        
    public void kidnap(Person person) {
        this.students.add(person);
    }
    
    public boolean willDragonEatOrNot() {
        int numberOfFreeBoys = 0;
        for (Person i: students) {
                if (i.gender == Gender.BOY) 
                    numberOfFreeBoys++;
                else if (i.gender == Gender.GIRL && numberOfFreeBoys > 0) 
                    numberOfFreeBoys--;
                else 
                    return true;
        } 
        if (numberOfFreeBoys > 0)
            return true;
        else
            return false;
    }

}