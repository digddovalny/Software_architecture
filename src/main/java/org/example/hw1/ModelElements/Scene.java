package org.example.hw1.ModelElements;

import java.util.Collection;

public class Scene {
    // region Constructor
    public Scene(int id, Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    // endregion

    // region Properties
    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public Object method1 (Object me1) {
        return me1;
    }

    public Object method2 (Object me2, Object met2) {
        Object ret = new Object();
        return ret;
    }

    public int getId() {
        return id;
    }
    // endregion

    // region Fields
    private int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;
    // endregion

}
