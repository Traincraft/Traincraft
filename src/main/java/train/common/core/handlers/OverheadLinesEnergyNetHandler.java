package train.common.core.handlers;

import java.util.ArrayList;

import train.common.tile.TileEntityOverheadLines;

public class OverheadLinesEnergyNetHandler {

	public OverheadLinesEnergyNetHandler() {}

	private ArrayList<TileEntityOverheadLines> network = new ArrayList<TileEntityOverheadLines>();

	public void addToNetwork(TileEntityOverheadLines lines) {
		for (int i = 0; i < network.size(); i++) {
			if (network.get(i).equals(lines)) {
				return;
			}
		}
		network.add(lines);

	}

	public void cleanNetwork() {
		for (int i = 0; i < network.size(); i++) {
			if (network.get(i) == null) {
				network.remove(i);
			}
		}
	}

	public ArrayList getNetwork() {
		return network;
	}

}
