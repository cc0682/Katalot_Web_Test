import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bugbounty.test.att.com/')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bugbounty.att.com/')

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/a_Program Guidelines'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/a_Program Exclusions'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/p_Back to top'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/a_Awarding Process'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/a_Frequently Asked Questions'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/p_How can I increase my chances of getting _a6ce5d'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/p_You fixed my bug...wheres my bounty'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/span_Reporting Process'))

WebUI.click(findTestObject('Object Repository/Page_ATT Bug Bounty - Welcome/a_Back to top'))

WebUI.closeBrowser()

