package train.common.library;

import ebf.tim.entities.GenericRailTransport;
import train.common.entity.rollingStock.EntityBoxCartUS;
import train.common.entity.trains.EntityLocoSteam4_4_0;

public class TrainRegistry {

    public static GenericRailTransport[] listSteam(){
        return new GenericRailTransport[]{
                new EntityLocoSteam4_4_0(null)
        };
    }


    public static GenericRailTransport[] listDiesel(){
        return new GenericRailTransport[]{
        };
    }


    public static GenericRailTransport[] listElectric(){
        return new GenericRailTransport[]{
        };
    }


    public static GenericRailTransport[] listPassenger(){
        return new GenericRailTransport[]{
        };
    }

    public static GenericRailTransport[] listFreight(){
        return new GenericRailTransport[]{
                new EntityBoxCartUS(null)
        };
    }


    public static GenericRailTransport[] listWorkCart(){
        return new GenericRailTransport[]{
        };
    }

    public static GenericRailTransport[] listTender(){
        return new GenericRailTransport[]{
        };
    }

    public static GenericRailTransport[] listTanker(){
        return new GenericRailTransport[]{
        };
    }


    public static GenericRailTransport[] listSpecial(){
        return new GenericRailTransport[]{
        };
    }
}
