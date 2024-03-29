package com.tts.TechTalentTwitter.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.ocpsoft.prettytime.PrettyTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TweetDisplay {
    private User user;
    private String message;
    private String date;
    private List<Tag> tags;


    }











//    private List<TweetDisplay> formatTimestamps(List<Tweet> tweets) {
//        List<TweetDisplay> response = new ArrayList<>();
//        PrettyTime prettyTime = new PrettyTime();
//        SimpleDateFormat simpleDate = new SimpleDateFormat("M/d/yy");
//        Date now = new Date();
//        for (Tweet tweet : tweets) {
//            TweetDisplay tweetDisplay = new TweetDisplay();
//            tweetDisplay.setUser(tweet.getUser());
//            tweetDisplay.setMessage(tweet.getMessage());
//            tweetDisplay.setTags(tweet.getTags());
//            long diffInMillies = Math.abs(now.getTime() - tweet.getCreatedAt().getTime());
//            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//            if (diff > 3) {
//                tweetDisplay.setDate(simpleDate.format(tweet.getCreatedAt()));
//            } else {
//                tweetDisplay.setDate(prettyTime.format(tweet.getCreatedAt()));
//            }
//            response.add(tweetDisplay);
//        }
//        return response;
//    }
//
//
//
//}
