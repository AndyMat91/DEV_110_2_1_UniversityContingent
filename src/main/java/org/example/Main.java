package org.example;

public class Main {
    public static void main(String[] args) {
        Person[] array = new Person[]{
                new Teacher("Serge Johansson", Person.Gender.M, "Computer science", Teacher.AcademicDegree.PHD, "Programming paradigms"),
                new Teacher("Sandra Turner", Person.Gender.F, "Jurisprudence", Teacher.AcademicDegree.DOCTOR_OF_SCIENCES, "Domestic arbitration"),
                new Student("Leo Wilkinson", Person.Gender.M, "Computer science", Student.TrainingStage.BACHELOR, "III"),
                new Student("Anna Cunningham", Person.Gender.F, "World economy", Student.TrainingStage.BACHELOR, "I"),
                new Student("Jill Lundqvist", Person.Gender.F, "Jurisprudence", Student.TrainingStage.MASTER, "I"),
                new GraduateStudent("Ronald Correa", Person.Gender.M, "Computer science", "Design of a functional programming language.")
        };
        Person.printAll(array);
    }
}