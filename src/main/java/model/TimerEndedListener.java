package model;

import java.util.EventListener;

interface TimerEndedListener extends EventListener {
    void timerEnded(ETimerEnded timerEnded);
}
