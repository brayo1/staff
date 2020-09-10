create table staf_Staff (
	uuid_ VARCHAR(75) null,
	staffId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	staffName VARCHAR(75) null,
	staffDept VARCHAR(75) null,
	staffOrg VARCHAR(75) null,
	staffAge VARCHAR(75) null,
	staffEmployer VARCHAR(75) null,
	staffDateEmployed VARCHAR(75) null
);