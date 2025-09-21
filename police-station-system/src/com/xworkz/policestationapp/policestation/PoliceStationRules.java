package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.constants.Gender;
import com.xworkz.policestationapp.police.Police;

public interface PoliceStationRules {
    boolean addPolice(Police police);
    boolean updateNameById(int existingId,String updatedName);
    boolean updateGenderById(int existingId, Gender updatedGender);
    boolean updateRankById(int existingId,String updatedRank);
    boolean updateDepartmentById(int existingId,String updatedDepartment);
    boolean updateShiftById(int existingId,String updatedShift);
    String getNameById(int existingPoliceId);
    Gender getGenderById(int existingPoliceId);
    String getRankById(int existingPoliceId);
    String getDepartmentById(int existingPoliceId);
    String getShiftById(int existingPoliceId);
    Gender getGenderByName(String existingName);
    void deletePoliceByName(String name);
    void deletePoliceById(int id);
    Police getPoliceById(int existingId);
    void getPoliceDetails(Police police);
    void getPoliceInfo();

}
