package de.aboutcloud.jfmengine.physics;

import de.aboutcloud.jfmengine.graphics.DrawableObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Entity extends DrawableObject {


    public Vector position;
    public Vector velocity;
    public List<Vector> forces;
    public double mass;

    public Entity(Vector position, double mass) {
        this.position = position;
        this.mass = mass;
        this.forces = new ArrayList<>();
        this.velocity = new Vector(0, 0);
    }

    @Override
    public void update(double delta) {
        Vector acceleration = getResultantForce().scale(1 / mass);

        velocity = velocity.add(acceleration.scale(delta));

        position = position.add(velocity.scale(delta));

        System.out.println(" ");
        System.out.println("X: " + position.x);
        System.out.println("Y:" + position.y);
        System.out.println("Velo X:" + velocity.x);
        System.out.println("Velo Y:" + velocity.y);
        System.out.println("Acc X:" + acceleration.x);
        System.out.println("Acc Y:" + acceleration.y);
        System.out.println("Delta:" + delta);
    }

    public void addForce(Vector force) {
        forces.add(force);
    }

    public Vector getResultantForce() {
        Vector result = new Vector(0, 0);
        for (Vector force : forces) {
            result = result.add(force);
        }
        return result;
    }

    public abstract Rectangle getBounds();
}
