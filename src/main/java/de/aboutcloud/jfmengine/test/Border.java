package de.aboutcloud.jfmengine.test;

import de.aboutcloud.jfmengine.graphics.DrawableObject;

import javax.swing.*;
import java.awt.*;

public class Border extends DrawableObject {

    @Override
    public void paint(Graphics g) {
        g.drawRect(10, 10, getWidth(), getHeight());
    }

    @Override
    public void update(double delta) {

    }
}
