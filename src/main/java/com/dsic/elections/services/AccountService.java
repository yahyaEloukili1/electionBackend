package com.dsic.elections.services;

import com.dsic.elections.entitis.AppRole;
import com.dsic.elections.entitis.AppUser;

public interface AccountService {

	public AppUser save(AppUser user);
	public AppRole saveRole(AppRole role);
	public void addRoleToUser(String username,String roleName);
	public AppUser finduserByUsrname(String username);
}
