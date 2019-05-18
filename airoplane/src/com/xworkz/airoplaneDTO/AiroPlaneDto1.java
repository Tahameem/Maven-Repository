package com.xworkz.airoplaneDTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="updateQuery",query="update AiroPlaneDto1 set airoplaneName=:an where seatCapacity=:sc"),
	@NamedQuery(name="fetchQuery",query="from AiroPlaneDto1 dto")
})

public class AiroPlaneDto1 implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int airoplaneID;
	private String engineType;
	private String airoplaneModel;
	private String seatCapacity;
	private String airoplaneType;
	private String airoplaneName;
	
	public int getAiroplaneID() {
		return airoplaneID;
	}
	public void setAiroplaneID(int airoplaneID) {
		this.airoplaneID = airoplaneID;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getAiroplaneModel() {
		return airoplaneModel;
	}
	public void setAiroplaneModel(String airoplaneModel) {
		this.airoplaneModel = airoplaneModel;
	}
	public String getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(String seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public String getAiroplaneType() {
		return airoplaneType;
	}
	public void setAiroplaneType(String airoplaneType) {
		this.airoplaneType = airoplaneType;
	}
	@Override
	public String toString() {
		return "AiroPlaneDto [airoplaneID=" + airoplaneID + ", engineType=" + engineType + ", airoplaneModel="
				+ airoplaneModel + ", seatCapacity=" + seatCapacity + ", airoplaneType=" + airoplaneType
				+ ", airoplaneName=" + airoplaneName + ", getAiroplaneID()=" + getAiroplaneID() + ", getEngineType()="
				+ getEngineType() + ", getAiroplaneModel()=" + getAiroplaneModel() + ", getSeatCapacity()="
				+ getSeatCapacity() + ", getAiroplaneType()=" + getAiroplaneType() + ", getAiroplaneName()="
				+ getAiroplaneName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getAiroplaneName() {
		return airoplaneName;
	}
	public void setAiroplaneName(String airoplaneName) {
		this.airoplaneName = airoplaneName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
