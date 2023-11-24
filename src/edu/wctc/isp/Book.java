package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Book extends Media{
    String getISBN();

    int getPages();

}
