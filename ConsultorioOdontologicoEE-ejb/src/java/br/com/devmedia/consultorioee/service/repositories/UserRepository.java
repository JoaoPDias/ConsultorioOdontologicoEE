package br.com.devmedia.consultorioee.service.repositories;

import br.com.devmedia.consultorioee.entities.Users;
import java.security.MessageDigest;
import java.util.List;
import javax.persistence.EntityManager;

public class UserRepository extends BasicRepository {

    public UserRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public Users getUser(int id) {
        return this.getEntityManager().find(Users.class, id);

    }

    public Users getUserbyLoginPassword(String login, String password) {
        return this.getPurePojo(Users.class, "select usr from Users usr where usr.usuLogin = ?1 and usr.usuPassword = ?2", login, this.getMD5(password));

    }
    
    public List<Users> getUsers()
    {
        return this.getPureList(Users.class, "select usr from Users usr");
    
    }
    
    public List<Users> getUsersByName(String name)
    {
        return this.getPureList(Users.class, "select usr from Users usr where usr.usuName like ?1",name+"%");
    }

    private String getMD5(String password) {
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(password.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                sb.append(String.format("%02x", b & 0xff));
            }
            digest = sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return digest;
    }

}
