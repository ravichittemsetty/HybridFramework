package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.commands.ActionDriver;
import com.gcr.config.StartBrowser;
import com.gcr.or.WebShopHomePage;
import com.gcr.or.WebShopLoginPage;


public class BusinessFunctions {
	public WebDriver driver;
	public ActionDriver ad;
	
	public BusinessFunctions()
	{
		driver = StartBrowser.driver;
		ad = new ActionDriver();
	}
	public void loginWebShop()throws Exception
	{
		StartBrowser.childTest =StartBrowser.parentTest.createNode("Login to WebShop application");
		ad.navigateToApplication("https://demowebshop.tricentis.com/");
		ad.click(WebShopHomePage.lnklogin, "Login Link");
		ad.type(WebShopLoginPage.txtEmail, "ravichandrachittemsetty@gmail.com", "Email text box");
		ad.type(WebShopLoginPage.txtPassword, "Smile@4uu", "Password Textbox");
		ad.click(WebShopLoginPage.btnLogin, "Login Button");
				
	}
	public void loginWebShop(String userName, String password)throws Exception
	{
		StartBrowser.childTest =StartBrowser.parentTest.createNode("Login to WebShop application using parameters");
		ad.navigateToApplication("https://demowebshop.tricentis.com/");
		ad.click(WebShopHomePage.lnklogin, "Login Link");
		ad.type(WebShopLoginPage.txtEmail, userName, "Email text box");
		ad.type(WebShopLoginPage.txtPassword, password, "Password Textbox");
		ad.click(WebShopLoginPage.btnLogin, "Login Button");
				
	}
	public void logoutWebShop()throws Exception
	{
		StartBrowser.childTest =StartBrowser.parentTest.createNode("LogOut to WebShop application");
	
		ad.click(WebShopHomePage.lnkLogout, "Logout Link");
		
	}

}
