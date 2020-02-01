package co.simplon.service;

import co.simplon.entity.AppRole;
import co.simplon.entity.AppUser;

public interface AccountService {

    public AppUser saveUser(AppUser user);
    public AppRole saveRole(AppRole role);
    public void addRoleToUse(String username,String roleName);
    public AppUser findUserByUsername(String username);
}
