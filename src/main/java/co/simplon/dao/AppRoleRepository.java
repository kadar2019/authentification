package co.simplon.dao;

import co.simplon.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface AppRoleRepository extends JpaRepository<AppRole,Long> {

    public AppRole findByRoleName(String roleName);
}
