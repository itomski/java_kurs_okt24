package de.lubowiecki.okt24;

import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class MiniGame {

    // Schreibe ein kleines Programm, welches ein Element in auf einem 2d Spielfeld anzeigt
    // Der User wird immer wieder nach Eigabe gefragt

    // 1x pro Sekunde wird geprüft, ob der Benutzer Eingaben für die Bewegung gemacht hat

    // Falls nicht, passiert nicht.
    // Falls doch, soll das Element bewegt werden und das Spielfeld neu ausgegeben werden

    private final ScheduledExecutorService service;

    private final Scanner scanner;

    private final Goblin goblin;

    private Board board;

    private final JFrame frame;

    public MiniGame() {
        this.service = Executors.newScheduledThreadPool(1);
        this.scanner = new Scanner(System.in);
        this.goblin = new Goblin();
        board  = new Board();
        frame = new JFrame("Mini Game");
    }

    public static void main(String[] args) {
        new MiniGame().start();
    }

    private void start() {

        // Runnable: void run();
        // service.scheduleAtFixedRate(() -> update(), 0, 1, TimeUnit.SECONDS);
        // als Methodenreferenz
        service.scheduleAtFixedRate(this::update, 0, 1, TimeUnit.SECONDS);

        frame.add(board);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        printBoard();

        app: while(true) {
            System.out.print("Eingabe: ");

            String input = scanner.next().toLowerCase();

            if(input.equals("exit")) {
                break app;
            }
            else if(input.equals("move")) {
                System.out.print("x: ");
                goblin.setX(scanner.nextInt());
                System.out.print("y: ");
                goblin.setY(scanner.nextInt());
                System.out.println();
            }
            else {
                System.out.println("Falsche Eingabe!");
            }
        }

        frame.setVisible(false);
        frame.dispose();
        service.shutdown();
    }

    public void printBoard() {
        board.setX(goblin.getX());
        board.setY(goblin.getY());
        frame.getContentPane().removeAll();
        frame.add(board);
        frame.repaint();
    }

    public void update() {
        if(goblin.isMoved()) {
            printBoard();
            goblin.setMoved(false);
        }
    }
}

class Board extends JPanel {

    private int x;
    private int y;

    @Override
    public void paint(Graphics g) {
        Graphics2D graphic2d = (Graphics2D) g;
        graphic2d.setColor(Color.RED);
        graphic2d.fillRect(x, y, 10, 10);
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x * 10;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y * 10;
    }
}

class Goblin {

    private int x;
    private int y;
    private boolean moved;

    public Goblin() {
    }

    public Goblin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(this.x != x) {
            this.x = x;
            setMoved(true);
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(this.y != y) {
            this.y = y;
            setMoved(true);
        }
    }

    public boolean isMoved() {
        return moved;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }
}