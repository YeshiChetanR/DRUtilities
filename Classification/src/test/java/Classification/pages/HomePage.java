package Classification.pages;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage extends Page{

	public static By rhassociateButton = By.id("newRHAssociate");
	public static By rhassociateDropdown = By.xpath("//div[@class='dropdown pull-right dropdown-kebab-pf']//button[@id='rha-associates-dropdown']");
	public static By takeOwnershipOption = By.xpath("//a[@id='takeOwnership']");
	public static By caseOwnerLocator = By.xpath("//div[text()='Owner']/parent::td/parent::tr/td/span/span/a");
	public static By caseProduct = By.xpath("//a[@id='caseProduct']");
	public static By caseVersion = By.xpath("//a[@id='productVersion']");
	public static By caseSeverity = By.xpath("//a[@id='caseSeverity']");
	public static By caseStatus = By.xpath("//a[@id='caseStatus']");
	public static By caseInternalStatus = By.xpath("//a[@id='caseInternalStatus']");
	public static By discussionsTab = By.xpath("(//span[contains(.,'Discussion')])");
	public static By bomgarButton = By.xpath("//button[contains(.,'Initiate Bomgar')]");
	//public static By commentTextArea = By.xpath("//textarea[@id='case-comment-box']");
	public static By commentTextArea = By.xpath("//div[@class=\"markdown-content\"]/textarea");
	public static By privateCommentTextBox = By.xpath("//div[@class='col-md-12']//div//textarea[@id='case-comment-box']");
	public static By postCommentButton = By.xpath("//button[@type=\"button\" and @class=\"margin-right-medium btn btn-primary\"]");
	public static By privatePostCommentButton = By.xpath("(//button[contains(.,'Post')])[2]");
	public static By cancelCommentButton = By.xpath("//button[contains(.,'Cancel')]");
	public static By commentSuccessMessage =  By.xpath("//div[contains(.,'Comment Updated Successfully.')]");
	public static By statusCombo = By.xpath("//div[@class='Select-input']/input");
	public static By internalStatusCombo = By.xpath("//span[@id='react-select-3--value-item']/parent::div/parent::span/div[@class='Select-input']/input");
	public static By makePrivateRadio = By.xpath("//div[@class='margin-top-medium']//label[2]//input[1]");
	public static By publicCommentLabel = By.xpath("//div[@class='row']/div[@class='col-xs-12']/div/div[1]/div[1]/pre[1]");
	public static By privateCommentLabel = By.xpath("//span[@id='textPrivateCaseNote']/parent::h4/parent::div/div/pre/span");
	public static By sbtNotUpdatedCommentLabel = By.xpath("//span[text()='SBT Not Updated']/parent::div/pre/span");
	public static By doNotUpdateSBTRadio = By.xpath("//label[@class='checkbox-inline margin-right-small']//input[@type='checkbox']");
	public static By editActionPlanLink = By.xpath("//a[@id='action-plan-edit-btn']");
	public static By editCaseSummaryLink = By.xpath("//a[@id='edit-case-next-steps']");
	public static By nextStepsTab = By.xpath("//span[contains(., 'Next Steps')]");
	public static By postActionPlan = By.xpath("//pre[@id='Action-Plan-write-edit-box']");
	public static By submitAP = By.xpath("//div[@class='editable-buttons m-l-0 btn-group']//button[@type='submit']");
	public static By actionPlanText = By.xpath("//pre[text()= 'This is test Action Plan']");
//	public static By postCaseSummary = By.xpath("//pre[contains(.,'Edit to add a Summary')]");
	public static By postCaseSummary = By.xpath("//pre[@id='pre-case-next-steps']");
//	public static By submitCS = By.xpath("(//button[@class='editable-submit btn btn-primary'])[2]");
//	public static By caseSummaryText = By.xpath("//pre[@class='f1o4q35m']");

	//public static By caseSummaryText = By.xpath("//pre[@class='xeditable-pre is-private not']");

	public static By caseRefresh =By.xpath("//a[@id='customer-details-main-refresh-button']");
	public static By caseSummaryText = By.xpath("//pre[contains(@id , 'case-next-steps-read')]");

	public static By caselockswitch = By.xpath("//span[contains(@class,'case-lock-switch')]/span");
	public static By sbtLabel = By.xpath("//div[@class='progress-bar progress-bar-success']");
	public static By lockedUser = By.xpath("//div/span/span/span/span/span/span/a");
	public static By ftsViewButton = By.xpath("//span[contains(.,'24x7 View')]");
	public static By updateFTSSearchButton = By.xpath("//div[@class='col-md-2']/button[1]");
	public static By taskActionsDropdown = By.xpath("//button[contains(.,'Task Actions ')]");
	public static By closeCaseOption = By.xpath("//a[contains(text(),'Close Case')]");
	public static By resolutionAlertMessage = By.xpath("//span[contains(.,'Please select a resolution while closing the case')]");
	public static By cancelResolutionAlertButton = By.xpath("//button[contains(.,'Cancel')]");
	public static By attachFilePane = By.xpath("//a[@id='add-comment-tabs-tab-2']");
	public static By custom =By.xpath("//div[@class='card-pf-body p-y-3']");
	public static By attachFilesButton = By.xpath("//button[contains(.,'Attach Files')]");
	public static By uploadFileButton = By.xpath("//button[contains(.,'Upload')]");
	public static By attachmentSuccessMessage = By.xpath("//div[@class='noty_body']");
	public static By newMessage = By.xpath("(//div[@class=\"bg padding-medium\"]/pre/span)[1]");
	public static By commentSucces = By.xpath("//span[@id='textMessage']/parent::h4/parent::div/pre/span");
	public static By genesysLogo = By.xpath("//img[@id='genesysLogo']");
	public static By genesysFrame = By.xpath("//iframe[@id= 'genesysFrame']");
	public static By actionPlanShowMore = By.xpath("//a[@id='action-plan-showmore-btn']");
	public static By caseSummaryShowMore = By.xpath("//a[@id='show-more-case-next-steps']");
	public static By taskActionsButton = By.xpath("//button[@id='case-actions']");
	public static By createSolution = By.xpath("//a[contains(text(),'Create Solution')]");
	public static By solutionTitleDrag = By.xpath("//span[@class='text-primary cursor-pointer']//i[@class='pficon pficon-folder-close f1syh9yw']");
	public static By solutionTitleText = By.xpath("//input[@id='solution-edit-title-input']");
	public static By solutionSubmit = By.xpath("//div//div//div[@class='solution-popover-buttons flex flex-start m-b-3']//div//button[2]");
	public static By soluCreateSuccessMessage = By.xpath("//div[@class='noty_body']");
	public static By successMessageContents = By.xpath("//div[@class='noty_body']");
	public static By initiateBomgar = By.xpath("//button[@id='Add-Comment-initiate-bomgar']");
	public static By bomgarConfirmPopup = By.xpath("//div[@role='dialog']");
	public static By bomgarSessionCancel = By.xpath("//div[@class='modal-footer']/button[text()='Cancel']");
	public static By confirmBomgarSession = By.xpath("//div[contains(@class,'swal2-buttonswrapper')]/button[text()='Yes!']");
	public static By bomgarInitiatedPopup = By.xpath("//h4[@class='modal-title']");
	public static By clickOnOK = By.xpath("//div[@class='modal-footer']//button[@type='button'][contains(text(),'Initiate')]");
	public static By bomgarComment = By.xpath("//div[@class='col-md-8']//a[@target='_blank']");
	public static By helpButton = By.xpath("//li/a[contains(@href, 'https://mojo.redhat.com/docs/DOC-1070872')]");
	public static By pcmButton = By.xpath("//div/a[contains(@href, '/support/cases/')]");
	public static By sfdcButton = By.xpath("//div/a[contains(@href, 'https://gss--qa.cs60.my.salesforce.com/apex/Case_View?sbstr=')]");
	public static By fooBarButton = By.xpath("//div/a[contains(@href, 'https://foobar.gsslab.')]");
	public static By takeOwnershipButton = By.id("takeOwnershipTopButton");
	public static By knowledgeResourcesTab = By.xpath("//a[@id='testOnclickknowledge']//span[@id='display']");
	public static By linkedSolution = By.xpath("//div[contains(@id, '_div')]/div/div/a[text()='This is test solution']");
	public static By unlinkTheSolution = By.xpath("//a[contains(., 'Unlink')]");
	public static By alertMessageForLinkedResources = By.xpath("//div[@class='alert alert-warning']");
	public static By caseStatusPicklist = By.id("caseStatus");
	public static By caseInternalStatusPicklist = By.xpath("//a[@id='caseInternalStatus']");
	public static By caseProductPicklist = By.xpath("//a[@id='caseProduct']");
	public static By productVersionPicklist = By.xpath("//a[@id='productVersion']");
	public static By problemStatement = By.xpath("//a[contains(@id,'editable-subject')]");
	public static By editProblemStatement = By.xpath("//input[@id='input-editable-subject']");
	public static By submitProblemStatement = By.id("submit-editable-subject");
	public static By editableSubjectPicklist = By.id("editable-subject");
	public static By caseStatusSubmitButton = By.xpath("//div[@class='editable-buttons btn-group']//button[@type='submit']");
	public static By sbtLabelOnCasePage = By.xpath("//div[@class='row-cards-pf d-flex flex-wrap row']/div[3]/div[1]/div[2]/div[2]");
	public static By alertMessage = By.xpath("//div[@class='noty_body']");
	public static By overviewTab = By.xpath("//a[@id='testOnclickoverview']//span[@id='display']");
	public static By overviewTabClose = By.xpath("//div[@id='section-overview']//span[@class='fa fa-angle-right fa-angle-down']");
	public static By paneInternalStatusLabel = By.xpath("//div[@class='additional-info-wrapper']/div[2]");
	public static By newNEPButton = By.xpath("//button[contains(.,'New NEP')]");
	public static By caseFTSFlag = By.xpath("//span[contains(text(),'24x7 Coverage')]");
	public static By makeMeFTSOption = By.xpath("//a[contains(.,'Add me as FTS')]");
	public static By commentCharacterCounter = By.xpath("//span[contains(@class, 'character-counter text')]");
	public static By attachmentNameLink = By.xpath("//div//div//div//div//div//div//div//a[@target='_blank']//span[3]");
	public static By createdByName = By.xpath("//div[@id='value-createdBy']");
	public static By casePin = By.xpath("//span/button[contains(@class, 'case-pin')]");
	public static By pinnedCaseInPriorityTask = By.xpath("//a//div[@class='case-pinned-label']");
	public static By accountTab = By.xpath("//span[contains(.,'Account')]");
	public static By accountName = By.xpath("//div[@id='value-account-name']");
	public static By accountNumber = By.xpath("//div[@id='value-account-number']");
	public static By contactName = By.xpath("//div[@id='case-contact-value']/span/a/span/span");
	public static By openConfigureFieldsDialog = By.xpath("//a/span[@id='configure-fields']");
	public static By configureFieldDialog = By.xpath("//div[@class='modal-dialog']");
	public static By availableItemsStatus = By.xpath("//div[@id='available-items']/div[text()='Priority Score']");
	public static By selectedItemsList = By.xpath("//div[@id='selected-items']//div[@class='drag-select-drop-zone-item flex-one'][contains(text(),'Drop stuff here')]");
	public static By saveFieldConfiguration = By.xpath("//button[contains(text(),'Save')]");
	public static By cancelFieldConfiguration = By.xpath("//button/span[text()='Close']");
	public static By checkFieldIsConfigured = By.xpath("//div[contains(text(), 'Account Name')]/parent::div/parent::div/div/div[contains(text(), 'Priority Score')]");	    
	public static By createSolutionButton = By.xpath("//button[@id='knowledge-resources-create-solution-button']");
	public static By markIsExact = By.xpath("//a[contains(. , 'Mark as Exact')]");
	public static By unmarkAsExact = By.xpath("//a[contains(. , 'Unmark as Exact')]");
	public static By kcsSearchBox = By.xpath("//span[contains(@class, 'input-group')]/input[@placeholder='Enter search query']");
	public static By kcsSearchButton = By.xpath("//*[text()='Search']");
	public static By searchedKcsSolution = By.xpath("//span/a[contains(@href, '#/solution/')]");
	public static By searchedKcsArticle = By.xpath("//span/a[contains(@href, 'https://access.qa.redhat.com/articles/')]");
	public static By editSignatureLink = By.xpath("//a[@id='edit-user-signature']");
	public static By saveSignatureButton = By.xpath("//button[@id='submit-user-signature']");
	public static By signatureTextArea = By.xpath("//pre[@id='pre-user-signature']");
	public static By signatureSuccessMessage = By.xpath("//div[contains(.,'Signature Updated Successfully.')]");
	public static By doneUpdatingPreferencesButton = By.xpath("//button[contains(.,'Done Updating')]");
	public static By searchTextBox = By.xpath("//input[@placeholder='Search Cases by Number or Description']");
	public static By searchIcon = By.xpath("//button[@type='submit']");
	public static By caseSearchTableRow = By.xpath("//div[@class='rt-tr-group']");
	public static By nepIntervalTextBox = By.xpath("//input[@id='unitValueInput']");
	public static By nepSaveButton = By.xpath("//button[@id='save-update-nep']");
	public static By deleteNEPButton = By.xpath("//button[@id='delete-nep']");
	public static By searchedCaseHeader = By.xpath("//h2[@class='header m-x-1']");
	public static By addTagLink = By.xpath("//a[@id='component-tooltip-caseTags']//span[@class='fa fa-pencil']");
	public static By tagTextArea = By.xpath("//div[@class='Select-placeholder']");
	public static By tagLink = By.xpath("//a[@id='caseTags']");
	public static By soluIssueDesc = By.xpath("//div[@id='solution-edit-issue-text-area']//textarea[@placeholder='Enter Markdown Content Here...']");
	public static By soluEnvironment = By.xpath("//div[@id='solution-edit-environment-text-area']//textarea[@placeholder='Enter Markdown Content Here...']");
	public static By soluResolution = By.xpath("//div[@id='solution-edit-resolution-text-area']//textarea[@placeholder='Enter Markdown Content Here...']");
	public static By soluRootCause = By.xpath("//div[@id='solution-edit-root-cause-text-area']//textarea[@placeholder='Enter Markdown Content Here...']");
	public static By soluDiagnosticSteps = By.xpath("//div[@id='solution-edit-diagnostic-steps-text-area']//textarea[@placeholder='Enter Markdown Content Here...']");
	public static By soluPrivateNotes = By.xpath("//div[@id='solution-edit-private-notes-text-area']//textarea[@placeholder='Enter Markdown Content Here...']");
	public static By soluPrivateNotesEditPanel = By.xpath("//div/textarea[@id='solution-edit-private-notes-text-area']");
	//public static By discussionSortPickList = By.xpath("//span[text()='Newest to Oldest']");
	public static By clickCopyToClipboard = By.xpath("//div[@id='text-content-case-next-steps']//span[@class='fa fa-clipboard']");
	public static By clickCopyToClipboardActionPlan = By.id("action-plan-copytoclipboard");
	public static By editCaseSummary =By.xpath("//a[@id='edit-case-next-steps']");
	public static By discussionSortPickList = By.xpath("//span[text()='Newest to Oldest']/parent::div/parent::div/parent::div/parent::div/div[2]/div/div[2]");
	public static By commentAtNumberOne = By.xpath("//div[@class='bg padding-medium']//span[text()='0']");
	public static By ascSort = By.xpath("//input[text()='Oldest to Newest']");
	public static By descSort = By.xpath("//span[text()='Newest to Oldest']");
	public static By tagPickerArrow = By.cssSelector("span.Select-arrow-zone");
	public static By pulpTag = By.xpath("//input[@id='virtual-select-caseTags'][text()='pulp']");
	public static By caseTagsSubmitButton = By.xpath("//button[@id='submit-btn-caseTags']");
	public static By sbrLink = By.xpath("//a[@id='component-tooltip-caseSbrs']");
	public static By sbrLinkEdit = By.xpath("//a[@id='component-tooltip-caseSbrs']//span[@class='fa fa-pencil']");
	public static By sbrArrow = By.xpath("//div[@class='Select has-value is-searchable Select--multi']//span[@class='Select-arrow']");
	public static By sbrArrowEdit = By.xpath("//span[@class='Select-arrow-zone']");
	public static By sbrName = By.xpath("//div[@class='Select-option'][2]");
	public static By saveSBRbutton = By.xpath("//button[@id='submit-btn-caseSbrs']");
	public static By soluActionButton = By.xpath("//button[@id='solution-actions']");
	public static By editSolution = By.xpath("//a[@id='solution-action-edit-solution-link']");
	public static By solutionRevisionAfterEdit = By.xpath("//div[@id='solutionNavContents']/a[text()='2']");
	public static By messagesCheckbox = By.xpath("//input[@value='publicComment']");
	public static By privateCaseNoteCheckbox = By.xpath("//input[@value='privateComment']");
	public static By attachementsCheckbox = By.xpath("//input[@value='attachment']");
	public static By bugzillaCheckbox = By.xpath("//input[@value='bugzilla']");
	public static By chatTranscriptCheckBox = By.xpath("//input[@value='chatTranscript']");
	public static By bomgarSessionCheckbox = By.xpath("//input[@value='bomgar']");
	public static By caseDescCheckbox = By.xpath("//input[@value='caseDescription']");
	public static By jiraCheckbox = By.xpath("//input[@value='Jira']");
	public static By serviceNowCheckbox = By.xpath("//input[@value='ServiceNow']");
	public static By microsoftCheckbox = By.xpath("//input[@value='Microsoft']");
	public static By caseDescription = By.xpath("//h4[text()='Case Description']");
	public static By historyTab = By.xpath("(//span[contains(.,'History')])[1]");
	public static By historyHeader = By.xpath("//h3[contains(.,' Case History')]");
	public static By firstHistoryLine = By.xpath("//div[@class='panel-body']/div/div[@class='row'][1]/div[2]/span");
	public static By yourRolesButton = By.xpath("//span[contains(.,'Your Roles')]");
	//public static By roleName = By.xpath("//span[text()='Your Roles']/parent::span/parent::a/parent::li/div/div[@class='task']/a");
	public static By roleName = By.xpath("(//li[@class='list-group-item sidebar-li'])[8]/div/div");
	public static By myOverviewButton = By.xpath("//span[contains(.,'My Overview')]");
	public static By ownedCaseHeader = By.xpath("//h2[contains(.,'Owned Cases')]");
	public static By rolesInMyOverview = By.xpath("//div[@class='card-pf-heading']/h2");
	public static By searchedResourceID = By.xpath("//i[@class='pficon pficon-key']/parent::span/span[2]");
	public static By additionalFiltersButton = By.xpath("//button[contains(.,'Additional Filters')]");
	public static By resourceSourceSelector = By.xpath("//div[@class='Select-control']/span/div[@class='Select-input']/input");
	public static By videosOption = By.xpath("//div[text()='Videos']");
	public static By applyFiltersButton = By.xpath("//button[contains(.,'Apply Filters')]");
	public static By searchedSolutionStatus = By.xpath("//a[text()='Link']/parent::span/parent::div/span[2]");
	public static By linkedSolutionStatus = By.xpath("//a[text()='Unlink']/parent::div/span[3]");
	public static By clearKCSSearchButton = By.xpath("//input[@placeholder='Enter search query']/parent::span/span/button");
	public static By cqiOption = By.xpath("//a[contains(text(),'Review')]");
	public static By cqiReviewer =  By.xpath("//div[@id='case-reviews-section']//a[text()='Kunal, Bipin']");
	public static By chatterTab = By.xpath("//span[contains(text(),'Chatter')]");
	public static By reviewerCase =By.xpath("(//h4[text()='cqi']//following-sibling::div//span[@class='caseLink'])[1]");
	public static By solutionAction = By.xpath("//button[contains(.,'Actions ')]");
	public static By sqiOption =By.xpath("//a[contains(.,'Review (SQI)')]");
	public static By sqiReviewer =  By.xpath("(//div[contains(.,'review')]//a[text()='Kunal, Bipin'])[1]");
	public static By reviewerSolution =By.xpath("(//h4[text()='sqi']//following-sibling::div//span[@class='caseLink'])[1]");
	public static By changeCaseStatusWithCommentPickList = By.xpath("(//span[@class=\"margin-left-medium\"]/div/div/div)[1]");
	public static By changeIntCaseStatusWithCommentPickList = By.xpath("(//span[@class=\"margin-left-medium\"]/div/div/div)[2]");
	public static By changeResolution = By.xpath("//div[@class=\"Select comment-select is-clearable is-searchable Select--single\"]"); 
	public static By replyToCommentLink = By.xpath("//a[contains(text(),'Reply')]");
	public static By privateComment = By.xpath("//span[@id='textPrivateCaseNote']");
	public static By publicCommentLinkLabel = By.xpath("//div[@class='col-xs-12']/div/div[1]/div[1]/pre[1]/span[1]");
	public static By privateCaseNoteLabel =By.xpath("//span[@id=\"textPrivateCaseNote\"]");
	public static By privateCommentEditButton = By.xpath("//span[@class='glyphicon glyphicon-pencil']");
	public static By privateToPublicCheckBox = By.xpath("//div[@class='list-group-item-container list-item-container']//div//div[@class='row']//div//div[@class='row']//div[@class='margin-top-medium']//label[1]//input[1]");
	public static By privateToPublicCommentPostButton = By.xpath("//button[@type=\"button\" and contains(text(),'Post')]");
	public static By newCaseStatusWithCommentPost = By.xpath("//div[text()= 'Waiting on Customer']");
	public static By editPrivateCommentTextArea = By.xpath("//div[@class='col-md-12']//div//textarea[@id='case-comment-box']");
	public static By resolutionwithComment = By.xpath("//span[text()='Resolution']");
	public static By resolutionWithCommentPickList = By.xpath("//div[@class='Select-placeholder']");
	public static By caseResolutionLabel = By.xpath("//a[@id='caseResolution']");
	public static By closeCaseInternalStatusPicklist = By.xpath("//span[@class='Select-arrow'][1]");
	public static By closedOption= By.xpath("//div[text()='Closed']");
	public static By anchorLinkOfComment = By.xpath("//li/a/span[@class='fa fa-external-link']");
	public static By anchorLink = By.xpath("//a[contains(@href,'/discussion/a')]//span[@class='glyphicon glyphicon-link']");
	public static By kcsSearchResult = By.xpath("//a[contains(text(),'Test Article')]");
	public static By myOverviewRolesColumn = By.xpath("//div[@id='ascension-main-content']//div[@class='flex-card card-pf']");
	public static By userPreferencesOption = By.xpath("//span[text()='Kunal, Bipin']");
	public static By userPrimaryLanguage = By.xpath("//span[text()='ar']");
	public static By primarylanguage = By.xpath("//body/div[@id='ascension-main-content']/div/div[@class='container-fluid container-pf-nav-pf-vertical']/div[@tabindex='-1']/div/div/div[@class='container-fluid container-cards-pf padding-left-zero padding-right-zero']/div[2]/div[1]/div[1]/div[2]/div[1]");
	public static By weekdaySBR = By.xpath("//body//div[@id='ascension-main-content']//div//div[@class='container-fluid container-pf-nav-pf-vertical']//div[@tabindex='-1']//div//div//div[@class='container-fluid container-cards-pf padding-left-zero padding-right-zero']//div[3]//div[1]//div[1]//div[2]");
	public static By selectPrimaryLangButton = By.xpath("//div[@class='btn-group']/button[@class='btn btn-primary']");
	public static By userWeekdaySBRPreferences = By.xpath("//span[text()='Shift']");
	//public static By weekdaySBR = By.xpath("//body//div[@id='ascension-main-content']//div//div[@class='container-fluid container-pf-nav-pf-vertical']//div[@tabindex='-1']//div//div//div[@class='container-fluid container-cards-pf padding-left-zero padding-right-zero']//div[3]//div[1]//div[1]//div[1]//div[1]");
	//public static By userCaseTagPreferences = By.xpath("((//div[@class='row-cards-pf row'])[4]/div[@class='col-xs-6 f11bwbrz'])[1]//a");
	public static By userCaseTagPreferences = By.xpath("//span[contains(text(),'pulp')]");
	public static By caseTag = By.xpath("//body//div[@id='ascension-main-content']//div//div[@class='container-fluid container-pf-nav-pf-vertical']//div[@tabindex='-1']//div//div//div[@class='container-fluid container-cards-pf padding-left-zero padding-right-zero']//div[4]//div[1]//div[1]//div[2]");
	//public static By searchKeyword = By.xpath("//span[text()='Keyword *']");
	public static By searchKeyword = By.xpath("//label[contains(text(),'Keyword')]");
	public static By searchSBRGroups = By.xpath("//label[contains(text(),'SBR Groups')]");
	public static By searchCaseTags = By.xpath("//label[contains(text(),'Tags')]");
	public static By searchCaseStatus = By.xpath("//form[@class='search-criteria']//div[2]//div[1]//div[1]//label[1]");
	public static By searchInternalStatus = By.xpath("//label[contains(text(),'Internal Status')]");
	public static By searchCaseSeverity = By.xpath("//label[contains(text(),'Severity')]");
	public static By searchLockStatus = By.xpath("//label[contains(text(),'Lock Status')]");
	public static By searchFTS = By.xpath("//label[contains(text(),'FTS')]");
	public static By searchKeywordTextBox = By.xpath("//input[@placeholder='Case Search Keyword']");//div[@class='col-md-4 col-sm-12'][1]//input
	public static By searchSubmitButton = By.xpath("//button[text()='Submit']");
	public static By searchResultTableRows = By.xpath("//div[@class='rt-tr-group']");
	public static By fileUploadNotPossibleMessage = By.xpath("//span[contains(text(),'Unable to read file(s), check that the file(s) are valid.')]");
	public static By fileUploadFailingMessage = By.xpath("//span[contains(text(),'greaterThanOneGB.tar.gz cannot be attached because it is larger than 1 GB. Please FTP large files to dropbox.redhat.com.')]");
	//public static By ownedCaseRolePrority = By.xpath("//div[@class='card-pf card-pf-accented f14smeri foh645m f1zx9e9']/div[@class='card-pf-body']/div[@class='ffdz2ak']//div[@class='btn-group']/button[@class='btn btn-success']");
	public static By ownedCaseRolePrority = By.xpath("//button[contains(text(),'3')]");
	public static By customerComment = By.xpath("//span[@class=\"text-danger\" and contains(text(),'Customer')]");
	public static By commentId = By.xpath("//h4[@class='meta private']/a");
	public static By commnetUserName = By.xpath("//div[@class='byline']/span/span");
	public static By assocaiteComment = By.xpath("//h4[@class='meta private']/span[@class='text-danger']");
	public static By priorityButtonGroup = By.xpath("//div[@class='btn-group']");
	public static By roleSelectedButton = By.xpath("//button[@class='btn btn-success']");
	public static By roleDeSelectedButton = By.xpath("//button[@class='btn btn-default']");
	public static By roleOFFButton = By.xpath("//button[@class='btn btn-danger']");
	public static By chooseTemplateButton = By.xpath("//span[contains(text(),'Select a role template')]");
	public static By selectTemplatePicklist = By.xpath("//button[contains(.,'Select a value ')]");
	public static By applyTemplateButton = By.xpath("//button[contains(.,'Apply Template')]");
	public static By saveCloseCaseDialogButton = By.xpath("//button[contains(.,'Save')]");
	public static By attachmentPaperClipIcon = By.xpath("//span[contains(@class,'paperclip discussion')]");
	public static By actionDropDownList = By.xpath("//li[@class='dropdown']");
	public static By ascensionViewForOtherUser = By.xpath("//li[@class='list-group-item sidebar-li']/h4");
	public static By actionsDropdown = By.xpath("//span[contains(.,'Actions')]");
	public static By ascensionViewOption = By.xpath("//span[contains(.,'Ascension View')]");
	public static By userInputBox = By.xpath("//input[@placeholder='Search users by name']");
	public static By userNameIcon = By.xpath("//span[@class='fa fa-user']");
	public static By submitUser = By.xpath("//button[contains(.,'Submit')]");
	public static By viewingTopCasesForLabel = By.xpath("//li[@class='list-group-item sidebar-li']/h4/span");
	public static By editNEPButton = By.xpath("//button[@id='edit-nep']");
	public static By publicCommentType =By.xpath("//span[@id='textMessage']/ancestor::div/pre/span//ancestor::div//h4//span[@id='textMessage']");
	public static By privateCaseCommentType =By.xpath("//span[@id='textPrivateCaseNote']");
	public static By caseDiscription=By.xpath("//h4[text()='Case Description']//following-sibling::div//span");
	public static By bugzillaNo=By.xpath("//a[@href='https://bugzilla.redhat.com/show_bug.cgi?id=1345975']");
	public static By chatTrans=By.xpath("//div//div//div//div//div[contains(@class,'pf-list-group-wrapper')]//div[@class='row']//div//div[1]//div[1]//h4[1]");
	public static By doNotUpdateCheckbox=By.xpath("//label[@class='checkbox-inline margin-right-small']//input[@type='checkbox']");
	public static By postButtonAttri=By.xpath("//button[contains(.,'Post')]//parent::button");
//	public static By actionPlanTitle =By.xpath("//*[@class='list-group-item-container fpmuk5c']//*[text()='Action Plan']");
	public static By actionPlanTitle =By.xpath("//b[contains(.,'Action Plan')]");
	public static By caseSummaryTitle = By.xpath("//b[contains(.,'Case Summary')]");
//	public static By caseSummaryTitle = By.xpath("//*[@class='list-group-item-container fpmuk5c']//*[text()='Case Summary']");
	public static By confirmActionPopUpText = By.xpath("//span[contains(., 'Confirm Action')]");
	public static By yesPopUpButton = By.xpath("//div[@class='modal-footer']//button[@type='button'][contains(text(),'Yes')]");
	public static By noPopUpButton = By.xpath("//button[contains(., 'No')]");
	public static By actionPlanTextArea = By.xpath("//pre[@id='Action-Plan-read-edit-box']");
	//public static By submitAP = By.xpath("//button[@class='editable-submit btn btn-primary']");
	public static By submitCS1 = By.xpath("//button[@class='editable-submit btn btn-primary']");
	public static By cancelButtonAP = By.xpath("//div[@class='btn-group']//button[@type='button']");
	public static By loadTemplateButton = By.xpath("//button[contains(.,'Load Template')]");
	public static By loadTemplateText = By.xpath(".//*[@id='Action-Plan-write-edit-box']");
	public static By postComment = By.xpath("//button[contains(text(),'Post')]");
	public static By editButtonForAP = By.xpath("//a[@id='action-plan-edit-btn']");
	public static By editButtonForCS = By.xpath("//a[@id='edit-case-next-steps']");
	public static By showMoreText = By.xpath(".//*[@id='action-plan-showmore-btn']/span");
	public static By showLessText = By.xpath(".//*[@id='action-plan-showless-btn']/span");
	public static By caseSummaryTextArea = By.xpath(".//*[@id='case-next-steps-write']");
	public static By lastModifiedByAP = By.xpath("(//span[contains(.,'Last Modified by')])[1]");
	public static By lastModifiedByCS = By.xpath("(//span[contains(.,'Last Modified by')])[2]");
	public static By tooltipAP = By.xpath("//pre[contains(.,'Edit to add an Action Plan')]");
	public static By tooltipCS = By.xpath("//pre[contains(.,'Edit to add a Summary')]");
	public static By submitCS = By.xpath("//button[@id='submit-case-next-steps']");
	public static By searchResultForText = By.xpath("//span[contains(.,'Search results for')]");
	public static By FirstRow = By.xpath("(//a[contains(@href, '#/solution')])[1]");
	public static By crossButtonOnSearch = By.xpath("(//button[@class='btn btn-default'])[2]");
	public static By noMatchesText = By.xpath("//strong[contains(.,'No matches!')]");
	public static By noSolutionFound = By.xpath("//span[contains(.,'No matches! No resource is matching your search criteria.')]");
	public static By cancelButtonOnAdditionalFilter = By.xpath("//button[contains(.,'Cancel')]");
	public static By crossButtonOnAdditionalFilter = By.xpath("//button[@class='close']");
	public static By allButtonForProduct = By.xpath("(//button[contains(.,'All')])[1]");
	public static By showUnpublishedResurcesNo = By.xpath("//button[contains(.,'No')]");
	public static By showUnpublishedResurcesYes = By.xpath("//button[contains(.,'Yes')]");
	public static By allButtonForSbr = By.xpath("(//button[contains(.,'All')])[2]");
	public static By anyButtonForProduct = By.xpath("(//button[contains(.,'Any')])[1]");
	public static By anyButtonForSbr = By.xpath("(//button[contains(.,'Any')])[2]");
	public static By additionalFilterPopUpTitle = By.xpath("//h4[contains(.,'Additional Filters')]");
	public static By additionalFilterSourcesTitle = By.xpath("//label[contains(.,'Sources')]");
	public static By additionalFilterShowUnpublishedResourcesTitle = By.xpath("//label[contains(.,'Show Unpublished Resources')]");
	public static By additionalFilterDocumentStateTitle = By.xpath("//label[contains(.,'Document State')]");
	public static By additionalFilterProductsTitle = By.xpath("//label[contains(.,'Products')]");
	public static By additionalFilterSBRsTitle = By.xpath("//label[contains(.,'SBRs')]");
	public static By additionalFilterCreatedByTitle = By.xpath("//label[contains(.,'Created By')]");
	public static By additionalFilterLastModifiedByTitle = By.xpath("//label[contains(.,'Last Modified By')]");
	public static By additionalFilterCreatedDateTitle = By.xpath("//label[contains(.,'Created Date')]");
	public static By additionalFilterLastModifiedDateTitle = By.xpath("//label[contains(.,'Last Modified Date')]");
	public static By loginModalHeader = By.xpath("//h4[@class='modal-title']/span[3]");
	public static By attachFileCancelButton = By.xpath("//button[@id='Attach-Files-cancel-button']");
    public static By attachFilesButtonMain = By.xpath("//button[@id='Attach-Files-button']");
    public static By deleteAttachmentIcon = By.xpath("//span[@class='fa fa-trash']");
    public static By attachmentDialogYes = By.xpath("//div[@class='modal-footer']//button[@type='button'][contains(text(),'Yes')]");
    public static By fileDeletedLabel = By.xpath("//span[contains(.,'File Deleted')]");
	public static By resetfilterButton = By.xpath("//button[contains(.,'Reset filters')]");
	public static By additionalFilterActiveButton = By.xpath("//button[contains(.,'Active')]");
	public static By additionalFilterPrivateButton = By.xpath("//button[contains(.,'Private')]");
	public static By additionalFilterRetiredButton = By.xpath("//button[contains(.,'Retired')]");
	public static By additionalFilterClearAllButton = By.xpath("//span[@class='Select-clear']");
	public static By searchRefreshButton = By.xpath("//button[text()='Clear Filters']//preceding-sibling::button");
	public static By privateCaseNoteChatter = By.xpath("//h4[contains(text(), 'Case Note')]");
	public static By publicCommentChatter = By.xpath("//h4[text()='Message']");
	public static By linkIconForCommentsChatterPublic = By.xpath("//a[contains(@href,'#/case/01079571/discussion')]//span[@class='glyphicon glyphicon-link']");
	
	public static By privateCaseNoteSection = By.xpath("//div[contains(@class, 'comment-container-private')]");
	public static By privateCommentBackgroundChatter = By.xpath("//div[contains(@class, 'comment-container-private')]");
	public static By caseLinkToDiscussionFromChatter = By.xpath("//a[contains(@href, '/discussion/')]/span[@class='caseLink']"); // this is link from public/private comment to discussion tab
	public static By additionalFilterProductDropdownArrow = By.xpath("(//span[@class='Select-arrow'])[2]");
	public static By additionalFilterProductDropdownValue1 = By.xpath("//div[@aria-label = 'Red Hat HPC']");
	public static By additionalFilterProductDropdownValue2 = By.xpath("//div[@aria-label='Red Hat Ceph Storage']");
	public static By additionalFilterSBRDropdownArrow = By.xpath("(//span[@class='Select-arrow'])[3]");
	public static By additionalFilterSBRDropdownValue1 = By.xpath("//div[@aria-label='API Mgmt']");
	public static By additionalFilterSBRDropdownValue2 = By.xpath("//div[@aria-label='Ansible']");
	public static By searchSBRDropdown =By.xpath("(//span[@class='Select-arrow'])[1]");
	public static By searchSBRSelection =By.xpath("//div[text()='Select SBRs']/parent::span/parent::div/parent::div/div[2]/div/div[3]");
	//public static By searchSBRValue =By.xpath("//span[@id='react-select-2--value']/div//span[text()='API Mgmt']");
	public static By searchSBRValue =By.xpath("//span[text()='Ansible']");
	public static By searchSBRRemoveEntry =By.xpath("//span[@id='react-select-2--value']//div//span[@class='Select-value-icon']");
	public static By searchTagDropdown =By.xpath("(//span[@class='Select-arrow'])[2]");
	public static By searchTagSelection =By.xpath("//div[text()='Select Tags']/parent::span/parent::div/parent::div/div[2]/div/div[3]");
	public static By searchTagValue =By.xpath("//span[@id='react-select-3--value']//div//span[text()='xpaas']");
	public static By searchTagRemoveEntry =By.xpath("//span[@id='react-select-3--value']/div/span[@class='Select-value-icon']");
	public static By searchPreviousButton =By.xpath("//button[text()='Previous']");
	public static By searchNextButton =By.xpath("//button[text()='Next']");
	public static By userNameonComment = By.xpath("//div[@class='list-group-item-container list-item-container']/div[@class='row']/div[@class='col-xs-12']/div/div[1]/div[1]/div[1]/span[1]/span[1]");
	public static By timeOnComment = By.xpath("//div[@class='byline']//span[2]//span[2]");
	public static By runInsightsOnAttachment = By.xpath("//span[@class='glyphicon glyphicon-play-circle']");
	public static By confirmInsights = By.xpath("//button[contains(text(),'Yes')]");
    public static By insightsConfirmationPopup = By.xpath("//button[contains(text(),'Yes')]");
	public static By articleIcon = By.xpath("//*[@class='fa fa-external-link']");
	public static By solutionIcon = By.xpath("//*[@class='fa fa-medkit']");
	public static By unpublished = By.xpath("(*//span[contains(., 'Unpublished')])[1]");
	public static By bestMatchDropdown = By.xpath("//button[contains(.,'Best Match')]");
	public static By bestMatchDropdownMostFrequentlyPinned = By.xpath("//span[contains(.,'Most Frequently Pinned')]");
	public static By MostFrequentlyPinnedDropdown = By.xpath("//button[contains(.,'Most Frequently Pinned')]");
	public static By particularArticle = By.xpath("//a[contains(.,'Red Hat Satellite Certificate / Manifest FAQ')]");
	public static By particularSolution = By.xpath("//a[contains(.,'Test create Solution");
	public static By particularActionText = By.xpath("//span[@class='fkdaxh']");
	public static By certifiedCloudPartner=By.xpath("//span[@id='react-select-2--value-7']");
	public static By certifiedHardware=By.xpath("//span[@id='react-select-2--value-8']");
	public static By certifiedSoftware=By.xpath("//span[@id='react-select-2--value-9']");
	public static By searchQueryLink = By.xpath("//span[@class='advanced-search-label']//ancestor::a");
	public static By searchGet1stCaseNoLink=By.xpath("(//div[@class='rt-tbody']//span[1]//span[2]//a)[1]//span");
	public static By searchClick1stCase=By.xpath("(//span[@class='fa fa-info-circle'])[1]");
	public static By searchStatusDropdown =By.xpath("(//span[@class='Select-arrow'])[3]");
	public static By searchStatusSelection =By.xpath("//div[text()='Select Status']/parent::span/parent::div/parent::div/div[2]/div/div[3]");
	public static By searchStatusValue =By.xpath("//span[@id='react-select-4--value']/div//span[text()='Closed']");
	public static By searchInternalDropdown = By.xpath("(//span[@class='Select-arrow'])[4]");
	public static By searchInternalStatusSelection = By.xpath("//div[text()='Select Internal Status']/parent::span/parent::div/parent::div/div[2]/div/div[3]");
	public static By searchStatusRemoveEntry =By.xpath("//span[@id='react-select-4--value']/div/span[@class='Select-value-icon']");
    public static By saveCaseContact = By.xpath("//div[@class='btn-group']//button[@type='submit']");
    public static By businessHoursText = By.xpath("//div[text()='Business Hours']/parent::div/div[2]/span");
    public static By attachmentPrivateCheckbox = By.xpath("//td/input[@type='checkbox']");
    public static By makeAttachmentPublic = By.xpath("//div[@class='clearfix comment-container']//input[@type='checkbox']");
    public static By changeAttachmentPrivacy = By.xpath("//div[@class='modal-header']//span[1]//span[1]");
    public static By privateAttachmentPane= By.xpath("//div[@class='bg padding-medium comment-container-private']//div//a");
    public static By publicAttachmentPane= By.xpath("//div//div//div[@class='pf-list-group-wrapper']//div[@class='row']//div//div[1]//div[1]//div[2]//span[1]//div[1]//a[1]");
    public static By uploadedFile = By.xpath("//span[@class='is-new']");
    public static By slaAttainmentBar = By.xpath("//div[contains(text(), 'SLA Attainment')]");
    public static By userIRCBadgeonPopover = By.xpath("//span[@class='badge']/span");
    public static By discussionFiltersContainer = By.xpath("//div[contains(@class,'discussion-filters-container')]");
	public static By linkIconForCommentsChatterPrivate=By.xpath("//a[contains(@href,'#/case/01079571/discussion')]//span[@class='glyphicon glyphicon-link']");
	public static By internalStatusClosed = By.xpath("//a[@id='caseInternalStatus']");
	public static By ftsFlag = By.xpath("//div[@class='margin-top-medium']//label[5]//input[1]");	
	public static By cancelButton = By.xpath("//button[@id='cancel-post-comment']");
	public static By editFTS = By.xpath("//a[@class='cursor-pointer margin-left-small edit']//span[@class='fa fa-pencil']");
	public static By clickFTS = By.xpath("//div[@class='Select has-value is-clearable is-searchable Select--multi']//div[@class='Select-control']");
	public static By submitFTS = By.xpath("//div//div//div//div[@class='case-header']//div//div//div[@class='btn-group']//button[1]");
	public static By saveAsFilter = By.xpath("//button[contains(text(),'Save As')]");
	public static By textFilter = By.xpath("//input[@placeholder='Enter Name for Filter Configuration']");
	public static By saveTextFilter = By.xpath("//div[@class='margin-right-medium padding-right pull-right']//button[@type='button'][contains(text(),'Save')]");
	public static By cancelTextFilter = By.xpath("//button[contains(text(),'Cancel')]");
	public static By deleteFilter = By.xpath("//button[contains(text(),'Delete')]");
	public static By clearFilters = By.xpath("//button[contains(text(),'Clear Filters')]");
	public static By selectSavedFilter = By.xpath("//div[contains(text(),'Select Saved Filters')]");
	public static By filterSelection = By.xpath("//div[text()='Select Saved Filters']/parent::span/parent::div/parent::div/div[2]/div/div[1]");
	public static By discussionFilter = By.xpath("//button[@id='discussion-filter']");
	public static By uncheckAllFilters = By.xpath("//button[@class='btn btn-link m-l-4']");
	public static By checkAllFilters = By.xpath("//button[@class='btn btn-link']");
	public static By attachmentsTab = By.xpath("//span[.='Attachments']");
	public static By remoteRiderButton = By.xpath("//button[contains(text(),'Request Remote Ride')]");
	public static By checkAttachment = By.xpath("//input[@value='attachment']");

	
    public HomePage(WebDriver driver){
		super(driver);
	}

	public void makeAttachmentPrivate(){
		waitUntillClickable(HomePage.attachmentPrivateCheckbox);
		driver.findElement(HomePage.attachmentPrivateCheckbox).click();
	}

	public void clickOnParticularArticle(){
		waitUntillClickable(HomePage.particularArticle);
		driver.findElement(HomePage.particularArticle).click();
	}

	public String checkCertifiedCloudPartnerText(){
		waitUntillClickable(HomePage.certifiedCloudPartner);
		System.out.println(driver.findElement(HomePage.certifiedCloudPartner).getText());
		return driver.findElement(HomePage.certifiedCloudPartner).getText();
	}

	public String checkCertifiedHardwareText(){
		waitUntillClickable(HomePage.certifiedHardware);
		System.out.println(driver.findElement(HomePage.certifiedHardware).getText());
		return driver.findElement(HomePage.certifiedHardware).getText();
	}

	public String checkCertifiedSoftware(){
		waitUntillClickable(HomePage.certifiedSoftware);
		System.out.println(driver.findElement(HomePage.certifiedSoftware).getText());
		return driver.findElement(HomePage.certifiedSoftware).getText();
	}

	public String checkOnParticularSolutionGetText(){
		waitUntillClickable(HomePage.particularActionText);
		System.out.println(driver.findElement(HomePage.particularActionText).getText());
		return driver.findElement(HomePage.particularActionText).getText();
	}

	public void clickOnParticularSolution(){
		waitUntillClickable(HomePage.particularSolution);
		driver.findElement(HomePage.particularSolution).click();
	}

	public void cancelUpload(){
		driver.findElement((HomePage.attachFileCancelButton)).click();
	}

	public void clickBestMatchDropdownMostFrequentlyPinned(){
		driver.findElement(HomePage.bestMatchDropdownMostFrequentlyPinned).click();
	}

	public void clickBestMatchDropdown(){
		driver.findElement(HomePage.bestMatchDropdown).click();
	}


	public void clickOnAdditionalFilterProductDropdownArrow(){
		driver.findElement(HomePage.additionalFilterProductDropdownArrow).click();
	}

	public void checkArticleIcon(){
		driver.findElement(HomePage.articleIcon).isDisplayed();
	}

	public String checkUnpublishedText(){
		return driver.findElement(HomePage.unpublished).getText();
	}

	public void checkSolutionIcon(){
		driver.findElement(HomePage.solutionIcon).isDisplayed();
	}
	public void selectAdditionalFilterProductDropdownValue1(){
		driver.findElement(HomePage.additionalFilterProductDropdownValue1).click();
	}

	public void selectAdditionalFilterProductDropdownValue2(){
		driver.findElement(HomePage.additionalFilterProductDropdownValue2).click();
	}

	public void clickOnAdditionalFilterSBRDropdownArrow(){

		driver.findElement(HomePage.additionalFilterSBRDropdownArrow).click();
	}

	public void selectAdditionalFilterSBRDropdownValue1(){
		driver.findElement(HomePage.additionalFilterSBRDropdownValue1).click();
	}

	public void selectAdditionalFilterSBRDropdownValue2(){
		driver.findElement(HomePage.additionalFilterSBRDropdownValue2).click();
	}

	public int checkSourcesCountOnAdditionalFiltersButton(){
		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='Select-value-label']"));
		return rows.size();
	}

	public void clickOnClearAllAdditionalFiltersPopUp(){
		driver.findElement((HomePage.additionalFilterClearAllButton)).click();
	}

	public void searchWorkByEnterKey(String id) throws InterruptedException
	{
		driver.findElement(HomePage.kcsSearchBox).sendKeys(id);
		Thread.sleep(1000);
		driver.findElement(HomePage.kcsSearchButton).sendKeys(Keys.ENTER);
	}

	public String checkCreateSolutionButton()
	{
		return driver.findElement(HomePage.createSolutionButton).getText();
	}

	public void clickOnResetFiltersButton(){
		driver.findElement((HomePage.resetfilterButton)).click();
	}


	public void clickOnAdditionalFiltersButton() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement((HomePage.additionalFiltersButton)).click();
	}

	public void clickOnCancelAdditionalFiltersPopUp(){
		driver.findElement((HomePage.cancelButtonOnAdditionalFilter)).click();
	}

	public void clickOnCrossButtonAdditionalFiltersPopUp(){
		driver.findElement((HomePage.cancelButtonOnAdditionalFilter)).click();
	}

	public void cancelActionPlan(String comment){
		driver.findElement(HomePage.postActionPlan).sendKeys(comment);
		driver.findElement(HomePage.cancelButtonAP).click();
	}

	public String checknoMatchesText()
	{
		return driver.findElement(HomePage.noMatchesText).getText();
	}

	public String checkAdditionalFilterPopUpTitleText()
	{
		return driver.findElement(HomePage.additionalFilterPopUpTitle).getText();
	}

	public String checkadditionalFilterSourcesTitleText()
	{
		return driver.findElement(HomePage.additionalFilterSourcesTitle).getText();
	}

	public String checkadditionalFilterShowUnpublishedResourcesTitlesText()
	{
		return driver.findElement(HomePage.additionalFilterShowUnpublishedResourcesTitle).getText();
	}

	public String checkadditionalFilterDocumentStateTitleText()
	{
		return driver.findElement(HomePage.additionalFilterDocumentStateTitle).getText();
	}
	public String checkadditionalFilterProductsTitleText()
	{
		return driver.findElement(HomePage.additionalFilterProductsTitle).getText();
	}
	public String checkadditionalFilterSBRsTitleText()
	{
		return driver.findElement(HomePage.additionalFilterSBRsTitle).getText();
	}
	public String checkadditionalFilterCreatedByTitlesText()
	{
		return driver.findElement(HomePage.additionalFilterCreatedByTitle).getText();
	}
	public String checkadditionalFilterLastModifiedByTitleText()
	{
		return driver.findElement(HomePage.additionalFilterLastModifiedByTitle).getText();
	}
	public String checkadditionalFilterCreatedDateTitleText()
	{
		return driver.findElement(HomePage.additionalFilterCreatedDateTitle).getText();
	}
	public String checkadditionalFilterLastModifiedDateTitleText()
	{
		return driver.findElement(HomePage.additionalFilterLastModifiedDateTitle).getText();
	}

