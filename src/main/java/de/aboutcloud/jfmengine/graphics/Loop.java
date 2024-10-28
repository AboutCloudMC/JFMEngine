package de.aboutcloud.jfmengine.graphics;

import de.aboutcloud.jfmengine.FMEngine;
import javax.swing.SwingUtilities;

public class Loop implements Runnable {

    private FMPanel panel;
    private Thread thread;
    private boolean running;

    public Loop(FMPanel panel) {
        this.panel = panel;
        thread = new Thread(this);
        running = false;
    }

    public void start() {
        thread.start();
        running = true;
    }

    public void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        long previousTime = System.nanoTime();
        double delta;

        while (running) {
            long currentTime = System.nanoTime();
            delta = (currentTime - previousTime) / 1_000_000_000.0; // Convert to seconds
            previousTime = currentTime;

            // Update the physics engine and repaint entities
            panel.update(delta);

            double finalDelta = delta;
            SwingUtilities.invokeLater(() -> panel.repaint());

            // Sleep to cap the frame rate (optional)
            try {
                Thread.sleep(2); // Adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
