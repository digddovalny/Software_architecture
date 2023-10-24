package org.example.hw1.InMemoryModel;

import org.example.hw1.ModelElements.Camera;
import org.example.hw1.ModelElements.Flash;
import org.example.hw1.ModelElements.PoligonalModel;
import org.example.hw1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ModelStore implements IModelChanger, IModelChangedObserver {

    //region Fields
    private Collection<PoligonalModel> models;
    private List<Scene> scenes;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;
    // endregion
    private Collection<IModelChangedObserver> changedObservers = new ArrayList<>();

    // region Properties
//  Нотифицирует о событии
    @Override
    public void ModifyChange() {
        for (IModelChangedObserver observer : changedObservers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void applyUpdateModel() {

    }

    public Scene GetScena(int nScena) {
        return scenes.get(nScena);
    }


    // endregion
}
