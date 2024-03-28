package Humens;

import Rooms.Library;

public class PersonFactory {
    
    public Person createPerson(String which) {
        int i = (int) (Math.random() * 30);
        switch (which) {
            case "Student" -> {
                if (i >= 20) {
                    return new Student(Library.getInstance().returnNames().get(i)[0], Library.getInstance().returnSurnames().get((int) (Math.random() * 60))[0] + "à");
                } else {
                    return new Student(Library.getInstance().returnNames().get(i)[0], Library.getInstance().returnSurnames().get((int) (Math.random() * 60))[0]);
                }
            }
            case "Teacher" -> {
                if (i >= 20) {
                    return new Teacher(Library.getInstance().returnNames().get(i)[0],
                            Library.getInstance().returnSurnames(true).get((int) (Math.random() * 14))[0] + "à",
                            Library.getInstance().returnMidnamesF().get((int) (Math.random() * 20))[0]);
                } else {
                    return new Teacher(Library.getInstance().returnNames().get(i)[0],
                            Library.getInstance().returnSurnames(true).get((int) (Math.random() * 14))[0],
                            Library.getInstance().returnMidnamesM().get((int) (Math.random() * 20))[0]);
                }
            }
            default -> {
                return null;
            }
        }

    }
}
