# JFMEngine - **J**ava **F**orces and **M**otion Engine  [Work in Progress]

JFMEngine is a modular and basic Java physics engine designed to perform various physics, math, and graphical computations.
This is a Java port of another repository of mine and is only used to stay in touch with Java.
This engine is currently only usable to simulate the effects of mass, force, velocity and momentum on objects
and how they effect each other.
Note: For graphics I use **Java Swing**.

## Project Structure

- **Graphics** - Handles graphical rendering and visualization tasks.
  - **DrawableObject.java** - Abstract child of **JComponent** with further functionality
  - **FMPanel.java** - Child of **JPanel** with further Functionality
  - **Loop.java** - Handles the simulation loop via an implementation of **Runnable**
- **Physics** - Manages physics-related computations and simulations
  - **Entity.java** - Abstract child of **DrawableObject** with added physics
  - **Vector.java** - Used to create and compute Vectors
- **Test** - Contains a test simulation to test the funtionality
  - **Border.java** - Child of **Entity**. Acts as a physical simulation barrier
  - **Cube.java** - Child of **Entity**. Acts as the simulated object.
  - **testsim.java** - Main class. Uses JFMEngine to run a simulation using the test entities.

## Getting Started

1. **Import the JFMEngine** [Repository is **MavenCentral**:
   ```xml
   <dependencies>
       <dependency>
           <groupId>de.aboutcloud</groupId>
           <artifactId>jfmengine</artifactId>
           <version>1.0</version>
           <scope>provided</scope>
       </dependency>
    </dependencies>
   ```

2. **Import the necessary engine components**:
   ```java
   import de.aboutcloud.jfmengine.FMEngine;
   import de.aboutcloud.jfmengine.graphics.Loop;
   import de.aboutcloud.jfmengine.physics.Vector;
   ```
   
3. **Create a basic simulation**:
   ```java
   FMEngine engine = new FMEngine();
   engine.initWindow(800, 500);
   Loop loop = engine.initLoop();

   Cube cubeA = new Cube(new Vector(100, 100), 20);
   cubeA.addForce(FMEngine.GRAVITY_EARTH);
   engine.getPanel().addEntity(cubeA);

   loop.start();
   ```

   3. **Compile, run and enjoy the simulation!**

## License

This project is open source and available under the [MIT License](LICENSE).
