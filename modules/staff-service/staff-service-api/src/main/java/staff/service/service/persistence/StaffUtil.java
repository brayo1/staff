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

package staff.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import staff.service.model.Staff;

/**
 * The persistence utility for the staff service. This utility wraps <code>staff.service.service.persistence.impl.StaffPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StaffPersistence
 * @generated
 */
public class StaffUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Staff staff) {
		getPersistence().clearCache(staff);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Staff> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Staff> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Staff> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Staff> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Staff> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Staff update(Staff staff) {
		return getPersistence().update(staff);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Staff update(Staff staff, ServiceContext serviceContext) {
		return getPersistence().update(staff, serviceContext);
	}

	/**
	 * Returns all the staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching staffs
	 */
	public static List<Staff> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @return the range of matching staffs
	 */
	public static List<Staff> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching staffs
	 */
	public static List<Staff> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Staff> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching staffs
	 */
	public static List<Staff> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Staff> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public static Staff findByUuid_First(
			String uuid, OrderByComparator<Staff> orderByComparator)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public static Staff fetchByUuid_First(
		String uuid, OrderByComparator<Staff> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public static Staff findByUuid_Last(
			String uuid, OrderByComparator<Staff> orderByComparator)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public static Staff fetchByUuid_Last(
		String uuid, OrderByComparator<Staff> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the staffs before and after the current staff in the ordered set where uuid = &#63;.
	 *
	 * @param staffId the primary key of the current staff
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next staff
	 * @throws NoSuchStaffException if a staff with the primary key could not be found
	 */
	public static Staff[] findByUuid_PrevAndNext(
			long staffId, String uuid,
			OrderByComparator<Staff> orderByComparator)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().findByUuid_PrevAndNext(
			staffId, uuid, orderByComparator);
	}

	/**
	 * Removes all the staffs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching staffs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the staff where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStaffException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public static Staff findByUUID_G(String uuid, long groupId)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public static Staff fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public static Staff fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the staff where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the staff that was removed
	 */
	public static Staff removeByUUID_G(String uuid, long groupId)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of staffs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching staffs
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching staffs
	 */
	public static List<Staff> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @return the range of matching staffs
	 */
	public static List<Staff> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching staffs
	 */
	public static List<Staff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Staff> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching staffs
	 */
	public static List<Staff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Staff> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public static Staff findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Staff> orderByComparator)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public static Staff fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Staff> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public static Staff findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Staff> orderByComparator)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public static Staff fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Staff> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the staffs before and after the current staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param staffId the primary key of the current staff
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next staff
	 * @throws NoSuchStaffException if a staff with the primary key could not be found
	 */
	public static Staff[] findByUuid_C_PrevAndNext(
			long staffId, String uuid, long companyId,
			OrderByComparator<Staff> orderByComparator)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().findByUuid_C_PrevAndNext(
			staffId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the staffs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching staffs
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the staff in the entity cache if it is enabled.
	 *
	 * @param staff the staff
	 */
	public static void cacheResult(Staff staff) {
		getPersistence().cacheResult(staff);
	}

	/**
	 * Caches the staffs in the entity cache if it is enabled.
	 *
	 * @param staffs the staffs
	 */
	public static void cacheResult(List<Staff> staffs) {
		getPersistence().cacheResult(staffs);
	}

	/**
	 * Creates a new staff with the primary key. Does not add the staff to the database.
	 *
	 * @param staffId the primary key for the new staff
	 * @return the new staff
	 */
	public static Staff create(long staffId) {
		return getPersistence().create(staffId);
	}

	/**
	 * Removes the staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param staffId the primary key of the staff
	 * @return the staff that was removed
	 * @throws NoSuchStaffException if a staff with the primary key could not be found
	 */
	public static Staff remove(long staffId)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().remove(staffId);
	}

	public static Staff updateImpl(Staff staff) {
		return getPersistence().updateImpl(staff);
	}

	/**
	 * Returns the staff with the primary key or throws a <code>NoSuchStaffException</code> if it could not be found.
	 *
	 * @param staffId the primary key of the staff
	 * @return the staff
	 * @throws NoSuchStaffException if a staff with the primary key could not be found
	 */
	public static Staff findByPrimaryKey(long staffId)
		throws staff.service.exception.NoSuchStaffException {

		return getPersistence().findByPrimaryKey(staffId);
	}

	/**
	 * Returns the staff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param staffId the primary key of the staff
	 * @return the staff, or <code>null</code> if a staff with the primary key could not be found
	 */
	public static Staff fetchByPrimaryKey(long staffId) {
		return getPersistence().fetchByPrimaryKey(staffId);
	}

	/**
	 * Returns all the staffs.
	 *
	 * @return the staffs
	 */
	public static List<Staff> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @return the range of staffs
	 */
	public static List<Staff> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of staffs
	 */
	public static List<Staff> findAll(
		int start, int end, OrderByComparator<Staff> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of staffs
	 * @param end the upper bound of the range of staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of staffs
	 */
	public static List<Staff> findAll(
		int start, int end, OrderByComparator<Staff> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the staffs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of staffs.
	 *
	 * @return the number of staffs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static StaffPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StaffPersistence, StaffPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(StaffPersistence.class);

		ServiceTracker<StaffPersistence, StaffPersistence> serviceTracker =
			new ServiceTracker<StaffPersistence, StaffPersistence>(
				bundle.getBundleContext(), StaffPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}