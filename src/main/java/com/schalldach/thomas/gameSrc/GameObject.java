package com.schalldach.thomas.gameSrc;

import com.schalldach.thomas.gameSrc.helper.Position;

import java.awt.*;

/**
 * Created by B.Sc. Thomas Schalldach on 16/10/2016. The code of this application is free to use for non-commercial projects,
 * as long as you ensure that you credit the author. For commercial usage, please contact software[at]thomas-schalldach.de
 */
public class GameObject {
    protected Position position;
    protected Image image;

    public GameObject() {
        this.position = new Position();
    }
}
