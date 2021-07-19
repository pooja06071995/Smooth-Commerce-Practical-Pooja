package com.smooth_commerce_practical_pooja.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Colors implements Serializable {
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("userName")
        @Expose
        private String userName;
        @SerializedName("numViews")
        @Expose
        private Integer numViews;
        @SerializedName("numVotes")
        @Expose
        private Integer numVotes;
        @SerializedName("numComments")
        @Expose
        private Integer numComments;
        @SerializedName("numHearts")
        @Expose
        private Integer numHearts;
        @SerializedName("rank")
        @Expose
        private Integer rank;
        @SerializedName("dateCreated")
        @Expose
        private String dateCreated;
        @SerializedName("hex")
        @Expose
        private String hex;
        @SerializedName("rgb")
        @Expose
        private Rgb rgb;
        @SerializedName("hsv")
        @Expose
        private Hsv hsv;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("imageUrl")
        @Expose
        private String imageUrl;
        @SerializedName("badgeUrl")
        @Expose
        private String badgeUrl;
        @SerializedName("apiUrl")
        @Expose
        private String apiUrl;

        public Integer getId() {
        return id;
    }

        public void setId(Integer id) {
        this.id = id;
    }

        public String getTitle() {
        return title;
    }

        public void setTitle(String title) {
        this.title = title;
    }

        public String getUserName() {
        return userName;
    }

        public void setUserName(String userName) {
        this.userName = userName;
    }

        public Integer getNumViews() {
        return numViews;
    }

        public void setNumViews(Integer numViews) {
        this.numViews = numViews;
    }

        public Integer getNumVotes() {
        return numVotes;
    }

        public void setNumVotes(Integer numVotes) {
        this.numVotes = numVotes;
    }

        public Integer getNumComments() {
        return numComments;
    }

        public void setNumComments(Integer numComments) {
        this.numComments = numComments;
    }

        public Integer getNumHearts() {
        return numHearts;
    }

        public void setNumHearts(Integer numHearts) {
        this.numHearts = numHearts;
    }

        public Integer getRank() {
        return rank;
    }

        public void setRank(Integer rank) {
        this.rank = rank;
    }

        public String getDateCreated() {
        return dateCreated;
    }

        public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

        public String getHex() {
        return hex;
    }

        public void setHex(String hex) {
        this.hex = hex;
    }

        public Rgb getRgb() {
        return rgb;
    }

        public void setRgb(Rgb rgb) {
        this.rgb = rgb;
    }

        public Hsv getHsv() {
        return hsv;
    }

        public void setHsv(Hsv hsv) {
        this.hsv = hsv;
    }

        public String getDescription() {
        return description;
    }

        public void setDescription(String description) {
        this.description = description;
    }

        public String getUrl() {
        return url;
    }

        public void setUrl(String url) {
        this.url = url;
    }

        public String getImageUrl() {
        return imageUrl;
    }

        public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

        public String getBadgeUrl() {
        return badgeUrl;
    }

        public void setBadgeUrl(String badgeUrl) {
        this.badgeUrl = badgeUrl;
    }

        public String getApiUrl() {
        return apiUrl;
    }

        public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
    public class Hsv implements Serializable{

        @SerializedName("hue")
        @Expose
        private Integer hue;
        @SerializedName("saturation")
        @Expose
        private Integer saturation;
        @SerializedName("value")
        @Expose
        private Integer value;

        public Integer getHue() {
            return hue;
        }

        public void setHue(Integer hue) {
            this.hue = hue;
        }

        public Integer getSaturation() {
            return saturation;
        }

        public void setSaturation(Integer saturation) {
            this.saturation = saturation;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

    }
    public class Rgb implements Serializable{

        @SerializedName("red")
        @Expose
        private Integer red;
        @SerializedName("green")
        @Expose
        private Integer green;
        @SerializedName("blue")
        @Expose
        private Integer blue;

        public Integer getRed() {
            return red;
        }

        public void setRed(Integer red) {
            this.red = red;
        }

        public Integer getGreen() {
            return green;
        }

        public void setGreen(Integer green) {
            this.green = green;
        }

        public Integer getBlue() {
            return blue;
        }

        public void setBlue(Integer blue) {
            this.blue = blue;
        }

    }
}
