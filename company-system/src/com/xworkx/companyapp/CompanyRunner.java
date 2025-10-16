package com.xworkx.companyapp;

import com.xworkx.companyapp.company.Company;
import java.util.ArrayList;
import java.util.List;

public class CompanyRunner {
    public static void main(String[] args) {
        List<Company> companyList = new ArrayList<>();

        companyList.add(new Company(1, "TCS", "IT Services", "Bangalore", 500000, 2500000.0, "Rajesh Gopinathan"));
        companyList.add(new Company(2, "Infosys", "IT Services", "Bangalore", 350000, 2000000.0, "Salil Parekh"));
        companyList.add(new Company(3, "Wipro", "IT Services", "Bangalore", 250000, 1500000.0, "Thierry Delaporte"));
        companyList.add(new Company(4, "Reliance", "Conglomerate", "Mumbai", 195000, 5000000.0, "Mukesh Ambani"));
        companyList.add(new Company(5, "HCL", "IT Services", "Noida", 200000, 1800000.0, "C Vijayakumar"));
        companyList.add(new Company(6, "L&T", "Engineering", "Mumbai", 150000, 3000000.0, "S.N. Subrahmanyan"));
        companyList.add(new Company(7, "Adani Group", "Conglomerate", "Ahmedabad", 120000, 4000000.0, "Gautam Adani"));
        companyList.add(new Company(8, "Flipkart", "E-Commerce", "Bangalore", 30000, 1000000.0, "Kalyan Krishnamurthy"));
        companyList.add(new Company(9, "Amazon India", "E-Commerce", "Bangalore", 60000, 1500000.0, "Amit Agarwal"));
        companyList.add(new Company(10, "Google India", "Technology", "Bangalore", 8000, 500000.0, "Sundar Pichai"));

        System.out.println("Company list 1:");
        for(Company company : companyList){
            System.out.println(company);
        }
        System.out.println();
        System.out.println("Size of Company list 1:" + companyList.size());

        List<Company> companyList2 = new ArrayList<>();

        companyList2.add(new Company(11, "Microsoft India", "Technology", "Hyderabad", 9000, 450000.0, "Satya Nadella"));
        companyList2.add(new Company(12, "Oracle India", "Technology", "Bangalore", 7000, 400000.0, "Safra Catz"));
        companyList2.add(new Company(13, "IBM India", "Technology", "Bangalore", 12000, 600000.0, "Arvind Krishna"));
        companyList2.add(new Company(14, "Dell India", "Technology", "Bangalore", 8000, 350000.0, "Michael Dell"));
        companyList2.add(new Company(15, "Capgemini India", "IT Services", "Bangalore", 15000, 500000.0, "Aiman Ezzat"));
        companyList2.add(new Company(16, "Tech Mahindra", "IT Services", "Pune", 125000, 600000.0, "CP Gurnani"));
        companyList2.add(new Company(17, "Cisco India", "Technology", "Bangalore", 7000, 300000.0, "Chuck Robbins"));
        companyList2.add(new Company(18, "SAP Labs India", "Technology", "Bangalore", 14000, 450000.0, "Christian Klein"));
        companyList2.add(new Company(19, "Uber India", "Technology", "Bangalore", 6000, 250000.0, "Dara Khosrowshahi"));
        companyList2.add(new Company(20, "Zomato", "FoodTech", "Gurgaon", 5000, 150000.0, "Deepinder Goyal"));

        System.out.println("Company list 2:");
        for(Company company : companyList2){
            System.out.println(company);
        }
        System.out.println();
        System.out.println("Size of Company list 2:" + companyList2.size());

        companyList.addAll(companyList2);
        System.out.println("Full company list:");
        for(Company company : companyList){
            System.out.println(company);
        }
        System.out.println();

        Company company1 = new Company(6, "L&T", "Engineering", "Mumbai", 150000, 3000000.0, "S.N. Subrahmanyan");
        Company company2 = new Company(21, "Paytm", "FinTech", "Noida", 10000, 200000.0, "Vijay Shekhar Sharma");
        companyList.add(4, company2);

        System.out.println("Does list contain company1:" + companyList.contains(company1));
        System.out.println("Does list contain companyList2:" + companyList.containsAll(companyList2));
        System.out.println();

        companyList.remove(company1);
        companyList.remove(7);

        System.out.println("Company list after remove(Object) and remove(index):");
        for(Company company : companyList){
            System.out.println(company);
        }
        System.out.println();

        companyList.removeAll(companyList2);
        System.out.println("Company list after removing companyList2:");
        for(Company company : companyList){
            System.out.println(company);
        }
        System.out.println();

        System.out.println("Does list contain company1:" + companyList.contains(company1));
        System.out.println("Does list contain companyList2:" + companyList.containsAll(companyList2));
        System.out.println();

        companyList.addAll(companyList2);
        companyList.retainAll(companyList2);

        System.out.println("Company list after retaining only companyList2:");
        for(Company company : companyList){
            System.out.println(company);
        }
        System.out.println();
    }
}
