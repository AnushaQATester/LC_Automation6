package com.cucumber.managers;

import org.apache.log4j.xml.DOMConfigurator;

import com.cucumber.PageObjects.*;
import com.cucumber.utility.Constants;
import com.cucumber.utility.Log;

public class PageObjectManager {

	// private WebDriver driver;

	private LoginPageObjects login;

	private Log log;

	private AdminApprovalSettingPageObjects approval;

	private AdminVerifiedCertificatesPageObjects verify;

	private AdminRateContractListPageObjects ratecontract;

	private AdminCreditsListPageObjects credits;

	private BulkGeneratedCertificatesPageObjects bulkgc;

	private AdminUpdateProfilePageObjects updtprf;

	private OrgMgmtViewInstitutionsPageObjects orgmgmtview;

	private AdminReceiptsPageObjects receipts;

	private UserUpdateProfilePageObjects updateprf;

	private UserChangePasswordPageObjects uchangepwd;

	private OrgMgmtCreateInstitutionPageObjects orgmgmtcreateinstitution;

	private AdminChangePasswordPageObjects achangepwd;

	private OrgSalesChangePasswordPageObjects oschangepwd;

	private AdminRegistrationPageObjects registration;

	private UserNewMailEditPageObjects newmail;

	private AdminCertificateNamesPageObjects certificateNames;

	private UserLaunchTheApplicationPageObjects userlaunchapplication;

	private AdminLaunchTheApplicationPageObjects adminlaunchapplication;

	private OrgSalesLaunchTheApplicationPageObjects saleslaunchapplication;

	private OrgSalesLaunchTheApplicationPageObjects mgmtlaunchapplication;

	private OrgSalesViewUserListPageObjects userlist;

	private OrgMgmtUpdateProfilePageObjects orgmgmtupdtprf;

	private AdminGeneratedCertificatesPageObjects admingeneratedcertificates;

	private OrgMgmtChangePasswordPageObjects orgmgmtchangepassword;

	private UserGenerateSingleWithoutApprovalPageObjects usergeneratesinglewithapproval;

	private AdminCertificateTypePageObjects admincertificatetype;

	private UserVerificationURLObjects userverificationurl;

	private AdminVerificationURLObjects adminverificationurl;

	private UserSingleGenerationWithApprovalPageObjects singlegenerationwithapproal;

	private OrgSalesViewInstitutionsPageObjects orgsalesviewinstitutions;
	

	private UserGeneratedCertificatesPageObjects usergeneratedcertificates;

	private UserVerifiedCertificatesPageObjects userverifiedcertificates;

	private UserRecentCertificateVerificationsPageObjects recentcertificateverifications;

	private UserRecentCertificateGenerationsPageObjects recentcertificategenerations;

	private UserRecentCertificateGenerationsandVerificationsSendMailPageObjects sendmail;

	private UserRecentCertificateGenerationsandVerificationsQRCodePageObjects downloadqrcode;

	private UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects originalcertificates;

	private UserRecentCertificateGenerationsRecallPageObjects recall;

	private UserRecentCertificateGenerationsRevokePageObjects revoke;

	private UserBacktotopbuttonPageObjects backtotop;

	private UserApplicationTitlePageObjects applicationtitle;

	private UserWelcomeTextPageObjects welcometext;

	private AdminRecentCertificateGenerationsRevokePageObjects adminrevoke;

	private AdminRecentCertificateGenerationsRecallPageObjects adminrecall;

	private AdminRecentCertificateGenerationsandVerificationsSendMailPageObjects adminsendmail;

	private AdminRecentCertificateGenerationsandVerificationsQRCodePageObjects admindownloadqrcode;

	private AdminWelcomeTextPageObjects adminwelcometext;

	private AdminApplicationTitlePageObjects adminapplicationtitle;

	private AdminRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects adminoriginalcertificates;

	private AdminCertificateApprovalsPageObjects certificateapprovals;

	private AdminBacktotopbuttonPageObjects adminbacktotop;

	private AdminNewMailEditPageObjects newemailedit;

	private AdminUpdateInstitutionPageObjects adminupdateinstition;

	private UserDashboardViewAllGenerationsPageObjects viewallgenerations;

	private UserDashboardRecentCertificateGenerationsPageObjects dbrecentcertificategeneration;

	private AdminAddCertificateTypePageObjects addcertificatetype;

	private UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects certificatetypedropdown;

	private UserGenerateBulkWithoutApprovalPageObjects userbulkwithoutapproval;

	private UserDashboardGenerationsGraphPageObjects generationsgraph;

	private UserDashboardVerificationsGraphPageObjects verificationsgraph;

	private AdminDashboardGenerationsGraphPageObjects admingenerationsgraph;

	private AdminDashboardVerificationsGraphPageObjects adminverificationsgraph;

	private UserGuidelinesPageObjects guidelines;
	
	private UserDashboardGenerationsandVerificationsCountPageObjects genandvencount;
	
	private AdminDashboardGenerationsandVerificationsCountPageObjects admingenandvencount;
	
	private UserVerifyCertificateWithEmptyAcademicRefNumfieldPageObjects verifycertiwithemptyrefid;
	
	private UserGeneratedCertificatesWithoutSelectingCheckboxesPageObjects generatedcertificates;
	
	private UserInternalPrintingCSVFileWithSpacesandDotsPageObjects internal;

	private UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects invalidfile;

	private UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsPageObjects invalidemailid;

	private UserInternalPrintingCSVFileStudentEmailWithoutSpecialCharectersPageObjects invalidemail;
	
