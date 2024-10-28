package de.aboutcloud.jfmengine.graphics;

import de.aboutcloud.jfmengine.physics.Entity;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FMPanel extends JPanel {

    private List<Entity> entities;

    public FMPanel() {
        entities = new ArrayList<>();
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
        this.add(entity);
    }

    public void update(double delta) {
        for (Entity entity : entities) {
            entity.update(delta);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
