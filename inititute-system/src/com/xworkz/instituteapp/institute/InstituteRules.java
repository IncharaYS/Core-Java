package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;

public interface InstituteRules {
    boolean addTrainee(Trainee trainee);
    boolean updateNameById(int existingId,String updatedName);
    boolean updateAgeById(int existingId,int updatedAge);
    boolean updatePhoneNoById(int existingId,long updatedPhoneNo);
    boolean updateEmailById(int existingId,String updatedEmail);
    String getNameById(int existingId);
    String getEmailById(int existingId);
    void deleteTraineeByName(String name);
    void deleteTraineeById(int id);
    Trainee getTraineeById(int existingId);
    void getTraineeDetails(Trainee trainee);
    void getTraineeInfo();
}
