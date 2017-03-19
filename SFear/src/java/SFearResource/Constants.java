/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;

/**
 *
 * @author fjcamillo
 */
public class Constants {
    public enum RESTResponseKey {
        responseCode,
        responseDescription,
        student,
        output
    }

    public enum ServiceCode {
        VALIDATE_ACCOUNT,
        RETRIEVE_STUDENTS,
        RETRIEVE_STUDENTS_BY_ID,
        ADD_STUDENT
    }
}
