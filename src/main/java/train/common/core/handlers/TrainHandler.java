package train.common.core.handlers;

import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

import java.util.ArrayList;

public class TrainHandler {
	private EntityRollingStock rolling;
	private ArrayList<EntityRollingStock> train = new ArrayList<EntityRollingStock>();
	private int trainPower;

	public TrainHandler() {}

	public TrainHandler(EntityRollingStock rolling) {
		this.rolling = rolling;
		addRollingStock(rolling);
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
		train.add(rolling);
		(rolling).train = this;
		//System.out.println("added "+rolling);
		if (rolling.cartLinked1 != null)
			addRollingStock((rolling.cartLinked1));
		if (rolling.cartLinked2 != null)
			addRollingStock((rolling.cartLinked2));
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