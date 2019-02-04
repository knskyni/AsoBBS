package jp.ac.asojuku.asobbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jp.ac.asojuku.asobbs.entity.UserTblEntity;


@Repository
public interface UserRepository extends JpaRepository<UserTblEntity,String>,JpaSpecificationExecutor<UserTblEntity> {

	@Query("select u from UserTblEntity u where mailadress = :mail and password = :password")
	public UserTblEntity getUser(@Param("mail")String mail,@Param("password")String password);

	@Query("select u from UserTblEntity u where mailadress = :mail")
	public UserTblEntity getUserByMail(@Param("mail")String mail);

	@Query("select u from UserTblEntity u where studentNo = :studentno")
	public UserTblEntity getUserByStudentNo(@Param("studentno")String studentno);
}
