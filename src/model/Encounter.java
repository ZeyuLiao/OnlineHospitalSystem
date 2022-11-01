/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Ruolin
 */
public class Encounter {
    private int encounterId;
    private int doctorId;
    private int patientId;
    private Boolean state;
    private String symptom;
    private String diagnosis;
    private LocalDate startDate;
    private LocalDate endDate;
    private int blood_pressure;
    private int heart_bear_rate;
    private double blood_sugar;
    private double white_blood_cells;

    public int getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(int blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public int getHeart_beat_rate() {
        return heart_bear_rate;
    }

    public void setHeart_beat_rate(int heart_beat_rate) {
        this.heart_bear_rate = heart_beat_rate;
    }

    public double getBlood_sugar() {
        return blood_sugar;
    }

    public void setBlood_sugar(double blood_sugar) {
        this.blood_sugar = blood_sugar;
    }

    public double getWhite_blood_cells() {
        return white_blood_cells;
    }

    public void setWhite_blood_cells(double white_blood_cells) {
        this.white_blood_cells = white_blood_cells;
    }
    
    
    
}

