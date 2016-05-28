package train.common.core.interfaces;

public interface IPlugin {

	public abstract boolean isAvailable();

	public abstract void initialize();

	//public HashMap<String, ItemStack> getItems();
}