package edu.wctc.isp;

import java.time.LocalDate;

public interface Media {
    String getArtist();

    String getAuthor();
    double getCost();
    String getFormattedReleaseDate();
    int getQuantityOnHand();
    LocalDate getReleaseDate();
    String getTitle();
    void order(int quantity);
}
