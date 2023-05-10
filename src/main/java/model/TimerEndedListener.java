package model;

import java.util.EventListener;

interface TimerEndedListener extends EventListener {
    public void timerEnded(ETimerEnded timerEnded);
}
