package train.common.core.handlers;

import train.common.blocks.tracks.BlockEnergyTrack;

import java.util.ArrayList;

public class EnergyNetHandler {
	private BlockEnergyTrack block;
	private ArrayList<BlockEnergyTrack> network = new ArrayList<BlockEnergyTrack>();

	public EnergyNetHandler() {}

	public void addToNetwork(BlockEnergyTrack block) {
		for (int i = 0; i < network.size(); i++) {
			if (network.get(i).equals(block)) {
				return;
			}
		}
		network.add(block);
		//block.network=this;

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
