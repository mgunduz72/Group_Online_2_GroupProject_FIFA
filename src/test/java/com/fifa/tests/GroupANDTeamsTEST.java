package com.fifa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fifa.pages.GroupsPage;

public class GroupANDTeamsTEST extends TestBase {
	
	@Test(priority = 1, groups= {"smoke"})
	public void checkGroupG() {
		GroupsPage g = new GroupsPage();
		g.groupIcon.click();
		 assertTrue(g.groupGicon.isDisplayed());
		 Boolean b =g.groupGicon.isDisplayed();
		 
		g.groupGicon.click();
		assertEquals(g.Belg.getText(), "Belgium");
		assertEquals(g.Engl.getText(), "England");
		assertEquals(g.Tuns.getText(), "Tunisia");
		assertEquals(g.Pana.getText(), "Panama");
	
		}
	@Test(priority = 2, groups= {"smoke"})
	public void checkAllTeam() {
		GroupsPage g = new GroupsPage();
		g.teamMain.click();
		assertEquals(g.allTeam.size(), 32);
		assertFalse(g.Belg.isDisplayed());
		
		
		
	}
}
