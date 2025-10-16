package com.xworkz.festivalapp.festival;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Festival {
        private String name;
        private String country;
        private String month;
        private int durationInDays;
        private String significance;
        private boolean nationalHoliday;

        @Override
        public String toString() {
                return "Festival{" +
                        "name='" + name + '\'' +
                        ", country='" + country + '\'' +
                        ", month='" + month + '\'' +
                        ", durationInDays=" + durationInDays +
                        ", significance='" + significance + '\'' +
                        ", nationalHoliday=" + nationalHoliday +
                        '}';
        }
}
