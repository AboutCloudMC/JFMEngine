package de.aboutcloud.jfmengine.test;

import de.aboutcloud.jfmengine.FMEngine;
import de.aboutcloud.jfmengine.graphics.Loop;
import de.aboutcloud.jfmengine.physics.Vector;

import javax.swing.*;

public class testsim {

    public static void main(String[] args) {
        FMEngine engine = new FMEngine();
        engine.initWindow(800, 500);
        Loop loop = engine.initLoop();


        Cube cubeA = new Cube(new Vector(100, 100), 20);
        cubeA.addForce(FMEngine.GRAVITY_EARTH);
        engine.getPanel().addEntity(cubeA);


        loop.start();
    }
}
