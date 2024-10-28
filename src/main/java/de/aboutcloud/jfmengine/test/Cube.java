package de.aboutcloud.jfmengine.test;

import de.aboutcloud.jfmengine.physics.Entity;
import de.aboutcloud.jfmengine.physics.Vector;

import java.awt.*;

public class Cube extends Entity {

    private final Rectangle body;

    public Cube(Vector position, double mass) {
        super(position, mass);
        body = new Rectangle((int) position.x, (int) position.y, 100, 100);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(body.x, body.y, body.width, body.height);
    }


    @Override
    public Rectangle getBounds() {
        return body;
    }
}
