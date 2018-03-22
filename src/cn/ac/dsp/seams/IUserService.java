package cn.ac.dsp.seams;

import java.util.List;

import cn.ac.dsp.seams.domain.Account;
import cn.ac.dsp.seams.domain.Permission;
import cn.ac.dsp.seams.domain.Role;
import cn.ac.dsp.seams.dto.UserResult;

public interface IUserService {
	/**
	 * 查看用户名称是否存在
	 * @param name
	 * @return
	 */
	public boolean isAccountNameExist(final String name) ;


	/**
	 * 添加用户
	 * 
	 * @param name
	 * @param password
	 * @param province
	 * @param city
	 * @param cellphone
	 * @param email
	 * @param state
	 * @param endTime
	 * @param roleId
	 * @return
	 */
	public UserResult addAccount(final String name, final String password,
			final String province, final String city, final String cellphone,
			final String email, final int state, final long endTime);


	/**
	 * 查询账户
	 * 
	 * @param name
	 * @param cellphone
	 * @param email
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<Account> findAccount(final String name, final String cellphone,
			final String email);

	/**
	 * 注销账户
	 * 
	 * @param id
	 * @return
	 */
	public UserResult removeAccount(final long id);

	/**
	 * 获取账户
	 * 
	 * @param id
	 * @return
	 */
	public Account getAccountById(final long id);
	
	/**
	 * 根据用户名获取账户
	 * 
	 * @param name
	 * @return
	 */
	public Account getAccountByName(final String name);

	/**
	 * 管理员更新账户
	 * 
	 * @param id
	 * @param password
	 * @param province
	 * @param city
	 * @param cellphone
	 * @param email
	 * @param state
	 * @param endTime
	 * @param roleId
	 * @return
	 */
	public UserResult updateAccountByAdmin(final Long id,
			final String password, final String province, final String city,
			final String cellphone, final String email, final int state,
			final long endTime);

	/**
	 * 普通用户更新账户
	 * 
	 * @param id
	 * @param password
	 * @param cellphone
	 * @param email
	 * @return
	 */
	public UserResult updateAccountByUser(final String id,
			final String password, final String cellphone, final String email);


	/**
	 * 查看角色是否存在
	 * @param name
	 * @return
	 */
	public boolean isRoleNameExist(final String name) ;


	/**
	 * 增加角色
	 * 
	 * @param name
	 * @param permissionList
	 * @return
	 */
	public UserResult addRole(final String name,
			final List<Permission> permissionSet);

	/**
	 * 查询角色
	 * 
	 * @param name
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<Role> findRole();

	/**
	 * 删除角色
	 * 
	 * @param id
	 * @return
	 */
	public UserResult removeRole(final Long id);

	/**
	 * 获取角色
	 * 
	 * @param id
	 * @return
	 */
	public Role getRoleById(final Long id);

	/**
	 * 更新角色
	 * 
	 * @param id
	 * @param permissionList
	 * @return
	 */
	public UserResult updateRole(final Long id,
			final List<Permission> permissionList);
	
	/**
	 * 获得全部权限
	 */
	public List<Permission> getPermissionList();
	
	/**
	 * 根据ID获得对应的权限
	 * @param id
	 * @return
	 */
	public Permission getPermissionById(Long id);
	
	
	/**
	 * 为用户添加角色
	 */
	public UserResult addAccountRoleList(long accountId,List<String> roles);
	
}
