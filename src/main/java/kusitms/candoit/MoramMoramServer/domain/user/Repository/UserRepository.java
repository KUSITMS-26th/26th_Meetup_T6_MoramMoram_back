package kusitms.candoit.MoramMoramServer.domain.user.Repository;


import kusitms.candoit.MoramMoramServer.domain.user.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneWithAuthoritiesByEmail(String email);
    Boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);

    Optional<User> findSellerById(Long userId);
}