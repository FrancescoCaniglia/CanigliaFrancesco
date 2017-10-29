/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 19.00.15                        ---
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
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.cyclingraceDaoService.constants.CyclingraceDaoServiceConstants;
import my.cyclingraceDaoService.jalo.StageRace;
import my.cyclingraceDaoService.jalo.StageRanking;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Stage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStage extends GenericItem
{
	/** Qualifier of the <code>Stage.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Stage.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Stage.start</code> attribute **/
	public static final String START = "start";
	/** Qualifier of the <code>Stage.end</code> attribute **/
	public static final String END = "end";
	/** Qualifier of the <code>Stage.km</code> attribute **/
	public static final String KM = "km";
	/** Qualifier of the <code>Stage.stageRace</code> attribute **/
	public static final String STAGERACE = "stageRace";
	/** Qualifier of the <code>Stage.stageRankings</code> attribute **/
	public static final String STAGERANKINGS = "stageRankings";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STAGERACE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStage> STAGERACEHANDLER = new BidirectionalOneToManyHandler<GeneratedStage>(
	CyclingraceDaoServiceConstants.TC.STAGE,
	false,
	"stageRace",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n STAGERANKINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StageRanking> STAGERANKINGSHANDLER = new OneToManyHandler<StageRanking>(
	CyclingraceDaoServiceConstants.TC.STAGERANKING,
	false,
	"stage",
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
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(START, AttributeMode.INITIAL);
		tmp.put(END, AttributeMode.INITIAL);
		tmp.put(KM, AttributeMode.INITIAL);
		tmp.put(STAGERACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STAGERACEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.end</code> attribute.
	 * @return the end
	 */
	public String getEnd(final SessionContext ctx)
	{
		return (String)getProperty( ctx, END);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.end</code> attribute.
	 * @return the end
	 */
	public String getEnd()
	{
		return getEnd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.end</code> attribute. 
	 * @param value the end
	 */
	public void setEnd(final SessionContext ctx, final String value)
	{
		setProperty(ctx, END,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.end</code> attribute. 
	 * @param value the end
	 */
	public void setEnd(final String value)
	{
		setEnd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.km</code> attribute.
	 * @return the km
	 */
	public Integer getKm(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, KM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.km</code> attribute.
	 * @return the km
	 */
	public Integer getKm()
	{
		return getKm( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.km</code> attribute. 
	 * @return the km
	 */
	public int getKmAsPrimitive(final SessionContext ctx)
	{
		Integer value = getKm( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.km</code> attribute. 
	 * @return the km
	 */
	public int getKmAsPrimitive()
	{
		return getKmAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.km</code> attribute. 
	 * @param value the km
	 */
	public void setKm(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, KM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.km</code> attribute. 
	 * @param value the km
	 */
	public void setKm(final Integer value)
	{
		setKm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.km</code> attribute. 
	 * @param value the km
	 */
	public void setKm(final SessionContext ctx, final int value)
	{
		setKm( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.km</code> attribute. 
	 * @param value the km
	 */
	public void setKm(final int value)
	{
		setKm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace()
	{
		return getStageRace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final SessionContext ctx, final StageRace value)
	{
		STAGERACEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final StageRace value)
	{
		setStageRace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRankings</code> attribute.
	 * @return the stageRankings
	 */
	public Collection<StageRanking> getStageRankings(final SessionContext ctx)
	{
		return STAGERANKINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRankings</code> attribute.
	 * @return the stageRankings
	 */
	public Collection<StageRanking> getStageRankings()
	{
		return getStageRankings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRankings</code> attribute. 
	 * @param value the stageRankings
	 */
	public void setStageRankings(final SessionContext ctx, final Collection<StageRanking> value)
	{
		STAGERANKINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRankings</code> attribute. 
	 * @param value the stageRankings
	 */
	public void setStageRankings(final Collection<StageRanking> value)
	{
		setStageRankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stageRankings. 
	 * @param value the item to add to stageRankings
	 */
	public void addToStageRankings(final SessionContext ctx, final StageRanking value)
	{
		STAGERANKINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stageRankings. 
	 * @param value the item to add to stageRankings
	 */
	public void addToStageRankings(final StageRanking value)
	{
		addToStageRankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stageRankings. 
	 * @param value the item to remove from stageRankings
	 */
	public void removeFromStageRankings(final SessionContext ctx, final StageRanking value)
	{
		STAGERANKINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stageRankings. 
	 * @param value the item to remove from stageRankings
	 */
	public void removeFromStageRankings(final StageRanking value)
	{
		removeFromStageRankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.start</code> attribute.
	 * @return the start
	 */
	public String getStart(final SessionContext ctx)
	{
		return (String)getProperty( ctx, START);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.start</code> attribute.
	 * @return the start
	 */
	public String getStart()
	{
		return getStart( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.start</code> attribute. 
	 * @param value the start
	 */
	public void setStart(final SessionContext ctx, final String value)
	{
		setProperty(ctx, START,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.start</code> attribute. 
	 * @param value the start
	 */
	public void setStart(final String value)
	{
		setStart( getSession().getSessionContext(), value );
	}
	
}
