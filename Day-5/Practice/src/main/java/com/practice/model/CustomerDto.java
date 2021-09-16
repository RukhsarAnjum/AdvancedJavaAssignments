package com.practice.model;
import java.util.Date;

public class CustomerDto {
    private Integer customerId;
    private String customerName;
    private Date birthDate;
    private Long mobileNumber;
    private String email;

    public CustomerDto(){

    }

    public CustomerDto(Integer customerId, String customerName,Date birthDate, Long mobileNumber, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.birthDate = birthDate;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", birthDate=" + birthDate +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
