package train.common.mtc;

import dan200.computercraft.api.peripheral.IComputerAccess;

public class PDMMessage {
    public static String UUIDFrom;
    public static String UUIDTo;
    public static Object message;
    public static Integer system;
    private static double distanceTravelled = 0;

    public PDMMessage(String UUIDFrom, String UUIDTo, Object message, Integer system) {
        this.UUIDTo = UUIDTo;
        this.UUIDFrom = UUIDFrom;
        this.message = message;
        this.system = system;
        distanceTravelled = 0;
    }

    public static Object[] getEventData(IComputerAccess computer) {
        return new Object[]{computer.getAttachmentName(), UUIDFrom, UUIDTo, message,
                system};
    }
}