	private UserVerifyCertificatePageObjects verifycertificate;

	private UserGenerateBulkWithApprovalPageObjects bulkwithapproval;

	private UserInternalPrintingCSVFileWithoutAcademicReferenceNumberPageObjects invalidacrefnum;

	private UserInternalPrintingCSVFileWithSpacesandDotsinAcademicReferenceNumberPageObjects invalidacrefnum1;

	private UserBulkWithoutSelectingCertificatetype invalidbulkdata;

	private UserBulkByUploadingJPGfilePageObjects invalidbulkdata1;

	private UserBulkByUploadingDOCfilePageObjects bulkwithdoc;

	private UserBulkByUploadingDOCXfilePageObjects bulkwithdocx;

	private UserBulkByUploadingJPEGfilePageObjects bulkwithjpeg;
	
	private UserBulkByUploadingPDFfilePageObjects bulkwithpdf;
	
	private UserBulkDashboardLinkPageObjects bulkdashboardlink;
	
	private UserBulkByUploadingCombinationOffilesPageObjects bulkfiles;
	
	private UserGenSingleEmailWithMultipleSpecialcharectersPageObjects invalidemail1;
	
	private UserGenSingleByUploadingJPGfilePageObjects gensinglewithjpg;
	
	private UserGenSingleByUploadingDOCfilePageObjects gensinglewithdoc;
	
	private OrgSalesReceiptsPageObjects salesreceipts;
	
	private UserGenSingleMobileNumWithAbove10digitsPageObjects genwithinvalidmobilenum1;
	
	private UserGenSingleMobileNumWithless10digitsPageObjects genwithinvalidmobilenum;
	
	private UserGenSingleBygivingFutureMonthandYearPageObjects genwithfuturemonth;
	
	private UserGenSingleByUploadingDOCXfilePageObjects gensinglewithdocx;
	
	private UserInternalPrintingPageObjects internalptinting;
	
	private UserInternalPrintingwithoutuploadingCSVfilePageObjects interprintwithempty;
	
	private UserBulkUploadingandRemovingthefilePageObjects emptystuname;
	
	private UserVerifiedCertificatesWithoutEnablecheckboxesPageObjects verifiedcertificates;
	
	private UserGeneratedCertificatesWithoutEnablecheckboxesPageObjects generatedcertificates1;
	
	private UserVerifyCertificateWithEmptyStudentNamePageObjects Verifstuname;

	private UserVerifyCertificatesStudentNameWithSpacesandDotsPageObjects verifStuDots;
	
	private UserBulkByUploadingCombinationOffilesPageObjects Bulkcombo;
	
	private UserGenSingleByUploadingJPEGfilePageObjects gensinwithjpeg;
	
	private UserVerifyCertificateVerifierEmailWithSpacesandDotsPageObjects verifieremail;
	
	private UserVerifyCertificateWithoutSpecialcharactersVerifierEmailPageObjects withoutverifieremail;
	
	private UserGenSingleWithApprovalPageObjects withapproval;

	private UserInternalPrintingByUploadingCSVFileWithInvalidIssueYearandMonthPageObjects invaliyearmonth;

	private UserInternalPrintingByUploadInvalidCSVFIlePageObjects invalidcsv;
	
	private UserVerifyCertificateVerifierNameWithAlphanumericsPageObjects invalidverifiername;

	private UserVerifyCertificateVerifierNameWithSpacesandDotsPageObjects invalidverifiername1;

	private UserInternalPrintingCSVFIleStudentNameWithAlphabetsandNumericsPageObjects invalidcsv1;

	private UserInternalPrintingUploadCSVFIleWithoutEmailidPageObjects invalidcsv2;

	private UserGenerateBulkUploadCSVFileEmailIdWithSpacesandDotsPageObjects bulkinvalidcsv;

	private UserGenerateBulkUploadCSVFileWithEmptyAcademicRefNumColumn bulkinvalidcsv1;

	private UserGenerateBulkByUploadCSVFileWithInvalidCertificateNamePageObjects invalidcertificatename;

	private UserGenerateBulkByUploadCSVFileWithoutIssueMonthObjects withoutissuemonth;

	private UserGenerateBulkByUploadCSVFileWithEmptyStudentNamePageObjects emptystuname1;

	private UserGenerateBulkByUploadCSVFileWithoutIssueYearObjects withoutissueyear;
	
	private UserGenerateBulkByUploadCSVFileWithInvalidCertificateTypePageObjects invalidcertificatetype;

	private UserGenerateBulkByUploadCSVFileWithEmptyMobileNumberPageObjects emptymobilenum;

	private UserGenerateBulkByUploadCSVFileWithEmptyCertificateNamePageObjects emptycertificatename1;

	private UserInternalPrintingUploadCSVFIleWithoutStudentNamePageObjects emptystudentname1;

	private UserInternalPrintingByUploadingCSVFileWithInvalidCertificateTypePageObjects invalidcertificatetype1;

	
	
	
	public PageObjectManager() {
		// this.driver = driver;
		DOMConfigurator.configure("log4j.xml");
	}

	public LoginPageObjects getlogin() {
		if (login == null) {
			login = new LoginPageObjects(Constants.driver);
		}
		return login;
	}


	public AdminApprovalSettingPageObjects getapproval() {
		if (approval == null) {
			approval = new AdminApprovalSettingPageObjects(Constants.driver);
		}
		return approval;
	}

