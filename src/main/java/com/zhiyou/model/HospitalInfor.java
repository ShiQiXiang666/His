package com.zhiyou.model;

import java.util.Date;

public class HospitalInfor {
    private String medicalRecord;

    private String caregiver;

    private String bedId;

    private Double payTheDeposit;

    private String stateIllness;

    private Date time;
    
    private Section section;
    
    private RegistrationInfor registrationInfor;
    
    private Doctor doctor;
    
    
    
    @Override
	public String toString() {
		return "HospitalInfor [medicalRecord=" + medicalRecord + ", caregiver=" + caregiver + ", bedId=" + bedId
				+ ", payTheDeposit=" + payTheDeposit + ", stateIllness=" + stateIllness + ", time=" + time
				+ ", section=" + section + ", registrationInfor=" + registrationInfor + ", doctor=" + doctor + "]";
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public RegistrationInfor getRegistrationInfor() {
		return registrationInfor;
	}

	public void setRegistrationInfor(RegistrationInfor registrationInfor) {
		this.registrationInfor = registrationInfor;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(String caregiver) {
        this.caregiver = caregiver;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public Double getPayTheDeposit() {
        return payTheDeposit;
    }

    public void setPayTheDeposit(Double payTheDeposit) {
        this.payTheDeposit = payTheDeposit;
    }

    public String getStateIllness() {
        return stateIllness;
    }

    public void setStateIllness(String stateIllness) {
        this.stateIllness = stateIllness;
    }
}