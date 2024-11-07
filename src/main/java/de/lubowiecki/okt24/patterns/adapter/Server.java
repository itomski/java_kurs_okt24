package de.lubowiecki.okt24.patterns.adapter;


import java.time.LocalDateTime;

public class Server {

    public Server() {
        System.out.println(LocalDateTime.now() + ": Server läuft");
    }

    public void send(Message msg) {
        System.out.println(LocalDateTime.now() + ": Nachricht wird verarbeitet");
        msg.compute();
    }
}
