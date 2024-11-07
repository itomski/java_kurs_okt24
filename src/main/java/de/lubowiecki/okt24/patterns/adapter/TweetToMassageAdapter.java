package de.lubowiecki.okt24.patterns.adapter;

public class TweetToMassageAdapter implements Message {

    private Tweet tweet;

    public TweetToMassageAdapter(Tweet tweet) {
        this.tweet = tweet;
    }

    @Override
    public void compute() {
        tweet.post();
    }
}
