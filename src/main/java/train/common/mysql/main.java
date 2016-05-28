/**
 * @author Oliver Tiit
 */
package train.common.mysql;

import java.util.HashMap;
import java.util.Map;

class main {

	@SuppressWarnings("all")
	public static void main(String[] random) {
		mysqlLogInterface logMysql = new mysqlLogger();
		Map<String, String> args = new HashMap<String, String>();
		args.put("itemID", "1");
		args.put("trainCreator", "Spitfire4466");
		args.put("trainType", "minecart");
		args.put("location", "66,66,66");
		args.put("uID", "A63EF1");
		if (logMysql.enableLogger()) {
			logMysql.logEvent("trainCreate", args);
		}
		else {
			System.out.println("Mysql Database Error!");
		}
	}

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
