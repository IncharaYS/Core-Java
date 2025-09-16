package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.constants.Gender;
import com.xworkz.loksabhaapp.politician.Politician;
import com.xworkz.loksabhaapp.validator.PoliticianValidator;

import java.util.Objects;

public class LokSabha {

    public LokSabha(int size) {
        this.politicians = new Politician[size];
    }


    public Politician[] politicians;
    public int index;

    public boolean addPolitician(Politician politician) {
        boolean isPoliticianAdded = false;

        PoliticianValidator politicianValidator = new PoliticianValidator();
        if (politicianValidator.validatePolitician(politician)) {
            politicians[index++] = politician;
            isPoliticianAdded = true;
        }
        return isPoliticianAdded;
    }

    public void updateNameById(int id, String name) {
        boolean isUpdated = false;
        for (Politician politician : politicians) {
            if (politician.getPoliticianId() == id) {
                isUpdated = true;
                politician.setName(name);
                System.out.println("Politician with id " + id + " name updated to " + politician.getName());
            }
        }
        if (!isUpdated) System.out.println(("Politician with given id " + id + " not found"));
    }

    public boolean updateGenderById(int existingId, Gender updatedGender) {
        boolean isGenderUpdated = false;
        for (Politician politician : this.politicians) {
            if (politician.getPoliticianId() == existingId) {
                politician.setGender(updatedGender);
                isGenderUpdated = true;
                System.out.println("Gender of politician " + politician.getPoliticianId() + " updated to:" + politician.getGender());
            }
            if (!isGenderUpdated) System.out.println("Politician Id " + existingId + " does not exist");
        }

        return isGenderUpdated;
    }

    public boolean updateAgeById(int existingId, int updatedAge) {
        boolean isAgeUpdated = false;
        for (Politician politician : this.politicians) {
            if (politician.getPoliticianId() == existingId) {
                politician.setAge(updatedAge);
                isAgeUpdated = true;
                System.out.println("Age of politician " + politician.getPoliticianId() + " updated to:" + politician.getAge());
            }
            if (!isAgeUpdated) System.out.println("Politician Id " + existingId + " does not exist");
        }

        return isAgeUpdated;
    }

    public boolean updatePartyById(int existingId, String updatedParty) {
        boolean isPartyUpdated = false;
        for (Politician politician : this.politicians) {
            if (politician.getPoliticianId() == existingId) {
                politician.setParty(updatedParty);
                isPartyUpdated = true;
                System.out.println("Party of politician " + politician.getPoliticianId() + " updated to:" + politician.getParty());
            }
            if (!isPartyUpdated) System.out.println("Politician Id " + existingId + " does not exist");
        }

        return isPartyUpdated;
    }

    public boolean updateStateById(int existingId, String updatedState) {
        boolean isStateUpdated = false;
        for (Politician politician : this.politicians) {
            if (politician.getPoliticianId() == existingId) {
                politician.setState(updatedState);
                isStateUpdated = true;
                System.out.println("State of politician " + politician.getPoliticianId() + " updated to:" + politician.getState());
            }
            if (!isStateUpdated) System.out.println("Politician Id " + existingId + " does not exist");
        }

        return isStateUpdated;
    }

    public String getNameById(int existingId) {
        boolean isIdFound = false;
        for (Politician politician : politicians) {
            if (politician.getPoliticianId() == existingId) {
                isIdFound = true;
                return politician.getName();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public Gender getGenderById(int existingId) {
        boolean isIdFound = false;
        for (Politician politician : politicians) {
            if (politician != null && politician.getPoliticianId() == existingId) {
                isIdFound = true;
                return politician.getGender();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public int getAgeById(int existingId) {
        boolean isIdFound = false;
        for (Politician politician : politicians) {
            if (politician != null && politician.getPoliticianId() == existingId) {
                isIdFound = true;
                return politician.getAge();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    public String getPartyById(int existingId) {
        boolean isIdFound = false;
        for (Politician politician : politicians) {
            if (politician != null && politician.getPoliticianId() == existingId) {
                isIdFound = true;
                return politician.getParty();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public String getStateById(int existingId) {
        boolean isIdFound = false;
        for (Politician politician : politicians) {
            if (politician != null && politician.getPoliticianId() == existingId) {
                isIdFound = true;
                return politician.getState();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public void deletePoliticianByName(String name) {
        boolean isDeleted = false;
        for (int i = 0; i < politicians.length; i++) {
            if (Objects.equals(politicians[i].getName(), name) && politicians[i] != null) {
                for (int j = i; j < politicians.length - 1; j++) {
                    politicians[j] = politicians[j + 1];
                }
                politicians[politicians.length - 1] = null;
                System.out.println("Politician with name " + name + " is deleted \n");
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) System.out.println("No politician with name " + name + " is found");
    }

    public void deletePoliticianByParty(String party) {
        boolean isDeleted = false;
        for (int i = 0; i < politicians.length; i++) {
            if (Objects.equals(politicians[i].getParty(), party) && politicians[i] != null) {
                for (int j = i; j < politicians.length - 1; j++) {
                    politicians[j] = politicians[j + 1];
                }
                politicians[politicians.length - 1] = null;
                System.out.println("Politician with party " + politicians[i].getParty() + " is deleted \n");
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) System.out.println("No politician with party " + party + " is found");
    }

    public void deletePoliticianById(int id) {
        boolean isDeleted = false;
        for (int i = 0; i < politicians.length; i++) {
            if (politicians[i].getPoliticianId() == id && politicians[i] != null) {
                for (int j = i; j < politicians.length - 1; j++) {
                    politicians[j] = politicians[j + 1];
                }
                politicians[politicians.length - 1] = null;
                System.out.println("Politician with id " + id + " is deleted \n");
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) System.out.println("No politician with id " + id + " is found");
    }

    public Politician getPoliticianById(int existingId){
        Politician politicianc=null;
        for(Politician politician:politicians){
            if(politician.getPoliticianId()==existingId){
                    politicianc=politician;
                System.out.println("Politician details are:");
                getPoliticianDetails(politician);
            }
        }
        return politicianc;
    }

    public void getPoliticianDetails(Politician politician) {
        if (politician != null) {
            System.out.println("Politician ID is: " + politician.getPoliticianId());
            System.out.println("Politician name is: " + politician.getName());
            System.out.println("Politician age is: " + politician.getAge());
            System.out.println("Politician gender is: " + politician.getGender());
            System.out.println("Politician party is: " + politician.getParty());
            System.out.println("Politician state is: " + politician.getState());
            System.out.println("----------------------------------------------------------");
        } else {
            System.out.println("No politician found");
            System.out.println("----------------------------------------------------------");
        }
    }


    public void getPoliticianInfo() {
        System.out.println("Politicians details are:");
        for (Politician politician : politicians) {
            if (politician != null) {
                System.out.println("Politician ID is: " + politician.getPoliticianId());
                System.out.println("Politician name is: " + politician.getName());
                System.out.println("Politician age is: " + politician.getAge());
                System.out.println("Politician gender is: " + politician.getGender());
                System.out.println("Politician party is: " + politician.getParty());
                System.out.println("Politician state is: " + politician.getState());
                System.out.println("----------------------------------------------------------");
            } else {
                System.out.println("No politician found");
                System.out.println("----------------------------------------------------------");
            }
        }
    }
}

