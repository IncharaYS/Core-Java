package com.xworkz.gameapp.game;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Game {
        private int gameId;
        private String name;
        private String genre;
        private String platform;
        private double rating;
        private int releaseYear;
        private double price;

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", platform='" + platform + '\'' +
                ", rating=" + rating +
                ", releaseYear=" + releaseYear +
                ", price=" + price +
                '}';
    }
}
