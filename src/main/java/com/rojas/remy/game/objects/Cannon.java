package com.rojas.remy.game.objects;

import com.rojas.remy.game.model.Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by B.Sc. Thomas Schalldach on 16/10/2016. The code of this application is free to use for non-commercial projects,
 * as long as you ensure that you credit the author. For commercial usage, please contact software[at]thomas-schalldach.de
 */
public class Cannon extends GameObject {

//TODO Create transitional Table
    private Map<AbstractShootState, AbstractShootState> transTable;

    private AbstractShootState shootState;
    private int score;

    public Cannon() {
        this.transTable = new HashMap<AbstractShootState, AbstractShootState>();
        SingleShootState ss = new SingleShootState(this);
        DoubleShootState ds = new DoubleShootState(this);
        transTable.put(ds, ss);
        transTable.put(ss,ds);
        shootState = ss;
    }

    public void shoot(Model m) {
        m.fireMissile();
    }

    public void nextState() {
        shootState = transTable.get(shootState);
        System.out.println("Shootig state changed to: "+shootState.getClass().toString());
    }

    public AbstractShootState getShootState() {
        return shootState;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
