package com.jiuge.songs.bean;

public class Singer {
    private Integer singer_ID;

    private String si_name;

    private String gender;

    private String si_image;

    private String area;

    private String label;

    public Integer getSinger_ID() {
        return singer_ID;
    }

    public void setSinger_ID(Integer singer_ID) {
        this.singer_ID = singer_ID;
    }

    public String getSi_name() {
        return si_name;
    }

    public void setSi_name(String si_name) {
        this.si_name = si_name == null ? null : si_name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getSi_image() {
        return si_image;
    }

    public void setSi_image(String si_image) {
        this.si_image = si_image == null ? null : si_image.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }
}