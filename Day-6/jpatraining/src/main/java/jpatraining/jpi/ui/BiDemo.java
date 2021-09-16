package main.java.jpatraining.jpi.ui;

import main.java.jpatraining.onetoonebi.AddressBi;
import main.java.jpatraining.onetoonebi.StudentBi;
import main.java.jpatraining.utility.EntityManagerUtility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;




public class BiDemo {

    public static void main(String[] args) {

        EntityManager entityManager=null;
        try {

            entityManager = EntityManagerUtility.getEntityManager();
            entityManager.getTransaction().begin();
            StudentBi student = new StudentBi();
            student.setName("Lakshmi");
            AddressBi homeAddress = new AddressBi();
            homeAddress.setStreet("MG Road");
            homeAddress.setCity("Pune");
            homeAddress.setState("Maharastra");
            homeAddress.setZipCode("400001");

            //inject address into student
            student.setAddress(homeAddress);

            //persist only student, no need to persist Address explicitly
            entityManager.persist(student);
            entityManager.getTransaction().commit();

            System.out.println("Added one student with address to database.");
        }catch(PersistenceException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            entityManager.close();
        }

    }

}