	public AdminVerifiedCertificatesPageObjects getverify() {
		if (verify == null) {
			verify = new AdminVerifiedCertificatesPageObjects(Constants.driver);
		}
		return verify;
	}

	public AdminRateContractListPageObjects getratecontract() {
		if (ratecontract == null) {
			ratecontract = new AdminRateContractListPageObjects(Constants.driver);
		}
		return ratecontract;
	}

	public AdminCreditsListPageObjects getcredits() {
		if (credits == null) {
			credits = new AdminCreditsListPageObjects(Constants.driver);
		}
		return credits;
	}

	public BulkGeneratedCertificatesPageObjects getbulkgc() {
		if (bulkgc == null) {
			bulkgc = new BulkGeneratedCertificatesPageObjects(Constants.driver);
		}
		return bulkgc;
	}

	public AdminUpdateProfilePageObjects getupdtprf() {
		if (updtprf == null) {
			updtprf = new AdminUpdateProfilePageObjects(Constants.driver);
		}
		return updtprf;
	}

	public OrgMgmtViewInstitutionsPageObjects getorgmgmtview() {
		if (orgmgmtview == null) {
			orgmgmtview = new OrgMgmtViewInstitutionsPageObjects(Constants.driver);
		}
		return orgmgmtview;
	}

	public AdminReceiptsPageObjects getreceipts() {
		if (receipts == null) {
			receipts = new AdminReceiptsPageObjects(Constants.driver);
		}
		return receipts;
	}

	public UserUpdateProfilePageObjects getupdate() {
		if (updateprf == null) {
			updateprf = new UserUpdateProfilePageObjects(Constants.driver);
		}
		return updateprf;
	}
	public UserChangePasswordPageObjects getuchangepwd() {
		if (uchangepwd == null) {
			uchangepwd = new UserChangePasswordPageObjects(Constants.driver);
		}
		return uchangepwd;
	}
	public OrgMgmtCreateInstitutionPageObjects getorgmgmtcreateinstitution() {
		if (orgmgmtcreateinstitution == null) {
			orgmgmtcreateinstitution = new OrgMgmtCreateInstitutionPageObjects(Constants.driver);
		}
		return orgmgmtcreateinstitution;
	}
	public AdminChangePasswordPageObjects getachangepwd() {
		if (achangepwd == null) {
			achangepwd = new AdminChangePasswordPageObjects(Constants.driver);
		}
		return achangepwd;
	}
	public OrgSalesChangePasswordPageObjects getoschangepwd() {
		if (oschangepwd == null) {
			oschangepwd = new OrgSalesChangePasswordPageObjects(Constants.driver);
		}
		return oschangepwd;
	}
	public AdminRegistrationPageObjects getregistration() {
		if (registration == null) {
			registration = new AdminRegistrationPageObjects(Constants.driver);
		}
		return registration;
	}
	public UserNewMailEditPageObjects getnewmail() {
		if (newmail == null) {
			newmail = new UserNewMailEditPageObjects(Constants.driver);
		}
		return newmail;
	}
	public AdminCertificateNamesPageObjects getcertificateNames() {
		if (certificateNames == null) {
			certificateNames = new AdminCertificateNamesPageObjects(Constants.driver);
		}
		return certificateNames;
	}

	public UserLaunchTheApplicationPageObjects getuserlaunchapplication() {
		if (userlaunchapplication == null) {
			userlaunchapplication = new UserLaunchTheApplicationPageObjects(Constants.driver);
		}
		return userlaunchapplication;
	}
	public AdminLaunchTheApplicationPageObjects getadminlaunchapplication() {
		if (adminlaunchapplication == null) {
			adminlaunchapplication = new AdminLaunchTheApplicationPageObjects(Constants.driver);
		}
		return adminlaunchapplication;
	}
	public OrgSalesLaunchTheApplicationPageObjects getsaleslaunchapplication() {
		if (saleslaunchapplication == null) {
			saleslaunchapplication = new OrgSalesLaunchTheApplicationPageObjects(Constants.driver);
		}
		return saleslaunchapplication;
	}
	public OrgSalesLaunchTheApplicationPageObjects getmgmtlaunchapplication() {
		if (mgmtlaunchapplication == null) {
			mgmtlaunchapplication = new OrgSalesLaunchTheApplicationPageObjects(Constants.driver);
		}
		return mgmtlaunchapplication;
	}
	public OrgSalesViewUserListPageObjects getuserlist() {
		if (userlist == null) {
			userlist = new OrgSalesViewUserListPageObjects(Constants.driver);
		}
		return userlist;
	}
	public OrgMgmtUpdateProfilePageObjects getorgmgmtupdtprf() {
		if (orgmgmtupdtprf == null) {
			orgmgmtupdtprf = new OrgMgmtUpdateProfilePageObjects(Constants.driver);
		}
		return orgmgmtupdtprf;
	}

	public AdminGeneratedCertificatesPageObjects getadmingeneratedcertificates() {
		if (admingeneratedcertificates == null) {
			admingeneratedcertificates = new AdminGeneratedCertificatesPageObjects(Constants.driver);
		}
		return admingeneratedcertificates;
	}

	public OrgMgmtChangePasswordPageObjects getorgmgmtchangepassword() {
		if (orgmgmtchangepassword == null) {
			orgmgmtchangepassword = new OrgMgmtChangePasswordPageObjects(Constants.driver);
		}
		return orgmgmtchangepassword;
	}
	public UserGenerateSingleWithoutApprovalPageObjects getusergeneratesinglewithoutapproval() {
		if (usergeneratesinglewithapproval == null) {
			usergeneratesinglewithapproval = new UserGenerateSingleWithoutApprovalPageObjects(Constants.driver);
		}
		return usergeneratesinglewithapproval;
	}


