/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 3-nov-2017 1.46.32                          ---
 * ----------------------------------------------------------------
 */
package my.cyclingraceDaoService.jalo;

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
import my.cyclingraceDaoService.jalo.CyclistTeam;
import my.cyclingraceDaoService.jalo.Person;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Cyclist}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclist extends Person
{
	/** Qualifier of the <code>Cyclist.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Cyclist.weight</code> attribute **/
	public static final String WEIGHT = "weight";
	/** Qualifier of the <code>Cyclist.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>Cyclist.cyclistTeam</code> attribute **/
	public static final String CYCLISTTEAM = "cyclistTeam";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CYCLISTTEAM's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCyclist> CYCLISTTEAMHANDLER = new BidirectionalOneToManyHandler<GeneratedCyclist>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Person.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(WEIGHT, AttributeMode.INITIAL);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(CYCLISTTEAM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CYCLISTTEAMHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.cyclistTeam</code> attribute.
	 * @return the cyclistTeam
	 */
	public CyclistTeam getCyclistTeam(final SessionContext ctx)
	{
		return (CyclistTeam)getProperty( ctx, CYCLISTTEAM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.cyclistTeam</code> attribute.
	 * @return the cyclistTeam
	 */
	public CyclistTeam getCyclistTeam()
	{
		return getCyclistTeam( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.cyclistTeam</code> attribute. 
	 * @param value the cyclistTeam
	 */
	public void setCyclistTeam(final SessionContext ctx, final CyclistTeam value)
	{
		CYCLISTTEAMHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.cyclistTeam</code> attribute. 
	 * @param value the cyclistTeam
	 */
	public void setCyclistTeam(final CyclistTeam value)
	{
		setCyclistTeam( getSession().getSessionContext(), value );
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