//	public String checknoSolutionFoundMessage()
//	{
//		return driver.findElement(HomePage.noSolutionFound).getText();
//	}

	public void clickOnCancelAP(){
		driver.findElement(HomePage.cancelButtonAP).click();
	}

	public String checkConfirmAlertText()
	{
		return driver.findElement(HomePage.confirmActionPopUpText).getText();
	}

	public String checksearchResultForText()
	{
		return driver.findElement(HomePage.searchResultForText).getText();
	}

	public String checkfirstRawResult()
	{
		return driver.findElement(HomePage.FirstRow).getText();
	}

	public void clickOnNoPopUp(){
		driver.findElement(HomePage.noPopUpButton).click();
	}

	public void clickOnYesPopUp(){
		driver.findElement(HomePage.yesPopUpButton).click();
	}

	public void clickOnLoadTemplate(){
		driver.findElement(HomePage.loadTemplateButton).click();
	}

	public String checkLoadTemplate(){
		return driver.findElement(HomePage.loadTemplateText).getText();
	}

	public String editButtonTextForAP()
	{
		return driver.findElement(HomePage.editButtonForAP).getText();
	}

	public String editButtonTextForCS()
	{
		return driver.findElement(HomePage.editButtonForCS).getText();
	}

	public String checkShowMoreText()
	{
		return driver.findElement(HomePage.showMoreText).getText();
	}

	public String checkShowLessText()
	{
		return driver.findElement(HomePage.showLessText).getText();
	}

	public void clickOnShowMoreText()
	{
		driver.findElement(HomePage.showMoreText).click();
	}

	public void clickOnShowLessText()
	{
		driver.findElement(HomePage.showLessText).click();
	}

	public String lastModifiedTextAP()
	{
		return driver.findElement(HomePage.lastModifiedByAP).getText();
	}

	public String lastModifiedTextCS()
	{
		return driver.findElement(HomePage.lastModifiedByCS).getText();
	}

	public String tooltipTextAP()
	{
		return driver.findElement(HomePage.tooltipAP).getText();
	}

	public String tooltipTextCS()
	{
		return driver.findElement(HomePage.tooltipCS).getText();
	}

	public static String getFirstName(String userName){
		String firstName="";
		String [] lineSplit = userName.split("\\s+");	   
		firstName = lineSplit[1];
		return firstName;
	}

	public void viewAscensionAs (String userName){
		waitUntillClickable(HomePage.actionsDropdown); 
		clickAt(HomePage.actionsDropdown);
		clickAt(HomePage.ascensionViewOption);
		waitUntillClickable(HomePage.userInputBox);
		driver.findElement(HomePage.userInputBox).sendKeys(getFirstName(userName));
		waitUntillClickable(HomePage.userNameIcon);
		driver.findElement(HomePage.userNameIcon).click();
		waitUntillClickable(HomePage.submitUser);
		driver.findElement(HomePage.submitUser).click();  

	}

	public void linkKCSbyID (String id) throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='"+id+"']/parent::span/parent::span/parent::div/span[1]/a")).click();
		Thread.sleep(5000);
	}


	public void turnOnVideosInKCSSearch() throws InterruptedException{
		
		waitUntillClickable(HomePage.additionalFiltersButton);
		clickAt(HomePage.additionalFiltersButton);
		waitUntillClickable(HomePage.applyFiltersButton);
		Thread.sleep(2000);
		boolean videosNotAlreadySelected = driver.findElements(By.xpath("//span[contains(.,'Videos ')]")).isEmpty();
		if (videosNotAlreadySelected){
			clickAt(HomePage.resourceSourceSelector);
			clickAt(HomePage.videosOption);
		}
		clickAt(HomePage.applyFiltersButton);
		Thread.sleep(5000);
	}

	public int getRoleCount() {
		waitUntillClickable(HomePage.yourRolesButton);
		clickAt(HomePage.yourRolesButton);
		waitUntillClickable(HomePage.roleName);
		int count = driver.findElements(HomePage.roleName).size();
		return count;
	}  

	public String getSecondRoleName() {

		String roleName = driver.findElement(By.xpath("(//li[@class='list-group-item sidebar-li'])[8]/div/div[2]")).getText();
		return roleName;

	}

	public void openMyOverviewPage(){

		waitUntillClickable(HomePage.myOverviewButton);
		driver.findElement(HomePage.myOverviewButton).click();
	}
	
	public void turnPriorityForRole (String role, String priority){

		driver.findElement(By.xpath("//div[@class='card-pf-body p-y-3']")).click();
		driver.findElement(By.xpath("//div[text()='"+role+"']/parent::div/div/div/div[@class='btn-group']/button[text()='"+priority+"']")).click();
	}

	public void clickRHAssociateButton() {
		waitUntillClickable(HomePage.rhassociateDropdown);
		clickAt(HomePage.rhassociateDropdown);
		waitUntillClickable(HomePage.takeOwnershipOption);
	}

	public void openNEPDialog(By NEPevent){

		/*	    	WebElement element_NEP = driver.findElement(HomePage.newNEPButton);
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView();", element_NEP);
            driver.findElement(HomePage.newNEPButton).click();*/

		clickAt(NEPevent);
	}

	public void clickTakeOwnershipOption() {
		waitUntillClickable(HomePage.takeOwnershipOption);
		driver.findElement(HomePage.takeOwnershipOption).click();
		waitUntillClickable(HomePage.caseOwnerLocator);
	}

	public void select24x7CoverageFlag() throws InterruptedException {
		waitUntillClickable(editFTS);
		driver.findElement(editFTS).click();
		
		driver.findElement(By.xpath("//span[@class='Select-arrow']")).click();
		//driver.findElement(By.xpath("div[@class='Select-input']//span[@id='react-select-2']")).click();
		
//		driver.findElement(clickFTS).click();
//		System.out.println("Clicked on FTS Tab...");
		Thread.sleep(2000);
		driver.findElement(clickFTS).sendKeys("Co");
		driver.findElement(clickFTS).sendKeys(Keys.ENTER);
		driver.findElement(submitFTS).click();
		
	}

	public void openDiscussionsTab() throws InterruptedException {
		waitUntillClickable(HomePage.discussionsTab);
		clickAt(HomePage.discussionsTab);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//a[@id=\"add-comment-tabs-tab-1\"]")));
	}

	public void openHistoryTab() {
		waitUntillClickable(HomePage.historyTab);
		clickAt(HomePage.historyTab);
	}

	public void openOverviewTab() throws Exception {
		//scrollInto(By.xpath("//h2[@class='header m-x-1']"));
		waitUntillClickable(HomePage.overviewTab);
		driver.findElement(HomePage.overviewTab).click();
		waitUntillClickable(HomePage.caseInternalStatus);
	}

	public void enterCommentText(String comment) throws InterruptedException {
		
		waitUntillClickable(HomePage.commentTextArea);
		driver.findElement(HomePage.commentTextArea).click();
		Thread.sleep(2000);
		driver.findElement(HomePage.commentTextArea).clear();	
		driver.findElement(HomePage.commentTextArea).click();
		driver.findElement(HomePage.commentTextArea).sendKeys(comment);
		//checkForSpinner();
		waitUntillClickable(HomePage.postCommentButton);
		
	}
	
