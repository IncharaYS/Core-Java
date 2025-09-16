package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.constants.Gender;
import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.validator.PoliceValidator;

import java.util.Objects;

public class PoliceStation {

    public PoliceStation(int size){
        this.polices=new Police[size];
    }

    public Police[] polices;
    public int index;

    public boolean addPolice(Police police){
        boolean isPoliceAdded=false;
        boolean isPoliceInfoValid=false;

        PoliceValidator policeValidator=new PoliceValidator();
        if(policeValidator.validatePolice(police)){
            isPoliceInfoValid=true;
            polices[index++]=police;
            isPoliceAdded=true;
        }
        return isPoliceAdded;
    }

    public boolean updateNameById(int existingId,String updatedName){
        boolean isNameUpdated=false;
        for(Police police:this.polices){
            if(police.getPoliceId()==existingId){
                police.setName(updatedName);
                isNameUpdated=true;
                System.out.println("Name of police "+police.getPoliceId()+" updated to:"+police.getName());
            }
            if(!isNameUpdated) System.out.println("Police Id "+existingId+" does not exist");
        }

        return isNameUpdated;
    }

    public boolean updateGenderById(int existingId,Gender updatedGender){
        boolean isGenderUpdated=false;
        for(Police police:this.polices){
            if(police.getPoliceId()==existingId){
                police.setGender(updatedGender);
                isGenderUpdated=true;
                System.out.println("Gender of police "+police.getPoliceId()+" updated to:"+police.getGender());
            }
            if(!isGenderUpdated) System.out.println("Police Id "+existingId+" does not exist");
        }

        return isGenderUpdated;
    }

    public boolean updateRankById(int existingId,String updatedRank){
        boolean isRankUpdated=false;
        for(Police police:this.polices){
            if(police.getPoliceId()==existingId){
                police.setRank(updatedRank);
                isRankUpdated=true;
                System.out.println("Rank of police "+police.getPoliceId()+" updated to:"+police.getRank());
            }
            if(!isRankUpdated) System.out.println("Police Id "+existingId+" does not exist");
        }

        return isRankUpdated;
    }

    public boolean updateDepartmentById(int existingId,String updatedDepartment){
        boolean isDepartmentUpdated=false;
        for(Police police:this.polices){
            if(police.getPoliceId()==existingId){
                police.setDepartment(updatedDepartment);
                isDepartmentUpdated=true;
                System.out.println("Department of police "+police.getPoliceId()+" updated to:"+police.getDepartment());
            }
            if(!isDepartmentUpdated) System.out.println("Police Id "+existingId+" does not exist");
        }

        return isDepartmentUpdated;
    }

    public boolean updateShiftById(int existingId,String updatedShift){
        boolean isShiftUpdated=false;
        for(Police police:this.polices){
            if(police.getPoliceId()==existingId){
                police.setShift(updatedShift);
                isShiftUpdated=true;
                System.out.println("Shift of police "+police.getPoliceId()+" updated to:"+police.getShift());
            }
            if(!isShiftUpdated) System.out.println("Police Id "+existingId+" does not exist");
        }

        return isShiftUpdated;
    }

    public String getNameById(int existingPoliceId){
        boolean isIdFound=false;
        for(Police police:polices){
            if(police.getPoliceId()==existingPoliceId){
                isIdFound=true;
                return police.getName();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public Gender getGenderById(int existingPoliceId){
        boolean isIdFound=false;
        for(Police police:polices){
            if(police!=null&&police.getPoliceId()==existingPoliceId){
                isIdFound=true;
                return police.getGender();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public String getRankById(int existingPoliceId){
        boolean isIdFound=false;
        for(Police police:polices){
            if(police!=null&&police.getPoliceId()==existingPoliceId){
                isIdFound=true;
                return police.getRank();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public String getDepartmentById(int existingPoliceId){
        boolean isIdFound=false;
        for(Police police:polices){
            if(police!=null&&police.getPoliceId()==existingPoliceId){
                isIdFound=true;
                return police.getDepartment();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public String getShiftById(int existingPoliceId){
        boolean isIdFound=false;
        for(Police police:polices){
            if(police!=null&&police.getPoliceId()==existingPoliceId){
                isIdFound=true;
                return police.getShift();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public Gender getGenderByName(String existingName){
        boolean isIdFound=false;
        for(Police police:polices){
            if(police!=null&&police.getName().equals(existingName)){
                isIdFound=true;
                return police.getGender();
            }
        }
        System.out.println("Name not found");
        return null;
    }

    public void deletePoliceByName(String name){
        boolean isDeleted=false;
        for(int i=0;i<polices.length;i++){
            if(Objects.equals(polices[i].getName(), name) &&polices[i]!=null){
                for (int j=i;j<polices.length-1;j++) {
                    polices[j]=polices[j+1];
                }
                polices[polices.length - 1] = null;
                System.out.println("Police with name "+name+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No police with name "+name+" is found");
    }


    public void deletePoliceById(int id){
        boolean isDeleted=false;
        for(int i=0;i<polices.length;i++){
            if(polices[i].getPoliceId()==id&&polices[i]!=null){
                for (int j=i;j<polices.length-1;j++) {
                    polices[j]=polices[j+1];
                }
                polices[polices.length - 1] = null;
                System.out.println("Police with id "+id+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No police with id "+id+" is found");
    }


    public Police getPoliceById(int existingId){
        Police policec=null;
        for(Police police:polices){
            if(police.getPoliceId()==existingId){
                policec=police;
                System.out.println("Police details are:");
                getPoliceDetails(police);
            }
        }
        return policec;
    }

    public void getPoliceDetails(Police police){
        if (police != null) {
            System.out.println("Police Id is:" + police.getPoliceId());
            System.out.println("Police name is:" + police.getName());
            System.out.println("Police gender is:" + police.getGender());
            System.out.println("Police rank is:" + police.getRank());
            System.out.println("Police shift is:" + police.getShift());
            System.out.println("Police department is:" + police.getDepartment());
            System.out.println("--------------------------------------------------------------");
        }
        else{
            System.out.println("No police found");
            System.out.println("--------------------------------------------------------------");
        }
    }

    public void getPoliceInfo(){
        System.out.println("Police details are:");
        for(Police police:polices) {
            if (police != null) {
                System.out.println("Police Id is:" + police.getPoliceId());
                System.out.println("Police name is:" + police.getName());
                System.out.println("Police gender is:" + police.getGender());
                System.out.println("Police rank is:" + police.getRank());
                System.out.println("Police shift is:" + police.getShift());
                System.out.println("Police department is:" + police.getDepartment());
                System.out.println("--------------------------------------------------------------");
            }
            else{
                System.out.println("No police found");
                System.out.println("--------------------------------------------------------------");
            }
        }
    }
}
