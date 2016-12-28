package br.com.devmedia.consultorioee.service.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public abstract class BasicRepository {
    private final EntityManager entityManager;
    
    public BasicRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    protected EntityManager getEntityManager()
    {
        return this.entityManager;
    
    }
    protected <T> List<T> getPureList(Class<T> classToCast, String query, Object... values)
    {
        Query qr = this.createQuery(query, values);
        return qr.getResultList();
    
    }
    protected <T> T getPurePojo(Class<T> classToCast, String query, Object... values)
    {
        Query qr=this.createQuery(query, values);
        return (T) qr.getSingleResult();
    }
    
    protected int executeCommand(String query,Object... values)
    {
        Query qr = this.createQuery(query, values);
        return qr.executeUpdate();
    }
    
    private Query createQuery (String query, Object... values)
    {
        Query qr = this.getEntityManager().createQuery(query);
        for (int i = 0; i < values.length; i++) {
            qr.setParameter(i, values[i]);
            
        }
        return qr;
    }
    
}
