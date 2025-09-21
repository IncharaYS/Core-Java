package com.xworkz.policestationapp.validator;

import com.xworkz.policestationapp.police.Police;

public class PoliceValidator {
    public boolean validatePolice(Police police){
        boolean isPoliceValidated=false;
        boolean isIdValid=false;
        boolean isNameValid=false;
        boolean isGenderValid=false;
        boolean isRankValid=false;
        boolean isShiftValid=false;
        boolean isDepartmentValid=false;

        if (police.getPoliceId()>0) isIdValid=true;
        else System.out.println("Entered police Id is not valid");

        if (police.getName()!=null&&!police.getName().isEmpty()) isNameValid=true;
        else System.out.println("Entered police name is not valid");

        if (police.getDepartment()!=null&&!police.getDepartment().isEmpty()) isDepartmentValid=true;
        else System.out.println("Entered department is not valid");

        if (police.getGender()!=null) isGenderValid=true;
        else System.out.println("Entered gender is not valid");

        if (police.getRank()!=null&&!police.getRank().isEmpty()) isRankValid=true;
        else System.out.println("Entered rank is not valid");

        if (police.getShift()!=null&&!police.getShift().isEmpty()) isShiftValid=true;
        else System.out.println("Entered rank is not valid");

        if (isIdValid&&isNameValid&&isGenderValid&&isDepartmentValid&&isRankValid&&isShiftValid){
            isPoliceValidated=true;
        }
        return isPoliceValidated;
    }
}
