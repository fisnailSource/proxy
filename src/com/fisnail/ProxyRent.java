package com.fisnail;

/**
 * 租房中介人员
 */
public class ProxyRent implements IRentalAgency{

    IRentalAgency iRentalAgency;
    public ProxyRent(IRentalAgency iRentalAgency) {
        this.iRentalAgency=iRentalAgency;
    }

    @Override
    public void rentRoom() {
        iRentalAgency.rentRoom();
    }
}
