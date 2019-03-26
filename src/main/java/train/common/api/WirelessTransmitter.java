package train.common.api;

import train.common.mtc.PDMMessage;
import train.common.mtc.TilePDMInstructionRadio;

public interface WirelessTransmitter {

    void receiveMessage(PDMMessage message);
    void sendMessage(PDMMessage message);


}
