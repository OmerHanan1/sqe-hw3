/* @Provengo summon selenium */

/**
 *  The ComposeQuery event defines the selenium actions for writing the query that was given in the parameter e.
 */
defineEvent(SeleniumSession, "GoToLoginPage", function(session, e) {
    session.click("//a[contains(text(),'Log in')]")
})

defineEvent(SeleniumSession, "WriteLoginData", function(session, e) {
    session.writeText("//input[@id='username']", e.username)
    session.writeText("//input[@id='password']", e.password)
    session.click("//button[@id='loginbtn']")
})

defineEvent(SeleniumSession, "GoToCourses", function(session, e) {
    session.click("//a[contains(text(),'My courses')]")
})

defineEvent(SeleniumSession, "GoToTestCourse", function(session, e) {
    session.click("//span[contains(text(),'testCourse')]")
})

defineEvent(SeleniumSession, "GoToTestQuiz", function(session, e) {
    session.click("//a[@id='yui_3_17_2_1_1674064360200_63']")
})