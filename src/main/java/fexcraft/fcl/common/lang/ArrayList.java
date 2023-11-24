package fexcraft.fcl.common.lang;

import javax.annotation.Nullable;
import java.util.List;

;

/**
 * @author Ferdinand Calo' (FEX___96)
 *
 * General ArrayList which will not cause "out of bounds" exceptions, but instead return null or first entry.
 * @param <T>
 */
public class ArrayList<T> extends java.util.ArrayList<T> {
	
	private static final long serialVersionUID = 6551014441630799597L;

	public ArrayList(List<T> list){
		super(list);
	}

	public ArrayList(){
		super();
	}

	public ArrayList(T[] arr){
		super();
		for(T e : arr){
			this.add(e);
		}
	}

	@Override @Nullable
	public T get(int i){
		return this.isEmpty() ? null : i > this.size() ? super.get(0) : i < 0 ? null : super.get(i);
	}
	
}