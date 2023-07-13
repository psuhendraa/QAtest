class LoginSteps {
    @Given("User navigates to login page")
    def navigateToLoginPage() {
        println ("\n I am inside navigateToLoginPage")
        WebUI.openBrowser('')
        WebUI.navigateToUrl('https://https://www.bareksa.com/id/member/login')
    }
    @When("User enters (.*) and (.*)")
    def enterCredentials(String email, String password) {
        println ("\n I am inside enterCredentials")
        println ("Username : "+username)
        printl ("Password : "+password)

        WebUI.setText(findTestObject('Object Repository/Page_Bareksa/input_LOGIN Panel_txtUsername'), username)
        WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bareksa/input_Username_txtPassword'), 'iAN9t1dNXG5Iv2tb19Zyjw==')
    }
    @And ("Click on login button")
    def clickLogin() {
        println ("\n I am inside clickLogin")

        WebUI.click(findTestObject('Object Repository/Page_Bareksa/input_Password_Submit'))
    }
    @Then ("User is navigated to homepage Bareksa")
    def verifyHomePage() {
        println ("\n I am inside home page")

        WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Bareksa/portofolio'))
        WebUI.closerBrowser()
    }
}
