package ui.selenide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.selenide.pages.Articles;
import ui.selenide.pages.PagePost;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;
import static ui.settings.Config.getSetting;

//todo add tests
public class ArticlesTest {

    private Articles articles;
    private PagePost pagePost;

    @BeforeMethod
    public void articlesBefore() {
        open(getSetting("mainURL"));
        articles = page(Articles.class);
        pagePost = page(PagePost.class);
    }

    @Test
    public void feedbackPageTest() {
        articles.clickOnArticle("Разрабатывайте системы с открытой архитектурой"); //todo add random
        pagePost.clickCommentsText();
    }

    @AfterClass
    void afterClass() {
        closeWindow();
    }
}