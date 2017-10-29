/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 19.00.15                        ---
 * ----------------------------------------------------------------
 */
package my.cyclingraceDaoService.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cyclingraceDaoService.constants.CyclingraceDaoServiceConstants;
import my.cyclingraceDaoService.jalo.StageRanking;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Cyclist}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclist extends GenericItem
{
	/** Qualifier of the <code>Cyclist.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Cyclist.fullName</code> attribute **/
	public static final String FULLNAME = "fullName";
	/** Qualifier of the <code>Cyclist.age</code> attribute **/
	public static final String AGE = "age";
	/** Qualifier of the <code>Cyclist.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>Cyclist.weight</code> attribute **/
	public static final String WEIGHT = "weight";
	/** Qualifier of the <code>Cyclist.team</code> attribute **/
	public static final String TEAM = "team";
	/** Qualifier of the <code>Cyclist.stageRankings</code> attribute **/
	public static final String STAGERANKINGS = "stageRankings";
	/**
	* {@link OneToManyHandler} for handling 1:n STAGERANKINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StageRanking> STAGERANKINGSHANDLER = new OneToManyHandler<StageRanking>(
	CyclingraceDaoServiceConstants.TC.STAGERANKING,
	false,
	"cyclist",
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
		tmp.put(FULLNAME, AttributeMode.INITIAL);
		tmp.put(AGE, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(WEIGHT, AttributeMode.INITIAL);
		tmp.put(TEAM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge()
	{
		return getAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive()
	{
		return getAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final Integer value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final int value)
	{
		setAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final int value)
	{
		setAge( getSession().getSessionContext(), value );
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.fullName</code> attribute.
	 * @return the fullName
	 */
	public String getFullName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FULLNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.fullName</code> attribute.
	 * @return the fullName
	 */
	public String getFullName()
	{
		return getFullName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.fullName</code> attribute. 
	 * @param value the fullName
	 */
	public void setFullName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FULLNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.fullName</code> attribute. 
	 * @param value the fullName
	 */
	public void setFullName(final String value)
	{
		setFullName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCyclist.getNationality requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.nationality</code> attribute. 
	 * @return the localized nationality
	 */
	public Map<Language,String> getAllNationality(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NATIONALITY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.nationality</code> attribute. 
	 * @return the localized nationality
	 */
	public Map<Language,String> getAllNationality()
	{
		return getAllNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCyclist.setNationality requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final String value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setAllNationality(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setAllNationality(final Map<Language,String> value)
	{
		setAllNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.stageRankings</code> attribute.
	 * @return the stageRankings
	 */
	public Collection<StageRanking> getStageRankings(final SessionContext ctx)
	{
		return STAGERANKINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.stageRankings</code> attribute.
	 * @return the stageRankings
	 */
	public Collection<StageRanking> getStageRankings()
	{
		return getStageRankings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.stageRankings</code> attribute. 
	 * @param value the stageRankings
	 */
	public void setStageRankings(final SessionContext ctx, final Collection<StageRanking> value)
	{
		STAGERANKINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.stageRankings</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>Cyclist.team</code> attribute.
	 * @return the team
	 */
	public String getTeam(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEAM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.team</code> attribute.
	 * @return the team
	 */
	public String getTeam()
	{
		return getTeam( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.team</code> attribute. 
	 * @param value the team
	 */
	public void setTeam(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEAM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.team</code> attribute. 
	 * @param value the team
	 */
	public void setTeam(final String value)
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
