package de.lubowiecki.okt24.patterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        Server server = new Server();
        server.send(new EMail("x@y.de", "a@b.com", "Dies und das", "Hallo... das ist meine Nachricht"));
        server.send(new EMail("a@b.com", "x@y.de", "Re: Dies und das", "Hallo... das ist eine andere Nachricht"));
        server.send(new Sms("12345678", "345678901", "Hi... das ist meine Nachricht... sie ist ziemlich lang... dies und das. Bla bla bla bla bla"));

        Tweet tweet = new Tweet("Peter Parker", "superheros", "Neue Strumpfhose",
                "Bla bla bla bla bla...", "spider", "web", "ny", "cool");

        server.send(new TweetToMassageAdapter(tweet));

    }
}
