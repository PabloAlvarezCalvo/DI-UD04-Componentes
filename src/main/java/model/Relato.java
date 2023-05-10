package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Relato extends ImageView implements TimerEndedListener {
    private ArrayList<String> images = new ArrayList<>();
    private int index = 0;
    private boolean finished = false;
    private CustomTimer timer;

    public Relato() {
        this.setPreserveRatio(true);
        this.setFitWidth(200d);
        timer = new CustomTimer(5);

        timer.addListener(this);
    }

    public void addImage(String url){
        images.add(url);
    }

    public void nextImage(){
        if (!finished) {
            String url = images.get(++index);
            this.setImage(new Image(url));

            if (index == images.size() - 1) {
                finished = true;
            } else {
                stop();
                start();
            }
        }

    }

    public void start(){
        if (images.size() > 0) {
            this.setImage(new Image(images.get(index)));
            this.setVisible(true);
        }
        finished = false;
        timer.start();
    }

    public void pause(){
        timer.pause();
    }

    public void resume(){
        timer.resume();
    }

    public void stop(){
        timer.stop();
        finished = false;
        this.setVisible(false);
    }

    public void restart(){
        stop();
        start();
    }


    @Override
    public void timerEnded(ETimerEnded timerEnded) {
        nextImage();
    }
}
