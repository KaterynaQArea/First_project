package HW_lesson9.Grades;

import java.util.HashMap;
import java.util.Set;

public class GradeBook {
    public static void main(String[] args) {
        Set<String> namesOfStudents = TestResults.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResults.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResults.getMakeUpGrades();
        HashMap<String, Integer> gradeBookMap = new HashMap<>();

        for (String name : namesOfStudents) {
            if (firstTest.get(name) > (secondTest.get(name))) {
                gradeBookMap.put(name, firstTest.get(name));
            } else {
                gradeBookMap.put(name, secondTest.get(name));
            }
        }
        for (HashMap.Entry<String, Integer> grades : gradeBookMap.entrySet()) {
            System.out.println(grades);
        }
    }
}

