package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class Relato extends ImageView {
    private ArrayList<String> images = new ArrayList<>();
    private int index = 0;
    private boolean finished = false;

    public Relato() {
        this.setPreserveRatio(true);
        this.setFitWidth(200d);
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
            }
        }

    }

    public void start(){
        index = 0;
        if (images.size() >0) {
            this.setImage(new Image(images.get(index)));
            this.setVisible(true);
        }
        finished = false;
    }

    public void restart(){
        this.start();
        this.setVisible(false);
    }


}
