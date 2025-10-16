package com.xworkx.companyapp.company;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
    private int companyId;
    private String name;
    private String industryType;
    private String location;
    private int employeeCount;
    private double revenue;
    private String ceo;
}
