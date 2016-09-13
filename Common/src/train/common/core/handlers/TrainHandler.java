package src.train.common.core.handlers;

import java.util.ArrayList;

import src.train.common.api.AbstractTrains;
import src.train.common.api.EntityRollingStock;
import src.train.common.api.Locomotive;

public class TrainHandler {
	private EntityRollingStock rolling;
	private ArrayList<EntityRollingStock> train = new ArrayList<EntityRollingStock>();
	private int trainPower;

	public TrainHandler() {}

	public TrainHandler(EntityRollingStock rolling) {
		this.rolling = rolling;
		addRollingStock((EntityRollingStock) rolling);
		rolling.allTrains.add(this);
	}

	public void addRollingStock(EntityRollingStock rolling) {
		for (int i = 0; i < train.size(); i++) {
			if (train.get(i).equals(rolling)) {
				return;
			}
		}
		if (rolling instanceof Locomotive) {
			trainPower += ((Locomotive) rolling).getPower();
		}
		train.add((EntityRollingStock) rolling);
		((EntityRollingStock) rolling).train = this;
		//System.out.println("added "+rolling);
		if (rolling.cartLinked1 != null)
			addRollingStock(((EntityRollingStock) rolling.cartLinked1));
		if (rolling.cartLinked2 != null)
			addRollingStock(((EntityRollingStock) rolling.cartLinked2));
	}

	public void resetTrain() {
		for (int i = 0; i < train.size(); i++) {
			if (train.get(i) != null)
				train.get(i).train = null;
		}
		train.clear();
	}

	public ArrayList<EntityRollingStock> getTrains() {
		return train;
	}

	public int getTrainPower() {
		return trainPower;
	}
}