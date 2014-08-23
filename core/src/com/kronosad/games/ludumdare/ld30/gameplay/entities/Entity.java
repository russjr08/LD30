package com.kronosad.games.ludumdare.ld30.gameplay.entities;

import com.badlogic.gdx.math.Vector2;
import com.kronosad.games.ludumdare.ld30.gameplay.Level;
import com.kronosad.games.ludumdare.ld30.interfaces.IRenderable;

/**
 * Created by russjr08 on 8/22/14.
 */
public abstract class Entity implements IRenderable {

    protected Vector2 pos;

    protected Level level;

    protected boolean isGrounded = false;

    public Entity(Level level) {
        this.level = level;
    }

    public abstract void update();

    public Vector2 getPos() {
        return pos;
    }

    public boolean isGrounded() {
        return isGrounded;
    }


}
