package com.xworkz.instituteapp.trainee;

import com.xworkz.instituteapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.management.ThreadInfo;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Trainee {
    private int traineeId;
    private String name;
    private Gender gender;
    private int age;
    private long phoneNo;
    private String email;

    @Override
    public String toString(){
        return "Trainee-(traineeId="+this.traineeId+
                " , name="+this.name+
                " , gender="+this.gender+
                " , age="+this.age+
                " , phoneNo="+this.phoneNo+
                " , email="+this.email+
        ")";
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Trainee){
            Trainee trainee=(Trainee) obj;
            if(this.traineeId==trainee.traineeId && this.name.equals(trainee.name) && this.gender.equals(trainee.gender) && this.age==trainee.age &&
            this.phoneNo==trainee.phoneNo && this.email.equals(trainee.email)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(traineeId, name, gender, age, phoneNo, email);
    }
}