/*public void enterCommentinMarkdown(String comment) throws InterruptedException {
		
		//waitUntillClickable(HomePage.markDown);
		driver.findElement(HomePage.markDown).click();
		Thread.sleep(2000);
		driver.findElement(HomePage.markDown).clear();	
		driver.findElement(HomePage.markDown).click();
		driver.findElement(HomePage.markDown).sendKeys(comment);
		//checkForSpinner();
		waitUntillClickable(HomePage.postCommentButton);
		
	}*/
	
	/*public void checkForSpinner() throws InterruptedException {
		
		do {
			
			if(driver.findElement(By.xpath("(//div[@class=\"spinner spinner-inline\"])[2]" )).isDisplayed()==false) {
				Thread.sleep(3000);
				System.out.println("Spinner Terminated");
			break;
			}else {
				Thread.sleep(3000);
				System.out.println("Waiting till spinner");
			}			
		}
		while (driver.findElement(By.xpath("(//div[@class=\"spinner spinner-inline\"])[2]" )).isDisplayed()==true);
	}
	*/
	public String findCommentId(String customerCommentId) {
		String commentId = driver.findElement(By.xpath("//a[contains(@href,'/"+customerCommentId+"')]//span[@class='glyphicon glyphicon-link']")).getAttribute("href");
		return commentId;
	}
	
	public void requestRemoteRider() throws Exception{
		driver.findElement(remoteRiderButton).click();
		Thread.sleep(2000);
	}
	
    public void enterCommentTextStatus(String comment) throws InterruptedException {
		
		waitUntillClickable(HomePage.commentTextArea);
		scrollInto(HomePage.attachFilePane);
		Thread.sleep(3000);
		driver.findElement(HomePage.commentTextArea).click();
		driver.findElement(HomePage.commentTextArea).sendKeys(comment);
		Thread.sleep(2000);
		scrollInto(By.xpath("//h2[@class='header m-x-1']"));
		driver.findElement(HomePage.overviewTabClose).click();
		waitUntillClickable(HomePage.postCommentButton);
		
	}
	public void anchorlink(String ncqCase) {
		driver.findElement(By.xpath("//a[contains(@href,'#/case/"+ncqCase+"/discussion/a')]//span[@class='glyphicon glyphicon-link']")).click();
	}
	
	public void toggleFTSFlag()
	{
		driver.findElement(HomePage.ftsFlag).click();
	}
	
	public void cancelButton()
	{
		driver.findElement(HomePage.cancelButton).click();;
	}

	public void submitComment()
	{
		driver.findElement(postComment).click();
	}

	public void clickPostButton() throws InterruptedException {
		waitUntillClickable(HomePage.postCommentButton);
		driver.findElement(HomePage.postCommentButton).click();
		//checkForSpinner();
		Thread.sleep(3000);
	}

	public void setStatusTo(String status) {
		driver.findElement(HomePage.statusCombo).sendKeys(status);
		driver.findElement(HomePage.statusCombo).sendKeys(Keys.ENTER);
	}

	public void checkIsPrivate() {
		waitUntillClickable(HomePage.makePrivateRadio);
		driver.findElement(HomePage.makePrivateRadio).click();

	}

	public void checkDoNotUpdateSBT() {
		waitUntillClickable(HomePage.doNotUpdateSBTRadio);
		driver.findElement(HomePage.doNotUpdateSBTRadio).click();

	}

	public void openNextStepsTab() {
		waitUntillClickable(HomePage.nextStepsTab);
		driver.findElement(HomePage.nextStepsTab).click();

	}

	public void openAccountsTab() {
		waitUntillClickable(HomePage.accountTab);
		driver.findElement(HomePage.accountTab).click();

	}

	public void clickOnEditActionPlan() {
		waitUntillClickable(HomePage.editActionPlanLink);
		driver.findElement(HomePage.editActionPlanLink).click();

	}

	public void postActionPlan(String comment){
		waitUntillClickable(HomePage.postActionPlan);
		driver.findElement(HomePage.postActionPlan).sendKeys(comment);
		driver.findElement(HomePage.submitAP).click();
		waitUntillClickable(HomePage.actionPlanShowMore);
	}

	public String getActionPlanPopUp(){
		return driver.findElement(HomePage.actionPlanTextArea).getText();
	}

	public String getActionPlan(){
		return driver.findElement(HomePage.actionPlanText).getText();
	}

	public String getActionPlanTitle(){
		return driver.findElement(HomePage.actionPlanTitle).getText();
	} 

	public String getCaseSummaryTitle(){
		return driver.findElement(HomePage.caseSummaryTitle).getText();
	}
	// editButtonForAP

	public void clickOnEditCaseSummary(){
		waitUntillClickable(HomePage.editCaseSummaryLink);
		driver.findElement(HomePage.editCaseSummaryLink).click();
	}

	public void postCaseSummary(String comment){
		waitUntillClickable(HomePage.postCaseSummary);
		driver.findElement(HomePage.postCaseSummary).sendKeys(comment);
		driver.findElement(HomePage.submitCS).click();
		waitUntillClickable(HomePage.caseSummaryShowMore);
	}

	public void postCopyToClipboardSummary(){
		driver.findElement(HomePage.clickCopyToClipboard).click();
		driver.findElement(HomePage.editCaseSummary).click();
		waitUntillClickable(HomePage.postCaseSummary);
		driver.findElement(HomePage.postCaseSummary).sendKeys(Keys.CONTROL + "v");
		driver.findElement(HomePage.submitCS).click();
		waitUntillClickable(HomePage.caseSummaryShowMore);
	}
	
	public void postCopyToClipboardActionPlan() throws InterruptedException {
		driver.findElement(HomePage.clickCopyToClipboardActionPlan).click();
		waitUntillClickable(HomePage.editButtonForAP);
		driver.findElement(HomePage.editButtonForAP).click();
		waitUntillClickable(HomePage.postActionPlan);
		driver.findElement(HomePage.postActionPlan).sendKeys(Keys.CONTROL + "v");
		driver.findElement(HomePage.submitAP).click();
		waitUntillClickable(HomePage.actionPlanShowMore);
		Thread.sleep(100);
	}

	public String getCaseSummary(){
		return driver.findElement(HomePage.caseSummaryText).getText();
	}

	public void toggleContributorLock() throws InterruptedException {
		waitUntillClickable(HomePage.caselockswitch);
		driver.findElement(HomePage.caselockswitch).click();
		Thread.sleep(10000);
	}


	public void refresh() throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(4000);
	}


	public void openFTSView() throws InterruptedException {
		waitUntillClickable(HomePage.ftsViewButton);
		driver.findElement(HomePage.ftsViewButton).click();
	}

	public void closeCaseFromTaskActions() throws InterruptedException {
		waitUntillClickable(HomePage.taskActionsDropdown);
		driver.findElement(HomePage.taskActionsDropdown).click();
		Thread.sleep(2000);
		driver.findElement(HomePage.closeCaseOption).click();
		waitUntillClickable(HomePage.closeCaseInternalStatusPicklist);
		clickAt(HomePage.closeCaseInternalStatusPicklist);
		clickAt(HomePage.closedOption);

	}

	public void openFileAttachPane() throws InterruptedException {
		scrollInto(By.xpath("//div[@class='list-group-item-heading' and contains(.,'Discussion')]"));
		Thread.sleep(3000);
		waitUntillClickable(HomePage.attachFilePane);
		driver.findElement(HomePage.attachFilePane).click();
		Thread.sleep(2000);
		driver.findElement(HomePage.attachFilesButtonMain).click();;

	}
	
	public void customCases() {
		driver.findElement(HomePage.custom).click();
	}

	public void attachFile(String Path) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('div.text-center > input[type=file]').setAttribute('style','');"); 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.text-center > input[type=file]")).sendKeys(Path);
		Thread.sleep(3000);

	}
	public void hitFileUpoad(){

		waitUntillClickable(HomePage.uploadFileButton);
		driver.findElement(HomePage.uploadFileButton).click();


	}

	public void openGenesysPopover() throws InterruptedException{
		waitUntillClickable(HomePage.genesysLogo);
		driver.findElement(HomePage.genesysLogo).click();
		Thread.sleep(5000);
	}
	
	public void clickHelpButton() throws InterruptedException{
		waitUntillClickable(HomePage.helpButton);
		driver.findElement(HomePage.helpButton).click();
		Thread.sleep(5000);
	}


	public void clickOnTaskActions(){
		waitUntillClickable(HomePage.taskActionsButton);
		driver.findElement(HomePage.taskActionsButton).click();
	}

	public void selectStatus(String status) throws InterruptedException{

		waitUntillClickable(HomePage.caseStatusPicklist);
		clickAt(HomePage.caseStatusPicklist);
		new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm flex-one' and @name='caseStatus']"))).selectByVisibleText(status);
		((JavascriptExecutor) driver).executeScript("scroll(0, -250);");
		driver.findElement(HomePage.caseStatusSubmitButton).click();
		Thread.sleep(8000);


	}

	public void selectInternalStatus(String internalStatus) throws InterruptedException{

		waitUntillClickable(HomePage.caseInternalStatusPicklist);
		driver.findElement(HomePage.caseInternalStatusPicklist).click();
		new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm flex-one' and @name='caseInternalStatus']"))).selectByVisibleText(internalStatus);
		((JavascriptExecutor) driver).executeScript("scroll(0, -250);");
		driver.findElement(HomePage.caseStatusSubmitButton).click();
		Thread.sleep(8000);		
	}
	
	public void selectProductStatus(String product) throws InterruptedException{

		waitUntillClickable(HomePage.caseProductPicklist);
		driver.findElement(HomePage.caseProductPicklist).click();
		
		 /*List<WebElement> list   = driver.findElements(By.xpath("(//select[@class='form-control input-sm flex-one' and @name='caseProduct'])/option"));
		list.get(0).click();*/
		new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm flex-one' and @name='caseProduct']"))).selectByVisibleText(product);
		((JavascriptExecutor) driver).executeScript("scroll(0, -250);");
		Thread.sleep(8000);		
	}
	
	public void selectVersionStatus(String version) throws InterruptedException{

//		waitUntillClickable(HomePage.productVersionPicklist);
//		driver.findElement(HomePage.productVersionPicklist).click();
		new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm flex-one' and @name='productVersion']"))).selectByVisibleText(version);
		((JavascriptExecutor) driver).executeScript("scroll(0, -250);");
		driver.findElement(HomePage.caseStatusSubmitButton).click();
		Thread.sleep(8000);		
	}
	
	public void selectProblemStatement(String pStatement) throws InterruptedException{

		waitUntillClickable(HomePage.problemStatement);
		driver.findElement(HomePage.problemStatement).click();
		driver.findElement(HomePage.editProblemStatement).sendKeys(pStatement);
		driver.findElement(HomePage.submitProblemStatement).click();
		Thread.sleep(8000);		
	}



	public  By fileDescriptionLocator (String filename)
	{
		
		By locator = By.xpath("//table[@class='striped-table-thead margin-top-medium table']//input[@type='text']");
		//By locator = By.xpath("//td[text()='"+filename+"']/parent::tr/td/input");
		return locator;
	}

	public  By fileSizeLocator (String filename){
		By locator =By.xpath("//tr//td[1]");
		//By locator = By.xpath("//td[text()='"+filename+"']/parent::tr/td[2]");
		return locator;
	}

	public void goToTextMode()
	{
		driver.findElement(HomePage.createSolution).click();
		waitUntillClickable(HomePage.solutionTitleDrag);
		driver.findElement(HomePage.solutionTitleDrag).click();
	}

	public void createSolution(String title){
		goToTextMode();
		driver.findElement(HomePage.solutionTitleText).sendKeys(title);	
	}

	public void clickOnSubmitSolution(){
		waitUntillClickable(HomePage.solutionSubmit);
		driver.findElement(HomePage.solutionSubmit).click();
	}

	public void openKnowledgeTesourcesTab(){
		waitUntillClickable(HomePage.knowledgeResourcesTab);
		//driver.findElement(By.xpath("//a[@id='testOnclickaccount']//span[@id='display']")).click();
		driver.findElement(HomePage.knowledgeResourcesTab).click();
	}

	public void unlinkSolution(){
		waitUntillClickable(HomePage.linkedSolution);
		driver.findElement(HomePage.unlinkTheSolution).click();
	}

	public void clickOnInitiateBomgarButton(){
		waitUntillClickable(HomePage.initiateBomgar);
		driver.findElement(HomePage.initiateBomgar).click();
	}

	public void cancelBomgarSession(){
		waitUntillClickable(HomePage.bomgarSessionCancel);
		driver.findElement(HomePage.bomgarSessionCancel).click();
	}

	public void confirmInitiatingBomgarSession(){
//		waitUntillClickable(HomePage.confirmBomgarSession);
//		driver.findElement(HomePage.confirmBomgarSession).click();
		waitUntillClickable(HomePage.bomgarInitiatedPopup);
		driver.findElement(HomePage.clickOnOK).click();
		waitUntillClickable(HomePage.bomgarComment);
	}

	public void clickToPinUnpinCase() {
		waitUntillClickable(HomePage.casePin);
		driver.findElement(HomePage.casePin).click();

	}

	public void openFieldConfigurationDialog(){
		waitUntillClickable(HomePage.openConfigureFieldsDialog);
		driver.findElement(HomePage.openConfigureFieldsDialog).click();
	}

	public void performDragAndDrop() throws InterruptedException, IOException
	{
		WebElement sourceLocator = driver.findElement(HomePage.availableItemsStatus);
		WebElement targetLocator = driver.findElement(HomePage.selectedItemsList);
		Actions act=new Actions(driver);
		act.dragAndDrop(sourceLocator, targetLocator).build().perform();
		Thread.sleep(8000);
		driver.findElement(HomePage.saveFieldConfiguration).click();
	}

	public void javascriptDragAndDrop(WebElement source, WebElement target) throws IOException
	{
		String script = readFile("/dev/shm/draganddrop.js", Charset.forName("UTF-8"));
		script += "simulateHTML5DragAndDrop(arguments[0], arguments[1])";
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript(script, source, target);
	}

	static String readFile(String path, Charset encoding) throws IOException
	{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public void clickOnCreateSolutionButton(String title)
	{
		driver.findElement(HomePage.createSolutionButton).click();
		waitUntillClickable(HomePage.solutionTitleDrag);
		driver.findElement(HomePage.solutionTitleDrag).click();
		driver.findElement(HomePage.solutionTitleText).sendKeys(title);
	}

	public void markIsExactSolution()
	{
		waitUntillClickable(HomePage.linkedSolution);
		driver.findElement(HomePage.markIsExact).click();
	}

	public void searchKCSByID(String id) throws InterruptedException
	{
		waitUntillClickable(HomePage.kcsSearchBox);
		driver.findElement(HomePage.kcsSearchBox).sendKeys(id);
		Thread.sleep(1000);
		driver.findElement(HomePage.kcsSearchButton).click();
	}

	public void searchKCSByWord(String keyword) throws InterruptedException
	{
		waitUntillClickable(HomePage.kcsSearchBox);
		driver.findElement(HomePage.kcsSearchBox).sendKeys(keyword);
		Thread.sleep(1000);
		driver.findElement(HomePage.kcsSearchButton).click();
	}
	public void searchCrossSignButton(String id) throws InterruptedException
	{
		waitUntillClickable(HomePage.kcsSearchBox);
		driver.findElement(HomePage.kcsSearchBox).sendKeys(id);
		Thread.sleep(1000);
		driver.findElement(HomePage.crossButtonOnSearch).click();
	}

	public void setRandomSignature(String uuid){
		clickAt(HomePage.editSignatureLink);
		driver.findElement(HomePage.signatureTextArea).clear();
		driver.findElement(HomePage.signatureTextArea).sendKeys(uuid);
		driver.findElement(HomePage.saveSignatureButton).click();
	}

	public void saveUserPreferences(){
		waitUntillClickable(HomePage.doneUpdatingPreferencesButton);
		clickAt(HomePage.doneUpdatingPreferencesButton);
	}


	public void searchFor(String keyword){
		driver.findElement(HomePage.searchTextBox).clear();
		driver.findElement(HomePage.searchTextBox).sendKeys(keyword);
		waitUntillClickable(HomePage.searchIcon);
		clickAt(HomePage.searchIcon);
	}

	public void setNEPAndSave( String intervalInMinutes ) throws InterruptedException{
		driver.findElement(HomePage.nepIntervalTextBox).click();
		Thread.sleep(5000);
		driver.findElement(HomePage.nepIntervalTextBox).clear();
		Thread.sleep(5000);
		driver.findElement(HomePage.nepIntervalTextBox).sendKeys(intervalInMinutes);
		//Thread.sleep(1400);
		driver.findElement(HomePage.nepSaveButton).click();
		waitUntillClickable(HomePage.deleteNEPButton);
		//Thread.sleep(14000);
	}

	public String addTag () throws InterruptedException{
		waitUntillClickable(HomePage.addTagLink);
		driver.findElement(HomePage.addTagLink).click();
		waitUntillClickable(HomePage.tagPickerArrow);
		clickAt(HomePage.tagPickerArrow);
		waitUntillClickable(HomePage.pulpTag);
		String tagName= driver.findElement(HomePage.pulpTag).getText();
		Thread.sleep(2000);
		clickAt(HomePage.pulpTag);
		clickAt(HomePage.caseTagsSubmitButton);
		System.out.println("added tag "+tagName);
		return tagName;
	}

	public void enterOtherDetailsToCreateSolution(String detail)
	{
		waitUntillClickable(HomePage.solutionTitleText);
		driver.findElement(HomePage.soluIssueDesc).sendKeys(detail);
		driver.findElement(HomePage.soluEnvironment).sendKeys(detail);
		driver.findElement(HomePage.soluResolution).sendKeys(detail);
		driver.findElement(HomePage.soluRootCause).sendKeys(detail);
		driver.findElement(HomePage.soluDiagnosticSteps).sendKeys(detail);
		driver.findElement(HomePage.soluPrivateNotes).sendKeys(detail);
	}

	public void setDiscussionSortPicklistToAsc() throws Exception{
		driver.findElement(By.xpath("//div[@class='Select comment-select custom-select has-value is-searchable Select--single']//div//span//span")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div/div[5]/div[2]/div/div/div[2]/div[2]/span[2]/div/div[1]/div/div[1]"));
		Thread.sleep(5000);
		clickAt(HomePage.discussionSortPickList);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(1000,0)", "");
		Thread.sleep(3000);
		uncheckAllCheckboxes();
		checkUncheckMessagePublicCommentCheckbox();
		Thread.sleep(3000);
	}


	public String addSBR () throws InterruptedException{
//		if(driver.findElement(HomePage.sbrLinkEdit).isEnabled())
//		{
//			waitUntillClickable(HomePage.sbrLinkEdit);
//			driver.findElement(HomePage.sbrLinkEdit).click();
//			//waitUntillClickable(HomePage.sbrArrow);
//			clickAt(HomePage.sbrArrowEdit);
//		}
		 if(driver.findElement(HomePage.sbrLink).isEnabled())
		{
			waitUntillClickable(HomePage.sbrLink);
			driver.findElement(HomePage.sbrLink).click();
			//waitUntillClickable(HomePage.sbrArrow);
			Thread.sleep(2000);
			clickAt(HomePage.sbrArrow);
		}
		waitUntillClickable(HomePage.sbrName);
		String sbr = driver.findElement(HomePage.sbrName).getText();
		Thread.sleep(2000);
		clickAt(HomePage.sbrName);
		clickAt(HomePage.saveSBRbutton);
		System.out.println("added sbr "+sbr);
		return sbr;
	}

	public void openSolutionInAscensionTab()
	{
		waitUntillClickable(HomePage.linkedSolution);
		driver.findElement(HomePage.linkedSolution).click();
	}

	public void clickOnSolutionActionsButton()
	{
		waitUntillClickable(HomePage.soluActionButton);
		driver.findElement(HomePage.soluActionButton).click();
	}

	public void openEditSolutionPanelAndEditSolution(String comment)
	{
		waitUntillClickable(HomePage.editSolution);
		driver.findElement(HomePage.editSolution).click();
		driver.findElement(HomePage.solutionTitleText).sendKeys(comment);
		driver.findElement(HomePage.soluIssueDesc).sendKeys(comment);
		driver.findElement(HomePage.soluEnvironment).sendKeys(comment);
		driver.findElement(HomePage.soluResolution).sendKeys(comment);
		driver.findElement(HomePage.soluRootCause).sendKeys(comment);
		driver.findElement(HomePage.soluDiagnosticSteps).sendKeys(comment);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
		driver.findElement(HomePage.soluPrivateNotesEditPanel).sendKeys(comment);
		driver.findElement(HomePage.solutionSubmit).click();	 
	}

	public void uncheckAllCheckboxes() throws InterruptedException
	{
		driver.findElement(HomePage.discussionFilter).click();
		driver.findElement(HomePage.uncheckAllFilters).click();
	}
	public void checkUncheckCaseDescriptionCheckbox()
	{
		driver.findElement(HomePage.caseDescCheckbox).click();
		driver.findElement(HomePage.discussionFilter).click();
	}
	
	public void checkUncheckBugzillaCommentsCheckbox()
	{
		driver.findElement(HomePage.bugzillaCheckbox).click();
		driver.findElement(HomePage.discussionFilter).click();
	}

	public void checkUncheckAttachmentCheckbox()
	{
		driver.findElement(HomePage.attachementsCheckbox).click();
		driver.findElement(HomePage.discussionFilter).click();
	}

	public void checkUncheckMessagePublicCommentCheckbox() throws InterruptedException
	{
		scrollInto(HomePage.commentTextArea);
		driver.findElement(HomePage.messagesCheckbox).click();
		driver.findElement(HomePage.discussionFilter).click();
	}

	public void checkUncheckPrivateCaseNotesCheckbox()
	{
		driver.findElement(HomePage.privateCaseNoteCheckbox).click();
		driver.findElement(HomePage.discussionFilter).click();
	}

	public void checkUncheckChatTranscrpitCheckbox()
	{
		driver.findElement(HomePage.chatTranscriptCheckBox).click();
		driver.findElement(HomePage.discussionFilter).click();
	}
	
	public String getLastHistoryEntry() throws InterruptedException{

		Thread.sleep(2000);
		String entry = driver.findElement(HomePage.firstHistoryLine).getText();
		return entry;
	}

	public void cqiFromTaskActions() throws InterruptedException {
		waitUntillClickable(HomePage.taskActionsDropdown);
		driver.findElement(HomePage.taskActionsDropdown).click();
		Thread.sleep(2000);
		driver.findElement(HomePage.cqiOption).click();
	}

	public void cqisqiReview() throws Exception
	{
//		List<WebElement> buttons = driver.findElements(By.xpath("//h4[@class='fc3qvhm']//following-sibling::div[1]//input"));
//		for(WebElement we:buttons)
//		{
//
//			we.click();
//			((JavascriptExecutor) driver).executeScript(
//					"arguments[0].scrollIntoView();", we);
//
//		}
//		driver.findElement(By.xpath("//button[@id='entity-review-SupportCase-submit-button']")).click();
		
		List<WebElement> radioButtonsOnSQIReview = driver.findElements(By.xpath("//input[@type='radio']"));
		Thread.sleep(2000);
		for (int i = 0; i < radioButtonsOnSQIReview.size(); i++) {
			if (i % 3 == 0) {
				Thread.sleep(2000);
				System.out.println("index :: " + i);
				Thread.sleep(2000);
				radioButtonsOnSQIReview.get(i).click();

				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
						radioButtonsOnSQIReview.get(i));
			}
		}

		List<WebElement> radioButtonsOnSQIReview2 = driver.findElements(By.xpath("//input[@type='radio']"));
		if (radioButtonsOnSQIReview2.size() > 50) {

			for (int i = radioButtonsOnSQIReview.size(); i < radioButtonsOnSQIReview2.size(); i++) {
				if (i % 3 == 0) {
					Thread.sleep(1100);
					radioButtonsOnSQIReview2.get(i).click();
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
							radioButtonsOnSQIReview2.get(i));
				}
			}
		}
		driver.findElement(By.xpath("//button[@id='entity-review-KnowledgeBaseSolution-submit-button']")).click();
		//driver.findElement(By.xpath("//button//span[text()='Submit']")).click();
	}

	public void clickChatter(){

		waitUntillClickable(HomePage.chatterTab);
		driver.findElement(HomePage.chatterTab).click();
	}

	public void sqiFromTaskActions() throws InterruptedException {
		waitUntillClickable(HomePage.solutionAction);
		driver.findElement(HomePage.solutionAction).click();
		Thread.sleep(2000);
		driver.findElement(HomePage.sqiOption).click();

	}


	public void searchAndChangeOption(By locator, String newCaseStatus) throws InterruptedException {
		waitUntillClickable(locator);	
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.click(driver.findElement(locator)).sendKeys(newCaseStatus+ Keys.TAB).build().perform();	
		Thread.sleep(2000);	
		

	}

	public void changeIntCaseStatus(String newCaseStatus) throws InterruptedException {
		Thread.sleep(5000);
		clickAt(HomePage.changeIntCaseStatusWithCommentPickList);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(1000,0)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='"+newCaseStatus+"']")).click();
		Thread.sleep(3000);

	}

	public void replyToComment(String replyToCommentText) throws InterruptedException {
		clickAt(HomePage.replyToCommentLink);
		enterCommentText(replyToCommentText);
		System.out.println("Replied to the comment.....");
	}

	public void convertPrivateToPublicComment() throws InterruptedException {
		clickAt(HomePage.privateCommentEditButton);
		Thread.sleep(3000);
		driver.findElement(HomePage.privateToPublicCheckBox).click();
	}

	public void editPrivateComment() throws Exception{
		scrollInto(HomePage.privateCommentEditButton);
		clickAt(HomePage.privateCommentEditButton);
		Thread.sleep(3000);
		enterCommentTextForPrivate("Editing on Private note");	
	}
	
	public void enterCommentTextForPrivate(String comment) {
		waitUntillClickable(HomePage.privateCommentTextBox);
		driver.findElement(HomePage.privateCommentTextBox).click();
		driver.findElement(HomePage.privateCommentTextBox).clear();
		driver.findElement(HomePage.privateCommentTextBox).sendKeys(comment);
		waitUntillClickable(HomePage.privatePostCommentButton);
		driver.findElement(HomePage.privatePostCommentButton).click();
	}
	
	public void clickPrivateCommentPostButton() {
		waitUntillClickable(HomePage.privateToPublicCommentPostButton);
		driver.findElement(HomePage.privateToPublicCommentPostButton).click();
	}

	public void editPrivateCommentText(String newCommentText) {
		clickAt(HomePage.privateCommentEditButton);
		driver.findElement(HomePage.editPrivateCommentTextArea).clear();
		driver.findElement(HomePage.editPrivateCommentTextArea).click();
		driver.findElement(HomePage.editPrivateCommentTextArea).sendKeys(newCommentText); 
	}

	public void selectCaseResoution(String caseResolution) throws InterruptedException {
		Thread.sleep(5000);
		//driver.findElement(HomePage.resolutionWithCommentPickList).click();
		driver.findElement(By.xpath("//div[text()='Select...']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(1000,0)", "");
		driver.findElement(By.xpath("//div[text()='"+caseResolution+"']")).click();
		Thread.sleep(3000);
	}

	public void clickLinkOfComment() throws InterruptedException {
		clickAt(HomePage.anchorLinkOfComment);
		Thread.sleep(3000);
	}

	public void searchKCSbykeyword(String searchKeyword) {
		waitUntillClickable(HomePage.kcsSearchBox);
		driver.findElement(HomePage.kcsSearchBox).sendKeys(searchKeyword);
		driver.findElement(HomePage.kcsSearchButton).click();
	}

	public void openUserPreferences() throws InterruptedException {

		driver.findElement(HomePage.userPreferencesOption).click();
		driver.findElement(By.xpath("//span[text()='Preferences']")).click();
		Thread.sleep(3000);
	}

	public void changeUserPrimaryLanguage(String newLanguage) throws Exception {
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(5000);
		driver.findElement(HomePage.userPrimaryLanguage).click();
		driver.findElement(By.xpath("//span[@class='Select-arrow']")).click();
		driver.findElement(By.xpath("//div[text()='"+newLanguage+"']")).click();
		waitUntillClickable(HomePage.selectPrimaryLangButton);
		Thread.sleep(10000);
		driver.findElement(HomePage.selectPrimaryLangButton).click();
		Thread.sleep(3000);
	}

	public void removePrimaryLanguage(String language) throws Exception {
		driver.manage().window().maximize();
		Thread.sleep(3000);
		waitUntillClickable(HomePage.userPrimaryLanguage);
		driver.findElement(HomePage.userPrimaryLanguage).click();
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		System.out.println(driver.findElement(HomePage.primarylanguage).getSize());
		System.out.println(driver.findElement(HomePage.primarylanguage).getText());
		List<WebElement> divs = driver.findElements(By.xpath("//div[@class='Select-multi-value-wrapper']/div[@class='Select-value']"));
		System.out.println(divs.size());
		for(WebElement div : divs) {
			System.out.println(div.getText());
			if(div.getText().contains(language)) {
				driver.findElement(By.xpath("(//div/span[@class='Select-value-icon'])[3]")).click();
				break;
			}
		}
		////span[text()='Product Filters']/parent::h3/div
		driver.findElement(By.xpath("//div[@class='btn-group']//button[2]")).click();
		Thread.sleep(3000);
	}

	public void addWeekdaySBRPreferences(String newSBRCode) throws InterruptedException
	{
		waitUntillClickable(HomePage.userWeekdaySBRPreferences);
		driver.findElement(HomePage.userWeekdaySBRPreferences).click();
		clickAt(By.xpath("//div[@class='Select-control']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(1000,0)", "");
		driver.findElement(By.xpath("//div[text()='"+newSBRCode+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='btn-group']//button[2]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(HomePage.weekdaySBR).getText());

	}

	public void removeWeekdaySBRPreferences(String SBRCode) throws InterruptedException
	{
		waitUntillClickable(HomePage.userWeekdaySBRPreferences);
		driver.findElement(HomePage.userWeekdaySBRPreferences).click();
		List<WebElement> divs = driver.findElements(By.xpath("//div[@class='Select-multi-value-wrapper']/div[@class='Select-value']"));
		System.out.println(divs.size());
		for(WebElement div : divs) {
			System.out.println(div.getText());
			System.out.println(SBRCode);
			System.out.println(div.getTagName());
			if(div.getText().contains(SBRCode)) {
				System.out.println("inside if : " +div.getText());
				System.out.println(div.toString());
				div.findElement(By.xpath("//div[@class='Select-multi-value-wrapper']/div[@class='Select-value']["+divs.size()+"]/span[@class='Select-value-icon']")).click();
				break;
			}
		}
		driver.findElement(By.xpath("//div[@class='btn-group']//button[2]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(HomePage.weekdaySBR).getText());
	}

	public void addCaseTagPreferences(String newCaseTag) throws InterruptedException
	{
		waitUntillClickable(HomePage.userCaseTagPreferences);
		driver.findElement(HomePage.userCaseTagPreferences).click();
		clickAt(By.xpath("//div[@class='Select-control']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(1000,0)", "");
		driver.findElement(By.xpath("//div[text()='"+newCaseTag+"']")).click();
		driver.findElement(By.xpath("//div[@class='btn-group']//button[2]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(HomePage.caseTag).getText());

	}

	public void removeCaseTagPreferences(String caseTag) throws InterruptedException
	{
		waitUntillClickable(HomePage.userCaseTagPreferences);
		driver.findElement(HomePage.userCaseTagPreferences).click();
		List<WebElement> divs = driver.findElements(By.xpath("//div[@class='Select-multi-value-wrapper']/div[@class='Select-value']"));
		System.out.println(divs.size());
		for(WebElement div : divs) {
			if(div.getText().contains(caseTag)) {
				div.findElement(By.xpath("//div[@class='Select-multi-value-wrapper']/div[@class='Select-value']["+divs.size()+"]/span[@class='Select-value-icon']")).click();
				break;
			}
		}
		driver.findElement(By.xpath("//div[@class='btn-group']//button[2]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(HomePage.caseTag).getText());
	}

	public boolean linkForChatter(String caseNo) {
		
		return driver.findElement(By.xpath("//a[contains(@href,'#/case/"+caseNo+"/discussion')]//span[@class='caseLink']")).isDisplayed();	
	}
	
	public void serachKeyword(String keyword) throws InterruptedException {
		waitUntillClickable(HomePage.searchKeywordTextBox);
		driver.findElement(HomePage.searchKeywordTextBox).clear();
		driver.findElement(HomePage.searchKeywordTextBox).click();
		driver.findElement(HomePage.searchKeywordTextBox).sendKeys(keyword);
		waitUntillClickable(HomePage.searchSubmitButton);
	}

	public void clickSearchSubmitButton() {
		waitUntillClickable(HomePage.searchSubmitButton);
		driver.findElement(HomePage.searchSubmitButton).click();
	}

	public void checkPagination(String rowCount)
	{
		clickAt(By.xpath("//span[@class='select-wrap -pageSizeOptions']"));
		new Select(driver.findElement(By.xpath("//span[@class='select-wrap -pageSizeOptions']/select"))).selectByValue(rowCount);
		((JavascriptExecutor) driver).executeScript("scroll(0, -250);");
	}

	public int getAllRoleCount(){

		List<WebElement> allRoles=driver.findElements(HomePage.priorityButtonGroup);
		int roleCount = allRoles.size();
		return roleCount;		 
	}

	public HashMap<String,String> roleScores (){

		HashMap<String, String> roleTemplate = new HashMap<String, String>();

		By roleTemplateTable =  By.xpath("//tbody");
		WebElement roleTable = driver.findElement(roleTemplateTable);

		List<WebElement> rowsCount = roleTable.findElements(By.xpath("tr"));
		System.out.println("Total roles in this template: "+ rowsCount.size());
		for (WebElement rowElement:rowsCount){
			String roleName = (rowElement.findElement(By.xpath("td[1]")).getText());
			String roleScore =(rowElement.findElement(By.xpath("td[2]")).getText());
			roleTemplate.put(roleName, roleScore);
		}
		driver.findElement(By.xpath("//button[contains(text(),'Update Role Preferences')]")).click(); 
		return roleTemplate;

	}

	public void clickActionMenu(String actionMenu) throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(HomePage.actionDropDownList).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='pointer'][contains(text(),'"+actionMenu+"')]")).click();
		Thread.sleep(5000);
	}

	public void clickViewAsAnotherUser(String otherUserName) throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='user-select']//input")).sendKeys(otherUserName);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(.,'Bowde')]")).click();
		driver.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		Thread.sleep(10000);
	}

	public void deleteNEP()
	{
		driver.findElement(By.xpath("//button[contains(., 'Yes')]")).click();
		waitUntillClickable(HomePage.newNEPButton);
	}

	public void addSBRAscensionRole() throws Exception
	{
		driver.findElement(By.xpath("//button[contains(.,'Add Role')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Automation Suit Test Role");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Automation Test Role-Ops");
		driver.findElement(By.xpath("//input[@name='sbrRequired']")).click();
		driver.findElement(By.xpath("//input[@name='ascensionRole']")).click();
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		Thread.sleep(5000);
	}

	public void deleteSBRAscensionRole() throws Exception
	{
		List<WebElement> roles = driver.findElements(By.xpath("//div[@class='rt-tbody']/div[@class='rt-tr-group']"));
		System.out.println(roles.size());
		for(WebElement role : roles)
		{
			String roleName = role.findElement(By.xpath(".//div[@class='rt-td'][2]")).getText();
			if (roleName.equals("Automation Suit Test Role"))
			{
				role.findElement(By.xpath(".//button[contains(.,'Remove')]")).click();
				Thread.sleep(3000);
				role.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
				Thread.sleep(3000);
				break;
			}
		}
	}

	public void canEditIsAscensionRole() throws Exception
	{
		List<WebElement> roles = driver.findElements(By.xpath("//div[@class='rt-tbody']/div[@class='rt-tr-group']"));
		System.out.println(roles.size());
		for(WebElement role : roles)
		{
			String roleName = role.findElement(By.xpath(".//div[@class='rt-td'][2]")).getText();
			System.out.println(roleName);
			if (role.findElement(By.xpath(".//div[@class='rt-td'][2]")).getText().equals("Yes"))
			{
				role.findElement(By.xpath(".//button[contains(.,'Edit')]")).click();
				Thread.sleep(3000);
			}
		}
	}
	
	public void clickToRedirectToDiscussionTab() throws Exception
	{
		scrollInto(By.xpath("//div[@class='clearfix']"));
		waitUntillClickable(HomePage.caseLinkToDiscussionFromChatter);
		Thread.sleep(3000);
		driver.findElement(HomePage.caseLinkToDiscussionFromChatter).click();
	}

	public int getBugzillaItemsCount (){ 
		
		int count = driver.findElements(By.id("textBugzilla")).size();
		return count;
	}
	
	
public int getReplyLinkCount (){ 
		
		int count = driver.findElements(By.xpath("//span[contains(.,'Reply')]")).size();
		return count;
	}


	public void changeCaseContact(String newContact) throws InterruptedException {
		clickAt(HomePage.contactName);
		driver.findElement(By.xpath("//div[@id='case-contact-value']")).click();
		Thread.sleep(3000);
		Select picklist = new Select(driver.findElement(By.xpath("(//select[@name='caseContact'])[1]")));
		picklist.selectByVisibleText(newContact);
		scrollInto(By.xpath(("//div[@id='value-contact-email']")));
		clickAt(HomePage.saveCaseContact);
	}

	public boolean checkFTSFlag() {
		// TODO Auto-generated method stub

    	return driver.findElement(By.xpath("//div[@class='margin-top-medium']//label[5]//input[1]")).isSelected();
	}

	public String checkDiscussionLabel() {
		waitUntillClickable(discussionsTab);
		return driver.findElement(discussionsTab).getText();
	}

	public String checkAttachmentsLabel() {
		waitUntillClickable(attachmentsTab);
		return driver.findElement(attachmentsTab).getText();
	}
}



