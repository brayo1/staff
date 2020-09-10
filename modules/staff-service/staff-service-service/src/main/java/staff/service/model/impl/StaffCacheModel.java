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

package staff.service.model.impl;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import staff.service.model.Staff;

/**
 * The cache model class for representing Staff in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StaffCacheModel implements CacheModel<Staff>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StaffCacheModel)) {
			return false;
		}

		StaffCacheModel staffCacheModel = (StaffCacheModel)obj;

		if (staffId == staffCacheModel.staffId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, staffId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", staffId=");
		sb.append(staffId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", staffName=");
		sb.append(staffName);
		sb.append(", staffDept=");
		sb.append(staffDept);
		sb.append(", staffOrg=");
		sb.append(staffOrg);
		sb.append(", staffAge=");
		sb.append(staffAge);
		sb.append(", staffEmployer=");
		sb.append(staffEmployer);
		sb.append(", staffDateEmployed=");
		sb.append(staffDateEmployed);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Staff toEntityModel() {
		StaffImpl staffImpl = new StaffImpl();

		if (uuid == null) {
			staffImpl.setUuid("");
		}
		else {
			staffImpl.setUuid(uuid);
		}

		staffImpl.setStaffId(staffId);
		staffImpl.setGroupId(groupId);
		staffImpl.setCompanyId(companyId);
		staffImpl.setUserId(userId);

		if (userName == null) {
			staffImpl.setUserName("");
		}
		else {
			staffImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			staffImpl.setCreateDate(null);
		}
		else {
			staffImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			staffImpl.setModifiedDate(null);
		}
		else {
			staffImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (staffName == null) {
			staffImpl.setStaffName("");
		}
		else {
			staffImpl.setStaffName(staffName);
		}

		if (staffDept == null) {
			staffImpl.setStaffDept("");
		}
		else {
			staffImpl.setStaffDept(staffDept);
		}

		if (staffOrg == null) {
			staffImpl.setStaffOrg("");
		}
		else {
			staffImpl.setStaffOrg(staffOrg);
		}

		if (staffAge == null) {
			staffImpl.setStaffAge("");
		}
		else {
			staffImpl.setStaffAge(staffAge);
		}

		if (staffEmployer == null) {
			staffImpl.setStaffEmployer("");
		}
		else {
			staffImpl.setStaffEmployer(staffEmployer);
		}

		if (staffDateEmployed == null) {
			staffImpl.setStaffDateEmployed("");
		}
		else {
			staffImpl.setStaffDateEmployed(staffDateEmployed);
		}

		staffImpl.resetOriginalValues();

		return staffImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		staffId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		staffName = objectInput.readUTF();
		staffDept = objectInput.readUTF();
		staffOrg = objectInput.readUTF();
		staffAge = objectInput.readUTF();
		staffEmployer = objectInput.readUTF();
		staffDateEmployed = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(staffId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (staffName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffName);
		}

		if (staffDept == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffDept);
		}

		if (staffOrg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffOrg);
		}

		if (staffAge == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffAge);
		}

		if (staffEmployer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffEmployer);
		}

		if (staffDateEmployed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(staffDateEmployed);
		}
	}

	public String uuid;
	public long staffId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String staffName;
	public String staffDept;
	public String staffOrg;
	public String staffAge;
	public String staffEmployer;
	public String staffDateEmployed;

}