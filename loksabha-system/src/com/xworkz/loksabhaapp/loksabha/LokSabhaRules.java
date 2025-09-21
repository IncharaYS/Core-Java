package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.constants.Gender;
import com.xworkz.loksabhaapp.politician.Politician;

public interface LokSabhaRules {
    boolean addPolitician(Politician politician);
    void updateNameById(int id, String name);
    boolean updateGenderById(int existingId, Gender updatedGender);
    boolean updateAgeById(int existingId, int updatedAge);
    boolean updatePartyById(int existingId, String updatedParty);
    boolean updateStateById(int existingId, String updatedState);
    String getNameById(int existingId);
    Gender getGenderById(int existingId);
    int getAgeById(int existingId);
    String getPartyById(int existingId);
    String getStateById(int existingId);
    void deletePoliticianByName(String name);
    void deletePoliticianByParty(String party);
    void deletePoliticianById(int id);
    Politician getPoliticianById(int existingId);
    void getPoliticianDetails(Politician politician);
    void getPoliticianInfo();
}
