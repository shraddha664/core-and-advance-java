package org.example;

public class Cuboid {
    int width,height,depth;

    public Cuboid(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Cuboid(int width, int height) {
        this.width = width;
        this.height = height;
        this.depth=10;
    }

    public Cuboid(int dimension) {
        this.width = dimension;
        height=dimension;
        depth=dimension;
    }

    public Cuboid() {
        this.width=10;
        this.height=10;
        this.depth=10;
    }

    int volume(){
        return width*height*depth;
    }

}
