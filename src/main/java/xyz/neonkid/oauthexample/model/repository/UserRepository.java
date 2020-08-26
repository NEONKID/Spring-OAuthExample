package xyz.neonkid.oauthexample.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.neonkid.oauthexample.model.User;

/**
 * Created by Neon K.I.D on 8/11/20
 * Blog : https://blog.neonkid.xyz
 * Github : https://github.com/NEONKID
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
