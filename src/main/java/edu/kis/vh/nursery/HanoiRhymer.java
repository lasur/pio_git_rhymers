package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//skrót alt + strzałka w lewo przechodzi do następnego słowa w Eclipse w Intellij ten skrót to ctrl + strzałka w lewo
//skrót alt + strzałka w prawo przechodzi do poprzedniego słowa w Eclipse w Intellij ten skrót to ctrl + strzałka w prawo