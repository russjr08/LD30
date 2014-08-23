package com.kronosad.games.ludumdare.ld30.gameplay.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kronosad.games.ludumdare.ld30.gameplay.Level;

/**
 * Created by russjr08 on 8/22/14.
 */
public class Player extends LivingEntity {


    public Player(Level level) {
        super(level);
    }

    @Override
    public boolean shouldHealthBeDisplayed() {
        return false;
    }

    @Override
    public void update() {

    }

    @Override
    public void render(SpriteBatch batch) {

    }
}
