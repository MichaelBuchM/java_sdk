package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notifications_row", propOrder = {
    "units",
    "values"
    })
public class NotificationsRow {

    @XmlElement(name = "units")
    protected Long units;
    @XmlElement(name = "values")
    protected  Long values;
    public Long getUnits() {
        return units;
    }

    public void setUnits(Long value) {
        this.units = value;
    }

    public Long getValues() {
        return values;
    }

    public void setValues(Long value) {
        this.values = value;
    }

    
}
