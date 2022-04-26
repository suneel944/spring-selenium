package com.auto.spring.springselenium.utility;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BrowserActions
{
    @Lazy
    @Autowired
    private WebDriver driver;

    public boolean launchUrl(String url)
    {
        try
        {
            this.driver.get(url);
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }
}
