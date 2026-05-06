package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage {
@FindBy(id = "Project_listView_basicAction_LBL_ADD_RECORD")
private WebElement addProjectBtn;


@FindBy(id = "PageJump")
private WebElement pageJumpBtn;

@FindBy(id = "Project_basicAction_LBL_IMPORT")
private WebElement importBtn;

}
