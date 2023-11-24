package edu.wctc.isp;

import java.time.Duration;

public interface Record extends Media{
    Duration getPlayingTime();
}
