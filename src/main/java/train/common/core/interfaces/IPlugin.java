package train.common.core.interfaces;

public interface IPlugin {

	boolean isAvailable();

	void initialize();

	//public HashMap<String, ItemStack> getItems();
}