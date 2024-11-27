package Com.myntra;

import org.example.base.screenSotBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class screenShotZoomin_out extends screenSotBase {
    @Test
    public void screenShotZoominANDout() throws InterruptedException {

       WebElement screenshot =
           driver.findElement(By.className("android.widget.ImageView"));
        screenshot.click();
//Thread.sleep(5000);
       WebElement img = driver.findElement(By.className("android.widget.ImageView"));
//        img.click();
        /*WebElement allowbut = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
        allowbut.click();*/
       /* WebElement fullimg = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.dddev.gallery.album.photo.editor:id/subsampling_view\"]"));
        fullimg.click();*/


    }

}
