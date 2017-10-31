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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cyclingraceDaoService.constants.CyclingraceDaoServiceConstants;
import my.cyclingraceDaoService.jalo.Cyclist;
import my.cyclingraceDaoService.jalo.Stage;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem StageRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStageRanking extends GenericItem
{
	/** Qualifier of the <code>StageRanking.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>StageRanking.ranking</code> attribute **/
	public static final String RANKING = "ranking";
	/** Qualifier of the <code>StageRanking.timeInSeconds</code> attribute **/
	public static final String TIMEINSECONDS = "timeInSeconds";
	/** Qualifier of the <code>StageRanking.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>StageRanking.cyclist</code> attribute **/
	public static final String CYCLIST = "cyclist";
	/** Qualifier of the <code>StageRanking.stage</code> attribute **/
	public static final String STAGE = "stage";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STAGE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStageRanking> STAGEHANDLER = new BidirectionalOneToManyHandler<GeneratedStageRanking>(
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
		tmp.put(RANKING, AttributeMode.INITIAL);
		tmp.put(TIMEINSECONDS, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(CYCLIST, AttributeMode.INITIAL);
		tmp.put(STAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STAGEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist(final SessionContext ctx)
	{
		return (Cyclist)getProperty( ctx, CYCLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist()
	{
		return getCyclist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final SessionContext ctx, final Cyclist value)
	{
		setProperty(ctx, CYCLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final Cyclist value)
	{
		setCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.ranking</code> attribute.
	 * @return the ranking
	 */
	public Integer getRanking(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.ranking</code> attribute.
	 * @return the ranking
	 */
	public Integer getRanking()
	{
		return getRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.ranking</code> attribute. 
	 * @return the ranking
	 */
	public int getRankingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRanking( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.ranking</code> attribute. 
	 * @return the ranking
	 */
	public int getRankingAsPrimitive()
	{
		return getRankingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.ranking</code> attribute. 
	 * @param value the ranking
	 */
	public void setRanking(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RANKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.ranking</code> attribute. 
	 * @param value the ranking
	 */
	public void setRanking(final Integer value)
	{
		setRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.ranking</code> attribute. 
	 * @param value the ranking
	 */
	public void setRanking(final SessionContext ctx, final int value)
	{
		setRanking( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.ranking</code> attribute. 
	 * @param value the ranking
	 */
	public void setRanking(final int value)
	{
		setRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.stage</code> attribute.
	 * @return the stage
	 */
	public Stage getStage(final SessionContext ctx)
	{
		return (Stage)getProperty( ctx, STAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.stage</code> attribute.
	 * @return the stage
	 */
	public Stage getStage()
	{
		return getStage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.stage</code> attribute. 
	 * @param value the stage
	 */
	public void setStage(final SessionContext ctx, final Stage value)
	{
		STAGEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.stage</code> attribute. 
	 * @param value the stage
	 */
	public void setStage(final Stage value)
	{
		setStage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.timeInSeconds</code> attribute.
	 * @return the timeInSeconds
	 */
	public Integer getTimeInSeconds(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIMEINSECONDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.timeInSeconds</code> attribute.
	 * @return the timeInSeconds
	 */
	public Integer getTimeInSeconds()
	{
		return getTimeInSeconds( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.timeInSeconds</code> attribute. 
	 * @return the timeInSeconds
	 */
	public int getTimeInSecondsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTimeInSeconds( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRanking.timeInSeconds</code> attribute. 
	 * @return the timeInSeconds
	 */
	public int getTimeInSecondsAsPrimitive()
	{
		return getTimeInSecondsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.timeInSeconds</code> attribute. 
	 * @param value the timeInSeconds
	 */
	public void setTimeInSeconds(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIMEINSECONDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.timeInSeconds</code> attribute. 
	 * @param value the timeInSeconds
	 */
	public void setTimeInSeconds(final Integer value)
	{
		setTimeInSeconds( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.timeInSeconds</code> attribute. 
	 * @param value the timeInSeconds
	 */
	public void setTimeInSeconds(final SessionContext ctx, final int value)
	{
		setTimeInSeconds( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRanking.timeInSeconds</code> attribute. 
	 * @param value the timeInSeconds
	 */
	public void setTimeInSeconds(final int value)
	{
		setTimeInSeconds( getSession().getSessionContext(), value );
	}
	
}
