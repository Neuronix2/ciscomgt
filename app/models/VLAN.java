package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Author: Nikolay A. Viguro
 * E-Mail: nv@ph-systems.ru
 * Date: 10.01.14
 * Time: 14:53
 * License: Apache 2.0
 */

@Entity
public class VLAN extends Model {

    /** VLAN id, e.g. 5 */
    public int vlanID;

    /** VLAN description */
    public String description;

    /** VLAN status, e.g. active */
    public String state;

    public int getVlanID() {
        return vlanID;
    }

    public void setVlanID(int vlanID) {
        this.vlanID = vlanID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static VLAN load(int vlanID) {
        return VLAN.find("byVlanID", vlanID).first();
    }

    @Override
    public String toString() {
        return "VLAN{" +
                "vlanID=" + vlanID +
                ", description='" + description + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
