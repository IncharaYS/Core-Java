package com.xworkz.courseapp.course;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Course {
    private int courseId;
    private String courseName;
    private int duration;
    private double fees;
    private String instructorName;
    private String Timing;
    private String institute;

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", duration=" + duration +
                ", fees=" + fees +
                ", instructorName='" + instructorName + '\'' +
                ", Timing='" + Timing + '\'' +
                ", institute='" + institute + '\'' +
                '}';
    }
}
