package edu.kis.vh.nursery;

public final class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//skrót alt + strzałka w lewo przechodzi do następnego słowa w Eclipse w Intellij ten skrót to ctrl + strzałka w lewo
//skrót alt + strzałka w prawo przechodzi do poprzedniego słowa w Eclipse w Intellij ten skrót to ctrl + strzałka w prawo