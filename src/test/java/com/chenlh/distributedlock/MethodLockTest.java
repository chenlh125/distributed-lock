package com.chenlh.distributedlock;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chenlh.distributedlock.mapper.MethodLockMapper;
import com.chenlh.distributedlock.model.MethodLock;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MethodLockTest {
	
	@Autowired
	MethodLockMapper methodLockMapper;
	
	@Test
	public void testInsert() {
		MethodLock methodLock=new MethodLock(2l,"test1","test",new Date());
		methodLockMapper.insert(methodLock);
	}

}
