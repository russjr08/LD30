package com.kronosad.games.ludumdare.ld30.gameplay;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.kronosad.games.ludumdare.ld30.gameplay.entities.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by russjr08 on 8/22/14.
 */
public class Level {

    protected TiledMap map;
    protected TiledMapRenderer mapRenderer;
    protected OrthographicCamera camera;

    private List<Entity> entities = new ArrayList<Entity>();


    private Level(TiledMap map, OrthographicCamera camera) {

        this.map = map;
        mapRenderer = new OrthogonalTiledMapRenderer(this.map);
        this.camera = camera;

    }

    public Level load


}
