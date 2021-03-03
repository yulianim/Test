// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.requirement.domain;

import com.requirement.domain.Requirement;
import java.util.Date;
import java.util.Objects;

privileged aspect Requirement_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long Requirement.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return Requirement
     */
    public Requirement Requirement.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Integer
     */
    public Integer Requirement.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return Requirement
     */
    public Requirement Requirement.setVersion(Integer version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets title value
     * 
     * @return String
     */
    public String Requirement.getTitle() {
        return this.title;
    }
    
    /**
     * Sets title value
     * 
     * @param title
     * @return Requirement
     */
    public Requirement Requirement.setTitle(String title) {
        this.title = title;
        return this;
    }
    
    /**
     * Gets description value
     * 
     * @return String
     */
    public String Requirement.getDescription() {
        return this.description;
    }
    
    /**
     * Sets description value
     * 
     * @param description
     * @return Requirement
     */
    public Requirement Requirement.setDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Gets creation_date value
     * 
     * @return Date
     */
    public Date Requirement.getCreation_date() {
        return this.creation_date;
    }
    
    /**
     * Sets creation_date value
     * 
     * @param creation_date
     * @return Requirement
     */
    public Requirement Requirement.setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
        return this;
    }
    
    /**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean Requirement.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Requirement)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Requirement) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int Requirement.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Requirement.toString() {
        return "Requirement {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + 
                ", title='" + title + '\'' + 
                ", description='" + description + '\'' + 
                ", creation_date='" + creation_date == null ? null : java.text.DateFormat.getDateTimeInstance().format(creation_date) + '\'' + "}" + super.toString();
    }
    
}