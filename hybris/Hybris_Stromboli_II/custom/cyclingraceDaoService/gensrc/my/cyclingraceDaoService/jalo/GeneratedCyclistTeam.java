/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 3-nov-2017 2.08.33                          ---
 * ----------------------------------------------------------------
 */
package my.cyclingraceDaoService.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cyclingraceDaoService.constants.CyclingraceDaoServiceConstants;
import my.cyclingraceDaoService.jalo.Cyclist;
import my.cyclingraceDaoService.jalo.Manager;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CyclistTeam}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclistTeam extends GenericItem
{
	/** Qualifier of the <code>CyclistTeam.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CyclistTeam.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>CyclistTeam.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>CyclistTeam.cycleModel</code> attribute **/
	public static final String CYCLEMODEL = "cycleModel";
	/** Qualifier of the <code>CyclistTeam.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>CyclistTeam.manager</code> attribute **/
	public static final String MANAGER = "manager";
	/** Qualifier of the <code>CyclistTeam.cyclists</code> attribute **/
	public static final String CYCLISTS = "cyclists";
	/**
	* {@link OneToManyHandler} for handling 1:n CYCLISTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Cyclist> CYCLISTSHANDLER = new OneToManyHandler<Cyclist>(
	CyclingraceDaoServiceConstants.TC.CYCLIST,
	false,
	"cyclistTeam",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		tmp.put(CYCLEMODEL, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(MANAGER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.cycleModel</code> attribute.
	 * @return the cycleModel
	 */
	public String getCycleModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CYCLEMODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.cycleModel</code> attribute.
	 * @return the cycleModel
	 */
	public String getCycleModel()
	{
		return getCycleModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.cycleModel</code> attribute. 
	 * @param value the cycleModel
	 */
	public void setCycleModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CYCLEMODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.cycleModel</code> attribute. 
	 * @param value the cycleModel
	 */
	public void setCycleModel(final String value)
	{
		setCycleModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.cyclists</code> attribute.
	 * @return the cyclists
	 */
	public Collection<Cyclist> getCyclists(final SessionContext ctx)
	{
		return CYCLISTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.cyclists</code> attribute.
	 * @return the cyclists
	 */
	public Collection<Cyclist> getCyclists()
	{
		return getCyclists( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.cyclists</code> attribute. 
	 * @param value the cyclists
	 */
	public void setCyclists(final SessionContext ctx, final Collection<Cyclist> value)
	{
		CYCLISTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.cyclists</code> attribute. 
	 * @param value the cyclists
	 */
	public void setCyclists(final Collection<Cyclist> value)
	{
		setCyclists( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclists. 
	 * @param value the item to add to cyclists
	 */
	public void addToCyclists(final SessionContext ctx, final Cyclist value)
	{
		CYCLISTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclists. 
	 * @param value the item to add to cyclists
	 */
	public void addToCyclists(final Cyclist value)
	{
		addToCyclists( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclists. 
	 * @param value the item to remove from cyclists
	 */
	public void removeFromCyclists(final SessionContext ctx, final Cyclist value)
	{
		CYCLISTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclists. 
	 * @param value the item to remove from cyclists
	 */
	public void removeFromCyclists(final Cyclist value)
	{
		removeFromCyclists( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.manager</code> attribute.
	 * @return the manager
	 */
	public Manager getManager(final SessionContext ctx)
	{
		return (Manager)getProperty( ctx, MANAGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.manager</code> attribute.
	 * @return the manager
	 */
	public Manager getManager()
	{
		return getManager( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.manager</code> attribute. 
	 * @param value the manager
	 */
	public void setManager(final SessionContext ctx, final Manager value)
	{
		setProperty(ctx, MANAGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.manager</code> attribute. 
	 * @param value the manager
	 */
	public void setManager(final Manager value)
	{
		setManager( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final String value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.year</code> attribute.
	 * @return the year
	 */
	public Integer getYear(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.year</code> attribute.
	 * @return the year
	 */
	public Integer getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.year</code> attribute. 
	 * @return the year
	 */
	public int getYearAsPrimitive(final SessionContext ctx)
	{
		Integer value = getYear( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.year</code> attribute. 
	 * @return the year
	 */
	public int getYearAsPrimitive()
	{
		return getYearAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final Integer value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final int value)
	{
		setYear( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final int value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
