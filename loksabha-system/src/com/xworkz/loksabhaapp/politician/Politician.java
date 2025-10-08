package com.xworkz.loksabhaapp.politician;


import com.xworkz.loksabhaapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Politician {
    private int politicianId;
    private String name;
    private Gender gender;
    private int age;
    private String party;
    private String state;

    @Override
    public String toString(){
        return "Politician-(politicianId="+this.politicianId+
                " , name="+this.name+
                " , gender="+this.gender+
                " , age="+this.age+
                " , party="+this.party+
                " , state="+this.state+
        ")";
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Politician){
            Politician politician=(Politician) obj;
            if(this.politicianId==politician.politicianId && this.name.equals(politician.name) && this.gender.equals(politician.gender) &&
            this.age==politician.age && this.party.equals(politician.party) && this.state.equals(politician.state)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(politicianId, name, gender, age, party, state);
    }
}
