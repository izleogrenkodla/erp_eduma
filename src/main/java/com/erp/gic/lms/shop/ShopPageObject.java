package com.erp.gic.lms.shop;

import com.erp.gic.lms.login.LoginPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPageObject extends LoginPageObject {

    int i = 0;

    @FindBy(xpath = "//*[@id=\"thim-product-archive\"]/nav/ul/li[2]/a")
    WebElement nextPage;

    @FindBy(xpath="//*[@id=\"post-1698\"]/div/div/div/div/div/a")
    WebElement checkoutBtn;

    @FindBy(name="add-to-cart")
    WebElement addCartBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/a")
    WebElement viewCart;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/a")
    WebElement clickCartBtn;

    @FindBy(xpath = "//*[@id=\"main-content\"]/section/div[1]/div[1]/div/div/h1")
    WebElement cartPageDisplay;

    public int getProductNumber(String productName)
    {
        if((productName.equals("Bag fabric")) | (productName.equals("Keychains")))
        {
            i = 1;
        }
        else if ((productName.equals("Bracelet")) | (productName.equals("Klappkarte kreuzstich")))
        {
            i = 2;
        }
        else if ((productName.equals("Brauhaus")) | (productName.equals("Luggage tag")))
        {
            i = 3;
        }
        else if ((productName.equals("Buschla")) | productName.equals("Princely pencil"))
        {
            i = 4;
        }
        else if ((productName.equals("Chutney")) | productName.equals("Smartphone cases"))
        {
            i = 5;
        }
        else if ((productName.equals("Corkscrew")) | productName.equals("Wood postcard"))
        {
            i = 6;
        }
        else if (productName.equals("Cup crown pattern"))
        {
            i = 7;
        }
        else if (productName.equals("Cup princely break"))
        {
            i = 8;
        }
        else if (productName.equals("Daham"))
        {
            i = 9;
        }
        else if (productName.equals("Funka"))
        {
            i = 10;
        }
        else if (productName.equals("Fursten hutchen"))
        {
            i = 11;
        }
        else if (productName.equals("Karton"))
        {
            i = 12;
        }
        return i;
    }

    public void productNameClick(int value)
    {
        implicitWait();
        driver.findElement(By.xpath("//*[@id=\"thim-product-archive\"]/ul/li["+value+"]/div/div[2]/a[1]")).click();
    }

    public void validateProductPage(String productName)
    {
        if(productName.equals("Bag fabric"))
        {
            i = 140;
        }
        else if (productName.equals("Bracelet"))
        {
            i = 142;
        }
        else if (productName.equals("Brauhaus"))
        {
            i = 1693;
        }
        else if (productName.equals("Buschla"))
        {
            i = 1691;
        }
        else if (productName.equals("Chutney"))
        {
            i = 1694;
        }
        else if (productName.equals("Corkscrew"))
        {
            i = 1690;
        }
        else if (productName.equals("Cup crown pattern"))
        {
            i = 139;
        }
        else if (productName.equals("Cup princely break"))
        {
            i = 1696;
        }
        else if (productName.equals("Daham"))
        {
            i = 137;
        }
        else if (productName.equals("Funka"))
        {
            i = 136;
        }
        else if (productName.equals("Fursten hutchen"))
        {
            i = 1695;
        }
        else if (productName.equals("Karton"))
        {
            i = 141;
        }
        else if(productName.equals("Keychains"))
        {
            i = 145;
        }
        else if (productName.equals("Klappkarte kreuzstich"))
        {
            i = 135;
        }
        else if (productName.equals("Luggage tag"))
        {
            i = 143;
        }
        else if (productName.equals("Princely pencil"))
        {
            i = 138;
        }
        else if (productName.equals("Smartphone cases"))
        {
            i = 1692;
        }
        else if (productName.equals("Wood postcard"))
        {
            i = 144;
        }

        WebElement title = driver.findElement(By.xpath("//*[@id=\"product-"+i+"\"]/div[1]/div[2]/h1"));
        explicitWait(title);
        Assert.assertEquals(productName,title.getText());
    }

    public void nextPageClick()
    {
        nextPage.click();
    }

    public void cartClick(int value)
    {
        driver.findElement(By.xpath("//*[@id=\"thim-product-archive\"]/ul/li["+value+"]/div/div[2]/a[2]")).click();
    }

    public void cartClickView(int value)
    {
        driver.findElement(By.xpath("//*[@id=\"thim-product-archive\"]/ul/li["+value+"]/div/div[2]/a[3]")).click();
    }

    public void clickCheckoutBtn()
    {
        checkoutBtn.click();
    }

    public void clickAddCart()
    {
        addCartBtn.click();
    }

    public void viewCartBtn()
    {
        viewCart.isDisplayed();
    }

    public void clickViewCart()
    {
       clickCartBtn.click();
    }

    public void cartPage()
    {
        explicitWait(cartPageDisplay);
        Assert.assertEquals("CART",cartPageDisplay.getText());
    }
}
