/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 19.00.15                        ---
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
import my.cyclingraceDaoService.jalo.Stage;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem StageRace}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStageRace extends GenericItem
{
	/** Qualifier of the <code>StageRace.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>StageRace.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>StageRace.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>StageRace.edition</code> attribute **/
	public static final String EDITION = "edition";
	/** Qualifier of the <code>StageRace.stages</code> attribute **/
	public static final String STAGES = "stages";
	/**
	* {@link OneToManyHandler} for handling 1:n STAGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Stage> STAGESHANDLER = new OneToManyHandler<Stage>(
	CyclingraceDaoServiceConstants.TC.STAGE,
	false,
	"stageRace",
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
		tmp.put(EDITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.edition</code> attribute.
	 * @return the edition
	 */
	public String getEdition(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.edition</code> attribute.
	 * @return the edition
	 */
	public String getEdition()
	{
		return getEdition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.edition</code> attribute. 
	 * @param value the edition
	 */
	public void setEdition(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.edition</code> attribute. 
	 * @param value the edition
	 */
	public void setEdition(final String value)
	{
		setEdition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.stages</code> attribute.
	 * @return the stages
	 */
	public Collection<Stage> getStages(final SessionContext ctx)
	{
		return STAGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.stages</code> attribute.
	 * @return the stages
	 */
	public Collection<Stage> getStages()
	{
		return getStages( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.stages</code> attribute. 
	 * @param value the stages
	 */
	public void setStages(final SessionContext ctx, final Collection<Stage> value)
	{
		STAGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.stages</code> attribute. 
	 * @param value the stages
	 */
	public void setStages(final Collection<Stage> value)
	{
		setStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stages. 
	 * @param value the item to add to stages
	 */
	public void addToStages(final SessionContext ctx, final Stage value)
	{
		STAGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stages. 
	 * @param value the item to add to stages
	 */
	public void addToStages(final Stage value)
	{
		addToStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stages. 
	 * @param value the item to remove from stages
	 */
	public void removeFromStages(final SessionContext ctx, final Stage value)
	{
		STAGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stages. 
	 * @param value the item to remove from stages
	 */
	public void removeFromStages(final Stage value)
	{
		removeFromStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.year</code> attribute.
	 * @return the year
	 */
	public Integer getYear(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.year</code> attribute.
	 * @return the year
	 */
	public Integer getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.year</code> attribute. 
	 * @return the year
	 */
	public int getYearAsPrimitive(final SessionContext ctx)
	{
		Integer value = getYear( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.year</code> attribute. 
	 * @return the year
	 */
	public int getYearAsPrimitive()
	{
		return getYearAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final Integer value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final int value)
	{
		setYear( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final int value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
