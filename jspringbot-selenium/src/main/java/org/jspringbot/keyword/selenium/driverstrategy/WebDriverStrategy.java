package org.jspringbot.keyword.selenium.driverstrategy;

import org.openqa.selenium.remote.DesiredCapabilities;

public interface WebDriverStrategy {
  
    public void init(DesiredCapabilities desiredCapabilities);
  
}
