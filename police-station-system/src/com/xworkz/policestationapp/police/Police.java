package com.xworkz.policestationapp.police;

import com.xworkz.policestationapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Police {
    private int policeId;
    private String name;
    private Gender gender;
    private String rank;
    private String department;
    private String shift;

    @Override
    public String toString(){
        return "Police-(policeId="+this.policeId+
                " , name="+this.name+
                " , gender="+this.gender+
                " , rank="+this.rank+
                " , department="+this.department+
                " , shift="+this.shift+
                ")";
    }

    @Override
    public  boolean equals(Object obj){
        if(obj instanceof Police){
            Police police=(Police) obj;
            if(this.policeId==police.policeId && this.name.equals(police.name) && this.gender.equals(police.gender) && this.rank.equals(police.rank)
            && this.department.equals(police.department) && this.shift.equals(police.department)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policeId, name, gender, rank, department, shift);
    }
}
