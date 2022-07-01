package com.excelprogram;

/*This is the property class. Each property in the excel sheet has the following:
[Parcel Number, Owner Name, Owner Name 2, Mailing 1, Mailing 2,
City State & Zip, Site Address, Sale Date, Sale Price, Acres, Buffer,
Book/Page, Parcel Area (sq.ft.), EXLU, Existing Land Use Description,
FLU, Future Land Use Description, Built Space (sq.ft.)]
 */

import java.util.Date;

public class property {
    String parcel;
    String ownerName;
    String ownerName2;
    String mailingAddress;
    String mailingAddress2;
    String cityStateZip;
    String siteAddress;
    Date saleDate;
    Integer salePrice;
    Double acres;
    String buffer;
    String bookPage;
    Integer parcelArea;
    String exlu;
    String existingLandUse;
    String flu;
    String futureLandUse;
    Integer builtSpace;


}
