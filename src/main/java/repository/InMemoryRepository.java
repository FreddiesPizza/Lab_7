package repository;

import java.util.ArrayList;
import java.util.List;

public abstract class InMemoryRepository<T> implements ICrudRepository<T> {


    protected List<T> repoList;

    public InMemoryRepository() {
        this.repoList = new ArrayList<>();

    }

    /**
     * a general method used to add an object to a repository
     * @param obj
     * @return object of general class T
     */
    @Override
    public T create(T obj) {
        this.repoList.add(obj);
        return obj;
    }

    /**
     * a general getAll method that returns all information in a repository
     * @return the contents of the repository
     */
    @Override
    public List<T> getAll() {
        return this.repoList;
    }

    /**
     * a general delete method to delete an object from a repository
     * @param obj
     */
    @Override
    public void delete(T obj) {
        this.repoList.remove(obj);
    }

}