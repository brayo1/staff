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

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

import staff.service.exception.NoSuchStaffException;
import staff.service.model.Staff;

/**
 * The persistence interface for the staff service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StaffUtil
 * @generated
 */
@ProviderType
public interface StaffPersistence extends BasePersistence<Staff> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StaffUtil} to access the staff persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Staff> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching staffs
	 */
	public java.util.List<Staff> findByUuid(String uuid);

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
	public java.util.List<Staff> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Staff> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator);

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
	public java.util.List<Staff> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public Staff findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Staff>
				orderByComparator)
		throws NoSuchStaffException;

	/**
	 * Returns the first staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public Staff fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator);

	/**
	 * Returns the last staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public Staff findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Staff>
				orderByComparator)
		throws NoSuchStaffException;

	/**
	 * Returns the last staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public Staff fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator);

	/**
	 * Returns the staffs before and after the current staff in the ordered set where uuid = &#63;.
	 *
	 * @param staffId the primary key of the current staff
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next staff
	 * @throws NoSuchStaffException if a staff with the primary key could not be found
	 */
	public Staff[] findByUuid_PrevAndNext(
			long staffId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Staff>
				orderByComparator)
		throws NoSuchStaffException;

	/**
	 * Removes all the staffs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching staffs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the staff where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStaffException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public Staff findByUUID_G(String uuid, long groupId)
		throws NoSuchStaffException;

	/**
	 * Returns the staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public Staff fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public Staff fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the staff where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the staff that was removed
	 */
	public Staff removeByUUID_G(String uuid, long groupId)
		throws NoSuchStaffException;

	/**
	 * Returns the number of staffs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching staffs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching staffs
	 */
	public java.util.List<Staff> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Staff> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Staff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator);

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
	public java.util.List<Staff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public Staff findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Staff>
				orderByComparator)
		throws NoSuchStaffException;

	/**
	 * Returns the first staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public Staff fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator);

	/**
	 * Returns the last staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff
	 * @throws NoSuchStaffException if a matching staff could not be found
	 */
	public Staff findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Staff>
				orderByComparator)
		throws NoSuchStaffException;

	/**
	 * Returns the last staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching staff, or <code>null</code> if a matching staff could not be found
	 */
	public Staff fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator);

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
	public Staff[] findByUuid_C_PrevAndNext(
			long staffId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Staff>
				orderByComparator)
		throws NoSuchStaffException;

	/**
	 * Removes all the staffs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching staffs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the staff in the entity cache if it is enabled.
	 *
	 * @param staff the staff
	 */
	public void cacheResult(Staff staff);

	/**
	 * Caches the staffs in the entity cache if it is enabled.
	 *
	 * @param staffs the staffs
	 */
	public void cacheResult(java.util.List<Staff> staffs);

	/**
	 * Creates a new staff with the primary key. Does not add the staff to the database.
	 *
	 * @param staffId the primary key for the new staff
	 * @return the new staff
	 */
	public Staff create(long staffId);

	/**
	 * Removes the staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param staffId the primary key of the staff
	 * @return the staff that was removed
	 * @throws NoSuchStaffException if a staff with the primary key could not be found
	 */
	public Staff remove(long staffId) throws NoSuchStaffException;

	public Staff updateImpl(Staff staff);

	/**
	 * Returns the staff with the primary key or throws a <code>NoSuchStaffException</code> if it could not be found.
	 *
	 * @param staffId the primary key of the staff
	 * @return the staff
	 * @throws NoSuchStaffException if a staff with the primary key could not be found
	 */
	public Staff findByPrimaryKey(long staffId) throws NoSuchStaffException;

	/**
	 * Returns the staff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param staffId the primary key of the staff
	 * @return the staff, or <code>null</code> if a staff with the primary key could not be found
	 */
	public Staff fetchByPrimaryKey(long staffId);

	/**
	 * Returns all the staffs.
	 *
	 * @return the staffs
	 */
	public java.util.List<Staff> findAll();

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
	public java.util.List<Staff> findAll(int start, int end);

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
	public java.util.List<Staff> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator);

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
	public java.util.List<Staff> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Staff>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the staffs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of staffs.
	 *
	 * @return the number of staffs
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}