package midterm.ana_kurua_2.task1;

import java.util.List;
import java.util.ArrayList;
public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName;
    public Fantasy(String studentName) {
        this.studentName = studentName;
    }


    public String toString() {
        return studentName;
    }

    @Override
    public String getLamp1() {
        return "Lamp1";
    }

    @Override
    public String getSuperposition2() {
        return "Superposition";
    }

    @Override
    public String methodSushi3(String argTree5) {
        return "Sushi with " + argTree5;
    }

    @Override
    public List<String> methodTruck4(String argBall6) {
        List<String> truckContents = new ArrayList<>();
        truckContents.add("Ball: " + argBall6); // Add the ball to the truck contents
        return truckContents;
    }
    }

