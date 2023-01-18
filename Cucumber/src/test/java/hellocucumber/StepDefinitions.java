package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class StepDefinitions {

    private String TEACHER_USERNAME = "admin";
    private String TEACHER_PASSWORD = "Admin1!!";
    private String STUDENT_USERNAME = "student";
    private String STUDENT_PASSWORD = "Student1!!";
    private static List<MoodleActuator> allMoodles;
    private static MoodleActuator moodle;
    private String webDriver = "webdriver.chrome.driver";
    private String path = "C:\\University\\Year C\\Semester A\\qa_course\\assignment3\\sqe-hw3\\Selenium\\chromedriver.exe";
    public void moodleInit() {
        System.out.println("--------------- INITIALIZING MOODLE TEST - OPENING WEBPAGE ---------------");
        if(allMoodles == null){
            allMoodles = new ArrayList<>();
        }
        moodle = new MoodleActuator();
        allMoodles.add(moodle);
        moodle.initSession(webDriver, path);
    }

    @Given("user is on homepage")
    public void userIsOnHomepage() {
        moodleInit();
    }

    @When("student is logging in")
    public void studentIsLoggingIn() {
        moodle.login(STUDENT_USERNAME, STUDENT_PASSWORD);
    }

    @When("admin is logging in")
    public void adminIsLoggingIn() {
        moodle.login(TEACHER_USERNAME, TEACHER_PASSWORD);
    }

    @And("user navigate to the quiz page")
    public void userNavigateToTheQuizPage() throws InterruptedException {
        moodle.navigateToQuiz();
    }

    @And("user select the quiz")
    public void userSelectTheQuiz() {
        moodle.selectQuiz();
    }

    @And("user answer the question")
    public void userAnswerTheQuestion() {
        
    }

    @And("user submit the answer")
    public void userSubmitTheAnswer() {
    }

    @And("user edit the quiz question type")
    public void userEditTheQuizQuestionType() {

    }

    @And("user save the quiz")
    public void userSaveTheQuiz() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Then("message displayed submit successfully")
    public void messageDisplayedSubmitSuccessfully() {
        
    }

    @Then("message displayed save successfully")
    public void messageDisplayedSaveSuccessfully() {
    }
}
