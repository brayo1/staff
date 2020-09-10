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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Staff}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Staff
 * @generated
 */
public class StaffWrapper implements ModelWrapper<Staff>, Staff {

	public StaffWrapper(Staff staff) {
		_staff = staff;
	}

	@Override
	public Class<?> getModelClass() {
		return Staff.class;
	}

	@Override
	public String getModelClassName() {
		return Staff.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("staffId", getStaffId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("staffName", getStaffName());
		attributes.put("staffDept", getStaffDept());
		attributes.put("staffOrg", getStaffOrg());
		attributes.put("staffAge", getStaffAge());
		attributes.put("staffEmployer", getStaffEmployer());
		attributes.put("staffDateEmployed", getStaffDateEmployed());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long staffId = (Long)attributes.get("staffId");

		if (staffId != null) {
			setStaffId(staffId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String staffName = (String)attributes.get("staffName");

		if (staffName != null) {
			setStaffName(staffName);
		}

		String staffDept = (String)attributes.get("staffDept");

		if (staffDept != null) {
			setStaffDept(staffDept);
		}

		String staffOrg = (String)attributes.get("staffOrg");

		if (staffOrg != null) {
			setStaffOrg(staffOrg);
		}

		String staffAge = (String)attributes.get("staffAge");

		if (staffAge != null) {
			setStaffAge(staffAge);
		}

		String staffEmployer = (String)attributes.get("staffEmployer");

		if (staffEmployer != null) {
			setStaffEmployer(staffEmployer);
		}

		String staffDateEmployed = (String)attributes.get("staffDateEmployed");

		if (staffDateEmployed != null) {
			setStaffDateEmployed(staffDateEmployed);
		}
	}

	@Override
	public Object clone() {
		return new StaffWrapper((Staff)_staff.clone());
	}

	@Override
	public int compareTo(staff.service.model.Staff staff) {
		return _staff.compareTo(staff);
	}

	/**
	 * Returns the company ID of this staff.
	 *
	 * @return the company ID of this staff
	 */
	@Override
	public long getCompanyId() {
		return _staff.getCompanyId();
	}

	/**
	 * Returns the create date of this staff.
	 *
	 * @return the create date of this staff
	 */
	@Override
	public Date getCreateDate() {
		return _staff.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _staff.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this staff.
	 *
	 * @return the group ID of this staff
	 */
	@Override
	public long getGroupId() {
		return _staff.getGroupId();
	}

	/**
	 * Returns the modified date of this staff.
	 *
	 * @return the modified date of this staff
	 */
	@Override
	public Date getModifiedDate() {
		return _staff.getModifiedDate();
	}

	/**
	 * Returns the primary key of this staff.
	 *
	 * @return the primary key of this staff
	 */
	@Override
	public long getPrimaryKey() {
		return _staff.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _staff.getPrimaryKeyObj();
	}

	/**
	 * Returns the staff age of this staff.
	 *
	 * @return the staff age of this staff
	 */
	@Override
	public String getStaffAge() {
		return _staff.getStaffAge();
	}

	/**
	 * Returns the staff date employed of this staff.
	 *
	 * @return the staff date employed of this staff
	 */
	@Override
	public String getStaffDateEmployed() {
		return _staff.getStaffDateEmployed();
	}

	/**
	 * Returns the staff dept of this staff.
	 *
	 * @return the staff dept of this staff
	 */
	@Override
	public String getStaffDept() {
		return _staff.getStaffDept();
	}

	/**
	 * Returns the staff employer of this staff.
	 *
	 * @return the staff employer of this staff
	 */
	@Override
	public String getStaffEmployer() {
		return _staff.getStaffEmployer();
	}

	/**
	 * Returns the staff ID of this staff.
	 *
	 * @return the staff ID of this staff
	 */
	@Override
	public long getStaffId() {
		return _staff.getStaffId();
	}

	/**
	 * Returns the staff name of this staff.
	 *
	 * @return the staff name of this staff
	 */
	@Override
	public String getStaffName() {
		return _staff.getStaffName();
	}

	/**
	 * Returns the staff org of this staff.
	 *
	 * @return the staff org of this staff
	 */
	@Override
	public String getStaffOrg() {
		return _staff.getStaffOrg();
	}

	/**
	 * Returns the user ID of this staff.
	 *
	 * @return the user ID of this staff
	 */
	@Override
	public long getUserId() {
		return _staff.getUserId();
	}

	/**
	 * Returns the user name of this staff.
	 *
	 * @return the user name of this staff
	 */
	@Override
	public String getUserName() {
		return _staff.getUserName();
	}

	/**
	 * Returns the user uuid of this staff.
	 *
	 * @return the user uuid of this staff
	 */
	@Override
	public String getUserUuid() {
		return _staff.getUserUuid();
	}

	/**
	 * Returns the uuid of this staff.
	 *
	 * @return the uuid of this staff
	 */
	@Override
	public String getUuid() {
		return _staff.getUuid();
	}

	@Override
	public int hashCode() {
		return _staff.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _staff.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _staff.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _staff.isNew();
	}

	@Override
	public void persist() {
		_staff.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_staff.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this staff.
	 *
	 * @param companyId the company ID of this staff
	 */
	@Override
	public void setCompanyId(long companyId) {
		_staff.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this staff.
	 *
	 * @param createDate the create date of this staff
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_staff.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_staff.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_staff.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_staff.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this staff.
	 *
	 * @param groupId the group ID of this staff
	 */
	@Override
	public void setGroupId(long groupId) {
		_staff.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this staff.
	 *
	 * @param modifiedDate the modified date of this staff
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_staff.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_staff.setNew(n);
	}

	/**
	 * Sets the primary key of this staff.
	 *
	 * @param primaryKey the primary key of this staff
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_staff.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_staff.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the staff age of this staff.
	 *
	 * @param staffAge the staff age of this staff
	 */
	@Override
	public void setStaffAge(String staffAge) {
		_staff.setStaffAge(staffAge);
	}

	/**
	 * Sets the staff date employed of this staff.
	 *
	 * @param staffDateEmployed the staff date employed of this staff
	 */
	@Override
	public void setStaffDateEmployed(String staffDateEmployed) {
		_staff.setStaffDateEmployed(staffDateEmployed);
	}

	/**
	 * Sets the staff dept of this staff.
	 *
	 * @param staffDept the staff dept of this staff
	 */
	@Override
	public void setStaffDept(String staffDept) {
		_staff.setStaffDept(staffDept);
	}

	/**
	 * Sets the staff employer of this staff.
	 *
	 * @param staffEmployer the staff employer of this staff
	 */
	@Override
	public void setStaffEmployer(String staffEmployer) {
		_staff.setStaffEmployer(staffEmployer);
	}

	/**
	 * Sets the staff ID of this staff.
	 *
	 * @param staffId the staff ID of this staff
	 */
	@Override
	public void setStaffId(long staffId) {
		_staff.setStaffId(staffId);
	}

	/**
	 * Sets the staff name of this staff.
	 *
	 * @param staffName the staff name of this staff
	 */
	@Override
	public void setStaffName(String staffName) {
		_staff.setStaffName(staffName);
	}

	/**
	 * Sets the staff org of this staff.
	 *
	 * @param staffOrg the staff org of this staff
	 */
	@Override
	public void setStaffOrg(String staffOrg) {
		_staff.setStaffOrg(staffOrg);
	}

	/**
	 * Sets the user ID of this staff.
	 *
	 * @param userId the user ID of this staff
	 */
	@Override
	public void setUserId(long userId) {
		_staff.setUserId(userId);
	}

	/**
	 * Sets the user name of this staff.
	 *
	 * @param userName the user name of this staff
	 */
	@Override
	public void setUserName(String userName) {
		_staff.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this staff.
	 *
	 * @param userUuid the user uuid of this staff
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_staff.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this staff.
	 *
	 * @param uuid the uuid of this staff
	 */
	@Override
	public void setUuid(String uuid) {
		_staff.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<staff.service.model.Staff>
		toCacheModel() {

		return _staff.toCacheModel();
	}

	@Override
	public staff.service.model.Staff toEscapedModel() {
		return new StaffWrapper(_staff.toEscapedModel());
	}

	@Override
	public String toString() {
		return _staff.toString();
	}

	@Override
	public staff.service.model.Staff toUnescapedModel() {
		return new StaffWrapper(_staff.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _staff.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StaffWrapper)) {
			return false;
		}

		StaffWrapper staffWrapper = (StaffWrapper)obj;

		if (Objects.equals(_staff, staffWrapper._staff)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _staff.getStagedModelType();
	}

	@Override
	public Staff getWrappedModel() {
		return _staff;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _staff.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _staff.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_staff.resetOriginalValues();
	}

	private final Staff _staff;

}