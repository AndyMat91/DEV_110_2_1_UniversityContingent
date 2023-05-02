package org.example;

public class Person {
    private String name;
    private Gender sex;
    private String faculty;

    public enum Gender {
        M("He"),
        F("She");

        private String title;

        Gender(String title) {
            setTitle(title);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public Person(String name, Gender sex, String faculty) {
        setName(name);
        this.sex = sex;
        setFaculty(faculty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Gender getSex() {
        return sex;
    }

    public void print() {
        System.out.println("This is " + getName() + ". " + sex.getTitle() +
                " " + (getClass().getSimpleName().equals("Teacher") ? "teaches" : "studies") +
                " at " + getFaculty());
    }

    public static void printAll(Person[] ar) {
        for (Person p : ar) {
            p.print();
            System.out.println();
        }
    }
}
