/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-ott-2017 18.39.55                        ---
 * ----------------------------------------------------------------
 */
package my.universityuiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.universityuiip.constants.UniversityuiipConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Individual}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIndividual extends GenericItem
{
	/** Qualifier of the <code>Individual.serialNumber</code> attribute **/
	public static final String SERIALNUMBER = "serialNumber";
	/** Qualifier of the <code>Individual.fullName</code> attribute **/
	public static final String FULLNAME = "fullName";
	/** Qualifier of the <code>Individual.birthDate</code> attribute **/
	public static final String BIRTHDATE = "birthDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SERIALNUMBER, AttributeMode.INITIAL);
		tmp.put(FULLNAME, AttributeMode.INITIAL);
		tmp.put(BIRTHDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BIRTHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate()
	{
		return getBirthDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BIRTHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final Date value)
	{
		setBirthDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.fullName</code> attribute.
	 * @return the fullName
	 */
	public String getFullName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FULLNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.fullName</code> attribute.
	 * @return the fullName
	 */
	public String getFullName()
	{
		return getFullName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.fullName</code> attribute. 
	 * @param value the fullName
	 */
	public void setFullName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FULLNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.fullName</code> attribute. 
	 * @param value the fullName
	 */
	public void setFullName(final String value)
	{
		setFullName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.serialNumber</code> attribute.
	 * @return the serialNumber
	 */
	public String getSerialNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SERIALNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.serialNumber</code> attribute.
	 * @return the serialNumber
	 */
	public String getSerialNumber()
	{
		return getSerialNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.serialNumber</code> attribute. 
	 * @param value the serialNumber
	 */
	public void setSerialNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SERIALNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.serialNumber</code> attribute. 
	 * @param value the serialNumber
	 */
	public void setSerialNumber(final String value)
	{
		setSerialNumber( getSession().getSessionContext(), value );
	}
	
}
