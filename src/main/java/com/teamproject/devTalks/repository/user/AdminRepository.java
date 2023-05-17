package com.teamproject.devTalks.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamproject.devTalks.entity.user.AdminEntity;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface AdminRepository extends JpaRepository <AdminEntity,Integer>{

    public AdminEntity findByAdminEmail(String Email);

    public boolean existsByAdminEmail(String email);
    public boolean existsByAdminNickname(String nickname);
    public boolean existsByAdminPhoneNumber(String phoneNumber);

    @Transactional
    public void deleteByAdminEmail(String AdminEmail);
}
