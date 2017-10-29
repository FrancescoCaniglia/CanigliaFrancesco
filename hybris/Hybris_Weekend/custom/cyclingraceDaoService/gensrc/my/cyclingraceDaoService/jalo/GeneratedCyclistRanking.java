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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cyclingraceDaoService.constants.CyclingraceDaoServiceConstants;
import my.cyclingraceDaoService.jalo.Cyclist;
import my.cyclingraceDaoService.jalo.StageRace;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CyclistRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclistRanking extends GenericItem
{
	/** Qualifier of the <code>CyclistRanking.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CyclistRanking.timeTotInSeconds</code> attribute **/
	public static final String TIMETOTINSECONDS = "timeTotInSeconds";
	/** Qualifier of the <code>CyclistRanking.raceRanking</code> attribute **/
	public static final String RACERANKING = "raceRanking";
	/** Qualifier of the <code>CyclistRanking.cyclist</code> attribute **/
	public static final String CYCLIST = "cyclist";
	/** Qualifier of the <code>CyclistRanking.stageRace</code> attribute **/
	public static final String STAGERACE = "stageRace";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TIMETOTINSECONDS, AttributeMode.INITIAL);
		tmp.put(RACERANKING, AttributeMode.INITIAL);
		tmp.put(CYCLIST, AttributeMode.INITIAL);
		tmp.put(STAGERACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist(final SessionContext ctx)
	{
		return (Cyclist)getProperty( ctx, CYCLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist()
	{
		return getCyclist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final SessionContext ctx, final Cyclist value)
	{
		setProperty(ctx, CYCLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final Cyclist value)
	{
		setCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.raceRanking</code> attribute.
	 * @return the raceRanking
	 */
	public Integer getRaceRanking(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RACERANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.raceRanking</code> attribute.
	 * @return the raceRanking
	 */
	public Integer getRaceRanking()
	{
		return getRaceRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.raceRanking</code> attribute. 
	 * @return the raceRanking
	 */
	public int getRaceRankingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRaceRanking( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.raceRanking</code> attribute. 
	 * @return the raceRanking
	 */
	public int getRaceRankingAsPrimitive()
	{
		return getRaceRankingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.raceRanking</code> attribute. 
	 * @param value the raceRanking
	 */
	public void setRaceRanking(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RACERANKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.raceRanking</code> attribute. 
	 * @param value the raceRanking
	 */
	public void setRaceRanking(final Integer value)
	{
		setRaceRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.raceRanking</code> attribute. 
	 * @param value the raceRanking
	 */
	public void setRaceRanking(final SessionContext ctx, final int value)
	{
		setRaceRanking( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.raceRanking</code> attribute. 
	 * @param value the raceRanking
	 */
	public void setRaceRanking(final int value)
	{
		setRaceRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace()
	{
		return getStageRace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final SessionContext ctx, final StageRace value)
	{
		setProperty(ctx, STAGERACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final StageRace value)
	{
		setStageRace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.timeTotInSeconds</code> attribute.
	 * @return the timeTotInSeconds
	 */
	public Integer getTimeTotInSeconds(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIMETOTINSECONDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.timeTotInSeconds</code> attribute.
	 * @return the timeTotInSeconds
	 */
	public Integer getTimeTotInSeconds()
	{
		return getTimeTotInSeconds( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.timeTotInSeconds</code> attribute. 
	 * @return the timeTotInSeconds
	 */
	public int getTimeTotInSecondsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTimeTotInSeconds( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.timeTotInSeconds</code> attribute. 
	 * @return the timeTotInSeconds
	 */
	public int getTimeTotInSecondsAsPrimitive()
	{
		return getTimeTotInSecondsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.timeTotInSeconds</code> attribute. 
	 * @param value the timeTotInSeconds
	 */
	public void setTimeTotInSeconds(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIMETOTINSECONDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.timeTotInSeconds</code> attribute. 
	 * @param value the timeTotInSeconds
	 */
	public void setTimeTotInSeconds(final Integer value)
	{
		setTimeTotInSeconds( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.timeTotInSeconds</code> attribute. 
	 * @param value the timeTotInSeconds
	 */
	public void setTimeTotInSeconds(final SessionContext ctx, final int value)
	{
		setTimeTotInSeconds( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.timeTotInSeconds</code> attribute. 
	 * @param value the timeTotInSeconds
	 */
	public void setTimeTotInSeconds(final int value)
	{
		setTimeTotInSeconds( getSession().getSessionContext(), value );
	}
	
}
