/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwwc.nees.joint.persistence;

import org.openrdf.repository.Repository;
import virtuoso.sesame2.driver.VirtuosoRepository;
import wwwc.nees.joint.module.kao.RepositoryConfig;

/**
 *
 * @author Debora
 */
//implements troquei por extends
public class Persistence implements RepositoryConfig {
private final String HOST = "jdbc:virtuoso://localhost:1111";
private final String USER = "dba";
private final String PASSWORD = "dba";

@Override
public Repository createNewRepository() {
return new VirtuosoRepository(HOST, USER, PASSWORD);
}
}
 