/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.core.helpers;

public class SessionHelper {
	private static Class openedLedger;

	public static void setOpenedLedger(Class ledgerClass) {
		openedLedger = ledgerClass;
	}

	public static Class getOpenedLedger() {
		return openedLedger;
	}
}
