package com.theironyard.clt;

/**
 * Created by mac on 3/31/16.
 */
public class Building {
    private String type;
    private String style;
    private String community;

    Building(String type, String style, String community) {
        this.type = type;
        this.style = style;
        this.community = community;

    }

    public void setType(type) {
        this.type = type;

    }

    public String getType() {
        return this.type;

    }

    public void setStyle(style) {
        this.style = style;

    }

    public String getStyle() {
        return this.style;

    }

    public void setCommunity(community) {
        this.community = community;
        
    }

    public String getCommunity() {
        return this.community;

    }
}
