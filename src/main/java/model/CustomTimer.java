package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class CustomTimer implements Serializable {
    private boolean started = false;
    private boolean finished = false;
    private int seconds = 0;
    private int targetTime;
    private Timer timer;
    private TimerTask countSeconds;

    private List<TimerEndedListener> listeners = new ArrayList<>();

    public CustomTimer(int targetTime){
        this.targetTime = targetTime;
    }

    public void setTargetTime(int targetTime){
        this.targetTime = targetTime;
    }

    public void start() {
        timer = new Timer();
        started = true;
        finished = false;
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

    public void pause(){
        timer.cancel();
    }

    public void resume(){
        start();
    }

    public void stop(){
        try {
            timer.cancel();
            timer.purge();
            started = false;
            finished = false;
            seconds = 0;
        } catch (Exception ignored){}
    }

    public void restart(){
        stop();
        start();
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
