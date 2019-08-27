package objectPackage;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a[text()='Women']")
	private WebElement women;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a[text()='Dresses']")
	private WebElement dresses;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a[text()='T-shirts']")
	private WebElement tShirt;
	
	@FindBy(xpath ="//*[@id='newsletter-input']")
	private WebElement newsLetter;
	
	@FindBy(xpath ="//*[@name='submitNewsletter']")
	private WebElement newsLetterClick;
	@FindBy(xpath ="//*[@id='columns']/p")
	private WebElement alertMessage;
	
	//@FindBy(xpath ="//*[@id='newsletter_block_left']//button")
	//private WebElement button;
//	@FindBy(xpath ="//*[@id='newsletter_block_left']//button")
	//private WebElement popup;
	
	//@FindBy(xpath ="//*[@id='newsletter_block_left']//button")
	//private WebElement Scroll;
	
	
	@FindBy(xpath ="//ul[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
	private WebElement small;
	
	@FindBy(xpath ="//ul[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
	private WebElement medium;
	
	@FindBy(xpath ="//ul[@id='ul_layered_id_attribute_group_1']/li[3]/label/a")
	private WebElement large;

	@FindBy(xpath ="//*[@class='page-heading product-listing']/span[2]") //xpath="//*[@id='center_column']/h1/span[2]"
	private WebElement count;
	
	@FindBys(@FindBy(xpath ="//*[@class='product-container']"))		//list-->xpath="//*[@id='center_column']/ul/li")
	private List<WebElement> dressCount1;
	
	
	
	/*@FindBy(xpath ="//ul//li[3]//a[@title='Add to cart']")
	private WebElement dressAddtoCart;
	
	@FindBy(xpath ="//*[@class='cart_block_list']//a/img")
	private WebElement InsideAddtoCart;*/
	//---------------------------------------------------------------------------------
	
	public HomePageObject() { 			// constructor
		PageFactory.initElements(driver, this);
	}
	
//------------------------------------------------------------------
			// verify Element presented or not.
	public WebElement getWomenPage() {
		return women;
	}
	public WebElement getDressPage() {
		return dresses;
	}
	public WebElement getTshirtPage() {
		return tShirt;
	}
	
	// -------------------------------------------------
			//Getting the Title
	public String womenClick() {
		women.click();
		return driver.getTitle();//  Mtd 1: use directly by driver.getTitle();
	}
	public String dressClick() {
		dresses.click();  //  Mtd 2: use directly call the Base class mtd 
		return getTITLE();
	}
	 public String tShirtClick() {
		 tShirt.click(); 
		 return getTITLE(); }
	
//-----------------------------------------------------------------------------
	 				//Getting the NewLetter
	/* public void getNewsLetter()
	 { 
		 int random= new Random().nextInt(50000);
		 String gmail = "saranya" + random +"@gmail.com";
		 pageScroll(newsLetter);
		 newsLetter.sendKeys(gmail);
		 System.out.println(newsLetter.getAttribute("value"));
			 }*/		
	 public WebElement getNews() {
			return newsLetter;
		}
	 public WebElement getNewsClick() {
			return newsLetterClick;
		}
	public WebElement getAlert() {
			return alertMessage; 
			}
	public void getNEWSLETTER()
			 { 				
			 newsLetter.sendKeys("saran.santhosh8@gmail.com");
			  }
	
//-----------------------------------------------------------------------------------
// Checking the all d size in T-shirt Tab
public WebElement getSmallSize() {
	return small;
}
public WebElement getMediumSize() {
	return medium;		}
public WebElement getLargeSize() {
	return large; }

//----------------------------------------------------------------------------------
		//getting the count Size


public WebElement getCount() 
{   //System.out.println(" String-COUNT in the dress TAB ");
	return count;		
}
public List<WebElement> getCount1() {
   System.out.println("COUNT SIZE in the dress List ");
   dressCount1.size();
   System.out.println( dressCount1.size());
   return dressCount1;
}
public int getCOUNTMatch()
{
	System.out.println(" Dress COUNT in the Dress Tab ");
	dresses.click();
	String Count = count.getText();
	String []arr = Count.split(" ");
	System.out.println(arr);
	String TxtNumber= arr[2];
	int number = Integer.parseInt(TxtNumber);
	return  number; 
	//return Integer.parseInt(dressCount.getText().split(" ")[2]);
}

//-----------------------------------------------------------------------------------------
// Add first product in dress tab and verify it’s added to cart

/*public String getSelectDress()
{
    dressAddtoCart.click();
	return driver.getTitle();
	}
public String getIntoCart()
{
   InsideAddtoCart.click();
	return driver.getTitle();
	}*/
}
