package com.example.Airlines.SaibotAirlines.webapp.jpa.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * 
 * @author Spring User
 * 
 *  CREATE TABLE SAIBOT.CMN_COUNTRIES 
   (	ID INT(10), 
	CODE VARCHAR(2), 
	NAME VARCHAR(100), 
	TAILCODE VARCHAR(10), 
	FLAG BLOB
   ) ;
 *
 */

@Entity
public class Cmn_Countries {
	
	private Integer id;
	private String code;	
	private String name;
	private String tailcode;
	private String flag;
	private Set<Cmn_Airports> cmn_airports;
	
	

	/**
	 * @param id
	 * @param code
	 * @param name
	 * @param tailcode
	 * @param flag
	 * @param cmn_airports
	 */
	
	public Cmn_Countries()
	{}
	
	public Cmn_Countries(Integer id, String code, String name, String tailcode, String flag,
			Set<Cmn_Airports> cmn_airports) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.tailcode = tailcode;
		this.flag = flag;
		this.cmn_airports = cmn_airports;
	}

	/**
	 * @return the id
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * @return the tailcode
	 */
	public String getTailcode() {
		return tailcode;
	}

	/**
	 * @param tailcode the tailcode to set
	 */
	public void setTailcode(String tailcode) {
		this.tailcode = tailcode;
	}

	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	@OneToMany(mappedBy = "cmn_countries", cascade = CascadeType.ALL)
	@JsonBackReference
	public Set<Cmn_Airports> getCmn_airports() {
		return cmn_airports;
	}

	public void setCmn_airports(Set<Cmn_Airports> cmn_airports) {
		this.cmn_airports = cmn_airports;
	}


}
