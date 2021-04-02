package com.fastroof.lab4;

/**
 * Class student
 *
 * @author Fastroof
 * @version 0.1 02 Mar 2021
 */

public final class Student {

    /** first name of the student */
    private final String firstName;

    /** last name of the student */
    private final String lastName;

    /** middle name of the student */
    private final String middleName;

    /** name of the university */
    private final String university;

    /** name of the faculty */
    private final String faculty;

    /** number of the specialty */
    private final int specialtyNumber;

    /** number of the course */
    private final int courseNumber;

    /** student score in the rating */
    private final double ratingScore;

    /**
     * Create object student
     *
     * @param firstName         first name of the student
     * @param lastName          last name of the student
     * @param middleName        middle name of the student
     * @param university        name of the university
     * @param faculty           name of the faculty
     * @param specialtyNumber   number of the specialty
     * @param courseNumber      number of the course
     * @param ratingScore       student score in the rating
     */
    public Student(String firstName, String lastName, String middleName, String university, String faculty,
                   int specialtyNumber, int courseNumber, double ratingScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.university = university;
        this.faculty = faculty;
        this.specialtyNumber = specialtyNumber;
        this.courseNumber = courseNumber;
        this.ratingScore = ratingScore;
    }

    public int getSpecialtyNumber() {
        return specialtyNumber;
    }

    public double getRatingScore() {
        return ratingScore;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + " " + middleName + " " + university + " " + faculty + " "
                + specialtyNumber + " " + courseNumber + " " + ratingScore;
    }

}
