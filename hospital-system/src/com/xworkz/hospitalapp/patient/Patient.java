package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Patient {
    private int patientId;
    private String name;
    private Gender gender;
    private long phoneNo;
    private String modeOfPayment;
    private double billAmount;

    @Override
    public String toString(){
        return "Patient-(patientId="+this.patientId+
                " , name="+this.name+
                " , gender="+this.gender+
                " , phoneNo="+this.phoneNo+
                " , modeOfPayment="+this.modeOfPayment+
                " , billAmount="+this.billAmount+
                ")";
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Patient){
            Patient patient=(Patient) obj;
            if(this.patientId==patient.patientId && this.name.equals(patient.name) && this.gender.equals(patient.gender) && this.phoneNo==patient.phoneNo && this.modeOfPayment.equals(patient.modeOfPayment) &&
            this.billAmount==patient.billAmount){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, name, gender, phoneNo, modeOfPayment, billAmount);
    }
}
