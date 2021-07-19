package com.podio.view;

import org.codehaus.jackson.annotate.JsonProperty;

public class ViewGroups
{
	@JsonProperty("value")
	private long id;
	private String label;

	/**
	 * @return the id
	 */
	public long getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId( long id )
	{
		this.id = id;
	}
	/**
	 * @return the label
	 */
	public String getLabel()
	{
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel( String label )
	{
		this.label = label;
	}
}