	public AdminCertificateTypePageObjects getadmincertificatetype() {
		if (admincertificatetype == null) {
			admincertificatetype = new AdminCertificateTypePageObjects(Constants.driver);
		}
		return admincertificatetype;
	}

	public UserVerificationURLObjects getuserverificationurl() {
		if (userverificationurl == null) {
			userverificationurl = new UserVerificationURLObjects(Constants.driver);
		}
		return userverificationurl;
	}

	public AdminVerificationURLObjects getadminverificationurl() {
		if (adminverificationurl == null) {
			adminverificationurl = new AdminVerificationURLObjects(Constants.driver);
		}
		return adminverificationurl;
	}

	public UserSingleGenerationWithApprovalPageObjects getsinglegenerationwithapproal() {
		if (singlegenerationwithapproal == null) {
			singlegenerationwithapproal = new UserSingleGenerationWithApprovalPageObjects(Constants.driver);
		}
		return singlegenerationwithapproal;
	}

	public OrgSalesViewInstitutionsPageObjects getorgsalesviewinstitutions() {
		if (orgsalesviewinstitutions == null) {
			orgsalesviewinstitutions = new OrgSalesViewInstitutionsPageObjects(Constants.driver);
		}
		return orgsalesviewinstitutions;
	}


	public UserGeneratedCertificatesPageObjects getusergeneratedcertificates() {
		if (usergeneratedcertificates == null) {
			usergeneratedcertificates = new UserGeneratedCertificatesPageObjects(Constants.driver);
		}
		return usergeneratedcertificates;
	}


	public UserVerifiedCertificatesPageObjects getuserverifiedcertificates() {
		if (userverifiedcertificates == null) {
			userverifiedcertificates = new UserVerifiedCertificatesPageObjects(Constants.driver);
		}
		return userverifiedcertificates;
	}

	public UserRecentCertificateVerificationsPageObjects getrecentcertificateverifications() {
		if (recentcertificateverifications == null) {
			recentcertificateverifications = new UserRecentCertificateVerificationsPageObjects(Constants.driver);
		}
		return recentcertificateverifications;
	}
	public UserRecentCertificateGenerationsPageObjects getrecentcertificategenerations() {
		if (recentcertificategenerations == null) {
			recentcertificategenerations = new UserRecentCertificateGenerationsPageObjects(Constants.driver);
		}
		return recentcertificategenerations;
	}

	public UserRecentCertificateGenerationsandVerificationsSendMailPageObjects getsendmail() {
		if (sendmail == null) {
			sendmail = new UserRecentCertificateGenerationsandVerificationsSendMailPageObjects(Constants.driver);
		}
		return sendmail;
	}
	public UserRecentCertificateGenerationsandVerificationsQRCodePageObjects getdownloadqrcode() {
		if (downloadqrcode == null) {
			downloadqrcode = new UserRecentCertificateGenerationsandVerificationsQRCodePageObjects(Constants.driver);
		}
		return downloadqrcode;
	}

	public UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects getoriginalcertificates() {
		if (originalcertificates == null) {
			originalcertificates = new UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects(Constants.driver);
		}
		return originalcertificates;
	}

	public UserRecentCertificateGenerationsRecallPageObjects getrecall() {
		if (recall == null) {
			recall = new UserRecentCertificateGenerationsRecallPageObjects(Constants.driver);
		}
		return recall;
	}

	public UserRecentCertificateGenerationsRevokePageObjects getrevoke() {
		if (revoke == null) {
			revoke = new UserRecentCertificateGenerationsRevokePageObjects(Constants.driver);
		}
		return revoke;
	}

	public UserBacktotopbuttonPageObjects getbacktotop() {
		if (backtotop == null) {
			backtotop = new UserBacktotopbuttonPageObjects(Constants.driver);
		}
		return backtotop;
	}

	public UserApplicationTitlePageObjects getapplicationtitle() {
		if (applicationtitle == null) {
			applicationtitle = new UserApplicationTitlePageObjects(Constants.driver);
		}
		return applicationtitle;
	}

	public UserWelcomeTextPageObjects getwelcometext() {
		if (welcometext == null) {
			welcometext = new UserWelcomeTextPageObjects(Constants.driver);
		}
		return welcometext;
	}

	public AdminRecentCertificateGenerationsRevokePageObjects getadminrevoke() {
		if (adminrevoke == null) {
			adminrevoke = new AdminRecentCertificateGenerationsRevokePageObjects(Constants.driver);
		}
		return adminrevoke;
	}

	public AdminRecentCertificateGenerationsRecallPageObjects getadminrecall() {
		if (adminrecall == null) {
			adminrecall = new AdminRecentCertificateGenerationsRecallPageObjects(Constants.driver);
		}
		return adminrecall;
	}

	public AdminRecentCertificateGenerationsandVerificationsSendMailPageObjects getadminsendmail() {
		if (adminsendmail == null) {
			adminsendmail = new AdminRecentCertificateGenerationsandVerificationsSendMailPageObjects(Constants.driver);
		}
		return adminsendmail;
	}

	public AdminRecentCertificateGenerationsandVerificationsQRCodePageObjects getadmindownloadqrcode() {
		if (admindownloadqrcode == null) {
			admindownloadqrcode = new AdminRecentCertificateGenerationsandVerificationsQRCodePageObjects(Constants.driver);
		}
		return admindownloadqrcode;
	}

