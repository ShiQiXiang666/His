package com.zhiyou.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class RegistrationInfor {
    private String medicalRecord;

    private String name;

    private String certificateType;

    private String idNum;

    private String socialSafeNum;

    private String phone;

    private Integer selfPaying;

    private Integer sex;

    private String career;

    private String earlyAppointment;

    private Integer doctorId;

    private String status;

    private String noted;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date time;

    private Integer sectionId;

    private Integer age;

    private Double registrationFee;
    
    private List<Doctor> doctor;

    private List<Section> section;
    
    private List<CertificateType> certificate_type;
    
    @Override
	public String toString() {
		return "RegistrationInfor [medicalRecord=" + medicalRecord + ", name=" + name + ", certificateType="
				+ certificateType + ", idNum=" + idNum + ", socialSafeNum=" + socialSafeNum + ", phone=" + phone
				+ ", selfPaying=" + selfPaying + ", sex=" + sex + ", career=" + career + ", earlyAppointment="
				+ earlyAppointment + ", doctorId=" + doctorId + ", status=" + status + ", noted=" + noted + ", time="
				+ time + ", sectionId=" + sectionId + ", age=" + age + ", registrationFee=" + registrationFee
				+ ", doctor=" + doctor + ", section=" + section + "]";
	}

    
	


	public List<CertificateType> getCertificate_type() {
		return certificate_type;
	}





	public void setCertificate_type(List<CertificateType> certificate_type) {
		this.certificate_type = certificate_type;
	}





	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public List<Section> getSection() {
		return section;
	}

	public void setSection(List<Section> section) {
		this.section = section;
	}

	public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getSocialSafeNum() {
        return socialSafeNum;
    }

    public void setSocialSafeNum(String socialSafeNum) {
        this.socialSafeNum = socialSafeNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSelfPaying() {
        return selfPaying;
    }

    public void setSelfPaying(Integer selfPaying) {
        this.selfPaying = selfPaying;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getEarlyAppointment() {
        return earlyAppointment;
    }

    public void setEarlyAppointment(String earlyAppointment) {
        this.earlyAppointment = earlyAppointment;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNoted() {
        return noted;
    }

    public void setNoted(String noted) {
        this.noted = noted;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(Double registrationFee) {
        this.registrationFee = registrationFee;
    }
}