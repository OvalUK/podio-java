package com.podio.view;

public class View
{
	private long view_id;
	private long filter_id;
	private String name;
	private ViewGroupings groupings;

	/**
	 * @return the view_id
	 */
	public long getView_id()
	{
		return view_id;
	}
	/**
	 * @param view_id the view_id to set
	 */
	public void setView_id( long view_id )
	{
		this.view_id = view_id;
	}
	/**
	 * @return the filter_id
	 */
	public long getFilter_id()
	{
		return filter_id;
	}
	/**
	 * @param filter_id the filter_id to set
	 */
	public void setFilter_id( long filter_id )
	{
		this.filter_id = filter_id;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName( String name )
	{
		this.name = name;
	}
	/**
	 * @return the groupings
	 */
	public ViewGroupings getGroupings()
	{
		return groupings;
	}
	/**
	 * @param groupings the groupings to set
	 */
	public void setGroupings( ViewGroupings groupings )
	{
		this.groupings = groupings;
	}
}