/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-ott-2017 2.31.08                         ---
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
import my.universityuiip.jalo.Exam;
import my.universityuiip.jalo.Individual;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Student}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStudent extends Individual
{
	/** Qualifier of the <code>Student.exams</code> attribute **/
	public static final String EXAMS = "exams";
	/**
	* {@link OneToManyHandler} for handling 1:n EXAMS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Exam> EXAMSHANDLER = new OneToManyHandler<Exam>(
	UniversityuiipConstants.TC.EXAM,
	false,
	"student",
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
	 * <i>Generated method</i> - Getter of the <code>Student.exams</code> attribute.
	 * @return the exams
	 */
	public Collection<Exam> getExams(final SessionContext ctx)
	{
		return EXAMSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.exams</code> attribute.
	 * @return the exams
	 */
	public Collection<Exam> getExams()
	{
		return getExams( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.exams</code> attribute. 
	 * @param value the exams
	 */
	public void setExams(final SessionContext ctx, final Collection<Exam> value)
	{
		EXAMSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.exams</code> attribute. 
	 * @param value the exams
	 */
	public void setExams(final Collection<Exam> value)
	{
		setExams( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exams. 
	 * @param value the item to add to exams
	 */
	public void addToExams(final SessionContext ctx, final Exam value)
	{
		EXAMSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exams. 
	 * @param value the item to add to exams
	 */
	public void addToExams(final Exam value)
	{
		addToExams( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exams. 
	 * @param value the item to remove from exams
	 */
	public void removeFromExams(final SessionContext ctx, final Exam value)
	{
		EXAMSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exams. 
	 * @param value the item to remove from exams
	 */
	public void removeFromExams(final Exam value)
	{
		removeFromExams( getSession().getSessionContext(), value );
	}
	
}
