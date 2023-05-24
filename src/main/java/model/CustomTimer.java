package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class CustomTimer implements Serializable {
    private int seconds = 0;
    private int targetTime;
    private Timer timer;

    private List<TimerEndedListener> listeners = new ArrayList<>();

    public CustomTimer(int targetTime){
        this.targetTime = targetTime;
    }


    public void start() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                seconds++;

                if (seconds == targetTime) {
                    ETimerEnded timerEnded = new ETimerEnded(this);
                    notifyListeners();
                }
            }
        }, 0, 1000);
    }

    public void stop(){
        try {
            timer.cancel();
            timer.purge();
            seconds = 0;
        } catch (Exception ignored){}
    }

    public void addListener(TimerEndedListener timerEndedListener){
        listeners.add(timerEndedListener);
    }

    public void notifyListeners(){
        for (TimerEndedListener t : listeners){
            t.timerEnded(new ETimerEnded(this));
        }
    }
}
