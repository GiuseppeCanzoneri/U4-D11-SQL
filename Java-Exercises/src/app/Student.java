package app;

import java.sql.Date;

public class Student {
    private int id;
    private String name;
    private String lastName;
    private String gender;
    private Date birthdate;
    private double avg;
    private int minVote;
    private int maxVote;

    public Student(int id, String name, String lastName, String gender, Date birthdate, double avg, int minVote, int maxVote) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.avg = avg;
        this.minVote = minVote;
        this.maxVote = maxVote;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public double getAvg() {
        return avg;
    }

    public int getMinVote() {
        return minVote;
    }

    public int getMaxVote() {
        return maxVote;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void setMinVote(int minVote) {
        this.minVote = minVote;
    }

    public void setMaxVote(int maxVote) {
        this.maxVote = maxVote;
    }
}
