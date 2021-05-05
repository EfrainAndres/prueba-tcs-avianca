package co.com.aviancareservation.elements;

import org.openqa.selenium.By;

public class SelectOptions {
    public static By CLIC_TAB = By.id("reservatuvuelo");
    public static By CLIC_ONE_WAY = By.linkText("Solo ida");
    public static By CLIC_SINCE = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[1]/div/label/div/input[1]");
    public static By CLIC_UNTIL = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[3]/div[2]/label/div/input[1]");
    public static By CLIC_CALENDAR = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[1]/label/div/input[1]");
    public static By SELECT_DATE = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[3]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[2]/td[3]/div");
    public static By CLIC_PASSENGER = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[1]/label/div/input");
    public static By SELECT_ADULTS = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[2]/div[2]/div[3]");
    public static By SELECT_KIDS = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[3]/div[2]/div[3]");
    public static By SELECT_BABIES = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[4]/div[2]/div[3]");
    public static By CLIC_BUTTON = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[3]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[4]/button");
}