	public AdminWelcomeTextPageObjects getadminwelcometext() {
		if (adminwelcometext == null) {
			adminwelcometext = new AdminWelcomeTextPageObjects(Constants.driver);
		}
		return adminwelcometext;
	}

	public AdminApplicationTitlePageObjects getadminapplicationtitle() {
		if (adminapplicationtitle == null) {
			adminapplicationtitle = new AdminApplicationTitlePageObjects(Constants.driver);
		}
		return adminapplicationtitle;
	}

	public AdminRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects getadminoriginalcertificates() {
		if (adminoriginalcertificates == null) {
			adminoriginalcertificates = new AdminRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects(Constants.driver);
		}
		return adminoriginalcertificates;
	}

	public AdminCertificateApprovalsPageObjects getcertificateapprovals() {
		if (certificateapprovals == null) {
			certificateapprovals = new AdminCertificateApprovalsPageObjects(Constants.driver);
		}
		return certificateapprovals;
	}

	public AdminBacktotopbuttonPageObjects getadminbacktotop() {
		if (adminbacktotop == null) {
			adminbacktotop = new AdminBacktotopbuttonPageObjects(Constants.driver);
		}
		return adminbacktotop;
	}


	public AdminNewMailEditPageObjects getnewemailedit() {
		if (newemailedit == null) {
			newemailedit = new AdminNewMailEditPageObjects(Constants.driver);
		}
		return newemailedit;
	}

	public AdminUpdateInstitutionPageObjects getadminupdateinstition() {
		if (adminupdateinstition == null) {
			adminupdateinstition = new AdminUpdateInstitutionPageObjects(Constants.driver);
		}
		return adminupdateinstition;
	}

	public UserDashboardViewAllGenerationsPageObjects getviewallgenerations() {
		if (viewallgenerations == null) {
			viewallgenerations = new UserDashboardViewAllGenerationsPageObjects(Constants.driver);
		}
		return viewallgenerations;
	}

	public UserDashboardRecentCertificateGenerationsPageObjects getdbrecentcertificategeneration() {
		if (dbrecentcertificategeneration == null) {
			dbrecentcertificategeneration = new UserDashboardRecentCertificateGenerationsPageObjects(Constants.driver);
		}
		return dbrecentcertificategeneration;
	}

	public AdminAddCertificateTypePageObjects getaddcertificatetype() {
		if (addcertificatetype == null) {
			addcertificatetype = new AdminAddCertificateTypePageObjects(Constants.driver);
		}
		return addcertificatetype;
	}

	public UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects getcertificatetypedropdown() {
		if (certificatetypedropdown == null) {
			certificatetypedropdown = new UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects(Constants.driver);
		}
		return certificatetypedropdown;
	}

	public UserGenerateBulkWithoutApprovalPageObjects getuserbulkwithoutapproval() {
		if (userbulkwithoutapproval == null) {
			userbulkwithoutapproval = new UserGenerateBulkWithoutApprovalPageObjects(Constants.driver);
		}
		return userbulkwithoutapproval;
	}

	public UserDashboardGenerationsGraphPageObjects getgenerationsgraph() {
		if (generationsgraph == null) {
			generationsgraph = new UserDashboardGenerationsGraphPageObjects(Constants.driver);
		}
		return generationsgraph;
	}

	public UserDashboardVerificationsGraphPageObjects getverificationsgraph() {
		if (verificationsgraph == null) {
			verificationsgraph = new UserDashboardVerificationsGraphPageObjects(Constants.driver);
		}
		return verificationsgraph;
	}

	public AdminDashboardGenerationsGraphPageObjects getadmingenerationsgraph() {
		if (admingenerationsgraph == null) {
			admingenerationsgraph = new AdminDashboardGenerationsGraphPageObjects(Constants.driver);
		}
		return admingenerationsgraph;
	}

	public AdminDashboardVerificationsGraphPageObjects getadminverificationsgraph() {
		if (adminverificationsgraph == null) {
			adminverificationsgraph = new AdminDashboardVerificationsGraphPageObjects(Constants.driver);
		}
		return adminverificationsgraph;
	}

	public UserGuidelinesPageObjects getguidelines() {
		if (guidelines == null) {
			guidelines = new UserGuidelinesPageObjects(Constants.driver);
		}
		return guidelines;
	}
	
	public UserDashboardGenerationsandVerificationsCountPageObjects getgenandvencount() {
		if (genandvencount == null) {
			genandvencount = new UserDashboardGenerationsandVerificationsCountPageObjects(Constants.driver);
		}
		return genandvencount;
	}
	

	public AdminDashboardGenerationsandVerificationsCountPageObjects getadmingenandvencount() {
		if (admingenandvencount == null) {
			admingenandvencount = new AdminDashboardGenerationsandVerificationsCountPageObjects(Constants.driver);
		}
		return admingenandvencount;
	}
	
	public UserInternalPrintingCSVFileWithSpacesandDotsPageObjects getinternal() {
		if (internal == null) {
			internal = new UserInternalPrintingCSVFileWithSpacesandDotsPageObjects(Constants.driver);
		}
		return internal;
	}
	
	public UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects getinvalidfile() {
		if (invalidfile == null) {
			invalidfile = new UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects(Constants.driver);
		}
		return invalidfile;
	}
	
