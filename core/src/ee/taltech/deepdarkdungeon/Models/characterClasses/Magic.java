package ee.taltech.deepdarkdungeon.Models.characterClasses;

import com.badlogic.gdx.graphics.Texture;
import ee.taltech.deepdarkdungeon.Models.GameObject;

public class Magic extends GameObject {
    String name;
    int health;
    int power;
    double x;
    double y;
    double width;
    double height;
    CharacterClass characterClass;
    CharacterType characterType;
    Texture picture;

    public Magic(Texture picture, String name, int health, int power, double x, double y, double width, double height, CharacterClass characterClass, CharacterType characterType) {
        this.name = "Magic";
        this.health = 100;
        this.power = 20;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.characterClass = characterClass;
        this.characterType = characterType;
        this.picture = picture;
    }
    @Override
    public Texture getPicture() {
        return null;
    }

    @Override
    public CharacterType getCharacterType() {
        return null;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public int getPower() {
        return 0;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
