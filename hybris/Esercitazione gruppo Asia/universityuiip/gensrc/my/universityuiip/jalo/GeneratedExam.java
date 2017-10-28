/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-ott-2017 18.39.55                        ---
 * ----------------------------------------------------------------
 */
package my.universityuiip.jalo;

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
import my.universityuiip.constants.UniversityuiipConstants;
import my.universityuiip.jalo.Student;
import my.universityuiip.jalo.Subject;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Exam}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedExam extends GenericItem
{
	/** Qualifier of the <code>Exam.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>Exam.subject</code> attribute **/
	public static final String SUBJECT = "subject";
	/** Qualifier of the <code>Exam.result</code> attribute **/
	public static final String RESULT = "result";
	/** Qualifier of the <code>Exam.grade</code> attribute **/
	public static final String GRADE = "grade";
	/** Qualifier of the <code>Exam.student</code> attribute **/
	public static final String STUDENT = "student";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STUDENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedExam> STUDENTHANDLER = new BidirectionalOneToManyHandler<GeneratedExam>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(SUBJECT, AttributeMode.INITIAL);
		tmp.put(RESULT, AttributeMode.INITIAL);
		tmp.put(GRADE, AttributeMode.INITIAL);
		tmp.put(STUDENT, AttributeMode.INITIAL);
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
		STUDENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.grade</code> attribute.
	 * @return the grade
	 */
	public Integer getGrade(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, GRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.grade</code> attribute.
	 * @return the grade
	 */
	public Integer getGrade()
	{
		return getGrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.grade</code> attribute. 
	 * @return the grade
	 */
	public int getGradeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getGrade( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.grade</code> attribute. 
	 * @return the grade
	 */
	public int getGradeAsPrimitive()
	{
		return getGradeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, GRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final Integer value)
	{
		setGrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final SessionContext ctx, final int value)
	{
		setGrade( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final int value)
	{
		setGrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RESULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult()
	{
		return getResult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RESULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final EnumerationValue value)
	{
		setResult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.student</code> attribute.
	 * @return the student
	 */
	public Student getStudent(final SessionContext ctx)
	{
		return (Student)getProperty( ctx, STUDENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.student</code> attribute.
	 * @return the student
	 */
	public Student getStudent()
	{
		return getStudent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.student</code> attribute. 
	 * @param value the student
	 */
	public void setStudent(final SessionContext ctx, final Student value)
	{
		STUDENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.student</code> attribute. 
	 * @param value the student
	 */
	public void setStudent(final Student value)
	{
		setStudent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.subject</code> attribute.
	 * @return the subject
	 */
	public Subject getSubject(final SessionContext ctx)
	{
		return (Subject)getProperty( ctx, SUBJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.subject</code> attribute.
	 * @return the subject
	 */
	public Subject getSubject()
	{
		return getSubject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final SessionContext ctx, final Subject value)
	{
		setProperty(ctx, SUBJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final Subject value)
	{
		setSubject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Exam.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Exam.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
