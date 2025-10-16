package com.xworkz.jobapp.job;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Job {
    private int jobId;
    private String title;
    private String company;
    private double salary;
    private String location;
    private String jobType;
    private int experienceRequired;

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", jobType='" + jobType + '\'' +
                ", experienceRequired=" + experienceRequired +
                '}';
    }
}
