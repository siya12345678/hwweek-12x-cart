package hotdeals;

import homepage.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class HotDealsTest extends Utility {
    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    // verifySaleProductsArrangeAlphabetically()
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link, //1.2 Mouse hover on the “Sale”  link and click
        clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']")
                , By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Sale']"));
        Thread.sleep(3000);

        //1.3 Verify the text “Sale”
        String expectedMsg1 = "Sale";
        String actualMsg1 = getTextFromElement(By.xpath("//h1[text()='Sale']"));
        Assert.assertEquals(" Text did not match", expectedMsg1, actualMsg1);

        //   1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mHoverAndClick(By.xpath("//span[@class='sort-by-value']"), By.partialLinkText("Name A -"));


    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {

        //2.1 Mouse hover on the “Hot deals” link, //2.2 Mouse hover on the “Sale”  link and click
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"),
                By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Sale']"));
        Thread.sleep(4000);
        //2.3 Verify the text “Sale”
        String expectedMsg2 = "Sale";
        String actualMsg2 = getTextFromElement(By.xpath("//h1[text()='Sale']"));
        Assert.assertEquals(" Text did not match", expectedMsg2, actualMsg2);
        Thread.sleep(1000);

        //2.4 Mouse hover on “Sort By” and select “Price Low-High”,//2.5 Verify that the product’s price arrange Low to High
        mHoverAndClick(By.xpath("//span[@class='sort-by-value']"), By.partialLinkText("Price Low - Hi"));
    }

    @Test
    //3 - verifySaleProductsArrangeByRates()
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        //3.1 Mouse hover on the “Hot deals” link,  //3.2 Mouse hover on the “Sale”  link and click

        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"),
                By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Sale']"));
        Thread.sleep(1000);

        //3.3 Verify the text “Sale”
        String expectedMsg3 = "Sale";
        String actualMsg3 = getTextFromElement(By.xpath("//h1[text()='Sale']"));
        Assert.assertEquals(" Text did not match", expectedMsg3, actualMsg3);
        Thread.sleep(1000);

        //3.4 Mouse hover on “Sort By” and select “Rates”, //3.5 Verify that the product’s arrange Rates
        mHoverAndClick(By.xpath("//span[@class='sort-by-value']"), By.partialLinkText("Rates"));

    }

    @Test
    //4 - verifyBestSellersProductsArrangeByZToA()
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {

        //1.1 Mouse hover on the “Hot deals” link,//1.2 Mouse hover on the “Bestsellers”  link and click
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"),
                By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Bestsellers']"));
        Thread.sleep(1000);

        //1.3 Verify the text “Bestsellers”
        String expectedMsg4 = "Bestsellers";
        String actualMsg4 = getTextFromElement(By.xpath("//h1[text()='Bestsellers']"));
        Assert.assertEquals(" Text did not match", expectedMsg4, actualMsg4);
        Thread.sleep(1000);

        //1.4 Mouse hover on “Sort By” and select “Name Z-A”
        mHoverAndClick(By.xpath("//span[@class='sort-by-value']"), By.partialLinkText("Name Z -"));


    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {

        //2.1 Mouse hover on the “Hot deals” link,//2.2 Mouse hover on the “Bestsellers” link and click
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"),
                By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Bestsellers']"));
        Thread.sleep(1000);

        //2.3 Verify the text “Bestsellers”
        String expectedMsg5 = "Bestsellers";
        String actualMsg5 = getTextFromElement(By.xpath("//h1[text()='Bestsellers']"));
        Assert.assertEquals(" Text did not match", expectedMsg5, actualMsg5);
        Thread.sleep(1000);

        //2.4 Mouse hover on “Sort By” and select “Price High-Low”, //2.5 Verify that the product’s price arrange High to Low
        mHoverAndClick(By.xpath("//span[@class='sort-by-value']"), By.partialLinkText("Price High - Low"));
        Thread.sleep(1000);

        //2.5 Verify that the product’s price arrange High to Low
        clickOnElement(By.partialLinkText("Price High - Low"));
        Thread.sleep(1000);

    }

    @Test
    //	6 - verifyBestSellersProductsArrangeByRates()
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {

        //3.1 Mouse hover on the “Hot deals” link,  //3.2 Mouse hover on the “Bestsellers”  link and click
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"),
                By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Bestsellers']"));
        Thread.sleep(1000);

        //3.3 Verify the text “Bestsellers”
        String expectedMsg6 = "Bestsellers";
        String actualMsg6 = getTextFromElement(By.xpath("//h1[text()='Bestsellers']"));
        Assert.assertEquals(" Text did not match", expectedMsg6, actualMsg6);
        Thread.sleep(1000);

        //3.4 Mouse hover on “Sort By” and select “Rates”, //3.5 Verify that the product’s arrange Rates
        mHoverAndClick(By.xpath("//span[@class='sort-by-value']"),By.partialLinkText("Rates"));
        Thread.sleep(1000);

    }

    @After
    public void tearUp() {
        closeBrowser();
    }
}
