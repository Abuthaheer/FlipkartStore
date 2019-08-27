package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectPackage.BasePage;
import objectPackage.HomePageObject;
@Test
public class HomePageTest {
	HomePageObject homepage;
	BasePage bp;
	
	public HomePageTest() {   					//constructor
		homepage = new HomePageObject();
		bp = new BasePage();
	}
	//------------------------------------------------------------
	   //verified Element presented or not.
	@Test(enabled=false)
	public void verifyTabs() {
		System.out.println("verify Element presented or not.");
		Assert.assertTrue(homepage.getWomenPage().isDisplayed());
		Assert.assertTrue(homepage.getDressPage().isDisplayed()); 
		Assert.assertTrue(homepage.getTshirtPage().isDisplayed()); 
		System.out.println("verified Element presented .");}
	
/*	@Test(enabled=false)
	public void verifyWomens() {
		Assert.assertTrue(homepage.getWomenPage().isDisplayed());
	}
	@Test(enabled=false)
	public void verifyDresses() 
	{		Assert.assertTrue(homepage.getDressPage().isDisplayed());   }
	@Test(enabled=false)
	public void verifyTShirt() 
	{		Assert.assertTrue(homepage.getTshirtPage().isDisplayed()); 	}*/
	
	//----------------------------------------------------
				//Getting the Title
	/*@Test
	public  void getwomensTitle()
	{		System.out.println(homepage.womenClick());	}
	@Test
	public  void getdressesTitle()
	{		System.out.println(homepage.dressClick());	}	
	@Test
	public  void gettShirtTitle()
	{   		System.out.println(homepage.tShirtClick());	}
	*/
	@Test (enabled=false)
	public  void getAllTitle()
	{	System.out.println("Verify : GETTING  All Title");
		System.out.println(homepage.womenClick());
		System.out.println(homepage.dressClick());
		System.out.println(homepage.tShirtClick());
		System.out.println("Verified : Got All Title");
	}
	//--------------------------------------------------------------------
	 //VerifyNewsLetter and getting Subscription Message
	@Test(enabled=false)
	public void VerifyNewsLetter()
	{
		System.out.println("Verify NewsLetter : ");
		homepage.getNEWSLETTER();
		homepage.getNewsClick().click();
		String subscriptionMSG = homepage.getAlert().getText();
		System.out.println( subscriptionMSG);
		System.out.println("Verified NewsLetter and Subscription Message Alert ");
	}
	//---------------------------------------------------------------------
	
	//validate the size in T-shirt
	@Test(enabled=false)
	public void verifyTshirtSizes() {
		Assert.assertTrue(homepage.getSmallSize().isDisplayed());
		Assert.assertTrue(homepage.getMediumSize().isDisplayed());
		Assert.assertTrue(homepage.getLargeSize().isDisplayed());
		System.out.println("verified All T-shirt size are presented.");
	}
	//verified the size
	//--------------------------------------------------------------------------
	//count the no of links in the dress page
/*	@Test
	public void verifyDressCount()
	{
		homepage.getCOUNTinDress();
	}*/
	@Test(enabled=false)
	public void verify()
	{
		System.out.println("COUNT :"+ homepage.getCOUNTMatch());
	}
	@Test
	public void verifyCount()
	{	homepage.dressClick();
	System.out.println(homepage.getCount1().equals(homepage.getCOUNTMatch()));
		
	}
//------------------------------------------------------------------------------------------
	//verify Added first product in dress tab and verify it’s added to cart
	//@Test
	/*public void verifyCART()
	{	
		//int actual = homepage.getCOUNTinDress();
		//int expected = homepage.getIntoCart();
		//Assert.assertEquals(actual, expected);
		//Assert.assertTrue(homepage.getSelectDress().iscontain("dressAddtoCart");
		System.out.println(homepage.getSelectDress());
		System.out.println(homepage.getIntoCart());
						//Assert.assertTrue(actual == expected ,"Failed:Count mismatched");
	}*/
}




