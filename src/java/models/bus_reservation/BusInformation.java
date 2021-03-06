
package models.bus_reservation;

import java.io.Serializable;

public class BusInformation implements Serializable{

    
    private int bus_id;
    private int bus_number;
    private String bus_type_en;
    private String bus_type_ar;
    private int bus_capacity;
    private int driver_id;
    private int plate_no;
    private String driver_name_en;
    private String driver_name_ar;
    
    
    public int getBusID(){
        return this.bus_id;
    }
    public void setBusID(int bus_id){
        this.bus_id=bus_id;
    }
    
     public int getBusNumber(){
        return this.bus_number;
    }
    public void setBusNumber(int bus_number){
        this.bus_number=bus_number;
    }
    
     public String getBusTypeEn(){
        return this.bus_type_en;
    }
    public void setBusTypeEn(String bus_type_en){
        this.bus_type_en=bus_type_en;
    } 
    public String getBusTypeAr(){
        return this.bus_type_ar;
    }
    public void setBusTypeAr(String bus_type_ar){
        this.bus_type_ar=bus_type_ar;
    }
    
     public int getBusCapacity(){
        return this.bus_capacity;
    }
    public void setBusCapacity(int bus_capacity){
        this.bus_capacity=bus_capacity;
    }

    public int getDriverID(){
            return this.driver_id;
    }
        public void setDriverID(int driver_id){
             this.driver_id=driver_id;
    }
        
    public int getPlateNo(){
            return this.plate_no;
    }
        public void setPlateNo(int plate_no){
            this.plate_no=plate_no;
    }
        public String getDriverNameEn(){
            return this.driver_name_en;
    }
        public void setDriverNameEn(String DriverNameEn){
            this.driver_name_en=DriverNameEn;
    }
        public String getDriverNameAr(){
            return this.driver_name_ar;
    }
        public void setDriverNameAr(String DriverNameAr){
            this.driver_name_ar=DriverNameAr;
    }
}


