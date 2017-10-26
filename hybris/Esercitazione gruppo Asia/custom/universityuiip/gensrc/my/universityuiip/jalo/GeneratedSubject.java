/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-ott-2017 2.31.08                         ---
 * ----------------------------------------------------------------
 */
package my.universityuiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.universityuiip.constants.UniversityuiipConstants;
import my.universityuiip.jalo.Professor;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Subject}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSubject extends GenericItem
{
	/** Qualifier of the <code>Subject.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>Subject.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Subject.program</code> attribute **/
	public static final String PROGRAM = "program";
	/** Qualifier of the <code>Subject.professor</code> attribute **/
	public static final String PROFESSOR = "professor";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PROFESSOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSubject> PROFESSORHANDLER = new BidirectionalOneToManyHandler<GeneratedSubject>(
	UniversityuiipConstants.TC.SUBJECT,
	false,
	"professor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PROGRAM, AttributeMode.INITIAL);
		tmp.put(PROFESSOR, AttributeMode.INITIAL);
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
		PROFESSORHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSubject.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSubject.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.professor</code> attribute.
	 * @return the professor
	 */
	public Professor getProfessor(final SessionContext ctx)
	{
		return (Professor)getProperty( ctx, PROFESSOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.professor</code> attribute.
	 * @return the professor
	 */
	public Professor getProfessor()
	{
		return getProfessor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.professor</code> attribute. 
	 * @param value the professor
	 */
	public void setProfessor(final SessionContext ctx, final Professor value)
	{
		PROFESSORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.professor</code> attribute. 
	 * @param value the professor
	 */
	public void setProfessor(final Professor value)
	{
		setProfessor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.program</code> attribute.
	 * @return the program
	 */
	public String getProgram(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSubject.getProgram requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PROGRAM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.program</code> attribute.
	 * @return the program
	 */
	public String getProgram()
	{
		return getProgram( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.program</code> attribute. 
	 * @return the localized program
	 */
	public Map<Language,String> getAllProgram(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PROGRAM,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.program</code> attribute. 
	 * @return the localized program
	 */
	public Map<Language,String> getAllProgram()
	{
		return getAllProgram( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.program</code> attribute. 
	 * @param value the program
	 */
	public void setProgram(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSubject.setProgram requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PROGRAM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.program</code> attribute. 
	 * @param value the program
	 */
	public void setProgram(final String value)
	{
		setProgram( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.program</code> attribute. 
	 * @param value the program
	 */
	public void setAllProgram(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PROGRAM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.program</code> attribute. 
	 * @param value the program
	 */
	public void setAllProgram(final Map<Language,String> value)
	{
		setAllProgram( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Subject.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Subject.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
