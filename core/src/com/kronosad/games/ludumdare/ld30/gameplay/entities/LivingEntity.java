package com.kronosad.games.ludumdare.ld30.gameplay.entities;

import com.kronosad.games.ludumdare.ld30.gameplay.Level;

/**
 * Created by russjr08 on 8/22/14.
 */
public abstract class LivingEntity extends Entity {

    protected float health;


    public LivingEntity(Level level) {
        super(level);
    }

    public float getHealth() {
        return health;
    }

    public abstract boolean shouldHealthBeDisplayed();
}
