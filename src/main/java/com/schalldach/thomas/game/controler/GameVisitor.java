package com.schalldach.thomas.game.controler;

import com.schalldach.thomas.game.objects.GameObject;
import com.schalldach.thomas.game.view.MainWindow;

/**
 * Created by remy on 29/11/16.
 */
public class GameVisitor implements IGameVisitor {
    private final MainWindow view;

    public GameVisitor(MainWindow view) {
        this.view = view;
    }

    @Override
    public void draw(GameObject o){
        view.getCanvas().setDrawableObj(o);
    }
}
