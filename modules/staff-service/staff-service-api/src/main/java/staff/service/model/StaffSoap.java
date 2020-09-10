/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package staff.service.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link staff.service.service.http.StaffServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StaffSoap implements Serializable {

	public static StaffSoap toSoapModel(Staff model) {
		StaffSoap soapModel = new StaffSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStaffId(model.getStaffId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStaffName(model.getStaffName());
		soapModel.setStaffDept(model.getStaffDept());
		soapModel.setStaffOrg(model.getStaffOrg());
		soapModel.setStaffAge(model.getStaffAge());
		soapModel.setStaffEmployer(model.getStaffEmployer());
		soapModel.setStaffDateEmployed(model.getStaffDateEmployed());

		return soapModel;
	}

	public static StaffSoap[] toSoapModels(Staff[] models) {
		StaffSoap[] soapModels = new StaffSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StaffSoap[][] toSoapModels(Staff[][] models) {
		StaffSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StaffSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StaffSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StaffSoap[] toSoapModels(List<Staff> models) {
		List<StaffSoap> soapModels = new ArrayList<StaffSoap>(models.size());

		for (Staff model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StaffSoap[soapModels.size()]);
	}

	public StaffSoap() {
	}

	public long getPrimaryKey() {
		return _staffId;
	}

	public void setPrimaryKey(long pk) {
		setStaffId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStaffId() {
		return _staffId;
	}

	public void setStaffId(long staffId) {
		_staffId = staffId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getStaffName() {
		return _staffName;
	}

	public void setStaffName(String staffName) {
		_staffName = staffName;
	}

	public String getStaffDept() {
		return _staffDept;
	}

	public void setStaffDept(String staffDept) {
		_staffDept = staffDept;
	}

	public String getStaffOrg() {
		return _staffOrg;
	}

	public void setStaffOrg(String staffOrg) {
		_staffOrg = staffOrg;
	}

	public String getStaffAge() {
		return _staffAge;
	}

	public void setStaffAge(String staffAge) {
		_staffAge = staffAge;
	}

	public String getStaffEmployer() {
		return _staffEmployer;
	}

	public void setStaffEmployer(String staffEmployer) {
		_staffEmployer = staffEmployer;
	}

	public String getStaffDateEmployed() {
		return _staffDateEmployed;
	}

	public void setStaffDateEmployed(String staffDateEmployed) {
		_staffDateEmployed = staffDateEmployed;
	}

	private String _uuid;
	private long _staffId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _staffName;
	private String _staffDept;
	private String _staffOrg;
	private String _staffAge;
	private String _staffEmployer;
	private String _staffDateEmployed;

}