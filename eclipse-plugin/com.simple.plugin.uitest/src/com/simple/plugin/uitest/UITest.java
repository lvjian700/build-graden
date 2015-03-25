package com.simple.plugin.uitest;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class UITest {

	 
		private static SWTWorkbenchBot	bot;
	 
		@BeforeClass
		public static void beforeClass() throws Exception {
			Thread.sleep(2000);
			bot = new SWTWorkbenchBot();
			bot.viewByTitle("Welcome").close();
		}
	 
	 
		@Test
		public void canCreateANewJavaProject() throws Exception {
			bot.menu("File").menu("New").menu("Project...").click();
		}
	 
	 
		@AfterClass
		public static void sleep() {
			bot.sleep(2000);
		}
}
