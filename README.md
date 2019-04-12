# WunderMobility_MobileAppTest

# Mobile automation testing framework (Android) - using Selenium and testng tests.

# System Requirements:

 [Appium]                                   Latest version of appium 1.6.5
 
 [Selenium WebDriver jar]                   Import all the dependencies through Maven for selenium
 
 [Android studio]                            Latest version of Android studio 3.2
 
 [UI automator]                              Tool used to capture the webelements from mobile devices. 
 
                                                    1.Once Android SDK installed, navigate to link:
                                                    
                                                        c:\users\<username>\AppData\Local\Android\sdk\tools 

                                                    2.Notice a batch file with name:

                                                         uiautomatorviewer.bat
                      
                                                    3.Enable "developer" options on your device
                                                    4.Connect android device to PC via USB cable
                                                    5.select app from applications.
                      
 
 [Eclipse]                                 Download Eclipse to create automation scripts.
 
 [Vysor]                                   Vysor can use as an emulator on a physical device.
 
 [testNG]                                  TestNG framework to provide more annotations and reporting purpose.
 
 [Android apk]                             selendroid-test-app-0.17.0.apk




# Framework with testng tests setup and execution:

 - Created 2 automation test scripts under 'TestCase_MobileAutomation' class:
 
   1.StartRegistration
   
   2.WebViewInteraction

- Report will be generated under 'Test-output' folder-> emailable-report.html.

- Can execute the testng.xml file to run the code.

- pom.xml file is present in base directory which has all the required dependencies.

# How to execute a test 

1. Connect the  real android mobile device through USB cable through vysor emulator to laptop.
2. Open Appium server and add apk application path.
3. Run the appium server
4. Open Eclipse -> Make sure all capablities added in the code.
                   1.Device name
                   2.Platform version
                   3.platform name
                   4.application package
                   5.application activity
 5.Run the testNG.XML
 6.After execution make sure test case pass/fail result should be capture in HTML report.
                   



