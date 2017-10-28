/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-ott-2017 18.39.55                        ---
 * ----------------------------------------------------------------
 */
package my.universityuiip.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.universityuiip.constants.UniversityuiipConstants;
import my.universityuiip.jalo.Individual;
import my.universityuiip.jalo.Subject;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Professor}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProfessor extends Individual
{
	/** Qualifier of the <code>Professor.subjects</code> attribute **/
	public static final String SUBJECTS = "subjects";
	/**
	* {@link OneToManyHandler} for handling 1:n SUBJECTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Subject> SUBJECTSHANDLER = new OneToManyHandler<Subject>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Individual.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Professor.subjects</code> attribute.
	 * @return the subjects
	 */
	public Collection<Subject> getSubjects(final SessionContext ctx)
	{
		return SUBJECTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Professor.subjects</code> attribute.
	 * @return the subjects
	 */
	public Collection<Subject> getSubjects()
	{
		return getSubjects( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Professor.subjects</code> attribute. 
	 * @param value the subjects
	 */
	public void setSubjects(final SessionContext ctx, final Collection<Subject> value)
	{
		SUBJECTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Professor.subjects</code> attribute. 
	 * @param value the subjects
	 */
	public void setSubjects(final Collection<Subject> value)
	{
		setSubjects( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to subjects. 
	 * @param value the item to add to subjects
	 */
	public void addToSubjects(final SessionContext ctx, final Subject value)
	{
		SUBJECTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to subjects. 
	 * @param value the item to add to subjects
	 */
	public void addToSubjects(final Subject value)
	{
		addToSubjects( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from subjects. 
	 * @param value the item to remove from subjects
	 */
	public void removeFromSubjects(final SessionContext ctx, final Subject value)
	{
		SUBJECTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from subjects. 
	 * @param value the item to remove from subjects
	 */
	public void removeFromSubjects(final Subject value)
	{
		removeFromSubjects( getSession().getSessionContext(), value );
	}
	
}
