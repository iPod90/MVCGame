package com.rojas.remy.game.objects;

/**
 * Created by B.Sc. Thomas Schalldach on 16/10/2016. The code of this application is free to use for non-commercial projects,
 * as long as you ensure that you credit the author. For commercial usage, please contact software[at]thomas-schalldach.de
 */
public class Collision extends GameObject {

    public void setDecayTimer(int decay) {
        this.decay = decay;
    }

    @Override
    public void decay(){
        decay = decay - 1;
    }

    public int getDecay(){
        return decay;
    }
}
