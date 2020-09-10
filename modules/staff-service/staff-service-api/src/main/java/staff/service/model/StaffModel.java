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

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Staff service. Represents a row in the &quot;staf_Staff&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>staff.service.model.impl.StaffModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>staff.service.model.impl.StaffImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Staff
 * @generated
 */
@ProviderType
public interface StaffModel
	extends BaseModel<Staff>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a staff model instance should use the {@link Staff} interface instead.
	 */

	/**
	 * Returns the primary key of this staff.
	 *
	 * @return the primary key of this staff
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this staff.
	 *
	 * @param primaryKey the primary key of this staff
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this staff.
	 *
	 * @return the uuid of this staff
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this staff.
	 *
	 * @param uuid the uuid of this staff
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the staff ID of this staff.
	 *
	 * @return the staff ID of this staff
	 */
	public long getStaffId();

	/**
	 * Sets the staff ID of this staff.
	 *
	 * @param staffId the staff ID of this staff
	 */
	public void setStaffId(long staffId);

	/**
	 * Returns the group ID of this staff.
	 *
	 * @return the group ID of this staff
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this staff.
	 *
	 * @param groupId the group ID of this staff
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this staff.
	 *
	 * @return the company ID of this staff
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this staff.
	 *
	 * @param companyId the company ID of this staff
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this staff.
	 *
	 * @return the user ID of this staff
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this staff.
	 *
	 * @param userId the user ID of this staff
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this staff.
	 *
	 * @return the user uuid of this staff
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this staff.
	 *
	 * @param userUuid the user uuid of this staff
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this staff.
	 *
	 * @return the user name of this staff
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this staff.
	 *
	 * @param userName the user name of this staff
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this staff.
	 *
	 * @return the create date of this staff
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this staff.
	 *
	 * @param createDate the create date of this staff
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this staff.
	 *
	 * @return the modified date of this staff
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this staff.
	 *
	 * @param modifiedDate the modified date of this staff
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the staff name of this staff.
	 *
	 * @return the staff name of this staff
	 */
	@AutoEscape
	public String getStaffName();

	/**
	 * Sets the staff name of this staff.
	 *
	 * @param staffName the staff name of this staff
	 */
	public void setStaffName(String staffName);

	/**
	 * Returns the staff dept of this staff.
	 *
	 * @return the staff dept of this staff
	 */
	@AutoEscape
	public String getStaffDept();

	/**
	 * Sets the staff dept of this staff.
	 *
	 * @param staffDept the staff dept of this staff
	 */
	public void setStaffDept(String staffDept);

	/**
	 * Returns the staff org of this staff.
	 *
	 * @return the staff org of this staff
	 */
	@AutoEscape
	public String getStaffOrg();

	/**
	 * Sets the staff org of this staff.
	 *
	 * @param staffOrg the staff org of this staff
	 */
	public void setStaffOrg(String staffOrg);

	/**
	 * Returns the staff age of this staff.
	 *
	 * @return the staff age of this staff
	 */
	@AutoEscape
	public String getStaffAge();

	/**
	 * Sets the staff age of this staff.
	 *
	 * @param staffAge the staff age of this staff
	 */
	public void setStaffAge(String staffAge);

	/**
	 * Returns the staff employer of this staff.
	 *
	 * @return the staff employer of this staff
	 */
	@AutoEscape
	public String getStaffEmployer();

	/**
	 * Sets the staff employer of this staff.
	 *
	 * @param staffEmployer the staff employer of this staff
	 */
	public void setStaffEmployer(String staffEmployer);

	/**
	 * Returns the staff date employed of this staff.
	 *
	 * @return the staff date employed of this staff
	 */
	@AutoEscape
	public String getStaffDateEmployed();

	/**
	 * Sets the staff date employed of this staff.
	 *
	 * @param staffDateEmployed the staff date employed of this staff
	 */
	public void setStaffDateEmployed(String staffDateEmployed);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(staff.service.model.Staff staff);

	@Override
	public int hashCode();

	@Override
	public CacheModel<staff.service.model.Staff> toCacheModel();

	@Override
	public staff.service.model.Staff toEscapedModel();

	@Override
	public staff.service.model.Staff toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}