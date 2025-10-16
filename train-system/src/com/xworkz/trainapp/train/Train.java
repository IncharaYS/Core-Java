package com.xworkz.trainapp.train;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Train {
    private int trainId;
    private String trainName;
    private int trainNumber;
    private String source;
    private String destination;
    private int coaches;
    private double ticketPrice;
}
