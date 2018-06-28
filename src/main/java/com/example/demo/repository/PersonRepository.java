package com.example.demo.repository;

import com.example.demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface PersonRepository extends JpaRepository<Person,Long> {
    Person  findByName(String name);

    Person findByNameAndPsd(String name,double psd);
    @Query("FROM Person p WHERE p.id=:id")
    Person findPersonById(@Param("id")int id);

    Person findById(@Param("id")int id);


/*    @Query("update administor u set u.name = :name where u.id=:id")
    public int updatePersionById(@Param("id") Integer id,@Param("name") String name);*/

    @Modifying
    @Transactional
    @Query("update Person u set u.name = :name,u.phn = :phn,u.e_mail = :e_mail,u.infro = :infro where u.id=:id")
    public int updatePsersionbyId(@Param("id") Integer id, @Param("name") String name,@Param("phn") String phn,@Param("e_mail") String e_mail,@Param("infro") String infro);
}
