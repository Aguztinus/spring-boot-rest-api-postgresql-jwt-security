package idm.pajak.pajakserverapi.repository;

import  idm.pajak.pajakserverapi.model.Role;
import  idm.pajak.pajakserverapi.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
