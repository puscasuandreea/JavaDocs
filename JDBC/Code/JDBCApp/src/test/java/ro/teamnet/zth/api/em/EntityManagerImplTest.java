package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Department;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Andreea.Puscasu on 7/14/2017.
 */
public class EntityManagerImplTest {

        @Test
        public  void testUpdateMethod(){
            EntityManagerImplTest test = new EntityManagerImplTest();
            Department department = new Department();
            department.setId(270L);
            department.setDepartmentName("Angajati");
            department.setLocation(1700L);
            assertTrue(department.getDepartmentName().equals("Angajati"));


        }


    @Test
    public void eTestDelete() throws NoSuchFieldException, IllegalAccessException {
        EntityManagerImpl entityManager = new EntityManagerImpl();
        Department department = new Department();
        department.setId(271L);
        entityManager.delete(department);
        assertTrue(entityManager.findById(Department.class, department.getId())==null);
    }



}

