package homework.day3.playground.processors;

import homework.day3.playground.essence.craft.hand.Storable;
import homework.day3.playground.essence.material.Pourable;
import homework.day3.playground.utils.VolumeGenerator;

public class StorableProcessor {

    public void runStorable(Storable storable, Pourable pourable) {
        storable.store(pourable, VolumeGenerator.generateVolume(pourable));
    }

    public void runStorable(Storable storable, Pourable pourable, int volume) {
        storable.store(pourable, volume);
    }

}
