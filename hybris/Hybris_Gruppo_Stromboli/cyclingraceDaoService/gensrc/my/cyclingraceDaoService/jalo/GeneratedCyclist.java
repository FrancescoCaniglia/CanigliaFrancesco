/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-ott-2017 2.33.03                         ---
 * ----------------------------------------------------------------
 */
package my.cyclingraceDaoService.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cyclingraceDaoService.constants.CyclingraceDaoServiceConstants;
import my.cyclingraceDaoService.jalo.Person;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Cyclist}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclist extends Person
{
	/** Qualifier of the <code>Cyclist.weight</code> attribute **/
	public static final String WEIGHT = "weight";
	/** Qualifier of the <code>Cyclist.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>Cyclist.team</code> attribute **/
	public static final String TEAM = "team";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TEAM's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCyclist> TEAMHANDLER = new BidirectionalOneToManyHandler<GeneratedCyclist>(
	CyclingraceDaoServiceConstants.TC.CYCLIST,
	false,
	"team",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Person.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(WEIGHT, AttributeMode.INITIAL);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(TEAM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TEAMHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.height</code> attribute.
	 * @return the height
	 */
	public String getHeight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.height</code> attribute.
	 * @return the height
	 */
	public String getHeight()
	{
		return getHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final String value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.team</code> attribute.
	 * @return the team
	 */
	public GenericItem getTeam(final SessionContext ctx)
	{
		return (GenericItem)getProperty( ctx, TEAM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.team</code> attribute.
	 * @return the team
	 */
	public GenericItem getTeam()
	{
		return getTeam( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.team</code> attribute. 
	 * @param value the team
	 */
	public void setTeam(final SessionContext ctx, final GenericItem value)
	{
		TEAMHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.team</code> attribute. 
	 * @param value the team
	 */
	public void setTeam(final GenericItem value)
	{
		setTeam( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.weight</code> attribute.
	 * @return the weight
	 */
	public String getWeight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.weight</code> attribute.
	 * @return the weight
	 */
	public String getWeight()
	{
		return getWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final String value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
}
