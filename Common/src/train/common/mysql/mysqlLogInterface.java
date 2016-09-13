/**
 * @author Oliver Tiit
 */
package src.train.common.mysql;

import java.util.Map;

public interface mysqlLogInterface {

	public boolean logEvent(String type, Map rawArgs);

	public boolean enableLogger();
}

//create map requirements  -> itemID, trainType, trainCreator, location, uID
//destroy map requirements -> itemID, trainType, trainCreator, location, trainDestroyer, uID
//explode map requirements -> itemID, trainType, trainCreator, location, uID
//place map requirements   -> itemID, trainType, trainCreator, location, uID
//color map requirements   -> itemID, trainType, trainCreator, location, color, uID

//HOW MYSQL TABE WILL LOOK ***************************************************************

//itemID, trainType, trainCreator, location, time, uID
//itemID, trainType, trainCreator, location, time, trainDestroyer, uID
//itemID, trainType, trainCreator, location, time, uID
//itemID, trainType, trainCreator, location, time, uID
//itemID, trainType, trainCreator, location, time, color, uID
