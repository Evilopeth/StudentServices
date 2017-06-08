package models.tutoring;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Abdalla
 */
public class Major implements Serializable {
    private int majorId;
    private String nameEn;
    private String nameAr;
    
   /*constructor 1*/ 
   public Major(){}
    
  /*constructor 2*/  
   public Major(int majorId, String nameEn, String nameAr) {
        this.majorId = majorId;
        this.nameEn = nameEn;
        this.nameAr = nameAr;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

}
        