package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * StudyDesignProperty generated by hbm2java
 */
public abstract class AbstractStudyDesignProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer studyDesignPropertyId;
     private StudyDesign studyDesign;
     private CVTerm type;
     private String value;
     private int rank;

    public AbstractStudyDesignProperty() {
    }

    
    public AbstractStudyDesignProperty(StudyDesign studyDesign, CVTerm type, int rank) {
        this.studyDesign = studyDesign;
        this.type = type;
        this.rank = rank;
    }
    public AbstractStudyDesignProperty(StudyDesign studyDesign, CVTerm type, String value, int rank) {
       this.studyDesign = studyDesign;
       this.type = type;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getStudyDesignPropertyId() {
        return this.studyDesignPropertyId;
    }
    
    public void setStudyDesignPropertyId(Integer studyDesignPropertyId) {
        this.studyDesignPropertyId = studyDesignPropertyId;
    }
    public StudyDesign getStudyDesign() {
        return this.studyDesign;
    }
    
    public void setStudyDesign(StudyDesign studyDesign) {
        this.studyDesign = studyDesign;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractStudyDesignProperty) ) return false;
         AbstractStudyDesignProperty castOther = ( AbstractStudyDesignProperty ) other; 
         
         return ( (this.getStudyDesign()==castOther.getStudyDesign()) || ( this.getStudyDesign()!=null && castOther.getStudyDesign()!=null && this.getStudyDesign().equals(castOther.getStudyDesign()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getStudyDesign() == null ? 0 : this.getStudyDesign().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         result = 37 * result + this.getRank();
         return result;
   }   

public AbstractStudyDesignProperty generateClone() {
    AbstractStudyDesignProperty cloned = new StudyDesignProperty(); 
           cloned.studyDesign = this.studyDesign;
           cloned.type = this.type;
           cloned.value = this.value;
           cloned.rank = this.rank;
    return cloned;
}


}

