package org.example;

public class Student extends Person {

    public enum TrainingStage {
        BACHELOR("Bachelor"),
        MASTER("Master");
        private String stage;

        TrainingStage(String stage) {
            setStage(stage);
        }

        public String getStage() {
            return stage;
        }

        public void setStage(String stage) {
            this.stage = stage;
        }
    }

    private String courseNumber;
    private TrainingStage stage;

    public Student(String name, Gender sex, String faculty, TrainingStage stage, String courseNumber) {
        super(name, sex, faculty);
        setCourseNumber(courseNumber);
        this.stage = stage;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getSex().getTitle() + " is " + getCourseNumber() +
                "'th year " + stage.getStage() + " student.");
    }
}
