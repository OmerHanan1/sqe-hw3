/* @provengo summon selenium */

const admin = {username: 'admin', password: 'Admin1!!'},
const student = {username: 'student', password: 'Student1!!'},

/**
 * This story opens a new browser window, goes to google.com, and searches for a pizza.
 */
story('Student fills out a question with multiple choices, chooses two answers.', function () {
  let s = new SeleniumSession().start('http://127.0.0.1/')
  s.goToLoginPage()
  s.writeLoginData({username:admin.username, password:admin.password})
  s.goToCourses()
  s.goToTestCourse()
  s.goToTestQuiz()
})

/**
 *
 */
//story('Teacher changes question type to single answer.', function () {
//  let s = new SeleniumSession().start('http://127.0.0.1/')
//  s.goToLoginPage()
//  s.writeLoginData({username:student.username, password:student.password})
//  s.goToCourse({quizURL:QUIZ_URL})
//})
