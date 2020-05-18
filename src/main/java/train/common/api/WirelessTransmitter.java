package train.common.api;

import train.common.mtc.PDMMessage;

public interface WirelessTransmitter {

    void receiveMessage(PDMMessage message);
    void sendMessage(PDMMessage message);


}
