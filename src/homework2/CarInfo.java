/**
 * 
 */
/**
 * @author Ryan's Desktop
 *
 */
package homework2;
public class CarInfo 
{
	private String Manufacture;
	private String Model;
	private String MakeYear;
	
	//This Defines the Manufacture(Ford, Chevy, ect)
	public String getManufacture() {
		return Manufacture;
	}
	public void setManufacture(String Manufacture) {
		this.Manufacture = Manufacture;
	}
	
	//This Defines the Model
	public String getModel() {
		return Model;
	}
	public void setModel(String Model) {
		this.Model = Model;
	}
	
	//This Defines The Year the car was Made
	public String getMakeYear() {
		return MakeYear;
	}
	public void setMakeYear(String MakeYear) {
		this.MakeYear = MakeYear;
	}	
}
