// Use a specific Firefox profile
FirefoxProfileManager profileManager = new FirefoxProfileManager();
FirefoxProfile profile = profileManager.GetProfile("HARDDISKUSER");
IWebDriver driver = new FirefoxDriver(profile);
// Set a HTTP proxy Firefox
FirefoxProfile firefoxProfile = new FirefoxProfile();
firefoxProfile.SetPreference("network.proxy.type", 1);
firefoxProfile.SetPreference("network.proxy.http", "myproxy.com");
firefoxProfile.SetPreference("network.proxy.http_port", 3239);
IWebDriver driver = new FirefoxDriver(firefoxProfile);
// Set a HTTP proxy Chrome
ChromeOptions options = new ChromeOptions();
var proxy = new Proxy();
proxy.Kind = ProxyKind.Manual;
proxy.IsAutoDetect = false;
proxy.HttpProxy =
proxy.SslProxy = "127.0.0.1:3239";
options.Proxy = proxy;
options.AddArgument("ignore-certificate-errors");

IWebDriver driver = new ChromeDriver(options);
// Accept all certificates Firefox
FirefoxProfile firefoxProfile = new FirefoxProfile();
firefoxProfile.AcceptUntrustedCertificates = true;
firefoxProfile.AssumeUntrustedCertificateIssuer = false;
IWebDriver driver = new FirefoxDriver(firefoxProfile);
// Accept all certificates Chrome
DesiredCapabilities capability = DesiredCapabilities.Chrome();
Environment.SetEnvironmentVariable("webdriver.chrome.driver", "C:PathToChromeDriver.exe");
capability.SetCapability(CapabilityType.AcceptSslCertificates, true);
IWebDriver driver = new RemoteWebDriver(capability);
// Set Chrome options.
ChromeOptions options = new ChromeOptions();
DesiredCapabilities dc = DesiredCapabilities.Chrome();
dc.SetCapability(ChromeOptions.Capability, options);
IWebDriver driver = new RemoteWebDriver(dc);
// Turn off the JavaScript Firefox
FirefoxProfileManager profileManager = new FirefoxProfileManager();
FirefoxProfile profile = profileManager.GetProfile("HARDDISKUSER");
profile.SetPreference("javascript.enabled", false);
IWebDriver driver = new FirefoxDriver(profile);
// Set the default page load timeout
driver.Manage().Timeouts().SetPageLoadTimeout(new TimeSpan(10));
// Start Firefox with plugins
FirefoxProfile profile = new FirefoxProfile();
profile.AddExtension(@"C:extensionsLocationextension.xpi");
IWebDriver driver = new FirefoxDriver(profile);
// Start Chrome with an unpacked extension
ChromeOptions options = new ChromeOptions();
options.AddArguments("load-extension=/pathTo/extension");
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.SetCapability(ChromeOptions.Capability, options);
DesiredCapabilities dc = DesiredCapabilities.Chrome();
dc.SetCapability(ChromeOptions.Capability, options);
IWebDriver driver = new RemoteWebDriver(dc);
// Start Chrome with a packed extension
ChromeOptions options = new ChromeOptions();
options.AddExtension(Path.GetFullPath("localpathto/extension.crx"));
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.SetCapability(ChromeOptions.Capability, options);
DesiredCapabilities dc = DesiredCapabilities.Chrome();
dc.SetCapability(ChromeOptions.Capability, options);
IWebDriver driver = new RemoteWebDriver(dc);
// Change the default files’ save location
String downloadFolderPath = @"c:temp";
FirefoxProfile profile = new FirefoxProfile();
profile.SetPreference("browser.download.folderList", 2);
profile.SetPreference("browser.download.dir", downloadFolderPath);
profile.SetPreference("browser.download.manager.alertOnEXEOpen", false);
profile.SetPreference("browser.helperApps.neverAsk.saveToDisk",
"application/msword, application/binary, application/ris, text/csv, image/png, application/pdf,
text/html, text/plain, application/zip, application/x-zip, application/x-zip-compressed, application/download,
application/octet-stream");
this.driver = new FirefoxDriver(profile);
