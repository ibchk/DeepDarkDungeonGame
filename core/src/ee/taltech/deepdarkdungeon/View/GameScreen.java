package ee.taltech.deepdarkdungeon.View;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ee.taltech.deepdarkdungeon.Models.Warrior;

public class GameScreen implements Screen {

    private Texture warriorTexture;
    private Texture warrior2Texture;
    private SpriteBatch batch;
    private Warrior warrior;
    private Warrior warrior2;

    @Override
    public void show() {
        batch = new SpriteBatch();
        warriorTexture = new Texture(Gdx.files.internal("warrior.png"));
        warrior2Texture = new Texture(Gdx.files.internal("warrior2.png"));
        warrior = new Warrior(warriorTexture, 0, 0, 200, 277);
        warrior2 = new Warrior(warrior2Texture, 200, 0, 200, 277);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        warrior.draw(batch);
        warrior2.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        warriorTexture.dispose();
        batch.dispose();
    }
}