	public UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsPageObjects getinvalidemailid() {
		if (invalidemailid == null) {
			invalidemailid = new UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsPageObjects(Constants.driver);
		}
		return invalidemailid;
	}
	
	public UserInternalPrintingCSVFileStudentEmailWithoutSpecialCharectersPageObjects getinvalidemail() {
		if (invalidemail == null) {
			invalidemail = new UserInternalPrintingCSVFileStudentEmailWithoutSpecialCharectersPageObjects(Constants.driver);
		}
		return invalidemail;
	}
	
	public UserVerifyCertificatePageObjects getverifycertificate() {
		if (verifycertificate == null) {
			verifycertificate = new UserVerifyCertificatePageObjects(Constants.driver);
		}
		return verifycertificate;
	}
	
	public UserGenerateBulkWithApprovalPageObjects getbulkwithapproval() {
		if (bulkwithapproval == null) {
			bulkwithapproval = new UserGenerateBulkWithApprovalPageObjects(Constants.driver);
		}
		return bulkwithapproval;
	}
	

	public UserInternalPrintingCSVFileWithoutAcademicReferenceNumberPageObjects getinvalidacrefnum() {
		if (invalidacrefnum == null) {
			invalidacrefnum = new UserInternalPrintingCSVFileWithoutAcademicReferenceNumberPageObjects(Constants.driver);
		}
		return invalidacrefnum;
	}
	
	public UserInternalPrintingCSVFileWithSpacesandDotsinAcademicReferenceNumberPageObjects getinvalidacrefnum1() {
		if (invalidacrefnum1 == null) {
			invalidacrefnum1 = new UserInternalPrintingCSVFileWithSpacesandDotsinAcademicReferenceNumberPageObjects(Constants.driver);
		}
		return invalidacrefnum1;
	}
	
	public UserBulkWithoutSelectingCertificatetype getinvalidbulkdata() {
		if (invalidbulkdata == null) {
			invalidbulkdata = new UserBulkWithoutSelectingCertificatetype(Constants.driver);
		}
		return invalidbulkdata;
	}
	
	public UserBulkByUploadingJPGfilePageObjects getinvalidbulkdata1() {
		if (invalidbulkdata1 == null) {
			invalidbulkdata1 = new UserBulkByUploadingJPGfilePageObjects(Constants.driver);
		}
		return invalidbulkdata1;
	}
	
	public UserBulkByUploadingDOCfilePageObjects getbulkwithdoc() {
		if (bulkwithdoc == null) {
			bulkwithdoc = new UserBulkByUploadingDOCfilePageObjects(Constants.driver);
		}
		return bulkwithdoc;
	}
	

	public UserBulkByUploadingDOCXfilePageObjects getbulkwithdocx() {
		if (bulkwithdocx == null) {
			bulkwithdocx = new UserBulkByUploadingDOCXfilePageObjects(Constants.driver);
		}
		return bulkwithdocx;
	}
	
	public UserBulkByUploadingJPEGfilePageObjects getbulkwithjpeg() {
		if (bulkwithjpeg == null) {
			bulkwithjpeg = new UserBulkByUploadingJPEGfilePageObjects(Constants.driver);
		}
		return bulkwithjpeg;
	}
	
	public UserBulkByUploadingPDFfilePageObjects getbulkwithpdf() {
		if (bulkwithpdf == null) {
			bulkwithpdf = new UserBulkByUploadingPDFfilePageObjects(Constants.driver);
		}
		return bulkwithpdf;
	}
	
	public UserBulkDashboardLinkPageObjects getbulkdashboardlink() {
		if (bulkdashboardlink == null) {
			bulkdashboardlink = new UserBulkDashboardLinkPageObjects(Constants.driver);
		}
		return bulkdashboardlink;
	}
	
	public UserBulkByUploadingCombinationOffilesPageObjects getbulkfiles() {
		if (bulkfiles == null) {
			bulkfiles = new UserBulkByUploadingCombinationOffilesPageObjects(Constants.driver);
		}
		return bulkfiles;
	}
	
	
	public UserGenSingleEmailWithMultipleSpecialcharectersPageObjects getinvalidemail1() {
		if (invalidemail1 == null) {
			invalidemail1 = new UserGenSingleEmailWithMultipleSpecialcharectersPageObjects(Constants.driver);
		}
		return invalidemail1;
	}
	
	public UserGenSingleByUploadingJPGfilePageObjects getgensinglewithjpg() {
		if (gensinglewithjpg == null) {
			gensinglewithjpg = new UserGenSingleByUploadingJPGfilePageObjects(Constants.driver);
		}
		return gensinglewithjpg;
	}
	
	public UserGenSingleByUploadingDOCfilePageObjects getgensinglewithdoc() {
		if (gensinglewithdoc == null) {
			gensinglewithdoc = new UserGenSingleByUploadingDOCfilePageObjects(Constants.driver);
		}
		return gensinglewithdoc;
	}
	
	public UserGenSingleByUploadingDOCXfilePageObjects getgensinglewithdocx() {
		if (gensinglewithdocx == null) {
			gensinglewithdocx = new UserGenSingleByUploadingDOCXfilePageObjects(Constants.driver);
		}
		return gensinglewithdocx;
	}
	
	public UserGenSingleBygivingFutureMonthandYearPageObjects getgenwithfuturemonth() {
		if (genwithfuturemonth == null) {
			genwithfuturemonth = new UserGenSingleBygivingFutureMonthandYearPageObjects(Constants.driver);
		}
		return genwithfuturemonth;
	}
	
