package com.mygdx.runrunrun.sprites;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.runrunrun.Main;

/**
 * Created by 343076 on 02/08/2015.
 */
public class Block extends MoveableObject{

    public Block(float x, float y, TextureRegion image){

        super(x,y,image);

    }

    public void update(float dt){

        position = velocity(position.x, position.y, false);

    }

    public void render(SpriteBatch sb){

        sb.draw(image,position.x,position.y);

    }

}
