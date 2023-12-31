package com.zehir1345java.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class State {
    protected OrthographicCamera camera;
    private StateManager stateManager;
    public State(StateManager stateManager){
        this.stateManager = stateManager;
      camera = new OrthographicCamera();
      camera.setToOrtho(true, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
    }
    public  abstract  void render(SpriteBatch spriteBatch);
    public abstract void update(float delta);
    public abstract void handleInput();

}
