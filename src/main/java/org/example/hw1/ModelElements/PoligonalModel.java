package org.example.hw1.ModelElements;

import java.util.Collection;

public class PoligonalModel {
    // region Constructor
    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

    public PoligonalModel(Collection<Poligon> poligons) {
        this.poligons = poligons;
    }
    // endregion

    // region Properties
    public Collection<Poligon> getPoligon() {
        return poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }
    // endregion

    // region Fields
    private Collection<Poligon> poligons;
    private Collection<Texture> textures;
    //endregion

}
