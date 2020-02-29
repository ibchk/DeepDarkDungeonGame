package ee.taltech.deepdarkdungeon.Models.characterClasses;

import com.badlogic.gdx.graphics.Texture;
import ee.taltech.deepdarkdungeon.Models.GameObject;

public class Paladin extends GameObject {
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

    public Paladin(Texture picture, String name, int health, int power, double x, double y, double width, double height, CharacterClass characterClass, CharacterType characterType) {
        this.name = "Paladin";
        this.picture = picture;
        this.health = 100;
        this.power = 20;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.characterClass = characterClass;
        this.characterType = characterType;
    }

    @Override
    public Texture getPicture() {
        return picture;
    }

    @Override
    public CharacterType getCharacterType() {
        return characterType;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }
}
