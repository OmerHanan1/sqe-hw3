/* @Provengo summon selenium */

/**
 *  STUDENT & ADMIN
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
    session.click("//li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
})

defineEvent(SeleniumSession, "StartQuiz", function(session, e) {
    session.click("//form[1]/button[1]")
})


/**
 *  STUDENT
 */
defineEvent(SeleniumSession, "MarkTwoAnswersInQuiz", function(session, e) {
    session.click("//div[1]/div[1]/input[2]")
    session.click("//div[2]/input[2]")
})

defineEvent(SeleniumSession, "SubmitQuiz", function(session, e) {
    session.click("//form[1]/div[1]/div[2]/input[1]")
    session.click("//div[5]/div[1]/div[1]/form[1]/button[1]")
    session.click("//div[6]/div[3]/div/div[2]/div/div[2]/input[1]")
})

/**
 *  ADMIN
 */
defineEvent(SeleniumSession, "EditQuestion", function(session, e) {
    session.click("//div[4]/a[1]")
})

defineEvent(SeleniumSession, "ChangeToOneAnswer", function(session, e) {
    session.click("//div[9]/div[2]/select[1]")
    session.click("//div[3]/div[4]/div/div[3]/div/section/div[2]/form/fieldset[1]/div[2]/div[9]/div[2]/select/option[2]")
})

defineEvent(SeleniumSession, "ChangeAnswersWeight", function(session, e) {
    session.click("//div[2]/div[2]/select[1]")
    session.click("//div[3]/div[4]/div/div[3]/div/section/div[2]/form/fieldset[2]/div[2]/div[2]/div[2]/select/option[2]")
    session.click("//fieldset[2]/div[2]/div[5]/div[2]/select[1]")
    session.click("//div[3]/div[4]/div/div[3]/div/section/div[2]/form/fieldset[2]/div[2]/div[5]/div[2]/select/option[1]")
})

defineEvent(SeleniumSession, "SubmitChanges", function(session, e) {
    session.click("//div[4]/div[2]/fieldset[1]/div[1]/div[1]/span[1]/input[1]")
})

