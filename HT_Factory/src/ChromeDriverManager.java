import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.sql.DriverManager;


public class ChromeDriverManger extends DriverManager {
    private ChromeDriverService chService;


    @Override
    protected void startServices() {
        if (chService == null)
        {
            try{
                chService = new ChromeDriverService.Builder().usingDriverExecutable(new File("C:\\Users\\pbandara\\OneDrive - Wiley\\Desktop\\Automation_CRM\\Automation Script\\GIT\\qe_crm_ui_auto_teasy_4172020\\FactoryPatternInAutomation\\chromedriver.exe"))
                        .usingAnyFreePort().build();
                chService.start();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopServices() {
        if(chService && chService.isRunning() != null)
            chService.stop();
    }

    @Override
    public void createDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);
        WebDriver driver=new ChromeDriver(options);
    }

}