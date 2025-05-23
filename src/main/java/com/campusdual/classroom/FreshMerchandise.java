package com.campusdual.classroom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    Date expirationDate;
    SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy");




    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }


    public Date getExpirationDate(){
         return expirationDate;

    }
    public String getFormattedDate(Date date){
        return df.format(date);
    }

    @Override
    public Object getSpecificData() {
        return "Nombre: "+super.name+" ID unico"+super.uniqueId+" ID responsible"+super.responsibleId+" Zona"+super.zone+" Area"+super.area+" Estante"+super.shelf+" Cantidad"+super.quantity+" Caducidad "+getFormattedDate(getExpirationDate());
    }


    public void printSpecificData(){
        System.out.println(this.getSpecificData());
    }
}
