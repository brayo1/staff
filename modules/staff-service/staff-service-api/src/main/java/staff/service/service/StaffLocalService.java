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

package staff.service.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import staff.service.model.Staff;

/**
 * Provides the local service interface for Staff. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see StaffLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface StaffLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StaffLocalServiceUtil} to access the staff local service. Add custom service methods to <code>staff.service.service.impl.StaffLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the staff to the database. Also notifies the appropriate model listeners.
	 *
	 * @param staff the staff
	 * @return the staff that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Staff addStaff(Staff staff);

	/**
	 * Creates a new staff with the primary key. Does not add the staff to the database.
	 *
	 * @param staffId the primary key for the new staff
	 * @return the new staff
	 */
	@Transactional(enabled = false)
	public Staff createStaff(long staffId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param staffId the primary key of the staff
	 * @return the staff that was removed
	 * @throws PortalException if a staff with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Staff deleteStaff(long staffId) throws PortalException;

	/**
	 * Deletes the staff from the database. Also notifies the appropriate model listeners.
	 *
	 * @param staff the staff
	 * @return the staff that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Staff deleteStaff(Staff staff);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>staff.service.model.impl.StaffModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>staff.service.model.impl.StaffModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Staff fetchStaff(long staffId);

	/**
	 * Returns the staff matching the UUID and group.
	 *
	 * @param uuid the staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching staff, or <code>null</code> if a matching staff could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Staff fetchStaffByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the staff with the primary key.
	 *
	 * @param staffId the primary key of the staff
	 * @return the staff
	 * @throws PortalException if a staff with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Staff getStaff(long staffId) throws PortalException;

	/**
	 * Returns the staff matching the UUID and group.
	 *
	 * @param uuid the staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching staff
	 * @throws PortalException if a matching staff could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Staff getStaffByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>staff.service.model.impl.StaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @return the range of staffs
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Staff> getStaffs(int start, int end);

	/**
	 * Returns all the staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the staffs
	 * @param companyId the primary key of the company
	 * @return the matching staffs, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Staff> getStaffsByUuidAndCompanyId(String uuid, long companyId);

	/**
	 * Returns a range of staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the staffs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching staffs, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Staff> getStaffsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Staff> orderByComparator);

	/**
	 * Returns the number of staffs.
	 *
	 * @return the number of staffs
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStaffsCount();

	/**
	 * Updates the staff in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param staff the staff
	 * @return the staff that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Staff updateStaff(Staff staff);

}