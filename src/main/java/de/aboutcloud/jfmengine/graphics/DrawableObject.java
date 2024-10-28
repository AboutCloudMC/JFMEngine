package de.aboutcloud.jfmengine.graphics;

import javax.swing.*;
import java.awt.*;

public abstract class DrawableObject extends JComponent {

    @Override
    public abstract void paint(Graphics g);



    public abstract void update(double delta);

}
