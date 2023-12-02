package train.common.core.handlers;

import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

import java.util.ArrayList;
import java.util.List;

public class TrainHandler {
	private final List<EntityRollingStock> train = new ArrayList<>();
	private int trainPower;

	public TrainHandler() {
	}

	public TrainHandler(EntityRollingStock rolling) {
		addRollingStock(rolling);
		EntityRollingStock.allTrains.add(this);
	}

	public void addRollingStock(EntityRollingStock rolling) {
        for (EntityRollingStock entityRollingStock : train) {
            if (entityRollingStock.equals(rolling)) {
                return;
            }
        }

		if (rolling instanceof Locomotive) {
			trainPower += rolling.transportMetricHorsePower();
		}

		train.add(rolling);
		(rolling).train = this;
		//System.out.println("added "+rolling);
		if (rolling.cartLinked1 != null) {
			addRollingStock((rolling.cartLinked1));
		}

		if (rolling.cartLinked2 != null) {
			addRollingStock((rolling.cartLinked2));
		}
	}

	public void resetTrain() {
        for (EntityRollingStock entityRollingStock : train) {
            if (entityRollingStock != null)
                entityRollingStock.train = null;
        }
		train.clear();
	}

	public List<EntityRollingStock> getTrains() {
		return this.train;
	}

	public int getTrainPower() {
		return trainPower;
	}
}