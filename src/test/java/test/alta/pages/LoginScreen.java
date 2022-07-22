package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By lupaPasswordButton(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Lupa Password?\"]");
    }

    private By lupaPasswordEmailField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText\n");
    }

    private By lanjutButton(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Lanjut\"]\n");
    }

    private By newPasswordField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]\n");
    }

    private By resetPasswordConfirmButton1(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Confrim\"]\n");
    }

    private By resetPasswordConfirmButton2(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Confrim\"]\n");
    }

    @Step
    public boolean isOnLoginPage(){
        return waitUntilVisible(lupaPasswordButton()).isDisplayed();
    }

    @Step
    public void clickLupaPasswordButton(){
        onClick(lupaPasswordButton());
    }

    @Step
    public void inputEmail(String email){
        onType(lupaPasswordEmailField(), email);
    }

    @Step
    public void clickLanjutButton(){
        onClick(lanjutButton());
    }

    @Step
    public void insertNewPassword(String password){
        onType(newPasswordField(), password);
    }

    @Step
    public void clickConfirmbuttonOne(){
        onClick(resetPasswordConfirmButton1());
    }

    @Step
    public void clickConfirmButtonTwo(){
        onClick(resetPasswordConfirmButton2());
    }




}
