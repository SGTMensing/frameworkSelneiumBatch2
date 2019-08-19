package resources;

public class ConstantVariables {
	

	// Elements
	public static final String baseUrl = "https://www.ascendum.com";
	public static final String headerTobeValidated = "KPS Services";
	public static final String navigateToUrl = "https://ascendum.com/contact/";
	public static final String headerOnPage = "ASCENDUM KPS";

	// Careers page
	public static final String cultureAndValues = "Culture and Values";
	public static final String employeeAndBenefits = "Employee Benefits";
	public static final String currentOpenings = "Current OPenings";
	public static final String tabs_currentOpenings = "Career Openings";

	// enterVariable
	public static final String enterTextfromConfig = "Manager";

	// writeToExcel
	public static final String writeToExcel = "Enter the data into excel";

	// Contact - Enquiry form details
	public static final String emailAddress = "xyz.xxx@ascendum.com";
	public static final int phoneNo = 1234567890;
	

	

	//Enums - Boolean - isDisplayed
	public static enum elementPresent
	{
		ISDISPLAYED,
		ISENABLED,
		ISSELCTED
	}
	
	public static enum pageScroll
	{
		UP,
		DOWN,
		LEFT,
		RIGHT,
		TILLBOTTOMOFPAGE,
		TILLTOPOFPAGE
	}
	
	
}
