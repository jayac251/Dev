/**
 * 
 */
package com.example.Airlines.SaibotAirlines.webapp.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Spring User
 * CREATE TABLE SAIBOT.CMN_AIRPORTS 
   (	ID INT(10), 
	IATA_CODE VARCHAR(3), 
	ICAO_CODE VARCHAR(4), 
	NAME VARCHAR(100), 
	CTY_ID INT(10), 
	CITY VARCHAR(100), 
	LONGITUDE INT(10), 
	LATTITUDE INT(10), 
	UTC_OFFSET INT(3)
   ) ;
   
 *
 */
@Entity
public class Cmn_Airports {
	private int id;
	private String iata_code;
	private String icao_code;
	private String name;
	//private int cty_id;
	private String city;
	private int longitude;
	private int latitude;
	private int utc_offset;
	private Cmn_Countries cmn_countries;
	
	
	
	/**
	 * @param id
	 * @param iata_code
	 * @param icao_code
	 * @param name
	 * @param city
	 * @param longitude
	 * @param latitude
	 * @param utc_offset
	 * @param cmn_countries
	 */
	public Cmn_Airports(int id, String iata_code, String icao_code, String name, String city, int longitude,
			int latitude, int utc_offset, Cmn_Countries cmn_countries) {
		super();
		this.id = id;
		this.iata_code = iata_code;
		this.icao_code = icao_code;
		this.name = name;
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
		this.utc_offset = utc_offset;
		this.cmn_countries = cmn_countries;
	}
	/**
	 * @return the id
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the iata_code
	 */
	public String getIata_code() {
		return iata_code;
	}
	/**
	 * @param iata_code the iata_code to set
	 */
	public void setIata_code(String iata_code) {
		this.iata_code = iata_code;
	}
	/**
	 * @return the icao_code
	 */
	public String getIcao_code() {
		return icao_code;
	}
	/**
	 * @param icao_code the icao_code to set
	 */
	public void setIcao_code(String icao_code) {
		this.icao_code = icao_code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the longitude
	 */
	public int getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the latitude
	 */
	public int getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the utc_offset
	 */
	public int getUtc_offset() {
		return utc_offset;
	}
	/**
	 * @param utc_offset the utc_offset to set
	 */
	public void setUtc_offset(int utc_offset) {
		this.utc_offset = utc_offset;
	}

@ManyToOne
@JoinColumn(name="id",insertable = false, updatable = false )
	public Cmn_Countries getCmn_countries() {
		return cmn_countries;
	}

	public void setCmn_countries(Cmn_Countries cmn_countries) {
		this.cmn_countries = cmn_countries;
	}

	
	

}