	public UserGenSingleMobileNumWithless10digitsPageObjects getgenwithinvalidmobilenum() {
		if (genwithinvalidmobilenum == null) {
			genwithinvalidmobilenum = new UserGenSingleMobileNumWithless10digitsPageObjects(Constants.driver);
		}
		return genwithinvalidmobilenum;
	}
	
	public UserGenSingleMobileNumWithAbove10digitsPageObjects getgenwithinvalidmobilenum1() {
		if (genwithinvalidmobilenum1 == null) {
			genwithinvalidmobilenum1 = new UserGenSingleMobileNumWithAbove10digitsPageObjects(Constants.driver);
		}
		return genwithinvalidmobilenum1;
	}
	
	public OrgSalesReceiptsPageObjects getsalesreceipts() {
		if (salesreceipts == null) {
			salesreceipts = new OrgSalesReceiptsPageObjects(Constants.driver);
		}
		return salesreceipts;
	}
	
	public UserGeneratedCertificatesWithoutSelectingCheckboxesPageObjects getgeneratedcertificates() {
		if (generatedcertificates == null) {
			generatedcertificates = new UserGeneratedCertificatesWithoutSelectingCheckboxesPageObjects(Constants.driver);
		}
		return generatedcertificates;
	}
	
	public UserVerifyCertificateWithEmptyAcademicRefNumfieldPageObjects getverifycertiwithemptyrefid() {
		if (verifycertiwithemptyrefid == null) {
			verifycertiwithemptyrefid = new UserVerifyCertificateWithEmptyAcademicRefNumfieldPageObjects(Constants.driver);
		}
		return verifycertiwithemptyrefid;
	}
	
	public UserInternalPrintingPageObjects getinternalptinting() {
		if (internalptinting == null) {
			internalptinting = new UserInternalPrintingPageObjects(Constants.driver);
		}
		return internalptinting;
	}
	
	public UserInternalPrintingwithoutuploadingCSVfilePageObjects getinterprintwithempty() {
		if (interprintwithempty == null) {
			interprintwithempty = new UserInternalPrintingwithoutuploadingCSVfilePageObjects(Constants.driver);
		}
		return interprintwithempty;
	}
	
	public UserBulkUploadingandRemovingthefilePageObjects getemptystuname() {
		if (emptystuname == null) {
			emptystuname = new UserBulkUploadingandRemovingthefilePageObjects(Constants.driver);
		}
		return emptystuname;
	}
	
	public UserVerifiedCertificatesWithoutEnablecheckboxesPageObjects getverifiedcertificates() {
		if (verifiedcertificates == null) {
			verifiedcertificates = new UserVerifiedCertificatesWithoutEnablecheckboxesPageObjects(Constants.driver);
		}
		return verifiedcertificates;
	}
	
	public UserGeneratedCertificatesWithoutEnablecheckboxesPageObjects getgeneratedcertificates1() {
		if (generatedcertificates1 == null) {
			generatedcertificates1 = new UserGeneratedCertificatesWithoutEnablecheckboxesPageObjects(Constants.driver);
		}
		return generatedcertificates1;
	}
	
	public UserVerifyCertificateWithEmptyStudentNamePageObjects getVerifstuname() {
		if (Verifstuname == null) {
			Verifstuname = new UserVerifyCertificateWithEmptyStudentNamePageObjects(Constants.driver);
		}
		return Verifstuname;
	}
	
	public UserVerifyCertificatesStudentNameWithSpacesandDotsPageObjects getverifStuDots() {
		if (verifStuDots == null) {
			verifStuDots = new UserVerifyCertificatesStudentNameWithSpacesandDotsPageObjects(Constants.driver);
		}
		return verifStuDots;
	}

	public UserBulkByUploadingCombinationOffilesPageObjects getBulkcombo() {
		if (Bulkcombo == null) {
			Bulkcombo = new UserBulkByUploadingCombinationOffilesPageObjects(Constants.driver);
		}
		return Bulkcombo;
	}
	
	public UserGenSingleByUploadingJPEGfilePageObjects getgensinwithjpeg() {
		if (gensinwithjpeg == null) {
			gensinwithjpeg = new UserGenSingleByUploadingJPEGfilePageObjects(Constants.driver);
		}
		return gensinwithjpeg;
	}
	
	public UserVerifyCertificateVerifierEmailWithSpacesandDotsPageObjects getverifieremail() {
		if (verifieremail == null) {
			verifieremail = new UserVerifyCertificateVerifierEmailWithSpacesandDotsPageObjects(Constants.driver);
		}
		return verifieremail;
	}
	
	public UserVerifyCertificateWithoutSpecialcharactersVerifierEmailPageObjects getwithoutverifieremail() {
		if (withoutverifieremail == null) {
			withoutverifieremail = new UserVerifyCertificateWithoutSpecialcharactersVerifierEmailPageObjects(Constants.driver);
		}
		return withoutverifieremail;
	}
	
	public UserGenSingleWithApprovalPageObjects getwithapproval() {
		if (withapproval == null) {
			withapproval = new UserGenSingleWithApprovalPageObjects(Constants.driver);
		}
		return withapproval;
	}
	
	public UserInternalPrintingByUploadingCSVFileWithInvalidIssueYearandMonthPageObjects getinvaliyearmonth() {
		if (invaliyearmonth == null) {
			invaliyearmonth = new UserInternalPrintingByUploadingCSVFileWithInvalidIssueYearandMonthPageObjects(Constants.driver);
		}
		return invaliyearmonth;
	}
	
