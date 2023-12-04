package com.example.test1;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Arrays;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.options.UiAutomator2Options;




@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InstagramRamp{

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformVersion("Android")
                .setDeviceName("Redmi 9T")
                .setApp(System.getProperty("user.dir") + "C:\\Appium\\instagram-288-1-0-22-66.apk")
                .eventTimings();

                /*.amend("platformName", "Android")
                .amend("appium:device_name", "Redmi 9T")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

                 */

        URL appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(appiumServerURL, options);
    }

    @Test
    public void Avtori() {
        WebElement e1 = driver.findElement(AppiumBy.id("com.google.android.gms:id/cancel"));
        e1.click();
        WebElement avto = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Войти\"]"));
        if (avto.isDisplayed()) {
            System.out.println("Login page on screen");
        } else {
            System.out.println("There is no login page");
        }
        WebElement e2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/layout_container_main\"]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
        e2.click();
        WebElement login = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Очистить текст \"]"));
        if (login.isDisplayed()) {
            System.out.println("Login field selection successful");
        } else {
            System.out.println("The login field was not highlighted");
        }
        WebElement e3 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/layout_container_main\"]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
        e3.sendKeys("pasenko.333@ukr.net");
        WebElement login2 = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"pasenko.333@ukr.net\"]"));
        if (login2.isDisplayed()) {
            System.out.println("The entered login is displayed on the screen");
        } else {
            System.out.println("The entered login is not displayed on the screen");
        }
        WebElement e4 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/layout_container_main\"]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
        e4.click();
        WebElement password = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Показать пароль\"]/android.widget.ImageView"));
        if (password.isDisplayed()) {
            System.out.println("Password field selection successful");
        } else {
            System.out.println("The password field was not highlighted");
        }
        WebElement e5 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/layout_container_main\"]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
        e5.sendKeys("333978_Alex");
        WebElement password2 = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"333978_Alex\"]"));
        if (password2.isDisplayed()) {
            System.out.println("The entered password is displayed on the screen");
        } else {
            System.out.println("The entered password is not displayed on the screen");
        }
        WebElement e6 = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Войти\"]"));
        e6.click();
        WebElement entrance = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Сохранить данные для входа?\"]"));
        if (entrance.isDisplayed()) {
            System.out.println("Login details are correct");
        } else {
            System.out.println("Login information is not correct");
        }
        WebElement e7 = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Не сейчас\"]"));
        e7.click();
        WebElement house = driver.findElement(AppiumBy.accessibilityId("Дом"));
        if (house.isDisplayed()) {
            System.out.println("Authorization was successful");
        } else {
            System.out.println("Authorization failed");
        }
    }

    @Test
    public void Stori() {
        WebElement el1 = driver.findElement(AppiumBy.accessibilityId("Дом"));
        el1.click();
        WebElement house = driver.findElement(AppiumBy.accessibilityId("Дом"));
        if (house.isDisplayed()) {
            System.out.println("Home page on screen");
        } else {
            System.out.println("Home page is missing");
        }
        final WebElement finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        WebElement start = new Point(164, 563);
        WebElement end = new Point (916, 557);
        WebElement swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        WebElement window = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/permission_message_video\"]"));
        if (window.isDisplayed()) {
            System.out.println("The window for selecting content for stories is open with a request for access");
        } else {
            System.out.println("The window for selecting content for stories could not be opened with an access request");
        }
        WebElement el2 = driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button"));
        el2.click();
        WebElement video = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/permission_message_microphone\"]"));
        if (video.isDisplayed()) {
            System.out.println("Access to video allowed");
        } else {
            System.out.println("Access to video is denied");
        }
        WebElement el3 = driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button"));
        el3.click();
        WebElement microphone = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/permission_message_file\"]"));
        if (microphone.isDisplayed()) {
            System.out.println("Access to microphone allowed");
        } else {
            System.out.println("Access to microphone is denied");
        }
        WebElement el31 = driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));
        el31.click();
        WebElement file = driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.instagram.android:id/ar_effect_in_tray_icon\"]"));
        if (file.isDisplayed()) {
            System.out.println("Access to file allowed");
        } else {
            System.out.println("Access to file is denied");
        }
        WebElement el6 = driver.findElement(AppiumBy.accessibilityId("Галерея"));
        el6.click();
        WebElement gallery = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Открыть камеру\"]"));
        if (gallery.isDisplayed()) {
            System.out.println("Gallery is open");
        } else {
            System.out.println("Galere is missing");
        }
        WebElement el7 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Test3\"]"));
        el7.click();
        WebElement choice = driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"com.instagram.android:id/focus_view/content-desc=\"Test3\"]"));
        if (choice.isDisplayed()) {
            System.out.println("The selection of the desired photo was successful");
        } else {
            System.out.println("Selecting the required photo failed");
        }
        WebElement el9 = driver.findElement(AppiumBy.accessibilityId("Поделиться в истории"));
        el6.click();
        WebElement house2 = driver.findElement(AppiumBy.accessibilityId("Дом"));
        if (house2.isDisplayed()) {
            System.out.println("Completing the publishing process is complete");
        } else {
            System.out.println("Completing the publishing process failed");
        }
        WebElement el11 = driver.findElement(AppiumBy.accessibilityId("История pasenko.333 в столбце 0. Непросмотренное."));
        el11.click();
        WebElement story = driver.findElement(AppiumBy.accessibilityId("//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/reel_viewer_image_view\"]/android.widget.ImageView=\"Test3\""));
        if (story.isDisplayed()) {
            System.out.println("Story published successfully");
        } else {
            System.out.println("No history");
        }
        final WebElement finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        WebElement start = new Point(22, 988);
        WebElement end = new Point (996, 975);
        WebElement swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        WebElement house3 = driver.findElement(AppiumBy.accessibilityId("Дом"));
        if (house3.isDisplayed()) {
            System.out.println("Return to home page successful");
        } else {
            System.out.println("Return to home page failed");
        }
    }

    @Test
    public void sampleTest() {
        WebElement house = driver.findElement(AppiumBy.accessibilityId("Дом"));
        if (house.isDisplayed()) {
            System.out.println("Home page on screen");
        } else {
            System.out.println("Home page is missing");
        }
        WebElement el2 = driver.findElement(AppiumBy.accessibilityId("Поиск и интересное"));
        el2.click();
        WebElement shot = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.instagram.android:id/action_bar_search_edit_text\"]"));
        if (shot.isDisplayed()) {
            System.out.println("Search page is open");
        } else {
            System.out.println("The search page is missing from the screen");
        }
        WebElement el3 = driver.findElement(AppiumBy.id("com.instagram.android:id/action_bar_search_edit_text"));
        el3.click();
        WebElement search = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Поиск\"]"));
        if (search.isDisplayed()) {
            System.out.println("Search field selection successful");
        } else {
            System.out.println("The search field was not highlighted");
        }
        WebElement el5 = driver.findElement(AppiumBy.id("com.instagram.android:id/action_bar_search_edit_text"));
        el5.sendKeys("akaman3");
        WebElement username = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"akaman3\"]"));
        if (username.isDisplayed()) {
            System.out.println("The entered username is displayed on the screen");
        } else {
            System.out.println("The entered username is not displayed on the screen");
        }
        WebElement el6 = driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.instagram.android:id/row_search_user_info_container\"])[1]/android.widget.LinearLayout"));
        el6.click();
        WebElement profile = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"akaman3\"]"));
        if (profile.isDisplayed()) {
            System.out.println("Profile page akaman3 successfully opened");
        } else {
            System.out.println("No profile page akaman3");
        }
        WebElement el7 = driver.findElement(AppiumBy.accessibilityId("Фото Алексей в строке 1, столбце 1"));
        el7.click();
        WebElement successful = driver.findElement(AppiumBy.xpath("///android.widget.TextView[@content-desc=\"Публикации\"]"));
        if (successful.isDisplayed()) {
            System.out.println("Opening any photo was successful");
        } else {
            System.out.println("Opening any photo did not open");
        }
        final WebElement finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        WebElement start = new Point(541, 1837);
        WebElement end = new Point (555, 910);
        WebElement swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        WebElement move = driver.findElement(AppiumBy.xpath("(//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/row_feed_photo_imageview\"])[2]/android.widget.ImageView"));
        if (move.isDisplayed()) {
            System.out.println("Moving down was successful");
        } else {
            System.out.println("Move down failed");
        }
        final WebElement finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        WebElement start = new Point(533, 1696);
        WebElement end = new Point (533, 1400);
        WebElement swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        WebElement move2 = driver.findElement(AppiumBy.xpath("(//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/row_feed_photo_imageview\"])[2]/android.widget.ImageView"));
        if (move2.isDisplayed()) {
            System.out.println("Moving down was successful");
        } else {
            System.out.println("Move down failed");
        }
        final WebElement finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        WebElement start = new Point(609, 1406);
        WebElement end = new Point (598, 1061);
        WebElement swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        WebElement move3 = driver.findElement(AppiumBy.xpath("(//android.widget.FrameLayout[@resource-id=\"com.instagram.android:id/row_feed_photo_imageview\"])[2]/android.widget.ImageView"));
        if (move3.isDisplayed()) {
            System.out.println("Moving down was successful");
        } else {
            System.out.println("Move down failed");
        }
        final WebElement finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        WebElement start = new Point(827, 1077);
        WebElement end = new Point (358, 1126);
        WebElement swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        WebElement two = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"2/2\"]"));
        if (two.isDisplayed()) {
            System.out.println("Viewing the second photo was successful");
        } else {
            System.out.println("Viewing the second photo failed");
        }
        WebElement el8 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Нравится\"])[1]"));
        el8.click();
        WebElement from = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Фото 2 из 2 от Алексей, Нравится: 36\"]"));
        if (from.isDisplayed()) {
            System.out.println("Changing the color of the like button was successful");
        } else {
            System.out.println("Changing the color of the like button failed");
        }
        WebElement el9 = driver.findElement(AppiumBy.accessibilityId("Дом"));
        el9.click();
        WebElement house3 = driver.findElement(AppiumBy.accessibilityId("Дом"));
        if (house3.isDisplayed()) {
            System.out.println("Return to home page successful");
        } else {
            System.out.println("Return to home page failed");
        }
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}