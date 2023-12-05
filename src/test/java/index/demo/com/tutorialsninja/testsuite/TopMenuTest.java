package index.demo.com.tutorialsninja.testsuite;

import index.demo.com.tutorialsninja.pages.ComponentsPage;
import index.demo.com.tutorialsninja.pages.DeskTopPage;
import index.demo.com.tutorialsninja.pages.HomePage;
import index.demo.com.tutorialsninja.pages.LaptopAndNoteBookPage;
import index.demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    DeskTopPage desktopPage = new DeskTopPage();
    LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        //click on desktop dropdown
        Thread.sleep(5000);
        homePage.mouseHoverAndClickOnDesktop();
        //select show all desktops
        homePage.selectMenu("Show All Desktops");
        Thread.sleep(5000);
        String expectedDesktop = "Desktops";
        String actualDesktop = desktopPage.getDesktopText();
        //verify if user is navigated to the correct page
        Assert.assertEquals(actualDesktop, expectedDesktop, "Desktop not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //click on laptops and notebooks dropdown
        homePage.mouseHoverAndClickOnLaptopsAndNotebooks();
        //select show all laptops and notebooks
        homePage.selectMenu("Show All Laptops & Notebooks");
        String expectedLaptopsAndNotebooks = "Laptops & Notebooks";
        String actualLaptopsAndNotebooks = laptopAndNoteBookPage.getLaptopAndNoteBookText();
        //verify if user is navigated to the correct page
        Assert.assertEquals(actualLaptopsAndNotebooks, expectedLaptopsAndNotebooks, "Laptops And Notebooks not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //click on components dropdown
        homePage.mouseHoverAndClickOnComponents();
        //select show all components
        homePage.selectMenu("Show All Components");
        String expectedComponents = "Components";
        String actualComponents = componentsPage.getComponentsText();
        //verify if user is navigated to the correct page
        Assert.assertEquals(actualComponents, expectedComponents, "Components Page not displayed");
    }

}