	public UserInternalPrintingByUploadInvalidCSVFIlePageObjects getinvalidcsv() {
		if (invalidcsv == null) {
			invalidcsv = new UserInternalPrintingByUploadInvalidCSVFIlePageObjects(Constants.driver);
		}
		return invalidcsv;
	}

	public UserVerifyCertificateVerifierNameWithAlphanumericsPageObjects getinvalidverifiername() {
		if (invalidverifiername == null) {
			invalidverifiername = new UserVerifyCertificateVerifierNameWithAlphanumericsPageObjects(Constants.driver);
		}
		return invalidverifiername;
	}
	
	public UserVerifyCertificateVerifierNameWithSpacesandDotsPageObjects getinvalidverifiername1() {
		if (invalidverifiername1 == null) {
			invalidverifiername1 = new UserVerifyCertificateVerifierNameWithSpacesandDotsPageObjects(Constants.driver);
		}
		return invalidverifiername1;
	}
	
	public UserInternalPrintingCSVFIleStudentNameWithAlphabetsandNumericsPageObjects getinvalidcsv1() {
		if (invalidcsv1 == null) {
			invalidcsv1 = new UserInternalPrintingCSVFIleStudentNameWithAlphabetsandNumericsPageObjects(Constants.driver);
		}
		return invalidcsv1;
	}
	
	public UserInternalPrintingUploadCSVFIleWithoutEmailidPageObjects getinvalidcsv2() {
		if (invalidcsv2 == null) {
			invalidcsv2 = new UserInternalPrintingUploadCSVFIleWithoutEmailidPageObjects(Constants.driver);
		}
		return invalidcsv2;
	}
	
	
	public UserGenerateBulkUploadCSVFileEmailIdWithSpacesandDotsPageObjects getbulkinvalidcsv() {
		if (bulkinvalidcsv == null) {
			bulkinvalidcsv = new UserGenerateBulkUploadCSVFileEmailIdWithSpacesandDotsPageObjects(Constants.driver);
		}
		return bulkinvalidcsv;
	}
	

	public UserGenerateBulkUploadCSVFileWithEmptyAcademicRefNumColumn getbulkinvalidcsv1() {
		if (bulkinvalidcsv1 == null) {
			bulkinvalidcsv1 = new UserGenerateBulkUploadCSVFileWithEmptyAcademicRefNumColumn(Constants.driver);
		}
		return bulkinvalidcsv1;
	}
	
	public UserGenerateBulkByUploadCSVFileWithInvalidCertificateNamePageObjects getinvalidcertificatename() {
		if (invalidcertificatename == null) {
			invalidcertificatename = new UserGenerateBulkByUploadCSVFileWithInvalidCertificateNamePageObjects(Constants.driver);
		}
		return invalidcertificatename;
	}
	
	public UserGenerateBulkByUploadCSVFileWithoutIssueMonthObjects getwithoutissuemonth() {
		if (withoutissuemonth == null) {
			withoutissuemonth = new UserGenerateBulkByUploadCSVFileWithoutIssueMonthObjects(Constants.driver);
		}
		return withoutissuemonth;
	}
	
	public UserGenerateBulkByUploadCSVFileWithEmptyStudentNamePageObjects getemptystuname1() {
		if (emptystuname1 == null) {
			emptystuname1 = new UserGenerateBulkByUploadCSVFileWithEmptyStudentNamePageObjects(Constants.driver);
		}
		return emptystuname1;
	}
	
	public UserGenerateBulkByUploadCSVFileWithoutIssueYearObjects getwithoutissueyear() {
		if (withoutissueyear == null) {
			withoutissueyear = new UserGenerateBulkByUploadCSVFileWithoutIssueYearObjects(Constants.driver);
		}
		return withoutissueyear;
	}
	

	public UserGenerateBulkByUploadCSVFileWithInvalidCertificateTypePageObjects getinvalidcertificatetype() {
		if (invalidcertificatetype == null) {
			invalidcertificatetype = new UserGenerateBulkByUploadCSVFileWithInvalidCertificateTypePageObjects(Constants.driver);
		}
		return invalidcertificatetype;
	}
	
	public UserGenerateBulkByUploadCSVFileWithEmptyMobileNumberPageObjects getemptymobilenum() {
		if (emptymobilenum == null) {
			emptymobilenum = new UserGenerateBulkByUploadCSVFileWithEmptyMobileNumberPageObjects(Constants.driver);
		}
		return emptymobilenum;
	}
	
	public UserGenerateBulkByUploadCSVFileWithEmptyCertificateNamePageObjects getemptycertificatename1() {
		if (emptycertificatename1 == null) {
			emptycertificatename1 = new UserGenerateBulkByUploadCSVFileWithEmptyCertificateNamePageObjects(Constants.driver);
		}
		return emptycertificatename1;
	}
	
	public UserInternalPrintingUploadCSVFIleWithoutStudentNamePageObjects getemptystudentname1() {
		if (emptystudentname1 == null) {
			emptystudentname1 = new UserInternalPrintingUploadCSVFIleWithoutStudentNamePageObjects(Constants.driver);
		}
		return emptystudentname1;
	}
	
	public UserInternalPrintingByUploadingCSVFileWithInvalidCertificateTypePageObjects getinvalidcertificatetype1() {
		if (invalidcertificatetype1 == null) {
			invalidcertificatetype1 = new UserInternalPrintingByUploadingCSVFileWithInvalidCertificateTypePageObjects(Constants.driver);
		}
		return invalidcertificatetype1;
	}
}
