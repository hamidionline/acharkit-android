package ir.acharkit.android.demo.model;

import ir.acharkit.android.component.carousel.model.CarouselModel;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    12/7/17
 * Email:   alirezat775@gmail.com
 */
public class TestCarouselModel extends CarouselModel {

    private int id;
    private String title;
    private String imageUri;

    public TestCarouselModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
