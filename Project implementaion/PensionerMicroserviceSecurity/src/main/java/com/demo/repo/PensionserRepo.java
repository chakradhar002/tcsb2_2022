package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.demo.bean.PensionerLogin;

public interface PensionserRepo extends JpaRepository<PensionerLogin, Long>{

}
