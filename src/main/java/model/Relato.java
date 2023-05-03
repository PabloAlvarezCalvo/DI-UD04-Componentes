package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.HashMap;

public class Relato extends ImageView {
    private final HashMap<Integer, String> images = new HashMap<>();
    private int index = 0;
    private boolean finished = false;

    public Relato() {
    }

    public void addImage(String url){
        images.put(images.size(), url);
    }

    public void nextImage(){
        if (!finished) {
            String url = images.get(++index);
            this.setImage(new Image(getClass().getResource(url).toExternalForm()));

            if (index == images.size() - 1) {
                finished = true;
            }
        }

    }

    public void start(){
        index = 0;
        this.setImage(new Image(getClass().getResource(images.get(index)).toExternalForm()));
        this.setVisible(true);
        finished = false;
    }

    public void restart(){
        this.start();
        this.setVisible(false);
    }


}
